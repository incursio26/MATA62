public class EmEstoque implements State{

    @Override
    public void emprestar(Exemplar exemplar) {
        exemplar.statusExemplar = false ; 
        exemplar.meuEstado = new Emprestado();      
    }

    @Override
    public void devolver(Exemplar exemplar) {
        System.out.println("O livro já foi devolvido");
    }
    
}
