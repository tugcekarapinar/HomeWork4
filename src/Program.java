import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();

        System.out.println("=======Yeni Personel Ekleme Programı=======");

        while (true){
            System.out.print("Lütfen Yeni Personelin Adını Girin:");
            String name = scanner.nextLine();

            System.out.print("Lütfen Yeni Personelin Soy Adını Girin:");
            String surname = scanner.nextLine();

            System.out.print("Lütfen Yeni Personelin Yaşını Girin:");
            int age = scanner.nextInt();

            System.out.print("Lütfen Yeni Personelin Maaşını Girin:");
            double salery = scanner.nextDouble();

            Person person = new Person(name,surname,age,salery);
            personList.add(person);
            person.WriteInfo();
        }
    }
}