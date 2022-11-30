
import java.util.ArrayList;
import java.util.Date;

public class Biblioteca {

    private ArrayList<UsuarioDefault> usuarios;
    private ArrayList<Professor> professores;
    private ArrayList<Livro> livros;
    private ArrayList<Reservas> reservas;
    private Date Datahoje;

    private Biblioteca() {}

    private static Biblioteca instancia;

    //singleton
    public static Biblioteca getInstancia(){
         if(instancia == null){
            instancia = new Biblioteca();
            instancia.inicializaBiblioteca();
         }
         return instancia;
    }
    



    public void reservar(int codLivro, int codUsuario)
    {
        Reservas novaReserva = new Reservas();
        
        //--------------
        int contUsuario = 0;
        for (int i = 0; i < reservas.size(); i++) 
        {
            if (reservas.get(i).getRusuarios() == codUsuario)
            {
            	contUsuario ++;
            }
		}
        if (contUsuario >= 3)
        {
        	novaReserva.ErroReseva(codUsuario, codLivro);
        }
        else
        {
        	novaReserva.ALDataRes = Datahoje;
        	novaReserva.Rexemplares = codLivro;
        	novaReserva.Rusuarios = codUsuario;
        	reservas.add(novaReserva);
        	novaReserva.SucessoReseva(codUsuario, codLivro); //print
        }
        //--------------
        
        /*
        Livro livroReserva = null;
        Usuario usuarioReserva = null;
        for (int i = 0; i < usuarios.size(); i++) 
        {
            if(usuarios.get(i).getCodigo() == codUsuario)
            {
                usuarioReserva = usuarios.get(i);
            }
		}
        
        for (int i = 0; i < livros.size(); i++) 
        {
            if(livros.get(i).getCodigo() == codUsuario)
            {
                livroReserva = livros.get(i);
            }
		}
        usuarioReserva.reservarLivro(livroReserva);
        */
    }
    public void printReserva(ArrayList<Integer> codigos)
    {
    	for (int i = 0; i < codigos.size(); i ++)
    	{
        	for (int j = 0; j < usuarios.size(); j ++)
        	{	
        		if (codigos.get(i) == usuarios.get(j).getCodigo())
        		{
        			System.out.println(usuarios.get(j).getNome());
        		}
        	}
    	}
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