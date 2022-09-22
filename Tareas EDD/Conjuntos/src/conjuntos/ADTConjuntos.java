/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conjuntos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author yahir
 * @param <T>
 */
public class ADTConjuntos<T> {
    
    int tamanio;
    int elemento;
    ArrayList<T> conjunto;
    ArrayList<T> conjunto2;

    public ADTConjuntos() {
    }

    public ADTConjuntos(int tam) {
        this.tamanio = tam;
        conjunto = new ArrayList();
        for (int i = 0; i < this.tamanio; i++) {
            conjunto.add(null);
        }
    }
        public int getTamanio() {
        return tamanio;
    }
        public void contiene(){
            Scanner contiene = new Scanner(System.in);
            
            System.out.println("ingrese un elemento para conocer si pertenece a nuestro conjunto ");
            System.out.println("elemento: ");
            elemento = contiene.nextInt();
            
            if (conjunto.contains(elemento)){
                System.out.println("true");
            } else { 
                System.out.println("false");
            }
        }
        
        public void agregarElemento(){
            int agregar;
            Scanner adding = new Scanner(System.in);
            System.out.println("ingrese el elemento que desea agregar ");
            System.out.println("Elemento: ");
            agregar = adding.nextInt();
            
            if (conjunto.contains(agregar)){
                System.out.println("el conjunto ya contiene este elemento ");
            } else { 
                /*conjunto.add(agregar); falta definir agregar como un generico pero estoy investigando como*/
            }
          
        }
        public void subConjunto(){
            if (conjunto.equals(conjunto2)== true) {
                System.out.println("true ");
            } else {
                System.out.println("false ");
            }
           
        }
        public void unir(){
            conjunto.addAll(conjunto2);
        }
        public void diferencia(){
            conjunto.removeAll(conjunto2);    
            System.out.println(conjunto);
        }
        /*public void interseccion(){
           intersection(conjunto, conjunto2);
        }*/
        
        
}
