public class EmpCommand implements Command 
{
    private Biblioteca biblioteca;
    
    public EmpCommand()
    {
      biblioteca = Biblioteca.getInstancia();
    }

    @Override
    public void execute()
    {
        System.out.println("AAAAAAAAAAAAAAAAA");
        biblioteca.pegarEmprestado();
    }
}