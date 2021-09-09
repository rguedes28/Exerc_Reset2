package aula12;
public class Reptil extends Animal{
    //Atributos
    private String crEscama;
    
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
    }

    
    @Override
    public void emitirSom() {
        System.out.println("Som de Reptil");
    }

    public String getCrEscama() {
        return crEscama;
    }

    public void setCrEscama(String crEscama) {
        this.crEscama = crEscama;
    }
    
}
