public class LisCommand implements Command 
{
    private Biblioteca biblioteca;
    
    public LisCommand()
    {
        biblioteca = Biblioteca.getInstancia();
    }

    public void execute()
    {
        biblioteca.listar();
    }    
}