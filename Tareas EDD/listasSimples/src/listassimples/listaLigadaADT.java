/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listassimples;

/**
 *
 * @author yahir
 * @param <T>
 */
public class listaLigadaADT <T> {
    
    Nodo<T> head;
    int despuesDe;
    int ref;
    T valor;
    int tamanio;

    public listaLigadaADT() {
    }
    
    public boolean estaVacia(){
        
        return this.head==null;
        
        }
    
    public int getTamanio(){
        
        return this.tamanio;
        
    }
    
    public void agregarAlFinal(T dato){
        
        this.valor=dato;
        if(this.head==null){
            head= new Nodo(dato);
        }else{
            Nodo<T> nuevo= new Nodo(dato);
            Nodo<T> aux= this.head;
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        System.out.println("Dato agregado al final");
    } 
    
    public void agregarInicio(T dato){
        this.valor=dato;
        if(this.head==null){
            head= new Nodo(dato);
        }else{
            Nodo<T> nuevo= new Nodo(dato);
            nuevo.setSiguiente(head);
            head=nuevo;
        }
    }
    
    public void agregarDespuesDe(int despuesDe, T dato){
        this.despuesDe = despuesDe;
        this.valor= dato;
        for(int i=0; i<= despuesDe; i++){
            head.getSiguiente();
        }
        Nodo<T> nuevo= new Nodo(dato);
        head.setSiguiente(nuevo);
    }
    
    public void eliminar(int ref){
        this.ref=ref;
         for(int i=0; i<=ref; i++){
            head.getSiguiente();
        }
        head.setSiguiente(null);
    }
    
    public void eliminarElPrimero(){
        Nodo<T> aux=this.head;
        aux.getSiguiente();
        head=null;
        head=aux;
    }
    
     public void elminartElFinal(){
         Nodo<T> aux = this.head; 
        while(aux.getSiguiente()!=null){
           aux=aux.getSiguiente();
        }
        aux.setSiguiente(null);
    }
     
        public int buscar(T valor){
        int posicion=0;
        Nodo<T> aux = this.head;
        while(aux.getSiguiente()==valor)
        {
            aux= (Nodo<T>) aux.getDato();
            posicion+=1;
        }
         aux.getDato();
        return posicion;
        
        }
        

         public void tranversal(){
        Nodo<T> aux = head;
        while(aux!=null){
            
            System.out.println(aux);
            aux = aux.getSiguiente();
            
        }
    }
}

