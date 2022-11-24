/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colaspriority;

/**
 *
 * @author yahir
 */
public class ADTcolasPrioridad {
     private int max;
     private int[] arr;
     private int nElementos;
;     
     
     public ADTcolasPrioridad(){
         max = 8;
         arr = new int[max];
         nElementos = 0;
         
     }
     
     public void insertar (int val) {
         
         int i;
         if (nElementos == 0)
         {
             arr[0] = val;
             nElementos++;
             return;
         }
         
         for (i = nElementos - 1; i >=0; i--)
         {
             if ( val > arr[i]) 
             {
                 arr[i+1] = arr[i];
                 
             } else {
                 break;
             }
         }
         arr[i+1]= val;
         nElementos++;
     }
 
     public int remove(){
         return arr[--nElementos];
         
     }
     
     public boolean estaLlena(){
         return nElementos == max;
     }
     
     public boolean estaVacia(){
         return nElementos == 0;
         
     }
     
}
