package in.maddy.RestApi.Repository;
import in.maddy.RestApi.Entity.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for managing ExpenseEntity persistence.
 * 
 * Extends JpaRepository to provide standard CRUD operations,
 * paging, and sorting for the `tbl_expenses` table.
 * 
 * No need to implement this interface — Spring Data JPA will
 * auto-generate the implementation at runtime.
 * 
 * @author Maddy
 */
public interface ExpenseRepository extends JpaRepository<ExpenseEntity, Long> {

}
