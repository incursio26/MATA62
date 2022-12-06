public class Exemplar {

    State meuEstado;

    public int codLivro;
    public int codExemplar;
    public boolean statusExemplar;

    private Exemplar (State estadoInicial) {
		meuEstado = estadoInicial;
	}

    public void emprestar(){
        meuEstado.emprestar(this);
    }

    public void devolver(){
        meuEstado.devolver(this);
    }
    
}
