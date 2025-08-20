public class ListaEncadeada<T> {

    private No<T> inicio;
    private int tamanho;

    // Construtor
    public ListaEncadeada() {
        this.inicio = null;
        this.tamanho = 0;
    }

    // Retorna o tamanho da lista
    public int getTamanho() {
        return tamanho;
    }

    // Verifica se a lista está vazia
    public boolean estaVazia() {
        return inicio == null;
    }

    // Adicionar elemento no final da lista
    public void adicionar(T elemento) {
        No<T> novoNo = new No<>(elemento);

        if (inicio == null) {
            inicio = novoNo;
        } else {
            No<T> atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
        tamanho++;
    }

    // Adicionar elemento no início da lista
    public void adicionarInicio(T elemento) {
        No<T> novoNo = new No<>(elemento);
        novoNo.proximo = inicio;
        inicio = novoNo;
        tamanho++;
    }

    // Adicionar elemento em uma posição específica
    public void adicionarPosicao(int posicao, T elemento) {
        if (posicao < 0 || posicao > tamanho) {
            System.out.println("Posição inválida!");
            return;
        }

        if (posicao == 0) {
            adicionarInicio(elemento);
            return;
        }

        No<T> novoNo = new No<>(elemento);
        No<T> atual = inicio;

        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.proximo;
        }

        novoNo.proximo = atual.proximo;
        atual.proximo = novoNo;
        tamanho++;
    }

    // Buscar elemento e retornar sua posição
    public int buscar(T elemento) {
        No<T> atual = inicio;
        int posicao = 0;

        while (atual != null) {
            if (atual.elemento.equals(elemento)) {
                return posicao;
            }
            atual = atual.proximo;
            posicao++;
        }
        return -1; // Não encontrado
    }

    // Obter elemento de uma posição
    public T obter(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("Posição inválida!");
            return null;
        }

        No<T> atual = inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }
        return atual.elemento;
    }

    // Remover primeiro elemento
    public T removerPrimeiro() {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return null;
        }

        T elemento = inicio.elemento;
        inicio = inicio.proximo;
        tamanho--;
        return elemento;
    }

    // Remover último elemento
    public T removerUltimo() {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return null;
        }

        if (inicio.proximo == null) {
            T elemento = inicio.elemento;
            inicio = null;
            tamanho--;
            return elemento;
        }

        No<T> atual = inicio;
        while (atual.proximo.proximo != null) {
            atual = atual.proximo;
        }

        T elemento = atual.proximo.elemento;
        atual.proximo = null;
        tamanho--;
        return elemento;
    }

    // Remover elemento de uma posição específica
    public T removerPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("Posição inválida!");
            return null;
        }

        if (posicao == 0) {
            return removerPrimeiro();
        }

        No<T> atual = inicio;
        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.proximo;
        }

        T elemento = atual.proximo.elemento;
        atual.proximo = atual.proximo.proximo;
        tamanho--;
        return elemento;
    }

    // Remover elemento por valor
    public boolean removerElemento(T elemento) {
        int posicao = buscar(elemento);
        if (posicao != -1) {
            removerPosicao(posicao);
            return true;
        }
        return false;
    }

    // Exibir todos os elementos da lista
    public void exibir() {
        if (inicio == null) {
            System.out.println("Lista vazia");
            return;
        }

        System.out.print("Lista: ");
        No<T> atual = inicio;
        while (atual != null) {
            System.out.print(atual.elemento);
            if (atual.proximo != null) {
                System.out.print(" -> ");
            }
            atual = atual.proximo;
        }
        System.out.println();
    }

    // Limpar toda a lista
    public void limpar() {
        inicio = null;
        tamanho = 0;
    }
}