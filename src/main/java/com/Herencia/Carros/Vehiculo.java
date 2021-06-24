
package com.Herencia.Carros;
public abstract class Vehiculo{
    private String TipoCombustible;
    private int Combustible;
    public int CantidadPasajeros;
    public int Velocidad;
    private double Aceleracion;
    private String Tipo;

    public Vehiculo(int Pasajeros, int Velocidad){
        this.CantidadPasajeros = Pasajeros;
        this.Velocidad  = Velocidad;
        this.TipoCombustible();
    }

    public abstract void TipoCombustible();

    public void setVelocidad(int Velocidad){
        this.Velocidad = Velocidad;
    }

    public String getTipoCombustible() {
        return TipoCombustible;
    }
    
    public int getVelocidad() {
        return Velocidad;
    }
    
    public int getCantidadPasajeros() {
        return CantidadPasajeros;
    }
    
    public int getCombustible() {
    return Combustible;
    }

    public double getAceleracion() {
        return Aceleracion;
    }

    @Override
    public String toString(){
        return " Gasolina: " +  TipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        TipoCombustible = tipoCombustible;
    }

}