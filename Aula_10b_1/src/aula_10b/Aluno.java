package aula_10b;
public class Aluno extends Pessoa {
    //Atributos
    private int matricula;
    private String curso;
//Metodos
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " + this.getNome() );
    }
    //Metodos Especias

    public int getMatr() {
        return matricula;
    }

    public void setMatr(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
