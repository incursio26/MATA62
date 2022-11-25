package biblioteca;
import java.util.*;

import estadosLivros.Devolver;
import estadosLivros.Emprestado;
import estadosLivros.Reservado;
import estadosLivros.State;
import usuarios.Aluno;
import estadosUsuarios.IDevedor;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;


public class Sistema implements IDevedor
{	
	public static void main(String[] args) 
	{
		Date data = new Date();
		Aluno Pedro = new Aluno(123, "Pedro");
		Livro Livro = new Livro();
		Livro.setCodigo(456);
		Aluno Joao = new Aluno(456, "João");
		Livro Kafka = new Livro();
		Kafka.setCodigo(456);
		Emprestar reserva = new Emprestar();
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Informe uma palavra:\n");
		String comando = ler.next();
		
		if(comando.substring(0,3).equals("emp"))
		{	
			reserva.emprestar(Pedro.getCodigo(), Livro.getCodigo(), data, data);
			reserva.emprestar(Joao.getCodigo(), Kafka.getCodigo(), data, data);
			reserva.getALCodUsr();
		}
		

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Livro Livro = new Livro();
		Devolver devolver = new Devolver(Livro);
		Livro.getState();
		Livro.setState(devolver);
		Livro.getState();
		HERE GOES CLOSE COMMENT
		
		
		Aluno Pedro = new Aluno(123, "Pedro");
	
		
		Pedro.setCodigo(123);
		Pedro.setNome("Pedro");
		Livro Livro = new Livro();
		Livro.setCodigo(456);
		
		//Pedro.emprestar("emp", Usuario.getCodigo(), Livro.getCodigo());
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add((Aluno) new Aluno(123, "João da Silva" ));
		alunos.add((Aluno) new Aluno(456, "Luiz Fernando Rodrigues" ));
		alunos.add((Aluno) new Aluno(789, "Pedro Paulo" ));
		
	    for (Aluno aluno: alunos)
	    {
	        System.out.println(aluno.getNome() + " " + aluno.getCodigo() + " ");
	    }
	    
	    //List<Usuario> devedores = new ArrayList<Usuario>();
	    devedores.add((Usuario) new Usuario(789, "Pedro Paulo" ));
	    System.out.println("Devedores:");
	    for (Usuario devedor: devedores)
	    {
	        System.out.println(devedor.getNome() + " " + devedor.getCodigo() + " ");
	    }
	    
	    devedores.add((Pedro));
	    System.out.println("Devedores:");
	    for (Usuario devedor: devedores)
	    {
	        System.out.println(devedor.getNome() + " " + devedor.getCodigo() + " ");
	    }
	    
	    
	    
	    //List<Empregado> empregados = new ArrayList<Empregado>();

	    
		/*Dados de teste:
		123 	Aluno 		João da Silva
		456 	AlunoPos 	Luiz Fernando Rodrigues
		789 	Aluno 		Pedro Paulo
		100 	Professor 	Carlos Lucena
		
		*/

	}
}