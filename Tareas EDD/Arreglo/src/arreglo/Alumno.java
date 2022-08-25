/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglo;

/**
 *
 * @author yahir
 */
public class Alumno {
    
    private int edad;
    private String numeroCuenta;
    private String nombre;

    public Alumno() {
    }

    public Alumno(int edad, String numeroCuenta, String nombre) {
        this.edad = edad;
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "Alumno{" + "edad=" + edad + ", numeroCuenta=" + numeroCuenta + ", nombre=" + nombre + '}';
    }
    
    
    
}
