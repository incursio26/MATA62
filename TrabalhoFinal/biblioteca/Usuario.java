package biblioteca;

public class Usuario 
{
	private int codigo;
	private String nome;
	
	public Usuario(int codigo, String nome) 
	{
		this.codigo = codigo;
		this.nome = nome;
	}

	//public void emprestar(String emp, int cusuario, int clivro)
	//{
	//	System.out.println("Método de empréstimo - " + emp + " CódUser" + cusuario + " CódBook" + clivro);
	//}
	
	
	
	
	
	//gets & sets
	public int getCodigo() 
	{
		return codigo;
	}
	public void setCodigo(int codigo) 
	{
		this.codigo = codigo;
	}
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
}