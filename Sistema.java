package biblioteca;
import java.util.*;

public class Sistema 
{
	public static void main(String[] args) 
	{
		Aluno Pedro = new Aluno(123, "Pedro");
		Livro Livro = new Livro();
		
		Pedro.setCodigo(123);
		Pedro.setNome("Pedro");
		
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
		
	    //List<Empregado> empregados = new ArrayList<Empregado>();

	    
		/*Dados de teste:
		123 	Aluno 		João da Silva
		456 	AlunoPos 	Luiz Fernando Rodrigues
		789 	Aluno 		Pedro Paulo
		100 	Professor 	Carlos Lucena
		
		*/

	}
}