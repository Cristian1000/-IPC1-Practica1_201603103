import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Practica1Snake {
    static Scanner scanner = new Scanner(System.in);
    static int numero ;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    while(numero != 4){
        System.out.println("Elija una Opcion");   
        System.out.println("1. Inicio del Juego");
        System.out.println("2. Datos del Estudiante");
        System.out.println("3. Historial de Partidas Jugadas");
        System.out.println("4. Salir");
        numero = Integer.parseInt(scanner.nextLine());
        switch(numero){
            case 1:
                while(numero != 5){
                    System.out.println("Elija una Opcion");   
                    System.out.println("i. Nombre Ususario");
                    System.out.println("ii. Tamaño en X del Tablero");
                    System.out.println("iii. Tamaño en Y del Tablero");
                    System.out.println("iv. Tamaño inicial del Snake");
                    System.out.println("v. Regresar");
                    numero = Integer.parseInt(scanner.nextLine());
                    switch(numero){
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                    }
                }
            case 2:
                while(numero != 1){
                    System.out.println("Nombre: Cristian Daniel Raguay Vicente");
                    System.out.println("Carnet: 201603103");
                    System.out.println("1. Regresar");
                    numero = Integer.parseInt(scanner.nextLine());
                    switch(numero){
                        case 1:
                    }
                }
            case 3:
        }
}
    }
    
}
