package in.maddy.RestApi.IO;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Response object used to return expense data to the client.
 * This class contains all necessary fields that represent a complete
 * expense record, including timestamps for creation and updates.
 * 
 * Typically used in GET responses from the API.
 * 
 * @author Maddy
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExpenseResponse {

    /** Unique identifier for the expense (external ID). */
    private String expenseId;

    /** Name or title of the expense. */
    private String name;

    /** Optional note describing the expense. */
    private String note;

    /** Category under which the expense falls. */
    private String category;

    /** Date when the expense occurred. */
    private Date date;

    /** Monetary value of the expense. */
    private BigDecimal amount;

    /** Timestamp of when the expense was created. */
    private Timestamp createdAt;

    /** Timestamp of the most recent update to the expense. */
    private Timestamp updatedAt;
}
