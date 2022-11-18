/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balanceopp;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author yahir
 */
public class Balancear {
    
    private String nombre;
    private String linea;
    private PilasADT<Character> lista = new PilasADT();
    private int i = 0;
    private int ii = 0;
    
    
    public Balancear(String nombre){
        this.nombre = nombre;
    }
    
    public String balancear() throws FileNotFoundException, IOException{
        BufferedReader buffer = new BufferedReader(new FileReader(nombre));
        
        linea = buffer.readLine();
        while (linea != null) {
            
            System.out.println(linea);
            
            char arreglo_letras[] = linea.toCharArray();
            
            for (int i = 0; i < arreglo_letras.length; i++) {
               
                if (arreglo_letras[i] == '(')
                {
                    lista.push('(');
                    i++;

                } else 
                    if (arreglo_letras[i] == ')') 
                    {
                    if (!lista.isEmpty()) 
                    {
                        lista.pop();
                        ii++;
                    }
                }
            }
            linea = buffer.readLine();
        }
        if (lista.isEmpty()) {
            return "\nSALIDA: Esta correctamente balanceada en parentesis \n" +
            "Numero de parentesis abiertos: " + i + "\n"+
            "Numero de parentesis cerrados: " + ii + "\n\n";

        } else {
            return "\nSALIDA: No esta balanceada en parentesis \n" +
            "Numero de parentesis abiertos: " + i + "\n"+
            "Numero de parentesis cerrados: " + ii + "\n\n";
        }
    }
    
}
