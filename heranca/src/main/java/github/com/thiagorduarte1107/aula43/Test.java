package github.com.thiagorduarte1107.aula43;

public class Test {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setCurso("Ciencias da Computação");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas (notas);

        System.out.println (aluno);
    }
}
