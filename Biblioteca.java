import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca 
{
    //List<UsuarioDefault> usuarios = new ArrayList<UsuarioDefault>();
    private ArrayList<UsuarioDefault> usuarios;
    private ArrayList<Professor> professores;
    private ArrayList<Livro> livros;
    ArrayList<Livro> listaLivro = new ArrayList<Livro>();
    
    //AlunoGraduacao ander = new AlunoGraduacao(123, "ander");
    //anderas = new AlunoGraduacao(123, "asa");
    

 //   usuarios.add(anderas);

   //private List<AlunoGraduacao> lista;

    
  


    //List<Aluno> alunos = new ArrayList<Aluno>();

    //AlunoGraduacao Pedro = new AlunoGraduacao(123, "Pedro");
	
    //ArrayList<String> agenda = new ArrayList();
    //agenda.add("Juca Bala;11 1111-1111");

    
    
  //  usuarios.add((UsuarioDefault) new UsuarioDefault(123, "João da Silva" ));
  //  usuarios.add((AlunoGraduacao) new AlunoGraduacao(456, "Luiz Fernando Rodrigues" ));
   // usuarios.add((AlunoGraduacao) new AlunoGraduacao(789, "Pedro Paulo" ));

    //livros.add(123, "sdsd");



    private Biblioteca() {}
    
    private static Biblioteca instancia;

    public static Biblioteca getInstancia()
    {
         if(instancia == null)
         {
            instancia = new Biblioteca();
            instancia.inicializaBiblioteca();
         }
         return instancia;
    }
    
    public void reservar()      //1 - reservar
    {
        Scanner ler = new Scanner(System.in);
        int codLivro, codUsuario;
        
        //System.out.printf("Informe um número para a tabuada: ");
        codLivro   = ler.nextInt();
        codUsuario = ler.nextInt();

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
            if(livros.get(i).getCodigo() == codLivro)
            {
                livroReserva = livros.get(i);
            }
		}
        usuarioReserva.reservarLivro(livroReserva);
    }

    public void pegarEmprestado()      //2 - emprestar
    {
        System.out.printf("Você entrou no método de emprestar.");

        Scanner ler = new Scanner(System.in);
        int codLivro, codUsuario;
               
        codLivro   = ler.nextInt();
        codUsuario = ler.nextInt();

        Livro livroEmpresta = null;
        Usuario usuarioEmpresta =  null;

        for (int i = 0; i < usuarios.size(); i++) 
        {
            if(usuarios.get(i).getCodigo() == codUsuario)
            {
                usuarioEmpresta = usuarios.get(i);
            }
		}
        System.out.printf("Você passou pelo array de usuários.");
        System.out.printf("Usuario " + usuarioEmpresta + " encontrado.");
        for (int i = 0; i < livros.size(); i++) 
        {
            if(livros.get(i).getCodigo() == codLivro)
            {
                livroEmpresta = livros.get(i);
            }
		}

        if(livroEmpresta.hasExemplar())
        {
            usuarioEmpresta.pegarLivroEmprestado(livroEmpresta);
        }
    }

    public void devolver(int codLivro, int codUsuario)      //3 - devolver
    {
        Livro livroDevolve = null;
        Usuario usuarioDevolve = null;
        for (int i = 0; i < usuarios.size(); i++) 
        {
            if(usuarios.get(i).getCodigo() == codUsuario)
            {
                usuarioDevolve = usuarios.get(i);
            }
		}
        for (int i = 0; i < livros.size(); i++) 
        {
            if(livros.get(i).getCodigo() == codLivro)
            {
                livroDevolve = livros.get(i);
            }
		}
        usuarioDevolve.devolverLivro(livroDevolve);
    }
    
    public void registraProfessor(int codLivro, int codUsuario)      //1 - reg orof obs
    {
        Livro livroSubject = null;
        Observer usuarioObserver = null;
        for (int i = 0; i < professores.size(); i++) 
        {
            if(professores.get(i).getCodigo() == codUsuario)
            {
                usuarioObserver = professores.get(i);
            }
		}

        for (int i = 0; i < livros.size(); i++) 
        {
            if(livros.get(i).getCodigo() == codLivro)
            {
                livroSubject = livros.get(i);
            }
		}

        livroSubject.registerObserver(usuarioObserver);
    }

    public Livro infoLivro(int codLivro)            // Informações de um livro dado o codigo
    {
        Livro livroInfo = null;
        for (int i = 0; i < livros.size(); i++) 
        {
            if(livros.get(i).getCodigo() == codLivro)
            {
                livroInfo = livros.get(i);
            }			
		}
        System.out.println(livroInfo);
        return livroInfo;
    }

    public void getReservasEmprestimos(int codUsuario)
    {
        Usuario usuarioEmpretimoReserva = null;
        for (int i = 0; i < usuarios.size(); i++) 
        {
            if(usuarios.get(i).getCodigo() == codUsuario)
            {
                usuarioEmpretimoReserva = usuarios.get(i);
            }			
		}

       ArrayList<Emprestimo> currentEmprestimos = usuarioEmpretimoReserva.getEmprestimoUsuario();
       ArrayList<Reserva> currentReservas = usuarioEmpretimoReserva.getReservasUsuario();

       System.out.println(currentEmprestimos);
       System.out.println(currentReservas);

    }

    public void checarProfessor(int codUsuario)
    {
        Professor usuarioProfessor = null;
        for (int i = 0; i < professores.size(); i++) 
        {
            if(professores.get(i).getCodigo() == codUsuario)
            {
                usuarioProfessor = professores.get(i);
            }			
		}
        System.out.println(usuarioProfessor.returnNotify());
    }

    public void inicializaBiblioteca()
    {
        AlunoGraduacao Pedro = new AlunoGraduacao(123, "Pedro");
        AlunoGraduacao Maria = new AlunoGraduacao(456, "Maria");
        AlunoGraduacao Ana = new AlunoGraduacao(789, "Ana");

        usuarios.add(Pedro);
        usuarios.add(Maria);
        usuarios.add(Ana);
        usuarios.add(new AlunoGraduacao(658, "João"));



        //Exemplar nautico;
        
        
    }
}