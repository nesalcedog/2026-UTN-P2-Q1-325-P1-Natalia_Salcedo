
package sistemagestióntransporteturístico;


import java.util.Scanner;

/**
 *
 * @author Natu
 */
public class Main {

    
    private static Scanner scanner = new Scanner(System.in);
    private static final GestionVehiculo nuevaGestion = new GestionVehiculo();
    
    public static void main(String[] args) {

        int opcion;
        do {
            mostrarMenu();
            System.out.println("Ingrese una opcion: ");
            //Validamos que ingrese un numero
            opcion = scanner.nextInt();
            scanner.nextLine(); //Para limpiar
            
            


            switch (opcion) {
                case 1: agregarVehiculo(); 
                        break;                
                case 2: mostrarTodosVehiculos(); 
                        break;
                case 3: realizarServicioTuristico(); 
                        break;
                case 4: buscarVehiculoPatente(); 
                        break;
                case 5: mostrarVehiculoCapacidadMayor(); 
                        break;
                case 6: mostrarVehiculosOrdenadosPorFabricacion(); 
                        break;
                case 7: mostrarVehiculosOrdenadosPorPasajeros(); break;
                case 8: System.out.println("¡Hasta luego!"); break;
                default: System.out.println("Opción inválida.");
            }

        } while (opcion != 8);

        scanner.close();
    }
    
    static void mostrarMenu() {
        System.out.println("----- MENU DE VEHICULOS -----");
        System.out.println(" 1. Agregar vehiculo");
        System.out.println(" 2. Mostrar todos los vehículos");
        System.out.println(" 3. Realizar servicios turísticos");
        System.out.println(" 4. Buscar vehículo por patente");
        System.out.println(" 5. Mostrar vehículos con capacidad mayor a un valor ingresado");
        System.out.println(" 6. Mostrar vehículos ordenados por año de fabricación descendente");
        System.out.println(" 7. Mostrar vehículos ordenados por capacidad de pasajeros descendente");
        System.out.println(" 8. Salir");
        System.out.println("========================================");
    }
        
    private static void agregarVehiculo(){    
        
        System.out.println("Elija que tipo de vehiculo quiere agregar: ");
        System.out.println("1. Colectivo Turistico \n 2.Van Ejecutiva \n 3. Lancha Turistica");
        
        int tipo = scanner.nextInt();
        scanner.nextLine(); //para limpiar el buffer
        
        if(tipo < 1 || tipo > 3){
            System.out.println("Tipo inválido"); 
            return;
        }
        
        //Agregamos la patente
        System.out.println("Patente: ");
        String patente = scanner.nextLine();
        
        //VALIDACION 1 : No permitimos patentes vacias
        if (patente.trim().isEmpty()){ 
            System.out.println("Error: La patente no puede estar vacia");   
            return;
        }        
        
        //Agregamos la marca
        System.out.println("Marca: ");
        String marca = scanner.nextLine();
        
        //Agregamos la cant. pasajeros
        System.out.println("Cantidad de pasajeros: ");
        int pasajeros = scanner.nextInt();
        
        //VALIDACION 2: No permitimos pasajeros menor o igual a cero
        if(pasajeros <= 0){
            System.out.println("Error: Los pasajeros no pueden ser negativos"); 
            return;
        }
        
        //Agregamos anio de Fabricacion
        System.out.println("Año de fabricacion: ");
        int anio = scanner.nextInt();
        
        //VALIDACION 3 Y 4: No permitimos anios menores de 1990 y mayores a 2026
        if(anio < 1990 && anio > 2026){
            System.out.println("Error: Rango de anio permitido de 1990 a 2026"); 
            return;
        }
        
        Vehiculo nuevoVehiculo;
        
        switch (tipo) {
            case 1: // Colectivo Turistico
                System.out.println("Cantidad de pisos (1 o 2): ");
                int pisos = scanner.nextInt();
                
                // VALIDACION 6: pisos debe ser 1 o 2
                if(pisos <= 0 && pisos >= 3){
                    System.out.println("Error: Cantidad de pisos invalidos."); 
                    return;
                }

                nuevoVehiculo = new ColectivoTuristico(patente, marca, pasajeros, anio, pisos);
                
                break;

            case 2: // Van Ejecutiva
                System.out.println("Posee aire?: S/N ");
                String tieneAire = scanner.nextLine();
                Boolean aire = false;
                
                if(tieneAire.equalsIgnoreCase("S"))
                {
                    aire = true;
                }else if(tieneAire.equalsIgnoreCase("S")){
                    aire = false;
                }else{
                    System.out.println("Opcion invalida");
                }

                
                nuevoVehiculo = new vanEjecutiva(patente, marca, pasajeros, anio, aire);
                break;

            case 3: // Lancha Turistica
                System.out.println("Tipo de Motor [1. NAFTA / 2. DIESEL / 3. ELECTRICO]: ");
                              
                int opcionMotor = scanner.nextInt();

                // Acá lo pasamos a String directo
                String motor = " ";

            switch (opcionMotor) {
                case 1:
                    motor = "NAFTA";
                    break;
                case 2:
                    motor = "DIESEL";
                    break;                    
                case 3:
                    motor = "ELECTRICO";
                    break;
                default:
                    System.out.println("Motor no valido"); //VALIDACION 7: Debe ser un motor valido
                    break;
            }

                // Corregido el typo: CruceroEstelar con "c"
                nuevoVehiculo = new LanchaTuristica(patente, marca, pasajeros, anio, motor);
                break;

        }
    }
    
    private static void mostrarTodosVehiculos(){      
                
        System.out.println(nuevaGestion.mostrarVehiculos());    
        
    }
    
    private static void realizarServicioTuristico(){      
                
        nuevaGestion.realizarServicioTuristico();    
        
    }
    
    private static void buscarVehiculoPatente(){      
        System.out.println("Ingrese la pantente a buscar: ");
        String patente = scanner.nextLine();        
        nuevaGestion.buscarVehiculoPorPatente(patente);    
        
    }

    private static void mostrarVehiculoCapacidadMayor() {
        System.out.println("Buscar vehiculos con capacidad mayor a: ");
        int capacidadMay = scanner.nextInt();        
        nuevaGestion.mostrarVehiculosCapacidad(capacidadMay);
    }

    private static void mostrarVehiculosOrdenadosPorFabricacion() {
        
        nuevaGestion.mostrarVehiculosPorAnioFabricacion();
        
    }

    private static void mostrarVehiculosOrdenadosPorPasajeros() {
        nuevaGestion.ordenarPorPasajeros();
    }
    
}
