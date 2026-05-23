
package sistemagestióntransporteturístico;

/**
 *
 * @author Natu
 */
public class ColectivoTuristico extends Vehiculo implements servicioTuristico{
    
    private int cantidadPisos; // 1 o 2

    public ColectivoTuristico(String patente, String marca, int capacidadPasajeros, int anioFabricacion, int cantidadPisos) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        this.cantidadPisos = cantidadPisos;
    }

    public int getCantidadPisos() {
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
    
    @Override
    public void realizarServicioTuristico() {
        System.out.println("Su colectivo incluye la realizacion de servicios turisticos.");
    }
    
    
    
    
}
