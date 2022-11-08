package constructorTest;

public class Main {

    public static final Integer MAGNIFIER = 10000;
    public static void main(String[] args) throws Exception{
        Person person = new Person("Sergey", 28, "Proletarskaya 28", "88005553535");
        Person.getCounter();
        Fraction fraction = new Fraction(1, 10);

        Person1 roma = new Person1("Savoskin", "Roma", 'm');
        System.out.println(roma);

        Employee sveta = new Employee("Savoskina", "Sveta", 'f', "Supruga");

        System.out.println(sveta);
        sveta.TellMeWhoArrU();

        Person1 sveta2 = sveta;
        System.out.println(sveta2);
        ((Employee) sveta2).TellMeWhoArrU();
        //Employee roma2 = roma;

    }
}

class Person{
    int id;
   private String name;
    private int age;
    private static int counter = 0;

    static {
        System.out.println(counter);
    }

    public static int getCounter() {
        return counter;
    }

    public Person(String name, int age, String address, String phone) {
        id = counter++;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age > 0 && age <110)
            this.age = age;
    }
}

class Fraction {
    int numerator;
    int denominator = 1;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator can't be zero");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

}
class Person1 {
        protected String firstName;
        protected String lastName;
        protected char gender; // m -male, f -female

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person1(){
            this("", "", '-');
        }

        public Person1(String lastName){
            this(lastName, "", '-');
        }

        public Person1(String lastName, String firstName, char gender){
            this(lastName, firstName);
            this.gender = gender;

        }

        public Person1(String lastName,String firstName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return "Person1{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", gender=" + gender +
                    '}';
        }

}

class Employee extends Person1{
    protected String dolzhnost;

    public Employee(String lastName, String firstName, char gender, String dolzhnost) {
        super(lastName, firstName, gender);
        this.dolzhnost = dolzhnost;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dolzhnost='" + dolzhnost + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }

    public void TellMeWhoArrU(){
        System.out.println("Hello, i'm Employee, and my class is " + this.getClass());
    }

}
