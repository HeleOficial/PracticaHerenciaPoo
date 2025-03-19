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
            //sobregiroTemporal = -3000
        
        if (sobregiro > 0) {
            if (sobregiroTemporal > 0) {
                sobregiro = sobregiroTemporal;
            } else {
                saldo = saldo - sobregiroTemporal;
                sobregiro = 0;
            }
        } else {
            super.consignar(cantidad);
        }
    }
    
    public void extractoMensual() {
        super.extractoMensual();
    }
    
    public void imprimir() {
        System.out.println("Saldo: $" + saldo);
        System.out.println("Comisión mensual: $" + comisionMensual);
        System.out.println("Número de transacciones: " + (numConsignaciones + numRetiros));
        System.out.println("Valor de sobregiro: $" + sobregiro);
    }
}
