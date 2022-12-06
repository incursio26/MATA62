import java.util.Date;


public class Emprestimo {
    public Livro livroEmp;
    public Date dataEmprestimo;
    public boolean statusEmprestimo;
    public int codUsuario;
    public int codExemplar;

    public Emprestimo(Livro livro, Date data, int codUsuarioEmp, int codExemplarEmp){
        livroEmp = livro;
        dataEmprestimo = data;
        codUsuario = codUsuarioEmp;
        codExemplar = codExemplarEmp;
    }
}
