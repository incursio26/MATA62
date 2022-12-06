public class ResCommand implements Command 
{
    private Biblioteca biblioteca;
    
    public ResCommand()
    {
        biblioteca = Biblioteca.getInstancia();
    }

    public void execute()
    {
        biblioteca.reservar();
    }
}