package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        List<Month> months = new ArrayList<>();

        months.add(Month.JAN);
        months.add(Month.FEB);
        months.add(Month.MARCH);
        months.add(Month.APRIL);
        months.add(Month.MAY);
        months.add(Month.JUNE);
        months.add(Month.JULY);
        months.add(Month.AUGUST);
        months.add(Month.SEPTEMBER);
        months.add(Month.OCTOBER);
        months.add(Month.NOVEMBER);
        months.add(Month.DECEMBER);

        System.out.println("\n" + "ENUMS EXAMPLE: " + "\n");

        System.out.println("First version of listing the months: " + months);

        months.addAll(List.of(Month.values()));

        System.out.println("Second version of listing the months: " + months + "\n");

        List<Planet> planets = new ArrayList<>();

        /* planets.add(Planet.VENUS);
        planets.add(Planet.MERCURY);*/

        planets.addAll(List.of(Planet.values()));

        System.out.println(planets + "\n");

        System.out.println(Planet.MERCURY.surfaceGravity());
        System.out.println((Planet.VENUS.surfaceGravity() + "\n"));

        List<Employee> employeeList = new ArrayList<>();

        Employee employee = new Employee("Ion Popescu", "2840911080041", Gender.Male);
        Employee employee1 = new Employee("Maria Ionescu", "1470511080035", Gender.Female);

        employeeList.add(employee);
        employeeList.add(employee1);

        System.out.println(employee.hashCode());
        System.out.println(employee1.getName());
        System.out.println(employee1);

    }
}
