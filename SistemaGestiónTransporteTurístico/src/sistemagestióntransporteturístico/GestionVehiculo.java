
package sistemagestióntransporteturístico;
import java.util.ArrayList;

/**
 *
 * @author Natu
 */
public class GestionVehiculo {
    
    private ArrayList<Vehiculo> vehiculos;
    
    public GestionVehiculo(){
        vehiculos = new ArrayList<>();
    }
    
    //Metodo para mostrar Vehiculos ingresados en la lista
    public void mostrarVehiculo(){
        
        //Verificamos si existe un vehiculo cargado en la lista
        verificacionArrayVacio(vehiculos);
        
        System.out.println("----- Lista de Vehiculos  -----");
        
        for(int i = 0; i < vehiculos.size(); i ++){
            
            System.out.println(vehiculos.get(i).toString());                   
            
        }
        
    }
     
    public void realizarServicioTuristico(){

        verificacionArrayVacio(vehiculos);
        
        System.out.println("Verificando si puede hacer servicio turistico...");
        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo vehiculoActual = vehiculos.get(i);
            // Verificamos el vehiculo implementa servicioTuristico
            if (vehiculoActual instanceof servicioTuristico) {
                servicioTuristico siServicioTuristico = (servicioTuristico) vehiculoActual; //si pasa el if, sabemos que si, entonces lo casteo
                siServicioTuristico.realizarServicioTuristico();
            } else {
                // Si no implementa, entonces no puede realizar el servicio
                System.out.println("El vehiculo " + vehiculoActual.getMarca() + " no realiza servicios turisticos.");
            }
        }
    }
    

    public void mostrarVehiculosCapacidad(int capacidadMax) {
        
        verificacionArrayVacio(vehiculos);

        System.out.println("----- Vehiculos con mayor capacidad a " + capacidadMax + "-----");

        for (int i = 0; i < vehiculos.size(); i++) {

            Vehiculo vehiculoActual = vehiculos.get(i);

            if (vehiculoActual.getCapacidadPasajeros() > capacidadMax) {

                System.out.println(vehiculoActual.getMarca() + "tiene una capacidad mayor a  " + vehiculoActual.getCapacidadPasajeros());
            }

        }

    }

    public void verificacionArrayVacio(ArrayList lista) {

        if (lista.isEmpty()) {
            System.out.println("No hay ningun vehiculo cargado.");
            return;
        }
}