/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoYoutube;

/**
 *
 * @author Usuario
 */
public class Video implements AcoesVideo{
    
    private String titulo;
    private int avaliacao, views, curtidas;
    private boolean reproduzir;
    
    //Constructor

    public Video(String t) {
        this.setTitulo(t);
        this.setAvaliacao(1);
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzir(false);
    }
    

    //métodos publicos
    @Override
    public void play() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void like() {
    }
    
    //métodos especiais

    public String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    private void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    private void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    private void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzir() {
        return reproduzir;
    }

    private void setReproduzir(boolean reproduzir) {
        this.reproduzir = reproduzir;
    }
    
    
}

