/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

import arreglo.Array;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author yahir
 */
public class NominaADT {
    
    String nombreEmpresa;
    Array<Empleado> nomina;
    String rutaArchivo;
    public static final String SEPARADOR = ",";
    
    public NominaADT(String ruta){
    
        
        this.rutaArchivo=ruta;
    String [][] tabla = new String [15][7];
    int i=0;
    BufferedReader bufferLectura = null;
        try{
        bufferLectura = new BufferedReader(new FileReader("/home/yahir/Downloads/junio.dat"));
        String linea = bufferLectura.readLine();
        

        
        while (linea != null){
            String[] campos = linea.split(SEPARADOR);
           
            for (int ii=0 ; ii<15 ; ii++) {
       tabla[i][ii] = campos[ii];
       
   }
            System.out.println(Arrays.toString(tabla[i]));
   // Volver a leer otra línea del fichero
   linea = bufferLectura.readLine();
   i++;
  
   int ic;
   
   int[] numeroDeTrabajador = new int [16];
   int[] nombres = new int [16];
   int[] paterno = new int [16];
   int[] materno = new int [16];
   int[] horasExtra = new int [16];
   int[] sueldoBase = new int [16];
   int[] anioDeIngreso = new int [16];
   
   for (ic= 0; ic<17; ic++){
   
   numeroDeTrabajador[ic]= Integer.parseInt(tabla[ic][1]);
   nombres[ic]= Integer.parseInt(tabla[ic][2]);
   paterno[ic]= Integer.parseInt(tabla[ic][3]);
   materno[ic]= Integer.parseInt(tabla[ic][4]);
   horasExtra[ic]= Integer.parseInt(tabla[ic][5]);
   sueldoBase[ic]= Integer.parseInt(tabla[ic][6]);
   anioDeIngreso[ic]= Integer.parseInt(tabla[ic][7]);
       
   }
   
   
   
        }   
        } catch(FileNotFoundException ex){
            System.err.println(ex.getMessage());
        } catch(IOException ex){
            System.err.println(ex.getMessage());
        } 
    }
            
    
    
}
