package aula03;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma Caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("ESta TAmapada? " + this.tampada);
    }
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Nao posso rabiscar");
        } else {
            System.out.println("EStou rabiscando");
        }
           
    }
    void tampar() {
        this.tampada = true;
        
    }
    void destampar() {
        this.tampada = false;
        
    }
    
    
    
    
    
}
