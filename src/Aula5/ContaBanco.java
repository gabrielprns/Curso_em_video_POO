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
    
    //Estado Atual
    
    public void estadoAtual(){
        System.out.println("------------------");
        System.out.println("Conta:"+ this.getNumConta());
        System.out.println("Tipo"+ this.getTipo());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Status"+ this.getStatus());
    }
    
    //Método Construtor
    
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    //Métodos Especiais

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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    //Métodos
    
        //Abrir a Conta
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t=="CC"){
            this.setSaldo(50);
        }else if(t=="CP"){
            this.setSaldo(150);
        }
    }
        
        //Fechar a Conta
    public String fecharConta(){
        String M = null;
        if(this.getSaldo()>0){
            M="Conta com om Dinheiro";     
        }else if(this.getSaldo()<0){
            M="Conta com Débito";
        }else{
            M="Sua conta será fechada";
            this.setStatus(false);
        }
        return M;
    }
       
        //Depositar
    public void depositar(float v){
        if(this.getStatus()){
           this.setSaldo(this.getSaldo()+v);
        }else{
            System.out.println("Impossível Depositar");
        }
    }
        
        //Sacar
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo()>=v){
                this.setSaldo(getSaldo()-v);
            }else{
                System.out.println("Saldo Insuficiente");
            }
        }else{
            System.out.println("Impossível sacar");
        }
        
    }
    
        //Pagamento Mensal
    public void pagarMensal(){
        float v = 0;
        if(this.getTipo()=="CC"){
            v=12;
        }else if(this.getTipo()=="CP"){
            v=20;
        }
        if(this.getStatus()){
            if(this.getSaldo() > v){
                this.setSaldo(getSaldo()-v);
            }else{
                System.out.println("Saldo Insuficiente");
            }
        }else{
            System.out.println("Impossível pagar");
        }
    }  
}
