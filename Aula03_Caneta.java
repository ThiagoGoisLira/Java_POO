package com.mycompany.java_poo;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Esta tampada: " + this.tampada);
        System.out.println("Qual dimensao: " + this.ponta);
        System.out.println("Qual o nivel de carga: "+ this.carga);
    }
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar!");
        }
        else{
            System.out.println("Estou Rabiscando");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    
}
