package school;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;   // this keyword
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public final void role() {
        System.out.println("I am a member of the school.");
    }

    public static void staticMethod() {
        System.out.println("Static method in Person");
    }
}
class Student extends Person {
    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
    }

    public static void staticMethod() {
        System.out.println("Static method in Student");
    }
}
class GraduateStudent extends Student {
    private String researchTopic;

    public GraduateStudent(String name, int age, int id, String topic) {
        super(name, age, id);
        this.researchTopic = topic;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Research Topic: " + researchTopic);
    }
}
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}

class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
final class Principal {
    public void showRole() {
        System.out.println("I am the Principal");
    }
}
public class Main {
    public static void main(String[] args) {

        Student s = new Student("Abel", 18, 101);
        s.displayInfo();

        GraduateStudent g = new GraduateStudent("Sara", 24, 202, "AI Research");
        g.displayInfo();

        Teacher t = new Teacher("Mr. John", 40, "Math");
        t.displayInfo();

        Staff st = new Staff("Helen", 35, "Administration");
        st.displayInfo();

        Person.staticMethod();
        Student.staticMethod();
    }
}
