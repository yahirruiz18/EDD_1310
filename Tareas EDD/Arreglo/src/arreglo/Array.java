/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglo;

import java.util.ArrayList;


/**
 *
 * @author yahir
 */
public class Array{
    
    
    int tamanio;
    int indice;
    String valor;
    
    ArrayList<String> Arrays = new ArrayList<>();

    public Array() {
    }

    public Array(int tamanio) {
        this.tamanio = tamanio;
    }
    public static int getLongitud (int tamanio) {
    return tamanio;
    
    }
    
    public int getElemento(int indice) {
    return indice;
     
    }
        
     public void limpiar(int valor){
     Arrays.clear();
     
    }

     /*public String toString() {
         return "arrays{" + arrays + '}';
     }*/
}

