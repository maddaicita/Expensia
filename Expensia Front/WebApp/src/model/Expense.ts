export interface Expense {
    id?: number;
    expenseId?: string; // Unique identifier for the expense
    name: string;   // Name of the expense
    note: string; // Optional note for the expense
    amount: number; // Amount of the expense  
    date: string;        // Date of the expense 
    category: string; // Category of the expense    
    
}
   