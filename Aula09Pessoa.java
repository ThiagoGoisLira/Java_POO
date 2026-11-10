
package aula09.aula09;
public class Pessoa {
    private String nome;
    private float idade;
    private String sexo;
    
    
    public void fazerAniver(){
        this.idade++;
    
    }

    public Pessoa(String nome, float idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getIdade() {
        return idade;
    }

    public void setIdade(float idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
