//CostCalculator acts as Adapter Class
package com.carrental.CarRentalApp.Pricing;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;

@Component
public class CostCalculator implements PriceCalculator {
    private final PriceSetter chain;
    private final AudiCal audi;
    private final BMWCal bmw;
    private final MercedesCal mercedes;

    public CostCalculator() {
        audi = new AudiCal();
        bmw = new BMWCal();
        mercedes = new MercedesCal();
        audi.setNext(bmw);
        bmw.setNext(mercedes);
        mercedes.setNext(null);
        this.chain = audi;
    }

    @Override
    public BigDecimal calculateRent(int state, int numberOfDays) {
        PriceSetter selectedCar = chain.handle(state);
        BigDecimal factor = new BigDecimal(selectedCar.getFactor());
        return factor.multiply(new BigDecimal(numberOfDays));
    }
    public PriceSetter getChain() {
        return this.chain;
    }
}
interface PriceCalculator {
    BigDecimal calculateRent(int state, int numberOfDays);
}