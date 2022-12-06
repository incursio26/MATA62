public class DevCommand implements Command 
{
    private Biblioteca biblioteca;
    
    public DevCommand()
    {
        biblioteca = Biblioteca.getInstancia();
    }

    @Override
    public void execute()
    {
        biblioteca.devolver();
    }
}    