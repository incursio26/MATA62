import java.util.ArrayList;

public class Livro implements Subject {

    private ArrayList<Exemplar> exemplares;
    private ArrayList<Observer> observadores;

    public int codigo;
    public String nome;

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public boolean hasExemplar() {
        return false;
    }

    public void registerObserver(Observer usuarioObserver) {
        observadores.add(usuarioObserver);
    }

    public ArrayList<Exemplar>  getAllExemplares(){
        return exemplares;
    }

    @Override
    public void removeObserver(Observer o) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub
        
    }
    
}
