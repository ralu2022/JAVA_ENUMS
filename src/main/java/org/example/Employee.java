package org.example;

public class Employee {

    private String name;
    private String CNP;

    private Gender gender;

    Employee(String name, String CNP, Gender gender){
        this.name = name;
        this.CNP = CNP;
        this.gender = gender;

    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name + " " + CNP + " " + gender + "\n";
     }
}
