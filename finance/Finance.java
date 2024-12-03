package finance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Finance {
    // Transaction class: Used for both income and expense
    static class Transaction {
        private String description;
        private double amount;

        public Transaction(String description, double amount) {
            this.description = description;
            this.amount = amount;
        }

        Transaction(String pay_Bills, String receiver, double amount) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public String getDescription() {
            return description;
        }

        public double getAmount() {
            return amount;
        }

        Object getTransactionType() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        Object getReceiver() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        Object getDateTime() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    // Income class: Manages the income transactions
    static class Income {
        private double totalIncome;

        public void addIncome(Transaction transaction) {
            totalIncome += transaction.getAmount();
        }

        public double getTotalIncome() {
            return totalIncome;
        }
    }

    // Expense class: Manages the expense transactions
    static class Expense {
        private double totalExpense;

        public void addExpense(Transaction transaction) {
            totalExpense += transaction.getAmount();
        }

        public double getTotalExpense() {
            return totalExpense;
        }
    }

    // Savings class: Manages savings
    static class Savings {
        private double totalSavings;

        public void addSavings(double amount) {
            totalSavings += amount;
        }

        public double getTotalSavings() {
            return totalSavings;
        }
    }

    public static void main(String[] args) {
        // Create instances of Income, Expense, and Savings
        Income income = new Income();
        Expense expense = new Expense();
        Savings savings = new Savings();

        // Create the main frame
        JFrame frame = new JFrame("Personal Finance System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        // Create panels for different sections
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2));

        // Labels and text fields
        JLabel descriptionLabel = new JLabel("Description:");
        JTextField descriptionField = new JTextField();
        JLabel amountLabel = new JLabel("Amount:");
        JTextField amountField = new JTextField();

        // Buttons
        JButton addIncomeButton = new JButton("Add Income");
        JButton addExpenseButton = new JButton("Add Expense");
        JButton addSavingsButton = new JButton("Add Savings");
        JButton viewSummaryButton = new JButton("View Summary");

        // Text area to display the summary
        JTextArea summaryArea = new JTextArea(10, 30);
        summaryArea.setEditable(false);
        JScrollPane summaryScrollPane = new JScrollPane(summaryArea);

        // Add components to input panel
        inputPanel.add(descriptionLabel);
        inputPanel.add(descriptionField);
        inputPanel.add(amountLabel);
        inputPanel.add(amountField);
        inputPanel.add(addIncomeButton);
        inputPanel.add(addExpenseButton);
        inputPanel.add(addSavingsButton);
        inputPanel.add(viewSummaryButton);

        // Add the input panel and the summary area to the frame
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(summaryScrollPane, BorderLayout.CENTER);

        // Action listeners for the buttons
        addIncomeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String description = descriptionField.getText();
                double amount = Double.parseDouble(amountField.getText());
                income.addIncome(new Transaction(description, amount));
                JOptionPane.showMessageDialog(frame, "Income added successfully!");
                descriptionField.setText("");
                amountField.setText("");
            }
        });

        addExpenseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String description = descriptionField.getText();
                double amount = Double.parseDouble(amountField.getText());
                expense.addExpense(new Transaction(description, amount));
                JOptionPane.showMessageDialog(frame, "Expense added successfully!");
                descriptionField.setText("");
                amountField.setText("");
            }
        });

        addSavingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(amountField.getText());
                savings.addSavings(amount);
                JOptionPane.showMessageDialog(frame, "Savings updated successfully!");
                amountField.setText("");
            }
        });

        viewSummaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display the summary in the text area
                String summary = "Total Income: $" + income.getTotalIncome() + "\n" +
                        "Total Expenses: $" + expense.getTotalExpense() + "\n" +
                        "Total Savings: $" + savings.getTotalSavings() + "\n" +
                        "Remaining Balance: $" + (income.getTotalIncome() - expense.getTotalExpense()) + "\n";
                summaryArea.setText(summary);
            }
        });

        // Set the frame visible
        frame.setVisible(true);
    }
}
