package aula_10b;
public class Bolsista extends Aluno{
    //Atributos
    private float bolsa;
    //Metodos
    public void renovaBolsa(){
        System.out.println("Renovando bolsa de " + this.nome);
    }
    //Metodos Especiaciais
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + " e bolsista, pagamento facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

        
}
