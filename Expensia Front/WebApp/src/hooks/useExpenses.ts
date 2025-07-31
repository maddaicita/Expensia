import { useEffect, useState } from "react";
import { getExpenses } from "../services/expense-service";
import type { Expense } from "../model/Expense";

const useExpenses = () => {
  const [expenses, setExpenses] = useState<Expense[]>([]);
  const [error, setErrors] = useState<string | null>(null);
  const [isLoading, setLoader] = useState(false);

  useEffect(() => {
    setLoader(true);
    getExpenses()
      .then((response) => {
        setExpenses(response.data);
      })
      .catch((error) => setErrors(error.message))
      .finally(() => setLoader(false));
  }, []);

  return { expenses, error, isLoading };
};

export default useExpenses;
