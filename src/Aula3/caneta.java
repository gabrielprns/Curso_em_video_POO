/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula3;



/**
 *
 * @author Usuario
 */
public class caneta {
        public String cor, modelo ;
        public float Ponta ;
        protected int carga;
        private boolean Tampada;
        
        
        public void rabiscar(){
            if(this.Tampada==true){
                System.out.println("Não pode rabiscar");
            }else{
                System.out.println("Rabiscando");
            }
        }
        
        protected void Tampar(){
            this.Tampada=true;
        }
        
        protected void Destampar(){
            this.Tampada=false;
        }
        
        public void Status(){
            System.out.println("Modelo: " + this.modelo);
            System.out.println("A cor da caneta é: " + this.cor);
            System.out.println("Está tampada? " + this.Tampada);
            System.out.println("Ponta: " + this.Ponta);
            System.out.println("Carga: " + this.carga);
        }
}
