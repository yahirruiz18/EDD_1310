/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinaledd;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author yahir
 */
public class ProyectofinalEDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        
        System.out.println("EJEMPLO DE LAS FUNCIONES PARA LA CLASE HASH_MAP");
        
        //CODIGO DE EJEMPLO PARA EL ADT HASH MAP
        //Declaramos HashMap
        Map<Integer, String> map = new HashMap<Integer, String>();
        
        //Declaramos nuestros respectivos valores con su acceso
        map.put(1, "Yahir");		
        map.put(15, "Adrian");
        map.put(3, "Ruiz");		
        map.put(5, "Machuca");

        // Imprimimos el Map con un Iterador
        Iterator it = map.keySet().iterator();
        while(it.hasNext())
        {
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -- Valor: " + map.get(key));
        }
        
        //Consultando la funcion containsKey para saber si existe o no ese slot 
        System.out.println(map.containsKey(5)); //si existe una llave con dicho acceso por lo que regresa true
        System.out.println(map.containsKey(5555)); //no existe una llave con dicho acceso lo que regresa false
        
        //Usamos la funcion get para obtener un valor a partir de su llave de acceso
        System.out.println(map.get(5)); //regresa el valor que hay en dicha llave
        System.out.println(map.get(5555)); //no existe valor en dicha llave por lo que regresa null
        
        //se imprime toda la lista con su llave de acceso
        System.out.println(map);
        
        //removemos un elemento 
        map.remove(3);
        
        //volvemos a imprimir toda la lista para ver el cambio reflejado
        System.out.println(map);
        
        //cambiamos el valor de un elemento por otro utilizando su llave
        map.replace(15, "Adrian", "Ruiz");
        
        //volvemos a imprimir para notar el cambio
        System.out.println(map);
        
        System.out.println("---------------------------------------------------");
        
        System.out.println("EJEMPLO DE LAS FUNCIONES PARA LA CLASE TREE_MAP");
        
        //Declaramos el uso de nuestra clase TreeMap
        TreeMap<Integer, String> Tree = new TreeMap<Integer, String>();
        
        //Declaramos sus elementos con sus respectivas llaves
        Tree.put(18, "yahir"); Tree.put(25, "Adrian"); Tree.put(35, "Ruiz"); Tree.put(1, "Machuca");
        
        //Estas funciones nos muestran dos llaves de acceso en especifico
        System.out.println(Tree.firstKey());//esta nos muestra la del indice menor, por lo que es la primera
        System.out.println(Tree.lastKey());//esta nos muestra la del indice mayor, por lo que es la ultima
        
        //Get nos regresa el contenido que hay en cada funcion
        System.out.println(Tree.get(25));
        System.out.println(Tree.get(35));
        
        //Estas dos funciones nos regresan el dato que se encuentra declarado en dos llaves en especifico
        System.out.println(Tree.firstEntry()); //nos regresa el dato de la primer llave de acceso
        System.out.println(Tree.lastEntry()); //nos regresa el dato de la ultima llave de acceso
        
        /*imprimimos y notamos que lo que hace esta clase especial es que no importa como declares tus datos
        estos van a ordenarse de automatico dependiendo del valor de su llave de acceso*/
        System.out.println(Tree);
        
        //removemos un valor de en medio para comprobar que continua el ordenamiento
        Tree.remove(18);
        
        //sin ese valor ahora se recorren los datos para que continue un orden
        System.out.println(Tree);
        
        System.out.println("---------------------------------------------------");
        
        System.out.println("EJEMPLO DE LAS FUNCIONES PARA LA CLASE LINKED_HASH_MAP");
        
        //Declaramos el uso de la clase Linked
        LinkedHashMap<Integer, String> linked = new LinkedHashMap<Integer, String>();
        
        linked.put(30, "yahir");
        linked.put(50, "ruiz");
        linked.put(2, "adrian");
        linked.put(7, "machuca");
        
        System.out.println(linked);
        
        /*La funcion get or default nos va a servir para obtener el dato dentro de la llave especificada
        pese a que le demos otro valor, ese otro valor solo se mostrara si dentro de la llave de acceso
        no hubiera ningun dato previamente*/

        System.out.println(linked.getOrDefault(50, "jose"));
        System.out.println(linked.getOrDefault(32, "messi"));
        
        //la funcion get or default no va a asignar un valor como la funcion put, esto se comprubea aqui
        System.out.println(linked.get(32));
 
        
    }
    
    
}
