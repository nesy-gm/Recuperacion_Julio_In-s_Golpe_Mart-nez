/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Random;

/**
 *
 * @author inesg
 */
public class SimulacionLoteria {

    Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {

        //lista de las primitivas simuladas con metodo random
        ArrayList<SimulacionLoteria> listaLoteria = new ArrayList<SimulacionLoteria>();
        SimulacionLoteria loteria;

        boolean salir = false;

        while (!salir) {
            System.out.println("=========================");
            System.out.println("=        M E N Ú        =");
            System.out.println("=========================");
            System.out.println(" 1 - Crear Apuesta");
            System.out.println(" 2 - Realizar simulación");
            System.out.println(" 3 - Salir");
            System.out.println("=========================");

            switch (pedirOpcion()) {
                case 1: {

                    break;
                }
                case 2: {
                    String nombre;
                    String apellido;
                    Scanner sc = new Scanner(System.in);
                    System.out.println("introduce tu nombre");
                    nombre = sc.next();
                    System.out.println("introduce tu apellido");
                    apellido = sc.next();
                    System.out.println("introduce el valor de tu apuesta");
                    int valor1 = sc.nextInt();
                    muestra_array(crearApuestaPrimitiva(valor1));//imprime el array que se genera al pasar por paramettro el valor, deben incidir los tipos y lo que retornan en este caso como retorna un array se puede pasar ese array al metodo de imprimir

                    break;
                }
                case 3: {
                    salir = true;
                    break;
                }
                default: {
                    System.out.println("Opción no válida");
                    break;
                }
            }
        }

    }

    /**
     * MENU*
     */
    //introducir la opción del menu
    public static int pedirOpcion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce la opción que deseas:");
        return leer.nextInt();
    }

    /**
     * Primitiva manual *
     */
    //rellena el array de forma manual
    public static int[] crearApuestaPrimitiva(int valor) {
        int num[] = new int[6];
        for (int i = 0; i < num.length; i++) {
            num[i] = valor;//se iguala el inicio array al numero pasado por parametro 
            valor++;
        }
        return num;

    }

    //recorre el array y lo imprime, se le pasa por parámetro un determinado array
    public static void muestra_array(int num[]) {

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");

        }
    }

    /**
     * Simulación aleagtoria *
     */
    
    //genera aleatorio
    public int generarAle(int min, int max) {
        return (int) ((max - min + 1) * Math.random() + min);
    }
    
    
    	/**genera numeros aleatorios con un tope de 1000*/
	public static int genera_aleatorio() {
		return ((int) Math.floor(Math.random() * 10));
	}

	/**en cada vuelta de bucle la posicion de i y ejecuta el random*/
	public static void rellena_array(int lista[]) {
		// rellenamos la lista con un bucle y el metodo random
		for (int i = 0; i < lista.length; i++) {
			lista[i] = genera_aleatorio();
		}
	}
    public void insertarSimulacion(SimulacionLoteria l){
        listaLoteria.add(l);
    }
    /*               
    public static List<Integer> generarAleatorio() {
// Metemos en una lista los números del 1 al 49.
        final int MAX_PRIMITIVA = 49;
        final int MIN_PRIMITIVA = 43;
        List<Integer> numbers = new ArrayList<>();
        List<Integer> sorteo = new ArrayList<>();
        System.out.println("tamaño" + numbers.size());
        System.out.println("valor1" + numbers.get(0));
        for (int i = 1; i < MAX_PRIMITIVA; i++) {
            numbers.add(i);
        }
// Instanciamos la clase Random
        Random random = new Random();
// Mientras queden números
        while (numbers.size() > MIN_PRIMITIVA) {
// Elegimos un índice al azar, entre 0 y el número de
            cartas que quedan por sacar
            int randomIndex = random.nextInt(numbers.size());
// Guardamos el número generado
            sorteo.add(numbers.get(randomIndex));
            // Y eliminamos la carta del mazo (la borramos de la
            lista
            )
numbers.remove(randomIndex);
        }
        return sorteo;
    }
     */
}



import java.util.Arrays;

public class DatosUnicos {

    private int vector[];
    private EntradaTeclado entrada1;

    public DatosUnicos() {
        vector = new int[6];
        entrada1 = new EntradaTeclado();
    }

    public int generarAle(int min, int max) {
        return (int) ((max - min + 1) * Math.random() + min);
    }

    public int buscar(int n) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == n) {
                System.out.println("Numero repetido... Por favor elija otro numero: ");
                return i;
            }
        }
        return -1;
    }

    public void llenarDatosAle() {
        vector = new int[6];
        int n;
        for (int i = 0; i < vector.length; i++) {
            do {
                n = generarAle(1, 49);
            } while (buscar(n) != -1);
            vector[i] = n;
        }
    }

   

}
