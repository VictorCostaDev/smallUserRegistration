package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = scan.nextInt();

        for(int index = 1; index <= numberOfEmployees; index++) {
            System.out.printf("Employee #%d data:\n", index);
            System.out.print("Outsourced (y/n)? ");
            char employeeStatus = scan.next().charAt(0);
            System.out.print("Name: ");
            scan.nextLine();
            String nameEmployee = scan.nextLine();
            System.out.print("Hours: ");
            int hoursWorked = scan.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = scan.nextDouble(); 
            if(employeeStatus == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = scan.nextDouble();
                employees.add(new OutsourcedEmployee(nameEmployee, hoursWorked, valuePerHour, additionalCharge));
            } else {
                employees.add(new Employee(nameEmployee, hoursWorked, valuePerHour));
            }
        }
        
        System.out.println("PAYMENTS:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
        }
        scan.close();
    }
}
