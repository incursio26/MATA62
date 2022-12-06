import java.util.HashMap;

public class Console 
{
    public static HashMap<String, Command> comandos = new HashMap<String, Command>();

    static 
    {
        comandos.put("emp", new EmpCommand());
        comandos.put("lis", new LisCommand());
        comandos.put("res", new ResCommand());
        comandos.put("dev", new DevCommand());
        comandos.put("start", new StartCommand());
    }

    public static void invoke (String command)
    {
        comandos.get(command).execute();
    }
}