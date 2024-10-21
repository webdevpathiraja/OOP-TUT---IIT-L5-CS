public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void displayName() {
        System.out.println(name);
    }
}
