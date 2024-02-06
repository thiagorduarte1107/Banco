package github.com.thiagorduarte1107.aula40;

public class test {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();
        pessoa.setEndereco("Qr510 cj 11 casa 03, Samambaia");
        aluno.setEndereco("Qn8F conj. 07 casa 1A, Riacho Fundo 2");
        professor.setEndereco("Qr604 cj 24 casa 18, Recanto das emas");

        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());


    }
}
