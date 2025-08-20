public class No<T> {
    T elemento;
    No<T> proximo;

    public No(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }
}