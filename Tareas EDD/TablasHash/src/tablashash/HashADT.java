/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablashash;

/**
 *
 * @author yahir
 */
public class HashADT {
    
    HashADT[] hashTable = new HashADT[10];
    int dato;
    int estado; 
    int m = 10;

    static int funcion(int n, int m) 
    {
        return ((n + 1) % m);
    }

    static void addHash(HashADT[] h, int m, int n) {
        boolean i = false;
        int j = funcion(n, m);
        do {
            if (h[j].estado == 0 || h[j].estado == 1) {
                h[j].dato = n;
                h[j].estado = 2;
                i = true;
            } else 
            {
                j++;
            }
        } while (j < m && !i);
        if (i)
        {
            javax.swing.JOptionPane.showMessageDialog(null, "elemento insertado correctamente");
        } else 
        {
            javax.swing.JOptionPane.showMessageDialog(null, "Hash is full");
        }
    }

    static int valueOfHash(HashADT[] h, int m, int n) {
        int j = funcion(n, m);
        while (j < m) {
            if (h[j].estado == 0)
            {
                return -1;
            } else if (h[j].dato == n) 
            {
                if (h[j].estado == 1)
                {
                    return -1;
                } else 
                {
                    return j;
                }
            } else {
                j++;
            }
        }
        return -1;
    }

    static int eliminaHash(HashADT[] h, int m, int n) 
    {
        int i = valueOfHash(h, m, n);
        if (i == -1) 
        {
            return -1;
        } else 
        {
            h[i].estado = 1;
            return 1;
        }
    }
    
}
