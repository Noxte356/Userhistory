import java.util.Scanner;

public class CustomerScanner {
    Customer scan(){
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        System.out.print("Введите имя --> ");
        String name = scanner.nextLine();
        System.out.print("Введите фамилию --> ");
        String surName = scanner.nextLine();
        customer.setName(name);
        customer.setSurname(surName);
        return customer;
    }
}
