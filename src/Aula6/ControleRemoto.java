/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula6;

/**
 *
 * @author Usuario
 */
public class ControleRemoto implements Controlador{
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Método Construtor
    public ControleRemoto(){
        this.volume =50;
        this.ligado =false;
        this.tocando =false;
    }
    
    //Métodos Especias

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
    
    //Métodos Abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está desligado? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i=0; i<= this.getVolume(); i+=10){
            System.out.println("[]");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(getVolume()+5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(getVolume()-5);
        }
    }

    @Override
    public void ligarMudo() {
    }

    @Override
    public void desligarMudo() {
    }

    @Override
    public void play() {
    }

    @Override
    public void pause() {
    }
    
    
    
}
