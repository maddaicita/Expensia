package in.maddy.RestApi.IO;

import java.math.BigDecimal;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Request object for creating or updating an expense.
 * This class is used to receive JSON data from the client in HTTP requests.
 * It contains only the fields necessary to create or update an expense record.
 * 
 * Typically used in controller endpoints that accept POST or PUT methods.
 * 
 * @author Maddy
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExpenseRequest {

    /** Name or title of the expense (e.g., "Groceries", "Water bill"). */
    private String name;

    /** Optional description or comment about the expense. */
    private String note;

    /** Category of the expense (e.g., Food, Utilities, Transport). */
    private String category;

    /** Date the expense occurred. */
    private Date date;

    /** Amount spent for the expense. */
    private BigDecimal amount;
}
