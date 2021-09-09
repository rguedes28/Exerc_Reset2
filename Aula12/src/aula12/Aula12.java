package aula12;
public class Aula12 {
    //programa principal
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        a.locomover();
        p.locomover();
        r.locomover();
        Canguru Cn = new Canguru();
        Cachorro ca = new Cachorro();
        Cn.locomover();
        ca.locomover();
        Cn.usarBolsa();
        ca.emitirSom();
    }
    
}
