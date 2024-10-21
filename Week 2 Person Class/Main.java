public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");

        Person person1 = new Person("Ben");
        person1.displayName();

        Person person2 = new Person("Ben");
        person2.setSurname("Hendrikson");
        person2.setAge(21);

        Person person3 = new Person("Anupama");
        person3.setSurname("Ushetti");
        person3.setAge(22);

        Person person4 = new Person("Gerald");
        person4.setSurname("Fernando");
        person4.setAge(18);

    }
}

