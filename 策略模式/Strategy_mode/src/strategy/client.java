package strategy;

import strategy.context.QuoteContext;
import strategy.itface.IQuoteStrategy;
import strategy.realization.MVPCustomerQuoteStrategy;
import strategy.realization.NewCustomerQuoteStrategy;
import strategy.realization.OldCustomerQuoteStrategy;
import strategy.realization.VIPCustomerQuoteStrategy;

import java.math.BigDecimal;

public class client {
    public static void main(String[] args) {
        //当前场景使用的策略
        IQuoteStrategy iQuoteStrategy = new VIPCustomerQuoteStrategy();
        IQuoteStrategy iQuoteStrategy2 = new NewCustomerQuoteStrategy();
        IQuoteStrategy iQuoteStrategy3 = new OldCustomerQuoteStrategy();
        IQuoteStrategy iQuoteStrategy4 = new MVPCustomerQuoteStrategy();

        //创建报价策略，并注入想要使用的策略
        QuoteContext quoteContext = new QuoteContext(iQuoteStrategy4);

        //得到当前策略的输出结果
        BigDecimal price = quoteContext.getPrice(new BigDecimal(100));
        System.out.println("折扣为:"+price);
    }
}
