package in.maddy.RestApi.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import in.maddy.RestApi.Service.ExpenseService;
import in.maddy.RestApi.DTO.ExpenseDTO;
import in.maddy.RestApi.IO.ExpenseResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Controller class for handling HTTP requests related to expenses.
 * Provides endpoints to retrieve and manipulate expense data.
 * Uses {@link ExpenseService} to interact with the business layer
 * and {@link ModelMapper} to convert DTOs to response objects.
 * 
 * @author Maddy
 */
@RestController
@RequiredArgsConstructor
@Slf4j
@CrossOrigin(origins = "*") // Allow requests from any origin(for now)
public class ExpenseController {

    /** Service layer dependency for retrieving expenses. */
    private final ExpenseService expenseService;

    /** ModelMapper instance for converting between DTOs and response models. */
    private final ModelMapper modelMapper;

    /**
     * Retrieves a list of all expenses.
     * This endpoint handles GET requests to `/expenses`.
     * 
     * @return List of {@link ExpenseResponse} objects representing all expenses.
     */
    @GetMapping("/expenses")
    public List<ExpenseResponse> getExpenses() {
        log.info("Fetching all expenses for API GET request");
        // Call the service method to get all expenses as DTOs
        List<ExpenseDTO> list = expenseService.getAllExpenses();

        // Convert ExpenseDTOs to ExpenseResponse DTOs using mapToExpenseResponse
        return list.stream()
                .map(this::mapToExpenseResponse)
                .collect(Collectors.toList());
    }

    /**
     * Converts an {@link ExpenseDTO} object to an {@link ExpenseResponse} object.
     * This is a utility method that uses ModelMapper for object mapping.
     * 
     * @param expenseDTO the ExpenseDTO to convert
     * @return the mapped ExpenseResponse object
     */
    private ExpenseResponse mapToExpenseResponse(ExpenseDTO expenseDTO) {
        return modelMapper.map(expenseDTO, ExpenseResponse.class);
    }
}
