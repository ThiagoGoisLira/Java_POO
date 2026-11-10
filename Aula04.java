package com.mycompany.aula04;
public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC" , "VERDE", 0.4f);//Usando o construtor
        c1.status();
        //c1.setModelo ("BIC"); //Como o modelo e publico possoa tribuir o valor desta forma e da forma abaixo
        //c1.modelo = "BIC";
        //c1.setPonta(0.5f);//Para modelo privado o comando set e obrigatorio
        
        
        //System.out.println("SOBRE A CANETA:");
        //System.out.println("Modelo: " + c1.getModelo());
        //System.out.println("Ponta: "+ c1.getPonta());
        
    }
}
