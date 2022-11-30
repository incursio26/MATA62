public class Exemplar {

    State meuEstado;

    public int codLivro;
    public int codExemplar;
    public Boolean statusExemplar;

    private Exemplar (State estadoInicial) {
		meuEstado = estadoInicial;
	}

    public void reservar(){
        meuEstado.reservar(this);
    }

    public void emprestar(){
        meuEstado.emprestar(this);
    }

    public void devolver(){
        meuEstado.devolver(this);
    }
    
}
