package strategy.itface;

import java.math.BigDecimal;

public interface IQuoteStrategy {
    BigDecimal getPrice(BigDecimal originalPrice);
}
