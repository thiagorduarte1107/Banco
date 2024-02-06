package github.com.thiagorduarte1107.aula39;

public class Professor extends Pessoa {

    private double salario;
    private String nomeCurso;



  public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCurso(double curso) {
        this.nomeCurso = String.valueOf(curso);
    }

    public double getSalario() {
        return salario;
    }

    public String getCurso() {
        return nomeCurso;
    }
    public double calcularSalarioLiquido (){
        return 0;
    }
}