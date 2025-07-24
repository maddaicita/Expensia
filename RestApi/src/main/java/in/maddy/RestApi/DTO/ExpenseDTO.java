package in.maddy.RestApi.DTO;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Data Transfer Object (DTO) for Expense.
 * This class is used to transfer expense data between layers within the application,
 * such as between the service layer and the controller layer.
 * It is not exposed directly to the client or database.
 * 
 * Fields include metadata such as creation and update timestamps.
 * 
 * @author Maddy
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExpenseDTO {

    /** Unique identifier for the expense. */
    private String expenseId;

    /** Name or title of the expense. */
    private String name;

    /** Optional note or description of the expense. */
    private String note;

    /** Category to which this expense belongs (e.g., Utilities, Food). */
    private String category;

    /** Date on which the expense occurred. */
    private Date date;

    /** Amount of money spent in this expense. */
    private BigDecimal amount;

    /** Timestamp of when the expense was created in the system. */
    private Timestamp createdAt;

    /** Timestamp of the last time this expense was updated. */
    private Timestamp updatedAt;
}
