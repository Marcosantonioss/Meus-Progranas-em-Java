/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula06poo;

/**
 *
 * @author marco
 */
public class Aula06POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        //c.desligar();
        c.maisVolume();
        c.play();
        c.pause();
        c.abrirMenu();
        c.fecharMenu();
    }
    
}
