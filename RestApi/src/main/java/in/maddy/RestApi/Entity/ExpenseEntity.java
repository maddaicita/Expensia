package in.maddy.RestApi.Entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entity class representing an expense record stored in the database.
 * This class is mapped to the table {@code tbl_expenses} and contains
 * fields for identifying and describing an expense, including timestamps
 * for creation and updates.
 * 
 * Used by the persistence layer (JPA/Hibernate) to store and retrieve
 * expense records from the database.
 * 
 * @author Maddy
 */
@Entity
@Table(name = "tbl_expenses")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExpenseEntity {

    /** Auto-generated primary key ID (internal use). */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /** Unique external identifier for the expense (UUID format recommended). */
    @Column(unique = true, nullable = false)
    private String expenseId;

    /** Name or title of the expense (e.g., "Electricity Bill"). */
    private String name;

    /** Optional note describing the expense. */
    private String note;

    /** Category of the expense (e.g., Utilities, Food, Travel). */
    private String category;

    /** Date when the expense occurred. */
    private Date date;

    /** Amount of the expense in the specified currency (e.g., USD). */
    private BigDecimal amount;

    /** Timestamp when the expense record was created (auto-managed by Hibernate). */
    @CreationTimestamp
    @Column(updatable = false, nullable = false)
    private Timestamp createdAt;

    /** Timestamp when the expense record was last updated (auto-managed by Hibernate). */
    @UpdateTimestamp
    private Timestamp updatedAt;
}
