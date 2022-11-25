package biblioteca;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import usuarios.Aluno;

public class Emprestar 
{
	
	List<Integer> 	ALCodUsr 	= new ArrayList<Integer>();
	List<Integer> 	ALCodLivro 	= new ArrayList<Integer>();
	List<Date>		ALDataEmp 	= new ArrayList<Date>();
	List<Date> 		ALDataDev 	= new ArrayList<Date>();

	public void getALCodUsr() 
	{
		for (int i = 0; i < ALCodUsr.size(); i ++)
		{
		   	System.out.println(ALCodUsr.get(i));							
		}
	}
	public int getALCodUsr2(int i) 
	{
		return ALCodUsr.get(i);
	}
	public void setALCodUsr(List<Integer> aLCodUsr) {
		ALCodUsr = aLCodUsr;
	}

	public void getALCodLivro() {
		for (int i = 0; i < ALCodLivro.size(); i ++)
		{
		   	System.out.println(ALCodLivro.get(i));							
		}
	}

	public void setALCodLivro(List<Integer> aLCodLivro) {
		ALCodLivro = aLCodLivro;
	}

	public void getALDataEmp() {
		for (int i = 0; i < ALDataEmp.size(); i ++)
		{
		   	System.out.println(ALDataEmp.get(i));							
		}
	}

	public void setALDataEmp(List<Date> aLDataEmp) {
		ALDataEmp = aLDataEmp;
	}

	public void getALDataDev() {
		for (int i = 0; i < ALDataDev.size(); i ++)
		{
		   	System.out.println(ALDataDev.get(i));							
		}
	}
	public List<Date> getALDataDev2() {
		List<Date> 		ALDataDev2 	= new ArrayList<Date>();
		for (int i = 0; i < ALDataDev.size(); i ++)
		{
			ALDataDev2.add(ALDataDev.get(i));							
		}
		return ALDataDev2;
	}
	
	public void setALDataDev(List<Date> aLDataDev) {
		ALDataDev = aLDataDev;
	}

	//método para reservar um livro que recebe os códigos e as datas
	//codigos são passados pelo usuário e as datas são indicadas pelo sistema
	//método retorna reservas na tela, por enquanto, com fins de teste
	public void emprestar(int CodUsr, int CodLivro, Date DataEmp, Date DataDev)
	{
		ALCodUsr.add(CodUsr);
		ALCodLivro.add(CodLivro);
		ALDataEmp.add(DataEmp);
		ALDataDev.add(DataDev);
		
		System.out.println("Emprestar: ");
		
	    for (int i = 0; i < ALCodUsr.size(); i ++)
		{
	    	String A, B; 						//apenas para formatar a data
	    	A = ALDataDev.get(i).toString();	//apenas para formatar a data
	    	B = ALDataEmp.get(i).toString();	//apenas para formatar a data
			System.out.println("Código do usuário - " + ALCodUsr.get(i) + ". Código do livro - " + ALCodLivro.get(i) + 
			". Data do Empréstimo - " + B.substring(0,10) + ". Data Devoução prevista - " + A.substring(0,10));							
		}
	}
}