/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaherenciapoo;

/**
 *
 * @author estudiante311
 */
public class PracticaHerenciaPoo {
    public static void main(String[] args) {
        // Create a savings account with initial balance of $20000 and 1.5% annual rate
        
        System.out.println("Cuenta de Ahorros: ");
        
        final float SALDO = 15000;
        final float TASA_ANUAL = 0.10f;

        
        CuentaAhorros cuenta = new CuentaAhorros(SALDO, TASA_ANUAL);

        System.out.println("");
        
        cuenta.imprimir();
        
        System.out.println("");

        cuenta.consignar(5000);
        cuenta.retirar(2000);
        cuenta.retirar(3000);
        cuenta.retirar(1000);
        cuenta.imprimir();
        
        System.out.println("");
        
        System.out.println
                //retira valor de 2000
        cuenta.consignar(2000);
        cuenta.retirar(1000);
        cuenta.retirar(100);
        cuenta.retirar(200);
        cuenta.retirar(500);
        cuenta.retirar(500);
        cuenta.retirar(10000);
        cuenta.imprimir();
        
        


        System.out.println("\nEstado después de extracto mensual:");
        cuenta.imprimir();
    }
}
