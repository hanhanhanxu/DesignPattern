package strategy.realization;

import strategy.itface.IQuoteStrategy;

import java.math.BigDecimal;

public class OldCustomerQuoteStrategy implements IQuoteStrategy {
    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        System.out.println("恭喜！老客户享有9折优惠。");
        return originalPrice.multiply(BigDecimal.valueOf(0.9));
    }
}
