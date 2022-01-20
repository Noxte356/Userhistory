import java.util.Scanner;

public class UserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerScanner customerScanner = new CustomerScanner();
        CustomerMemorySaver customerMemorySaver = new CustomerMemorySaver();
        CustomerFileSaver customerFileSaver = new CustomerFileSaver();
        System.out.println("1 - сохранить на память.");
        System.out.println("2 - сохранить в файл.");
        int chooseSaver = scanner.nextInt();
        if (chooseSaver == 1) {
            Customer customer = customerScanner.scan();
            customerMemorySaver.save(customer);
            System.out.println("Данные сохранены.");

        } else if (chooseSaver == 2) {
            Customer customer = customerScanner.scan();
            customerFileSaver.save(customer);
            System.out.println("Данные сохранены.");

        }

    }
}
