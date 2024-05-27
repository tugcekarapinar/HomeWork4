import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        Person person1 = new Person("Tuğçe","Karapinar",30,100);
        Person person2 = new Person("Tugay","Karapinar",31,100);
        Person person3 = new Person("Demir Ege","Karapinar",0,100);
        Person person4 = new Person("Ali","Veli",30,100);

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        for (int i = 0; i < personList.size(); i++) {
            personList.get(i).WriteInfo();
        }
    }
}