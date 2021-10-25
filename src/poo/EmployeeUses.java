package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class EmployeeUses {
    public static void main(String[] args) {

        /*Employee employee1 = new Employee("juan",70000,1990,12,17);
        Employee employee2 = new Employee("carla",90000,1985,2,14);
        Employee employee3 = new Employee("laura",60000,1995,4,4);

        employee1.increaseTheSalary(5);
        employee2.increaseTheSalary(5);
        employee3.increaseTheSalary(5);

        System.out.println("nombre: "+ employee1.tellMeName() +" sueldo: " + employee1.tellMeSalary()
        + " fecha de alta: " + employee1.tellMeDate());

        System.out.println("nombre: "+ employee2.tellMeName() +" sueldo: " + employee2.tellMeSalary()
                + " fecha de alta: " + employee2.tellMeDate());

        System.out.println("nombre: "+ employee3.tellMeName() +" sueldo: " + employee3.tellMeSalary()
                + " fecha de alta: " + employee3.tellMeDate());*/
        Employee[] myEmployees = new Employee[4];
        myEmployees[0] = new Employee("juan", 75000, 1993, 2, 23);
        myEmployees[1] = new Employee("carlos", 100000, 1998, 1, 12);
        myEmployees[2] = new Employee("sebastian", 45000, 2000, 12, 3);
        myEmployees[3] = new Employee("mario");

        /*for (int i = 0; i < 3; i++) {*/
        for (Employee e: myEmployees){
        e.increaseTheSalary(5);

        }
        for (Employee e: myEmployees){
            System.out.println("nombre: "+ e.tellMeName() +" sueldo: " + e.tellMeSalary()
                    + " fecha de alta: " + e.tellMeDate());
        }
    }
}

class Employee { //metodo constructor
    public Employee(String name, double salary, int year, int month, int day) {

        this.name = name;
        this.salary = salary;

        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        date = calendar.getTime();

    }
    public Employee(String name){//metodo constructor
        this(name, 30000, 2000,01,01);
    }

    public String tellMeName() { //getter
        return name;
    }

    public double tellMeSalary() {//getter
        return salary;
    }

    public Date tellMeDate() { //getter
        return date;
    }

    public void increaseTheSalary(double percentage) { //setter
        double increase = salary * percentage / 100;
        salary += increase;

    }

    private final String name;
    private double salary;
    private Date date;

}