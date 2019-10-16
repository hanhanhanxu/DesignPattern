package test;

import strategy.realization.OldCustomerQuoteStrategy;
import strategy.realization.VIPCustomerQuoteStrategy;

import java.math.BigDecimal;

public class Demo1 {

    public static void main(String[] args){
        OldCustomerQuoteStrategy oldCustomerQuoteStrategy = new OldCustomerQuoteStrategy();
        System.out.println(oldCustomerQuoteStrategy.getPrice(new BigDecimal(100)));
    }

}
