package sistemagestióntransporteturístico;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Natu
 */
public class GestionVehiculo {

    private ArrayList<Vehiculo> vehiculos;

    public GestionVehiculo() {
        vehiculos = new ArrayList<>();
    }
    
    //PUNTO 1
    public void agregarVehiculo(Vehiculo nuevoVehiculo)  {

        // Recorremos la lista con el for tradicional usando el índice "i"
        for (int i = 0; i < vehiculos.size(); i++) {

            // Rescatamos a la persona que está en la posición "i"
            Vehiculo vehiculoActual = vehiculos.get(i);

            // VALIDACION 5 :Comparamos si la patente ya existe
            if (vehiculoActual.getPatente().equals(nuevoVehiculo.getPatente())) {

                // Si encontramos coincidencia, lanzamos tu error personalizado y el método se corta acá
                System.out.println("No se puede crear vehiculo. Patente existente en el sistema.");
                return;
            }
        }
   
        vehiculos.add(nuevoVehiculo);
        System.out.println("Se agrego correctamente el vehiculo: " + nuevoVehiculo.toString());
    }
    
    //PUNTO 2
    //Metodo para mostrar Vehiculos ingresados en la lista
    public String mostrarVehiculos() {

        //Verificamos si existe un vehiculo cargado en la lista
        verificacionArrayVacio(vehiculos);

        System.out.println("----- Lista de Vehiculos  -----");

        for (int i = 0; i < vehiculos.size(); i++) {

            return vehiculos.get(i).toString();

        }
        return null;
    }

    //PUNTO 3
    public void realizarServicioTuristico() {

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
                System.out.println("El vehiculo " + vehiculoActual.toString()+ " no realiza servicios turisticos.");
            }
        }
    }
    
   //PUNTO 5
    public void mostrarVehiculosCapacidad(int capacidadMax) {

        verificacionArrayVacio(vehiculos);

        System.out.println("----- Vehiculos con mayor capacidad a " + capacidadMax + "-----");

        for (int i = 0; i < vehiculos.size(); i++) {

            Vehiculo vehiculoActual = vehiculos.get(i);

            if (vehiculoActual.getCapacidadPasajeros() > capacidadMax) {

                System.out.println(vehiculoActual.toString() + "tiene una capacidad mayor a  " + vehiculoActual.getCapacidadPasajeros());
            }

        }

    }
    
    
    //PUNTO 4
    public Vehiculo buscarVehiculoPorPatente(int patenteBuscada)  {
        

        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo vehiculoActual = vehiculos.get(i);
            

            if (vehiculoActual.getPatente().equals(patenteBuscada)) {
                return vehiculoActual;
            }else{
                System.out.println("No se encontro el DNI ingresado");
                return null;                
            }
        }
        return null;


    }
    
    //PUNTO 6
       
    public void mostrarVehiculosPorAnioFabricacion() {
        
        ArrayList<Vehiculo> copia = new ArrayList<>(vehiculos); 
        copia.sort(new Comparator<Vehiculo>() {
            @Override
            public int compare(Vehiculo n1, Vehiculo n2) {
                return Integer.compare(n2.getAnioFabricacion(), n1.getAnioFabricacion());
            }
        });
        
        mostrarVehiculos();
    }
    
    //PUNTO 7
    public void ordenarPorTripulacion(){
        ArrayList<Vehiculo> copia = new ArrayList<>(vehiculos);  
        
        copia.sort(new Comparator<Vehiculo>(){
            @Override
            public int compare(Vehiculo n1, Vehiculo n2){
                return Integer.compare(n2.getCapacidadPasajeros(), n1.getCapacidadPasajeros()); 
            }   
        });
        mostrarVehiculos();
    }
    
    public void verificacionArrayVacio(ArrayList lista) {

        if (lista.isEmpty()) {
            System.out.println("No hay ningun vehiculo cargado.");
            return;
        }
    }
}
