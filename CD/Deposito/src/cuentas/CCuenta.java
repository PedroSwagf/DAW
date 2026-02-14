/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 * Clase que representa una cuenta bancaria con sus datos básicos y operaciones.
 * @author Pedro Manuel Fernandez Chacon
 * @version 1.0
 */
public class CCuenta {
    
    /** Nombre del titular de la cuenta */
    private String nombre;
    /** Número de la cuenta bancaria */
    private String cuenta;
    /** Saldo actual disponible en la cuenta */
    private double saldo;
    /** Tipo de interés aplicado a la cuenta */
    private double tipoInteres;
        
    /**
     * Obtiene el nombre del titular de la cuenta.
     * @return El nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el titular de la cuenta.
     * @param nom El nuevo nombre del titular.
     */
    public void setNombre(String nom) {
        nombre = nom;
    }

    /**
     * Obtiene el número de la cuenta bancaria.
     * @return El número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece un nuevo número de cuenta.
     * @param cue El nuevo número de cuenta.
     */
    public void setCuenta(String cue) {
        cuenta = cue;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * @return El saldo disponible.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece un nuevo saldo para la cuenta.
     * @param sal El nuevo saldo a establecer.
     */
    public void setSaldo(double sal) {
        saldo = sal;
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     * @return El tipo de interés actual.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Establece un nuevo tipo de interés para la cuenta.
     * @param tipo El nuevo tipo de interés.
     */
    public void setTipoInteres(double tipo) {
        tipoInteres = tipo;
    }
        
    /*
     * public CCuenta() {
     * ESTA CLASE DEL CODIGO PROPORCIONADO LA COMENTO YA QUE NO HACE NADA
     * }
     */
    
    /**
     * Constructor de la clase CCuenta que inicializa los atributos de la cuenta.
     * @param nom  Nombre del titular de la cuenta.
     * @param cue  Número de la cuenta bancaria.
     * @param sal  Saldo inicial con el que se abre la cuenta.
     * @param tipo Tipo de interés que se aplicará a la cuenta.
     */
    public CCuenta(String nom, String cue, double sal ,double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }
    
    /**
     * Devuelve el estado actual de la cuenta, que equivale a su saldo.
     * @return El saldo disponible en la cuenta.
     */
    public double estado(){
        return saldo;
    }
    
    /**
     * Ingresa una cantidad de dinero en la cuenta.
     * @param cantidad La cantidad de dinero a ingresar.
     * @throws Exception Si la cantidad a ingresar es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0 )
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**
     * Retira una cantidad de dinero de la cuenta.
     * @param cantidad La cantidad de dinero a retirar.
     * @throws Exception Si la cantidad es negativa o si no hay saldo suficiente en la cuenta.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay saldo suficiente");
        saldo = saldo - cantidad;
    }
}