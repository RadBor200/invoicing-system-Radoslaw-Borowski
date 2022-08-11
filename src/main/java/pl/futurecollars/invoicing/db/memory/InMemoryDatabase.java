package pl.futurecollars.invoicing.db.memory;

import java.util.HashMap;
import java.util.Map;
import pl.futurecollars.invoicing.db.Database;
import pl.futurecollars.invoicing.model.Invoice;

public class InMemoryDatabase implements Database {
  private Map<Long, Invoice> invoices = new HashMap<>();
  private static long currentIndex = 1;

  @Override
  public long save(Invoice invoice) {
    long newId = currentIndex++;
    invoice.setId(newId);
    invoices.put(currentIndex++, invoice);
    return newId;


  }

  @Override
  public Invoice getById(long id) {
    return invoices.get(id);
  }

  @Override
  public void update(long id, Invoice invoice) {

    Invoice saved = getById(id);

    if (saved == null){
      throw new RuntimeException("Invoice with id = " + id + "does not exist.");
    }
    invoices.put(id, invoice);
  }

  @Override
  public void delete(long id) {
    invoices.remove(id);

  }
}
