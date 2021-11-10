package aula2.Exercicio.Ex2;

public class Forma {
    private String nome;
    Forma(){
        setNome("Quadrado");
    }
    Forma(final String nome){
        this.nome = nome;
    }

    public void setNome(final String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    @Override
    public String toString(){
        return "Forma do objeto: " + getNome();
    }

}
