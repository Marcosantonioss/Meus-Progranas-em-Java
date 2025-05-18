/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06poo;

/**
 *
 * @author marco
 */
public class ControleRemoto implements Controlador{
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //Métodos Especiais

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        if(this.getLigado()){
            this.setLigado(false);
        }
        else{
            System.out.println("impossível desligar algo que já está desligado!");
        }
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado()){
            System.out.println("----MENU-----");
            System.out.println("Está ligado? " + this.getLigado());
            System.out.println("Está tocando? " + this.getTocando());
            System.out.print("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i +=10){
            System.out.print("|");
          }
            System.out.println("");
        }
        else{
            System.out.println("Impossível mostrar o menu");
        }
    }

    @Override
    public void fecharMenu() {
        if(this.getLigado()){
            System.out.println("Fechando menu...");
        }
        else{
            System.out.println("Equipamento desligado!");
        }
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }
        else{
            System.out.println("Impossível aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }
        else{
            System.out.println("Impossível diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado()){
            this.setVolume(0);
        }
        else{
            System.out.println("impossível ligar o modo mudo");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
        else{
            System.out.println("Impossível desligar o modo mudo");
        }
    }

    @Override
    public void play() {
        if(this.getLigado()){
            this.setTocando(true);
        }
        else{
            System.out.println("Impossível dar play");
        
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
        else{
            System.out.println("Impossível dar pause");
        }
    }
    
}