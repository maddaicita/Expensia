package in.maddy.RestApi.Service.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import in.maddy.RestApi.DTO.ExpenseDTO;
import in.maddy.RestApi.Entity.ExpenseEntity;
import in.maddy.RestApi.Repository.ExpenseRepository;
import in.maddy.RestApi.Service.ExpenseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Implementation of the ExpenseService interface.
 * 
 * This service handles the business logic related to expense operations,
 * including fetching all expenses from the database and converting them to DTOs.
 * 
 * Uses ModelMapper to transform between Entity and DTO layers.
 * 
 * Annotated with @Service to indicate it's a service-layer component,
 * and @RequiredArgsConstructor (Lombok) to inject dependencies via constructor.
 * 
 * @author Maddy
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class ExpenseServiceImpl implements ExpenseService {

    /** Repository to interact with the expense data in the database. */
    private final ExpenseRepository expenseRepository;

    /** ModelMapper to convert between Entity and DTO objects. */
    private final ModelMapper modelMapper;

    /**
     * Retrieves all expenses from the database and maps them to DTOs.
     * 
     * @return a list of ExpenseDTO representing all stored expenses
     */
    @Override

    public List<ExpenseDTO> getAllExpenses() {
        List<ExpenseEntity> list = expenseRepository.findAll();
        log.info("Fetched {} expenses from the database", list.size());

        // Map each ExpenseEntity to ExpenseDTO using ModelMapper
        List<ExpenseDTO> listOfExpenses = list.stream()
                .map(this::mapToExpenseDTO)
                .collect(Collectors.toList());

        return listOfExpenses;
    }

    /**
     * Helper method to convert ExpenseEntity to ExpenseDTO.
     * 
     * @param expenseEntity the entity object to convert
     * @return the corresponding DTO object
     */
    private ExpenseDTO mapToExpenseDTO(ExpenseEntity expenseEntity) {
        return modelMapper.map(expenseEntity, ExpenseDTO.class);
    }

}
