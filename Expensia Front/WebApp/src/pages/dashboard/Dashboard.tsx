import ExpenseList from "../../components/ExpenseList";
import useExpenses from "../../hooks/useExpenses";

const Dashboard = () => {
  const { expenses, error, isLoading } = useExpenses();

  return (
    <div>
      {isLoading && <h2>Loading...</h2>}
      {error && <h2>Error: {error}</h2>}
      <ExpenseList expenses={expenses} />
    </div>
  );
};

export default Dashboard;
