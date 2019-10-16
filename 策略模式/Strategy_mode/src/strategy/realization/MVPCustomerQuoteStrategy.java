package strategy.realization;

import strategy.itface.IQuoteStrategy;

import java.math.BigDecimal;

public class MVPCustomerQuoteStrategy implements IQuoteStrategy {
    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        System.out.println("恭喜恭喜！MVP客户赏一斤屎！并打1折哦！！！");
        return originalPrice.multiply(BigDecimal.valueOf(0.1));
    }
}
