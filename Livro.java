import java.util.Date;
import java.util.ArrayList;

public class Livro implements Subject {

    private ArrayList<Exemplar> exemplares;
    private ArrayList<Observer> observadores;
    private ArrayList<Reserva> reservasLivro;
    private ArrayList<Emprestimo> emprestimosLivro;

    public int codigo;
    public String nome;

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public boolean hasExemplar() {
        return findExemplar() != null;
    }

    public void registerObserver(Observer usuarioObserver) {
        observadores.add(usuarioObserver);
    }

    private Exemplar findExemplar() {
        Exemplar currentExemplar = null;
        for (int i = 0; i < exemplares.size(); i++) {
            if (exemplares.get(i).statusExemplar) {
                currentExemplar = exemplares.get(i);
            }
        }
        return currentExemplar;
    }

    public void tentarEmprestimo(Usuario alugador){
       Exemplar exemplar = findExemplar();
       boolean validaEmprestimo = false;
       int contadorDeReservas = 0;
       for (int i = 0; i < reservasLivro.size(); i++) {
        if(reservasLivro.get(i).dataReserva == new java.util.Date()){
           contadorDeReservas += 1;
        }
        if(reservasLivro.get(i).codUsuarioReserva ==  alugador.getCodigo()){
            validaEmprestimo = true;
        }
       }
       if(contadorDeReservas < exemplares.size() || validaEmprestimo ){
         Date currentDate = new Date();
         exemplar.emprestar();
         emprestimosLivro.add(new Emprestimo(this, currentDate, alugador.getCodigo(), exemplar.codExemplar));
         System.out.println("Emprestimo Efetuado!");
       }else{
        System.out.println("Não foi possível emprestar!");
       }
    }

    public void tentarDevolver(Usuario devolvedor){
        int currentCodExemplar = 0;
        Exemplar currentExemplar = null;
        for (int i = 0; i < emprestimosLivro.size(); i++) {
            if(emprestimosLivro.get(i).codUsuario ==  devolvedor.getCodigo()){
                currentCodExemplar = emprestimosLivro.get(i).codExemplar;
            }
        }
        for (int i = 0; i < exemplares.size(); i++) {
            if(exemplares.get(i).codExemplar ==  currentCodExemplar){
                currentExemplar = exemplares.get(i);
            }
        }   
        if(currentExemplar != null){
            currentExemplar.devolver(); 
            System.out.println("Devolução Efetuada!");
        }else{
            System.out.println("Não foi possível devolver!");
        }
           
    }

    public Reserva tentarReserva(int codUsuario){
       Reserva currentReserva = new Reserva(this, new Date(), codUsuario);
       System.out.println("Reserva efetuada!");

       return currentReserva;
    }

    public ArrayList<Exemplar> getAllExemplares() {
        return exemplares;
    }

    @Override
    public void removeObserver(Observer o) {
       observadores.remove(o);
    }

    @Override
    public void notifyObservers() {
       System.out.println("Tem reserva simultânea");
       for (int i = 0; i < observadores.size(); i++) {
          observadores.get(i).update();
       }   
    }

}
