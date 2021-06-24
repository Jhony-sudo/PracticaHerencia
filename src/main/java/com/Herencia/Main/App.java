package com.Herencia.Main;

import com.Herencia.Carros.Camioneta;
import com.Herencia.Carros.Carrera;
import com.Herencia.Carros.Carga;
import com.Herencia.Carros.Vehiculo;
import java.util.*;
public class App {

    public static void main( String[] args ){
        App Herencia = new App();
       
    }
    Scanner leer = new Scanner(System.in);
    public App(){
        int Seleccion;
        int Continuar;
        do{
        LlenarVehiculos();
        System.out.println("Ingrese el identificador de un vehiculo 1 -5 para comprobar");
        Seleccion = leer.nextInt();
        Verificar(Vehiculos[Seleccion-1]);
        System.out.println(Vehiculos[Seleccion - 1].toString());

        Continuar = leer.nextInt();
        }while(Continuar != 2);
    }
    Vehiculo[] Vehiculos = new Vehiculo[5];
    
    public void LlenarVehiculos(){
        Random r = new Random();
        for(int i =0;i < Vehiculos.length;i++){
            int Seleccion = r.nextInt(3);
            switch(Seleccion){
                case 0:
                Vehiculos[i] = new Camioneta(18,55) ;
                break;
                case 1:
                Vehiculos[i] = new Carga(2,30);
                break;
                case 2:
                Vehiculos[i] = new Carrera(2,120);
                break;

            }
        }
    }

    public void Verificar(Vehiculo Carro){
        if(Carro instanceof Camioneta){
            System.out.println("Es una Camioneta");
        }
        if(Carro instanceof Carrera){
            System.out.println("Vehiculo de carreras");
        }
        if(Carro instanceof Carga){
            System.out.println("Es un vehiculo de carga");
        }
    }
}
