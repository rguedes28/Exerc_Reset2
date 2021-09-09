package aula_10b;
public class Professor extends Pessoa{
    //Atributos
    private String espcialidade;
    private float salario;
    //metodos
    public void receberAumento(float aum){
        this.salario += aum;
        System.out.println("O salario aumentou para " + this.getSalario());
    }
//Metodos Especiais
    public String getEspcialidade() {
        return espcialidade;
    }

    public void setEspcialidade(String espcialidade) {
        this.espcialidade = espcialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
