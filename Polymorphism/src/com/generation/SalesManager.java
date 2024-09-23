package com.generation;

import java.util.HashMap;

public class SalesManager extends Employee {
    // Atributo para almacenar el equipo de ventas (SalesReps)
    private HashMap<Integer, SalesRep> salesTeam;

    // Constructor que incluye los atributos de Employee y SalesManager
    public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked) {
        super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
        this.salesTeam = new HashMap<>(); // Inicializa el equipo de ventas
    }

    // Método para agregar un SalesRep al equipo de ventas
    public void addSalesRep(int id, SalesRep salesRep) {
        this.salesTeam.put(id, salesRep);
    }

    // Método para calcular la comisión del SalesManager basada en las ventas totales del equipo
    public double calculateComission() {
        double totalSales = 0.0;

        // Iterar sobre el equipo de ventas y sumar todas las ventas realizadas por los SalesReps
        for (SalesRep rep : salesTeam.values()) {
            totalSales += rep.getSalesMade();
        }

        return totalSales * 0.03;
    }

    // Getter y setter para salesTeam 
    public HashMap<Integer, SalesRep> getSalesTeam() {
        return salesTeam;
    }

    public void setSalesTeam(HashMap<Integer, SalesRep> salesTeam) {
        this.salesTeam = salesTeam;
    }
}
