/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 *
 * @author Windows11
 */
public class Main {
    
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es: "+ saldoActual );
        
        operativa_cuenta(cuenta1, 3000.0f);
    }
    
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
         try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al retirar");
        }
         
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
            System.out.println("El nuevo saldo es: " +cuenta1.estado());
        } catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }
    }
}

