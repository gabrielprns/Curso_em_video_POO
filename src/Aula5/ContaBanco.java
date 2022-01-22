/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula5;

/**
 *
 * @author Usuario
 */
public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Métodos Especiais e Construtor
    
    public ContaBanco(){
        saldo=0;
        status=false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    //Métodos
        //Abrir a Conta
    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if(t=="CC"){
            setSaldo(50);
        }else if(t=="CP"){
            setSaldo(150);
        }
    }
        //Fechar a Conta
    public String fecharConta(){
        String M = null;
        if(saldo>0){
            M="Conta com om Dinheiro";     
        }else if(saldo<0){
            M="Conta com Débito";
        }else{
            M="Sua conta será fechada";
            setStatus(false);
        }
        return M;
    }
    
    
    
}
