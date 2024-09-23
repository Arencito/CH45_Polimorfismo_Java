package com.generation;

public class SalesRep extends Employee {
    private double salesMade;

    // Constructor que incluye los atributos de Employee y SalesRep
    public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked, double salesMade) {
        // Llamada al constructor de la superclase (Employee)
        super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
        this.salesMade = salesMade;
    }

    // Método para calcular la comisión
    public double calculateComission() {
        return this.salesMade * 0.10;
    }

    // Getter y setter para salesMade
    public double getSalesMade() {
        return salesMade;
    }

    public void setSalesMade(double salesMade) {
        this.salesMade = salesMade;
    }
}
