package pl.futurecollars.invoicing.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Company {

  private long id;
  private String taxIdentificationNumber;
  private String address;
}
