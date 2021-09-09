package aula_10b;
public class Aula_10b {
    public static void main(String[] args) {
//Programa Principal
//Pessoa p1 = new Pessoa(); nao pode ser isntanciada
/*Visitante v1 = new Visitante();
v1.setNome("Juvenal");
v1.setIdade(22);
v1.setSexo("M");
        System.out.println(v1.toString());*/
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatr(1111);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        System.out.println("");
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Marcus");
        b1.setMatr(2222);
        b1.setCurso("ingles");
        b1.setIdade(17);
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
        System.out.println(b1.toString());
        
        System.out.println("");
        
        Professor p1 = new Professor();
        p1.setNome("Carvalho");
        p1.setIdade(55);
        p1.setSexo("M");
        p1.setSalario(2700.50f);
        p1.receberAumento(300f);
        System.out.println(p1.toString());
        
        System.out.println("");
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Maria");
        t1.setIdade(21); 
        t1.setSexo("F");
        t1.setCurso("TEcnic em Edificacoes");
        t1.setRegistroProfissional("Crea-2125");
        t1.pratica();
        System.out.println(t1.toString());
        
        
        
        
//System.out.println(a1.toString());
        
        


    
   
        
        
    }
    
}
