import java.util.ArrayList;

public interface Usuario {

    public void reservarLivro(Livro livroReserva);

    public int getCodigo(); 

    public void pegarLivroEmprestado(Livro livroEmpresta);

    public void devolverLivro(Livro livroDevolve);

    public ArrayList<Emprestimo> getEmprestimoUsuario();

    public ArrayList<Reserva> getReservasUsuario();

    
    
}
