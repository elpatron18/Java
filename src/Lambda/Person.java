package Lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {

    public enum Sex {MALE, FEMALE}

    private String name;
    private LocalDate birthday;
    private Sex gender;
    private String emailAdress;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        age = LocalDate.now().getYear() - birthday.getYear();
        if (birthday.getDayOfYear() >= LocalDate.now().getDayOfYear()) age -= 1;
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public void printPerson() {
        System.out.println(
                "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", emailAdress='" + emailAdress + '\'' +
                ", age=" + age +
                '}'
        );
    }

    public Person(String name, Sex gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    /*public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) if (p.getAge() >= age) p.printPerson();
    } */

    public static void printPersons(List<Person> roaster, CheckPerson cp) {
        for (Person p : roaster) if (cp.test(p)) p.printPerson();
    }

    public static void main(String[] args) {
        Person donald = new Person("Donald", Sex.MALE, 40);
        Person daisy = new Person("Daisy", Sex.FEMALE, 39);

        List<Person> roster = new ArrayList<>();

        roster.add(donald);
        roster.add(daisy);

        //printPersonsOlderThan(roster,40);

        printPersons(roster, (Person p) -> p.getGender() == Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25);

    }


}
