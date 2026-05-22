/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestióntransporteturístico;

import java.util.ArrayList;

/**
 *
 * @author Natu
 */
public class GestionVehiculo {
    
    private ArrayList<Vehiculo> vehiculos;
    
    public GestionVehiculo(){
        vehiculos = new ArrayList<Vehiculo>();
    }
    
    
    public void mostrarVehiculo(){
        
        //Verificamos si existe un vehiculo cargado en la lista
        if(vehiculos.isEmpty()){
            System.out.println("No hay ningun vehiculo cargado.");
            return;
        }
        
        System.out.println("----- Lista de Vehiculos  -----");
        
        for(int i = 0; i < vehiculos.size(); i ++){
            
            
        }
        
    }
    
}
