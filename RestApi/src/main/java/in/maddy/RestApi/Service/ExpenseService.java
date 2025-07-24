package in.maddy.RestApi.Service;

import java.util.List;

import in.maddy.RestApi.DTO.ExpenseDTO;

/**
 * Service interface for handling expense-related operations.
 * 
 * Defines the contract for any implementation class to provide methods
 * related to expense data manipulation or retrieval.
 * 
 * Currently supports:
 * - Retrieving all expenses from the database
 * 
 * @author Maddy
 */
public interface ExpenseService {

    /**
     * Retrieves all expenses from the data source.
     *
     * @return a list of {@link ExpenseDTO} representing all expenses
     */
    List<ExpenseDTO> getAllExpenses();
}
