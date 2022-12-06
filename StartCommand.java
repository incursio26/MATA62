public class StartCommand implements Command 
{
    private Biblioteca biblioteca;
    
    public StartCommand()
    {
      biblioteca = Biblioteca.getInstancia();
    }

    @Override
    public void execute()
    {
        System.out.println("AAAAAAAAAAAAAAAAA");
        biblioteca.inicializaBiblioteca();
    }
}