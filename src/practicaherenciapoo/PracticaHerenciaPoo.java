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
        CuentaAhorros cuenta = new CuentaAhorros(20000, 1.5f);

        System.out.println("Estado inicial de la cuenta:");
        cuenta.imprimir();

        cuenta.consignar(5000);
        cuenta.retirar(1000);
        cuenta.retirar(2000);
        cuenta.retirar(3000);
        cuenta.retirar(4000);
        cuenta.retirar(5000);

        System.out.println("\nEstado después de transacciones:");
        cuenta.imprimir();

        cuenta.extractoMensual();

        System.out.println("\nEstado después de extracto mensual:");
        cuenta.imprimir();
    }
}
