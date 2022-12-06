import java.util.Date;

public class AlunoGraduacao extends UsuarioDefault 
{
    public AlunoGraduacao(int codigo, String nome) 
    {
        super(codigo, nome);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void pegarLivroEmprestado(Livro livroEmpresta) 
    {
        int contagem_emprestimos = 0;
        boolean apto_a_pegarEmprestado = true;
        for (int i = 0; i < EmprestimosUsuario.size(); i ++) 
        {
           if(EmprestimosUsuario.get(i).dataEmprestimo == new Date())
           {
                contagem_emprestimos += 1;
           }
           if(EmprestimosUsuario.get(i).livroEmp.getCodigo() == livroEmpresta.getCodigo())
           {
                apto_a_pegarEmprestado = false;
           }			
		}
        if(!isDevedor && contagem_emprestimos < 4 && apto_a_pegarEmprestado)
        {
            livroEmpresta.tentarEmprestimo(this);
        }
    }

    @Override
    public void devolverLivro(Livro livroDevolve) 
    {
        livroDevolve.tentarDevolver(this);         
    }   
}