/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestióntransporteturístico;

/**
 *
 * @author Natu
 */
public class vanEjecutiva extends Vehiculo {
    
    private Boolean aireAcondicionado;

    public vanEjecutiva(String patente, String marca, int capacidadPasajeros, int anioFabricacion, Boolean aireAcondicionado) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        this.aireAcondicionado = false; //de base no tiene
    }

    public Boolean getAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(Boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }
    
    @Override
    public String toString() {
        String tieneAire = "";
        
        if(aireAcondicionado == true){
             tieneAire = "Si";
        }else{
            tieneAire = "No";
        }
        
        return "[Colectivo Turistico] " + super.toString() + 
                "\n Tiene aire acondicionado: " + tieneAire;
                
    }
    
    
}
