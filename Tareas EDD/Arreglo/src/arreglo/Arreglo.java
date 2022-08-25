/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglo;

import java.util.ArrayList;
import java.util.Arrays;



/**
 *
 * @author yahir
 */
public class Arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Arreglo[] alumnos = new Arreglo[5];
        Alumno a1 = new Alumno(19, "319081846", "yahir");
        
        System.out.println(a1);
        
        System.out.println("-----------SET EDAD------------");
        
        a1.setEdad(40);
        
        System.out.println(a1);
        
        //ESTO NO ES LA TAREA, LA TAREA ES LA CLASE ARRAY
        //PRUEBAS

        
        }
         
}
