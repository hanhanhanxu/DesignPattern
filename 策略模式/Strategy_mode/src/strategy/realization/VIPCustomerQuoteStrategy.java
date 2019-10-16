package strategy.realization;

import strategy.itface.IQuoteStrategy;

import java.math.BigDecimal;

public class VIPCustomerQuoteStrategy implements IQuoteStrategy {
    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        System.out.println("恭喜！VIP客户享有8折优惠");
        return originalPrice.multiply(BigDecimal.valueOf(0.8));
    }
}
