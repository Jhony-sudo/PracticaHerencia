package com.Herencia.Carros;

public class Camioneta extends Vehiculo implements Especificaciones{

    public Camioneta(int Pasajero,int Velocidad){
        super(Pasajero, Velocidad);
    }

    @Override
    public void TipoCombustible(){
        this.setTipoCombustible("Diesel");
    }
    @Override
    public void Girar() {
       
    }

    @Override
    public String Comportamiento() {
        return "Soy una Camioneta";
    }
}