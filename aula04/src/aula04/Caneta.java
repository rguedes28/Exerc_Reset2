package aula04;
public class Caneta {
    public String modelo;
    private float ponta;
    private boolean Tampada;
    private String cor;
    public Caneta() {
         this.tampar();
          this.cor = "Azul";
 
    }      
   public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    public float getPonta() {
        return this.ponta;
        
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public void tampar() {
        this.Tampada = true;        
    }
    public vid destampar() {
        this.Tampada = false;
    }
    
    public void status() {
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo " + this.getModelo());
        System.out.println("Ponta " + this.getPonta());
        System.out.println("Cor " + this.cor);
        System.out.println("Tampada: " + this.Tampada);
    }
    
        
        
}
