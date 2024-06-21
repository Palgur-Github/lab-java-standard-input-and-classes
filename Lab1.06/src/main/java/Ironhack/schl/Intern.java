package Ironhack.schl;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Intern extends Employee {
    public final double SALARY_LIMIT = 20000.0;
    private double internSalary;
    private boolean isIntern;

    public Intern(String name, String email, int age, double salary, boolean isIntern) {
        super(name, email, age, salary);
        isIntern = true;
    }

    public boolean isIntern() {
        return this.isIntern;
    }

    public void setIntern(boolean isIntern) {
        this.isIntern = true;
    }

    public void internMembership(double salary, double SALARY_LIMIT, boolean isIntern) {
        if (salary <= SALARY_LIMIT) {
            isIntern = true;
            System.out.println(isIntern);
        } else {
            System.out.println("Employee");
        }

    }
}
