package aula_10a;
public class Aula_10a {
    public static void main(String[] args) {
//Programa Principal
Pessoa p1 = new Pessoa();
Aluno p2 = new Aluno();
Professor p3 = new Professor();
Funcionario p4 = new Funcionario();

    p1.setNome("Pedro");
    p2.setNome("Maria");
    p3.setNome("Claudio");
    p4.setNome("Fabiana");
    
    p1.setIdade(0);
    p2.setIdade(16);
    p3.setIdade(50);
    p4.setIdade(34);
    
    p1.setSexo("M");
    p2.setSexo("F");
    p3.setSexo("M");
    p4.setSexo("F");
    
    p2.setCurso("Informatica");
    p3.setSalario(2500.75f);
    p4.setSetor("Estoque");
    
    //Erros
    /*p1.receberAumento(550.20f);
    p2.mudarTrabalho():
    p4.cancelarMtric();*/
    
    
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        
        
    }
    
}
