/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balanceopp;
import java.util.ArrayList;

/**
 *
 * @author yahir
 * @param <T>
 */
public class PilasADT<T> {
    
    ArrayList datos;
    int  tope;

    public PilasADT() {
        datos = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return datos.size()==0;
    }
    public int getLength (){
            return datos.size();
    }
     
    public T pop(){
        T sacado = (T) datos.remove(tope);
        tope --;
        return sacado;
    }
    
    public void push (T dato){
        
        datos.add(dato);
        tope = datos.size()-1;
        
    }
    
    public T peek(){
        return (T) datos.get(tope);
    }
    
    @Override
    public String toString() {
        return   "" + datos  ;
    }
    
}
