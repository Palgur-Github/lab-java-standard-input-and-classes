package Ironhack.schl;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Employee employee1 = new Employee("Jack Hawk", "jhawk@company.ent",48,46001.3);
        Employee employee2 = new Employee("Janice Hale", "jhale@company.ent",39,25000);
        Employee employee3 = new Employee("Nicky Kelly", "nkelly@company.entt",35,35000);
        Employee employee4 = new Employee("Chihiro Osaka", "cosaka@company.ent",38,22000.3);
        Employee employee5 = new Employee("Ulrich Schneider", "uschneider@company.ent",29,20100.1);
        Employee employee6 = new Employee("Naga Naga", "nnaga@company.entt",35,34500);
        Employee employee7 = new Employee("Yehu Joab", "yjoab@company.ent",21,26500.7);
        Employee employee8 = new Employee("Jackie Hawke", "jhawk@company.ent",48,44000.1);
        Employee employee9 = new Employee("Julius Maximus", "jmaximus@company.ent",30,31000.9);

        PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
        System.setOut(out);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);
        System.out.println(employee6);
        System.out.println(employee7);
        System.out.println(employee8);
        System.out.println(employee9);

        Intern intern1 = new Intern("Yuki Oh", "yoh@company.ent",23,17000,false);
        System.out.println(intern1);
    }


}