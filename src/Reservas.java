import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reservas 
{

	public int Rusuarios;
	public int Rexemplares; 
	public Date ALDataRes;
	
	
	
	public int getRusuarios() 	{
		return Rusuarios;
	}
	public int getRexemplares() 	{
		return Rexemplares;
	}
	
	
	public void SucessoReseva(int Rusuarios, int Rexemplares)
	{
		System.out.println("Reserva feita com sucesso para usuário " + Rusuarios + " e livro " + Rexemplares);
	}
	
	public void ErroReseva(int Rusuarios, int Rexemplares)
	{
		System.out.println("Reserva não foi feita. Usuário " + Rusuarios + ". Livro: " + Rexemplares);
	}
	
	//retorna codigos dos usuarios com reservas em um array
	//primeiro valor indica a quantidade de reservas, códigos a partir do segundo valor
	public ArrayList<Integer> ListaReserva(ArrayList<Reservas> reservas, int Rexemplares)
	{
		int contadorReservas = 0;
		ArrayList<Integer> codigos = null;
		
		for (int i = 0; i < reservas.size(); i++)
		{
			if (reservas.get(i).getRexemplares() == Rexemplares)
			{
				contadorReservas ++;
				codigos.add(0, contadorReservas);
				codigos.add(reservas.get(i).getRusuarios());
			}
		}
		return codigos;
	}
	
	public void RegistraReseva(int Rusuarios, int Rexemplares, Date ALDataRes)
	{
		
	}
	public void HistoricoReseva(int Rusuarios, int Rexemplares, Date ALDataRes)
	{
		
	}
	
}
	













/*
	 
	 
	 	//arrays para armazenar o código do usuário, do livro e a data de reservas correntes
	public ArrayList<Integer> int Rusuarios, int	Rexemplares, Date ALDataRes;
	public ArrayList<Integer> Rexemplares;
	public ArrayList<Date> ALDataRes;
	
	//arrays para armazenar o código do usuário, do livro e a data de todas reservas (historico)
	//quando uma reserva for concluída, ele é apagada de Rexemplares e Rusuarios, mas não daqui 
	public ArrayList<Integer> Histusuarios;
	public ArrayList<Integer> Histexemplares;
	public ArrayList<Date> HistDataRes;
	
	
	
	//tipo de usuario
	public void reservar(int CodUsr, int CodLivro)
	{
		Date DataRes = new Date(); //data atual
				
		//verificação 1: percorre o array de usuarios para verificar se o usuário já tem três reservas
		int contador = 0;
		for (int i = 0; i < Rusuarios.size(); i ++)
		{
			if (Rusuarios.get(i) == CodUsr)
			{
				contador ++;
			}
		}
		if (contador > 2)
		{
			//mensagem de erro, limite de reservas por usuário
		}
		//verificação 1: final de verificação
		
		//Adiciona à lista de reservas atuais
		Rusuarios	.add(CodUsr);
		Rexemplares	.add(CodLivro);
		ALDataRes	.add(DataRes);
		
		//Adiciona ao histórico de reservas
		Histusuarios	.add(CodUsr);
		Histexemplares	.add(CodLivro);
		HistDataRes		.add(DataRes);
		
		System.out.println("Livro " + CodLivro + " reservado com sucesso para o usuário " + CodUsr + ".");
	}
	
	public void ListarReservasU(int CodUsr) // 5b
	{
		int contador = 0; //podia ser um bool
		for (int i = 0; i < Histusuarios.size(); i ++)
		{
			if (Histusuarios.get(i) == CodUsr)
			{
				System.out.println(Histexemplares.get(i) + " " + HistDataRes.get(i));
				contador = 1;
			}
		}
		if (contador == 0)
		{
			System.out.println("O usuário nunca fez reservas.");
		}
	}
	
	public void ListarReservasE(int CodLivro) //5a
	{
		int contador = 0;
		for (int i = 0; i < Histexemplares.size(); i ++)
		{
			if (Histexemplares.get(i) == CodLivro)
			{
				System.out.println(Histusuarios.get(i) + " ");
				contador ++;
			}
		}
		if (contador == 0)
		{
			System.out.println("Este exemplar nunca foi reservado.");
		}		
		else
		{
			System.out.println("Quantidade de reservas feitas: " + contador);
		}
	}
}*/