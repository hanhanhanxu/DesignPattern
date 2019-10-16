package strategy.context;

import strategy.itface.IQuoteStrategy;

import java.math.BigDecimal;

public class QuoteContext {
    private IQuoteStrategy iQuoteStrategy;
    //注入这个报价策略
    public QuoteContext(IQuoteStrategy iQuoteStrategy) {
        this.iQuoteStrategy = iQuoteStrategy;
    }

    public void setiQuoteStrategy(IQuoteStrategy iQuoteStrategy) {
        this.iQuoteStrategy = iQuoteStrategy;
    }

    //回调具体的报价策略的方法
    public BigDecimal getPrice(BigDecimal originalPrice){
        return iQuoteStrategy.getPrice(originalPrice);
    }
}
