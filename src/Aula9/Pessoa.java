/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula9;

/**
 *
 * @author Usuario
 */
public class Pessoa {
    private String nome;
    private int Idade;
    private String sexo;
    
    public void fazerAniver(){
        this.setIdade(getIdade()+1);
    }

    public Pessoa(String n, int I, String s) {
        this.nome = n;
        this.Idade = I;
        this.sexo = s;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
}
