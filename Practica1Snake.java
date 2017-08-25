import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Practica1Snake {
    static Scanner scanner = new Scanner(System.in);
    static int numero ;
    static Usuario []usuario = new Usuario[5];
    static String nombre1;
    static int puntos1;
    static int tamanox;
    static int tamanoy;
    static int serpientex = 5;
    static int serpientey = 5;
    Serpiente snake = new Serpiente(serpientex, serpientey, '@');
    Marco marco = new Marco(tamanox, tamanoy);
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
                    System.out.println("1. Nombre Ususario");
                    System.out.println("2. Tamaño en X del Tablero");
                    System.out.println("3. Tamaño en Y del Tablero");
                    System.out.println("4. Tamaño inicial del Snake");
                    System.out.println("5. Regresar");
                    numero = Integer.parseInt(scanner.nextLine());
                    switch(numero){
                        case 1:
                            System.out.println("Escriba su nombre");
                            nombre1 = scanner.nextLine();
                            break;
                        case 2:
                            pedirTamanox();
                            break;
                        case 3:
                            pedirTamanoy();
                            break;
                            
                        case 4:
                            
                            
                            try{
                                
                            
                            try{
                            System.out.print(nombre1);
                            System.out.println("             "+puntos1);
                            llenar(nombre1, puntos1);
                            }catch(Exception e_excetion){
                            
                            }
                            Marco marco = new Marco(tamanox, tamanoy);
		            marco.pantalla();

		
                            Pared par = new Pared('#');
                            par.anadirFilas(marco, par, 0); 
                            par.anadirFilas(marco, par, marco.getAltura() - 1); 
                                                                                                                                                            
                            par.anadirColumna(marco, par, 0); 
                            par.anadirColumna(marco, par, marco.getAncho() - 1);
                                                                                                                                                            

                            
                            Serpiente snake = new Serpiente(serpientex, serpientey, '@');
                            marco.setLocalizacion(snake, snake.getX(), snake.getY());

                            
                            Comida comida = new Comida('*');
                            
                            comida.anadirComida(marco, comida);
                            
                            
                            Scanner scanner = new Scanner(System.in);
                            char dir;

                            
                            boolean jug = true;

                            while (jug) {
                                    marco.imprimir();
                                    
                                    switch (dir = scanner.nextLine().charAt(0)) {
                                    case 'a':
                                            snake.izquierda(marco, snake);
                                            break;
                                    case 'd':
                                            snake.derecha(marco, snake);
                                            break;
                                    case 'w':
                                            snake.arriba(marco, snake);
                                            break;
                                    case 's':
                                            snake.abajo(marco, snake);
                                            break;
                                    }
                            }
                            }catch(Exception e_excetion){
                                System.out.println("Has perdido");
                            }
                            
                            break;
                    }
                }
                break;
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
                break;
            case 3:
                for(int i = 0; i < 5; i++){
                    System.out.println(usuario[i]);
                }
        }
}
    }
     public static void llenar(String nombre, int puntos){
         
             Usuario us = null;
             us.setNombre(nombre);
             puntos = +10;
             us.setPunto(puntos);
             usuario[0]=us;
             
              
         
    }
    public static void pedirTamanox(){
		System.out.println("Introduce el tamaño en x:");
		tamanox = Integer.parseInt(scanner.nextLine());
    }
    public static void pedirTamanoy(){
		System.out.println("Introduce el tamaño en y:");
		tamanoy = Integer.parseInt(scanner.nextLine());
    }
}