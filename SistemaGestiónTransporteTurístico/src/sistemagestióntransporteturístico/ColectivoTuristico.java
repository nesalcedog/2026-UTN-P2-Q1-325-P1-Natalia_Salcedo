/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestióntransporteturístico;

/**
 *
 * @author Natu
 */
public class ColectivoTuristico extends Vehiculo {
    
    private short cantidadPisos; // 1 o 2

    public ColectivoTuristico(String patente, String marca, int capacidadPasajeros, int anioFabricacion, short cantidadPisos) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        this.cantidadPisos = cantidadPisos;
    }

    public short getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(short cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }
    
    @Override
    public String toString() {
        return "[Colectivo Turistico] " + super.toString() + 
                "\n Cantidad de Pisos: " + cantidadPisos;
                
    }
    
    
    
    
}
