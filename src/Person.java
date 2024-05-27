public class Person {
    public String name;
    public String surname;
    public int age;
    public double salary;

    public Person(String name,String surname,int age,double salary){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public void WriteInfo(){
        System.out.println("Adı:" + name + " " + "Soyadı:" + surname + " " + "Yaşı:" + age + " " + "Maaşı:"+salary);
    }
}
