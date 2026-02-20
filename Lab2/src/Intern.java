public class Intern extends Employee {


    private static final double maxSalary = 20000;

    private Intern(String name, String email, int age, double salary) {

        if(salary> maxSalary){
            throw new IllegalArgumentException("maas 20k ustu intern yaratmaq olmaz");

        }
        super(name, email, age, salary);


    }
     

    private Intern() {
        super();
    }




    


}
