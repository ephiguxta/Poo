package com.mycompany.funcionario_contratado;

public class OutsourcedEmployee extends Employee{
    //Atributos
    private double addtionalCharge;

    //Construtor

    public OutsourcedEmployee(double addtionalCharge, String name, int hours, double valuePerHour) {
        super(name, hours, valuePerHour);
        this.addtionalCharge = addtionalCharge;
    }
    
    public void setAddtionalCharge(double addtionalCharge) {
        this.addtionalCharge = addtionalCharge;
    }
    
    @Override
    public double payment() {
        return getHours() * getValuePerHour() + (1.1 * this.addtionalCharge);
    }
}
