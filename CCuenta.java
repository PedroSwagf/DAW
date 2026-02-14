/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 *
 * @author Windows11
 */
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
        
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nom) {
        nombre = nom;
    }

    public String getCuenta() {
        return cuenta;
    }
    public void setCuenta(String cue) {
        cuenta = cue;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double sal) {
        saldo = sal;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipo) {
        tipoInteres = tipo;
    }
    
    
    public CCuenta() {
        
    }
    
    public CCuenta(String nom, String cue, double sal ,double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }
    
    public double estado(){
        return saldo;
    }
    
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0 )
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay saldo suficiente");
        saldo = saldo - cantidad;
    }
    
}
