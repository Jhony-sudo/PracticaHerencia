package com.Herencia.Carros;

public class Carga extends Vehiculo implements Especificaciones{
    
    public Carga(int Pasajero,int Velocidad){
        super(Pasajero, Velocidad);
    }

    
    @Override
    public void TipoCombustible(){
        this.setTipoCombustible("Gasolina");
    }

    @Override
    public void Girar() {
       
    }

    @Override
    public String Comportamiento() {
       return "Soy un vehiculo de carga";
    }
    
}