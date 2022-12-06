public class Professor extends UsuarioDefault implements Observer, IProfessor {

    public int numeroNotify;

    public Professor(int codigo, String nome) {
        super(codigo, nome);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void pegarLivroEmprestado(Livro livroEmpresta) {
        if(!isDevedor){
            livroEmpresta.tentarEmprestimo(this); 
        }
        
    }

    @Override
    public void devolverLivro(Livro livroDevolve) {
        livroDevolve.tentarDevolver(this);        
    }

    @Override
    public void update() {              
        numeroNotify += 1;
    }


    public int returnNotify(){
        return numeroNotify;
    }

    
}
