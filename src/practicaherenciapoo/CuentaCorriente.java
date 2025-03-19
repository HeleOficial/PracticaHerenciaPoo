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


class CuentaCorriente extends Cuenta {
    private float sobregiro;
    
    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        sobregiro = 0;
    }
    
    public void retirar(float cantidad) {
        float saldoTemporal = saldo - cantidad;
        
        if (saldoTemporal < 0) {
            sobregiro = sobregiro - saldoTemporal;
            saldo = 0;
        } else {
            super.retirar(cantidad);
        }
    }
    
    public void consignar(float cantidad) {
        float sobregiroTemporal = sobregiro - cantidad;
        
        if (sobregiro > 0) {
            if (cantidad <= sobregiro) {
                sobregiro -= cantidad;
            } else {
                saldo = cantidad - sobregiro;
                sobregiro = 0;
            }
        } else {
            super.consignar(cantidad);
        }
    }
    
    public void imprimir() {
        System.out.println("Saldo: $" + saldo);
        System.out.println("Comisión mensual: $" + comisionMensual);
        System.out.println("Número de transacciones: " + (numConsignaciones + numRetiros));
        System.out.println("Valor de sobregiro: $" + sobregiro);
    }
}
