
public interface State {
    public abstract String emprestar(Exemplar exemplar);

    public abstract String reservar(Exemplar exemplar);

    public abstract String devolver(Exemplar exemplar);
}