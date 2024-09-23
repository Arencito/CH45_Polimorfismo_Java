package com.generation;

public class Employee {
    // Atributos
    private String firstName;
    private String lastName;
    private int registration;
    private int age;
    private int daysWorked;
    private int vacationDaysTaken;
    private double salary;
    private int yearsWorked;

    // Constructor
    public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.age = age;
        this.daysWorked = daysWorked;
        this.vacationDaysTaken = vacationDaysTaken;
        this.salary = salary;
        this.yearsWorked = yearsWorked;
    }

    // Método para calcular el tiempo hasta la jubilación
    public int timeToRetirement() {
        
        int retirementAge = 60;
        int maxYearsWorked = 40;
        return Math.min(retirementAge - this.age, maxYearsWorked - this.yearsWorked);
    }

    // Método para calcular el tiempo de vacaciones restantes
    public int vacationTimeLeft() {
       
        int totalVacationDays = 30;
        return (int) ((this.daysWorked / 360.0) * (totalVacationDays - this.vacationDaysTaken));
    }

    // Método para calcular el bono
    public int calculateBonus() {
       
        return (int) (2.2 * this.salary);
    }

    // Getters y setters (si los necesitas)
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

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    public int getVacationDaysTaken() {
        return vacationDaysTaken;
    }

    public void setVacationDaysTaken(int vacationDaysTaken) {
        this.vacationDaysTaken = vacationDaysTaken;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearsWorked() {
        return yearsWorked;
    }

    public void setYearsWorked(int yearsWorked) {
        this.yearsWorked = yearsWorked;
    }
}

