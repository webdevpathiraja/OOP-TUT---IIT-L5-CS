public class Test {

    public static void main(String[] args) {
        Person prerson1 = new Person("Jack Brooke", 27, "M");
        System.out.println(prerson1 );

//        Student student1 = new Student("Anupama Ushetti", 21, "M", 20232090);
//        System.out.println(student1);
        System.out.println();

        Teacher teacher2 = new Teacher("Sam Soori", 46,
                "F", "Data science",  500000);

        System.out.println(teacher2);

        // creating student objects
        Student student1 = new Student("Anupama Ushetti", 21, "M", 20232090);
        Student student2 = new Student("Samantha Peterson", 22, "F", 20232091);
        Student student3 = new Student("John Doe", 23, "M", 20232092);
        Student student4 = new Student("Jane Smith", 24, "F", 20232093);


        // Adding students to the teacher
        teacher2.addStudent(student1);
        teacher2.addStudent(student2);
        teacher2.addStudent(student3);
        teacher2.addStudent(student4);

        // print teacher details with asssigned students
        System.out.println(teacher2);



    }
}
