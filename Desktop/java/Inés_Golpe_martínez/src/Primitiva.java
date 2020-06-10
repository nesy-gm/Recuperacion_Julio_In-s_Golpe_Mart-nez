/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author inesg
 */
public class Primitiva extends Apuesta {

    //atributos
    private int listaNum[] = new int[6];
    private int aciertos = 0;

    //contructor vacio
    public Primitiva() {
         generarPrimitiva();
    }
    

    public Primitiva(Apuesta Ap1) {
        super(Ap1);
    }

    public Primitiva(int num_apuesta, String nombre, String apellidos) {
        super(num_apuesta, nombre, apellidos);
        this.setListaNum(listaNum);
        this.setAciertos(aciertos);

    }

    public int[] getListaNum() {
        return listaNum;
    }

    public void setListaNum(int[] listaNum) {
        this.listaNum = listaNum;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
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

    //Métodos
    @Override
    public void mostrarApuesta() {
        super.mostrarApuesta();
        System.out.println("Lista de numeros: " + Arrays.toString(this.getListaNum()));
        System.out.println("Aciertos: " + this.getAciertos());

    }
    
     //genera aleatorio
    public int generarAle(int min, int max) {
        return (int) ((max - min + 1) * Math.random() + min);
    }

    private void generarPrimitiva() {
        for (int i = 0; i < listaNum.length; i++) {
            int j = listaNum[i];
            
        }
    }
    }
    
