public class Emprestado implements State {

    @Override
    public void emprestar(Exemplar exemplar) {
        System.out.println("O livro já está emprestado");
    }

    @Override
    public void devolver(Exemplar exemplar) {
       exemplar.statusExemplar = true;
       exemplar.meuEstado = new EmEstoque();      
    }
    
}
