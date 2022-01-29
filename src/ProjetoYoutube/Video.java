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
        this.reproduzir=true;
    }

    @Override
    public void pause() {
        this.reproduzir=false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }
    
    //métodos especiais

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        //int nova;
        //nova=(int)((this.avaliacao + avaliacao)/this.views) ;
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzir() {
        return reproduzir;
    }

    public void setReproduzir(boolean reproduzir) {
        this.reproduzir = reproduzir;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + 
                ", avaliacao=" + avaliacao + 
                ", views=" + views + 
                ", curtidas=" + curtidas + 
                ", reproduzir=" + reproduzir + '}';
    }
    
    
    
    
}

