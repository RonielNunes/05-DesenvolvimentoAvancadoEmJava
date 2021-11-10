package aula2.Exercicio.Ex2;

public class Pessoa {
    private String nome;
    private Integer idade;

    Pessoa(){

    }
    Pessoa(final String nome, final Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(final String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setIdade(final Integer idade){
        this.idade = idade;
    }
    public Integer getIdade(){
        return idade;
    }
    @Override
    public String toString(){
        StringBuilder texto = new StringBuilder();
        texto.append("DADOS PESSOAIS \n");
        texto.append("Nome: " + getNome() + "\n");
        texto.append("Idade: " + getIdade() + "\n");
        return texto.toString();
    }

}
