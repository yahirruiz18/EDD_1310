/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

/**
 *
 * @author yahir
 */
public class ADTcolas
{
    
    private Nodo inicioCola, finalCola;
    
    
    public ADTcolas()
    {
        
        inicioCola = null;
        finalCola = null;
        
    }
    
    public boolean ColaVacia()
    {
        
        if (inicioCola == null)
        {
            
            return true;
        }
        else 
        {
            return false;
        }    
        
    }
    
    public void insertar (int info){
        
        Nodo nodoInser = new Nodo();
        
        nodoInser.dato = info;
        nodoInser.sig = null;
        
        if (ColaVacia()) {
            
            inicioCola = nodoInser;
            finalCola = nodoInser;
            
        }
        else
        {
            finalCola.sig = nodoInser;
            finalCola = nodoInser;
            
        }
        
    }
    
    public int Extraer(){
        if (!ColaVacia())
        {
            int info = (int) inicioCola.dato;
            
            if (inicioCola.equals(finalCola)) {
                
                inicioCola =null;
                finalCola=null;
            }
            else 
            {
                inicioCola = inicioCola.sig;
                
            }
            return info;
            
        }
        else {
            return 0;
        }
    }
}
