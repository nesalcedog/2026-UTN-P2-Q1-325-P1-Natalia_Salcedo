package sistemagestióntransporteturístico;

/**
 *
 * @author Natu
 */
public class LanchaTuristica extends Vehiculo implements servicioTuristico {
    
    private String tipoMotor; //NAFTA DIESEL o ELECTRICO

    public LanchaTuristica(String patente, String marca, int capacidadPasajeros, int anioFabricacion, String tipoMotor) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        this.tipoMotor = tipoMotor;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
    
    @Override
    public String toString() {
        return "[Lancha Turistica] " + super.toString()
                + "\n Tipo de Motor: " + tipoMotor;

    }

    @Override
    public void realizarServicioTuristico() {
        System.out.println("Su Lancha incluye la realizacion de servicios turisticos.");
    }
    
    
}
