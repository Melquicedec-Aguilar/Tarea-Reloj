/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2;

/**
 *
 * @author Melqui
 */
public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    //alt+insert
    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    
    public void mostrarHora(){
        for(this.hora = 0; this.hora <= 23; this.hora ++){
            for(this.minuto = 0; this.minuto <= 59; this.minuto ++){
                for(this.segundo = 0; this.segundo <= 59; this.segundo ++){
                    System.out.println(this.hora + ":" + this.minuto + ":" + this.segundo);
                }
            }
        }
    }

}
