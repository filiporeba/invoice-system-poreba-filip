package pl.invoicing.model;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {

  private Integer id;
  private LocalDate date;
  private Company buyer;
  private Company seller;
  private List<InvoiceEntry> entries;
}
