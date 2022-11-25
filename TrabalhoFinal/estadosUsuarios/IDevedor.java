package estadosUsuarios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import biblioteca.Emprestar;
import biblioteca.Usuario;

public interface IDevedor 
{
	List<Integer> devedores = new ArrayList<Integer>();
	Emprestar emprestimos = new Emprestar();
	Date datatual = new Date();

	public static void ChecarListardevedores()
	{
		List<Date> datas = emprestimos.getALDataDev2();
		devedores.clear();
		
		for (int i = 0; i < datas.size(); i ++)
		{
			if (datas.get(i).compareTo(datatual) < 0)
			{
				devedores.add(emprestimos.getALCodUsr2(i));							
			}
		}
		//até aqui, checa quem são os devedores e coloca os códigos dos usuarios no array "devedores"
		//agora, vai listar os devedores
		
		if(!devedores.isEmpty())
		{
			for (int i = 0; i < devedores.size(); i ++)
			{
				System.out.println("código do usuário:" + devedores.get(i));
		//		System.out.println("nome do usuário:"   + devedores.get(i)); pegar nome do usuário
			}
		}
		
				
		//data1.compareTo(date2); //data1 < data2, retorna um valor menor que 0
		//data2.compareTo(date1); //data2 > data1, retorna um valor maior que 0
		//data1.compareTo(date3); //data1 = data3, então um 0 será mostrado no console	
	}
	//public static void ListaDevedores() - O ideal é dividir o método em dois, não consegui fazer isso

}


