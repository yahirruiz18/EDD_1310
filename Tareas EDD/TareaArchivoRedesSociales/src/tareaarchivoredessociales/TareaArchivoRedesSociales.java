/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaarchivoredessociales;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author yahir
 */
public class TareaArchivoRedesSociales {

    public static final String SEPARADOR = ",";

public static void main(String[] args) {
    
    
    
 BufferedReader bufferLectura = null;
 
 String [][] tabla = new String [19][15];
 int i= 0;
 
 try {
  // Abrir el .csv en buffer de lectura
  bufferLectura = new BufferedReader(new FileReader("/home/yahir/Proyecto tarea/presenciaredes.csv"));
  
  // Leer una linea del archivo
  String linea = bufferLectura.readLine();
  
  /*for (int copia = 0; copia<19 ; copia++)*/
  while (linea != null) {
   // Sepapar la linea leída con el separador definido previamente
   String[] campos = linea.split(SEPARADOR);
   
   //System.out.println(Arrays.toString(campos));
   
   for (int ii=0 ; ii<15 ; ii++) {
       tabla[i][ii] = campos[ii];
       
   }
   System.out.println(Arrays.toString(tabla[i]));
   // Volver a leer otra línea del fichero
   linea = bufferLectura.readLine();
   i++;
  }
  
  //almacenar enteros fb tw crecimiento
  int ic;
  int[] seguidoresfb = new int [6];
  int[] seguidorestw = new int [6];
  int[] crecimientofb = new int [6];
  int[] crecimientotw = new int [6];
  int[] visualizacionesyt = new int [6];
  
 
 
for (ic= 0; ic<6; ic++){
   
    seguidorestw[ic]= Integer.parseInt(tabla[8][3+ic]);
    visualizacionesyt[ic]= Integer.parseInt(tabla[16][3+ic]);
    crecimientofb[ic] = Integer.parseInt(tabla[2][3+ic]);
    crecimientotw[ic] = Integer.parseInt(tabla[9][3+ic]);
    
            
  }
     
 System.out.println("--------------------------------------");
     System.out.println("Se muestra el numero de seguidores en cuestion a los meses de Enero a Junio en orden"
             + "dentro de la red social Twitter");

Arrays.toString(seguidorestw);
     System.out.println(Arrays.toString(seguidorestw));
     
     int diferenciaDeSeguidores;
     diferenciaDeSeguidores = seguidorestw[5] - seguidorestw[0];
     
     System.out.println("La diferencia seguidores en twitter entre el mes de enero y junio es de: " + diferenciaDeSeguidores);
     
     System.out.println("-------------------------------------------");
     
     System.out.println("Se muestra el numero de visualizaciones de los meses enero a junio en Youtube");
     
     Arrays.toString(visualizacionesyt);
     
     System.out.println(Arrays.toString(visualizacionesyt));
     
     Scanner entrada = new Scanner(System.in);
     int mes;
     int mes2;
     
     System.out.println("seleccione dos numeros del 1 al 6 que correspondan a los meses"
             + " de los cuales busca saber la diferencia de visualizaciones ");
     
     System.out.println("mes 1: ");
     mes = entrada.nextInt();
     
     System.out.println("mes 2: ");
     mes2 = entrada.nextInt();
     
     System.out.println("La diferencia de visualizaciones entre dichos meses es de: ");
     
     int diferencia;
     
     diferencia = visualizacionesyt[mes2-1] - visualizacionesyt[mes-1];
     
     System.out.println(diferencia + " visualizaciones");
     
     
     System.out.println("--------------------------------------------");
     
     System.out.println("Se muestra el crecimiento de seguidores en facebook y twitter respectivamente durante los meses de enero a junio");
     
     Arrays.toString(crecimientofb);
     Arrays.toString(crecimientotw);
     
     System.out.println("Crecimiento en facebook" + Arrays.toString(crecimientofb));
     System.out.println("Crecimiento en twitter" + Arrays.toString(crecimientotw));
     
    int sum = 0;
        for (int iii = 0; iii < crecimientofb.length; iii++) {
            sum+=crecimientofb[iii];
        }
        System.out.println("El promedio de crecimiento de seguidores en facebook durante los meses de enero a junio es de  " +sum / 6);
        
        int suma = 0;
        for (int iiii = 0; iiii < crecimientotw.length; iiii++) {
            suma+=crecimientotw[iiii];
        }
        System.out.println("El promedio de crecimiento de seguidores en twitter durante los meses de enero a junio es de " +suma / 6);
     
     
     
     
     
     
 
 }
 catch (IOException e) {
  e.printStackTrace();
 }
 finally {
  // Cierro el buffer de lectura
  if (bufferLectura != null) {
   try {
    bufferLectura.close();
   } 
   catch (IOException e) {
    e.printStackTrace();
   }
  }
 }
}
    
}
