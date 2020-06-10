/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author inesg
 */
public class Apuesta {

    //atributos
    private static int ultimo_num_apuesta = 1;//se incrementará secuencialmente
    private int num_apuesta;
    protected String nombre;
    protected String apellidos;

    //contructor vacio
    public Apuesta() {
    }

    //constructor copia
    public Apuesta(Apuesta Ap1) {
        this.num_apuesta = Ap1.num_apuesta;
        this.nombre = Ap1.nombre;
        this.apellidos = Ap1.apellidos;
    }

    //contructor con parametros
    public Apuesta(int num_apuesta, String nombre, String apellidos) {
        this.num_apuesta = ultimo_num_apuesta++;
        this.num_apuesta = num_apuesta;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    //get y set
    public static int getUltimo_num_apuesta() {
        return ultimo_num_apuesta;
    }

    public static void setUltimo_num_apuesta(int ultimo_num_apuesta) {
        Apuesta.ultimo_num_apuesta = ultimo_num_apuesta;
    }

    public int getNum_apuesta() {
        return num_apuesta;
    }

    public void setNum_apuesta(int num_apuesta) {
        this.num_apuesta = num_apuesta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void mostrarApuesta() {

        System.out.println("Numero apuesta:: " + this.getNum_apuesta());
        System.out.println("Nombre: " + this.getNombre().toUpperCase());
        System.out.println("Apellidos: " + this.getApellidos().toUpperCase());

    }

}
