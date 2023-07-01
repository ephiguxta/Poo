package com.mycompany.funcionario_contratado;

public class Employee {
    //Atributos
    private String name;
    private int hours;
    private double valuePerHour;
    
    //Construtor

    public Employee(String name, int hours, double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }
    
    //Métodos
    public double payment() {
        return this.valuePerHour * this.hours; 
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public Integer getHours() {
        return hours;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }
}
