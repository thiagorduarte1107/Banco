package github.com.thiagorduarte1107.aula40;

public class Professor extends Pessoa {

    private double salario;
    private String nomeCurso;


    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCurso(String curso) {
        this.nomeCurso = new String (curso);
    }

    public double getSalario() {
        return salario;
    }

    public String getCurso() {
        return nomeCurso;
    }

    public double calcularSalarioLiquido() {

        return 0;
    }
}
