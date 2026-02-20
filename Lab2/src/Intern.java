import java.io.FileWriter;
import java.io.IOException;

public class Intern extends Employee {

    // need advice --> idk if it is okay to create FileWriter outside the method(for
    // creating object only once)

    private static final double maxSalary = 20000;

    private Intern(String name, String email, int age, double salary) {
        super(name, email, age, salary);

        try {
            FileWriter fW = new FileWriter("employees.txt", true);

            fW.write(name +" "+ email +" "+age +" "+ salary +"\n");
            fW.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Intern newIntern(String name, String email, int age, double salary) {

        if (salary > maxSalary) {
            throw new IllegalArgumentException("maas 20k ustu intern yaratmaq olmaz");

        }
        else{return new Intern(name, email, age, salary);
}

    }

}
