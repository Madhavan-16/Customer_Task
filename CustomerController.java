package customerTask;

import java.text.SimpleDateFormat;
import java.util.*;

public class CustomerController {
    public static void main(String[] args) {
        // Create 10 customer records
        List<Customer> customers = new ArrayList<>();
        try {
            customers.add(new Customer(1, "Alice", "Delhi", 75000, new SimpleDateFormat("yyyy-MM-dd").parse("1985-05-15")));
            customers.add(new Customer(2, "Bob", "Mumbai", 82000, new SimpleDateFormat("yyyy-MM-dd").parse("1990-08-23")));
            customers.add(new Customer(3, "Charlie", "Bangalore", 95000, new SimpleDateFormat("yyyy-MM-dd").parse("1983-12-02")));
            customers.add(new Customer(4, "David", "Delhi", 67000, new SimpleDateFormat("yyyy-MM-dd").parse("1978-04-19")));
            customers.add(new Customer(5, "Eve", "Hyderabad", 50000, new SimpleDateFormat("yyyy-MM-dd").parse("1995-03-11")));
            customers.add(new Customer(6, "Frank", "Chennai", 90000, new SimpleDateFormat("yyyy-MM-dd").parse("1992-07-30")));
            customers.add(new Customer(7, "Grace", "Delhi", 83000, new SimpleDateFormat("yyyy-MM-dd").parse("1980-11-09")));
            customers.add(new Customer(8, "Hank", "Pune", 78000, new SimpleDateFormat("yyyy-MM-dd").parse("1987-06-25")));
            customers.add(new Customer(9, "Ivy", "Mumbai", 120000, new SimpleDateFormat("yyyy-MM-dd").parse("1981-01-15")));
            customers.add(new Customer(10, "Jack", "Delhi", 89000, new SimpleDateFormat("yyyy-MM-dd").parse("1989-09-07")));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("All Customers:");
        customers.forEach(System.out::println);

        
        System.out.println("\nCustomers with premium > 80000:");
        customers.stream().filter(c -> c.premium > 80000).forEach(System.out::println);

        System.out.println("\nCustomers from Delhi:");
        customers.stream().filter(c -> c.city.equalsIgnoreCase("Delhi")).forEach(System.out::println);

        System.out.println("\nCustomers sorted by dateOfBirth:");
        Collections.sort(customers, (c1, c2) -> c1.dateOfBirth.compareTo(c2.dateOfBirth));
        customers.forEach(System.out::println);

        System.out.println("\nCustomers sorted by custName:");
        Collections.sort(customers, (c1, c2) -> c1.custName.compareTo(c2.custName));
        customers.forEach(System.out::println);
    }
}
