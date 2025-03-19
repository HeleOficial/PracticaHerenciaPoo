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

class CuentaAhorros extends Cuenta {
    private boolean cuentaActiva;
    private final float MONTO_MINIMO = 10000;
    private final float COSTO_COMISION_MENSUAL = 1000;

    
    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        if (saldo < MONTO_MINIMO) {
            cuentaActiva = false;
        } else {
            cuentaActiva = true;
        }
    }
    
    public void consignar(float cantidad) {
        if (cuentaActiva) {
            super.consignar(cantidad);
        }
    }
    
    public void retirar(float cantidad) {
        if (cuentaActiva) {
            super.retirar(cantidad);
        }
    }
    
    public void extractoMensual() {
        if (numRetiros > 4) {
            comisionMensual += (numRetiros - 4) * COSTO_COMISION_MENSUAL;
        }
        super.extractoMensual();
        if (saldo <  MONTO_MINIMO) {
            cuentaActiva = false;
         }
    }
    
    public void imprimir() {
        System.out.println("Saldo: $" + saldo);
        System.out.println("Comisión mensual: $" + comisionMensual);
        System.out.println("Número de transacciones: " + (numConsignaciones + numRetiros));
        System.out.println("Estado de la cuenta: " + (cuentaActiva ? "Activa" : "Inactiva"));
    }
    
    public void isActive(){
        if (saldo <  MONTO_MINIMO) {
            cuentaActiva = false;
       }else {
            activa = true;
        }
            
    }

}
