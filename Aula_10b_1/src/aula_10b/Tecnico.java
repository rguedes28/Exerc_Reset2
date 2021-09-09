package aula_10b;
public class Tecnico extends Aluno{
    //Atributos
    private String registroProfissional;
    //Metodos
    public void pratica(){
        System.out.println("Aluno praticando");
    }
//Metodos Especiais

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}

