package github.com.thiagorduarte1107.aula39;

public class Aluno extends Pessoa {

    private String curso;
    private double notas;

    public void verificarAcesso() {

    }

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone);
        this.curso = curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public double getNotas() {
        return notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    public void metodoQualquer() {
        super.setCpf("22255326555");
        this.setCpf("525426544156");
    }
}
