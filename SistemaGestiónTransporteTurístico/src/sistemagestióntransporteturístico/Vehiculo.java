package sistemagestióntransporteturístico;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Natu
 */
public class Vehiculo implements Comparable<Vehiculo>{
    
    private String patente; //no se permiten patentes vacias y No permitir vehículos duplicados con la misma patente
    private String marca;
    private int capacidadPasajeros; // No permitir capacidad de pasajeros menor o igual a cero.
    private int anioFabricacion; //No permitir años menores a 1990 y  No permitir años mayores al actual.

    public Vehiculo(String patente, String marca, int capacidadPasajeros, int anioFabricacion) {
        this.patente = patente;
        this.marca = marca;
        this.capacidadPasajeros = capacidadPasajeros;
        this.anioFabricacion = anioFabricacion;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
    
    @Override
    public String toString() {
        return "Vehiculo: \n Patente: " + patente +
                "\n Marca: " + marca +
                "\n Anio: " + anioFabricacion +
                "\n Capacidad de Pasajeros: " + capacidadPasajeros;
    }
    
    
    // Se sobrescribe el compareTo para que ordene comparando los anios de fabricacion
    // y comparando la capacidad de pasajeros
    @Override
    public int compareTo(Vehiculo otro) {
        
        if (this.anioFabricacion != otro.anioFabricacion) {
            return Integer.compare(otro.anioFabricacion, this.anioFabricacion);
        }
        
        return Integer.compare(otro.capacidadPasajeros, this.capacidadPasajeros);
    } 
        
    
    
}
