/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package balanceopp;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author yahir
 */
public class BalanceoPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
         int texto;
        String nombre;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Que texto quiere leer? ");
        System.out.println("Inserte 1 para comprobar el balanceo del texto1.txt");
        System.out.println("Inserte 2 para comprobar el balanceo del texto2.txt");

        texto = teclado.nextInt();
        switch (texto) {
            case 1 -> {
                System.out.println("EL TEXTO ES:");
                nombre = "texto1.txt";
                Balancear p = new Balancear(nombre);
                System.out.println(p.balancear());
            }
            case 2 -> {
                System.out.println("EL TEXTO ES:");
                nombre = "texto2.txt";
                Balancear p = new Balancear(nombre);
                System.out.println(p.balancear());
            }

            default ->
                throw new AssertionError();
        }

    }
        
    
}
