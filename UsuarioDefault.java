import java.util.ArrayList;
import java.util.Date;

public abstract class UsuarioDefault implements Usuario {
	private int codigo;
	private String nome;

	public boolean isDevedor = false;

	public ArrayList<Reserva> ReservasUsuario;
	public ArrayList<Emprestimo> EmprestimosUsuario;

	public UsuarioDefault(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Reserva> getReservasUsuario() {
		return ReservasUsuario;
	}

	public ArrayList<Emprestimo> getEmprestimoUsuario() {
		return EmprestimosUsuario;
	}

	public void reservarLivro(Livro livroReserva){
		int contadorDeReservas = 0;
		for (int i = 0; i < ReservasUsuario.size(); i++) {
            if (ReservasUsuario.get(i).dataReserva == new Date()) {
                contadorDeReservas += 1;
            }
        }

		if(contadorDeReservas < 3){
		  ReservasUsuario.add(livroReserva.tentarReserva(codigo));
		}else{
			System.out.println("Não foi possível efetuar reserva");
		}
	}

	public abstract void pegarLivroEmprestado(Livro livroEmpresta);

	public abstract void devolverLivro(Livro livroDevolve);
}