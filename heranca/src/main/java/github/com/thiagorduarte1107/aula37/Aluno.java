package github.com.thiagorduarte1107.aula37;

public class Aluno extends Pessoa {

    private String curso;
    private double notas;



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
    public double calcularMedia(){
        return 0;
    }
    public boolean verificarAprovado(){
        return true;
    }
}
