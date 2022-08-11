package pl.futurecollars.invoicing.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class InvoiceEntry {

  private String description;
  private BigDecimal price;
  private BigDecimal vatValue;
  private Vat vatRate;

}
