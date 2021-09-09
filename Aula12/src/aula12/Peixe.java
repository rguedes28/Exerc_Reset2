package aula12;
public class Peixe extends Animal {
    //Atributos
    private String corEscama;
        
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de peixe");
    }
    //metodos especias
    public void soltarBolha(){
        System.out.println("Soltou bolha");
    }
    
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
