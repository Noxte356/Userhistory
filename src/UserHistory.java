import java.util.Scanner;

public class UserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerScanner customerScanner = new CustomerScanner();
        CustomerSaver customerSaver;
        System.out.println("1 - сохранить на память.");
        System.out.println("2 - сохранить в файл.");
        int chooseSaver = scanner.nextInt();
        if (chooseSaver == 1) {
            customerSaver = new CustomerMemorySaver();


        } else if (chooseSaver == 2) {
            customerSaver = new CustomerFileSaver();
        } else {
            customerSaver = new CustomerFileSaver();
        }
        while (true) {
            Customer customer = customerScanner.scan();
            if (customer.getName().equals("exit")){
                break;
            }
            customerSaver.save(customer);
            System.out.println("Данные сохранены.");
        }
    }
}
// 1. Юзер выбирает куда сохранять кастомеров файл или память
// 2. пользователь вводит имя и фамилию
// 3. комп сохраняет в файл или память
// 4. продолжается 2 и 3 пункт до тех пор пока не напишет exit

// 1. Юзер выбирает тип базы файл или память
// 2. Юзер выбирает сохранить или вывести всю инфу, или завершить программу
// 3. комп делает выполняет выбранное действие
// 3.1 если пользователь выбрал сохранить то:
// а) вводит имя фамилию
// б) сохраняет введенные данные в выбранныую базу ранее
// 3.2 иначе если пользователь выбрал вывести инфу то:
// а) запрашиваем у источника выбранного ранее данные и выводим юзеру
// 3.3 иначе если пользователь выбрал завершить программу то заврешаем
// 4. повторяет пункт 2 и 3  пока юзер не выберит завершить