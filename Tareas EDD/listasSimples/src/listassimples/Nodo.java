/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listassimples;

/**
 *
 * @author yahir
 */
public class Nodo <T> {
    
    private T dato;
    private Nodo<T> sig;

    public Nodo(){
    }

    public Nodo(T valor){
        this.dato=valor;
    }

    public Nodo(T dato, Nodo<T> siguiente){
        this.dato= dato;
        this.sig = sig;
    }

    public Nodo<T> getSiguiente(){
        return sig;
    }

    public void setSiguiente(Nodo<T> sig){
        this.sig = sig;
    }

    public T getDato(){
        return dato;
    }

    public void setDato(T dato){
        this.dato = dato; 
    }

    @Override
    public String toString(){
        return "|"+dato+"| -->";
    }
    
    
    
}
