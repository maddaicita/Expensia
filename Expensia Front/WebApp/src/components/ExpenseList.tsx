import type { Expense } from "../model/Expense";

interface ExpenseListProps {
    expenses: Expense[];
}

const ExpenseList = ({ expenses }: ExpenseListProps) => {
  return (
    <div>
      <table border={1} style={{ width: "100%", textAlign: "left" }}>
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Amount</th>
            <th>Date</th>
          </tr>
        </thead>
        <tbody>
          {expenses.map((expense) => (
            <tr key={expense.expenseId}>
              <td>{expense.id}</td>
              <td>{expense.name}</td>
              <td>${expense.amount.toFixed(2)}</td>
              <td>{expense.date}</td>
            </tr>
          ))}
        </tbody>
      </table>
      <h2>
        Total Expenses: $
        {expenses.reduce((total, expense) => total + expense.amount, 0).toFixed(2)}
      </h2>
    </div>
  );
};
    export default ExpenseList;