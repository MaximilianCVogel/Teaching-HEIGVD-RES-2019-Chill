package ch.heigvd.res.chill.domain.mercierjo;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Merjo implements IProduct {

  public final static String NAME = "Merjo";
  public final static BigDecimal PRICE = new BigDecimal(3.7);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
