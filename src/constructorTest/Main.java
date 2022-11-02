package constructorTest;

public class Main {

    public static final Integer MAGNIFIER = 10000;
    public static void main(String[] args) throws Exception{
        Person person = new Person("Sergey", 28, "Proletarskaya 28", "88005553535");
        Person.getCounter();
        Fraction fraction = new Fraction(1, 10);
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

class Fraction{
    int numerator;
    int denominator = 1;

    public Fraction(int numerator, int denominator){
        if (denominator == 0){
            System.out.println("Denominator can't be zero");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

}
