public interface Usuario {

    public void reservarLivro(Livro livroReserva);

    public int getCodigo(); 

    public void pegarLivroEmprestado(Livro livroEmpresta);

    public void devolverLivro(Livro livroDevolve);
    
    
}
