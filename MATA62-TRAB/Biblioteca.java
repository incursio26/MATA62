
import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<UsuarioDefault> usuarios;
    private ArrayList<Professor> professores;
    private ArrayList<Livro> livros;

    

    private Biblioteca() {}

    private static Biblioteca instancia;

    public static Biblioteca getInstancia(){
         if(instancia == null){
            instancia = new Biblioteca();
            instancia.inicializaBiblioteca();
         }
         return instancia;
    }
    



    public void reservar(int codLivro, int codUsuario){
        Livro livroReserva = null;
        Usuario usuarioReserva = null;
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getCodigo() == codUsuario){
                usuarioReserva = usuarios.get(i);
            }
			
		}

        for (int i = 0; i < livros.size(); i++) {
            if(livros.get(i).getCodigo() == codUsuario){
                livroReserva = livros.get(i);
            }
			
		}
        usuarioReserva.reservarLivro(livroReserva);
    }

    public void pegarEmprestado(int codLivro, int codUsuario){
        Livro livroEmpresta = null;
        Usuario usuarioEmpresta =  null;
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getCodigo() == codUsuario){
                usuarioEmpresta = usuarios.get(i);
            }
			
		}

        for (int i = 0; i < livros.size(); i++) {
            if(livros.get(i).getCodigo() == codUsuario){
                livroEmpresta = livros.get(i);
            }
			
		}

        if(livroEmpresta.hasExemplar()){
            usuarioEmpresta.pegarLivroEmprestado(livroEmpresta);
        }

    }

    public void devolver(int codLivro, int codUsuario){
        Livro livroDevolve = null;
        Usuario usuarioDevolve = null;
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getCodigo() == codUsuario){
                usuarioDevolve = usuarios.get(i);
            }
			
		}

        for (int i = 0; i < livros.size(); i++) {
            if(livros.get(i).getCodigo() == codUsuario){
                livroDevolve = livros.get(i);
            }
			
		}

        usuarioDevolve.devolverLivro(livroDevolve);
    }
    

    public void registraProfessor(int codLivro, int codUsuario){
        Livro livroSubject = null;
        Observer usuarioObserver = null;
        for (int i = 0; i < professores.size(); i++) {
            if(professores.get(i).getCodigo() == codUsuario){
                usuarioObserver = professores.get(i);
            }
			
		}

        for (int i = 0; i < livros.size(); i++) {
            if(livros.get(i).getCodigo() == codUsuario){
                livroSubject = livros.get(i);
            }
			
		}

        livroSubject.registerObserver(usuarioObserver);
    }

    private void inicializaBiblioteca(){
        
    }
}