package com.Herencia.Carros;

public class Carrera extends Vehiculo implements Especificaciones{

    public Carrera(int Pasajero,int Velocidad){
        super(Pasajero, Velocidad);
        this.TipoCombustible();
    }

   
    @Override
    public void TipoCombustible(){
        this.setTipoCombustible("Diesel");
    }
    @Override
    public void Girar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String Comportamiento() {
        this.setVelocidad(this.getVelocidad() * 3);
        return "Puedo competir en carreras";
    }
    
}