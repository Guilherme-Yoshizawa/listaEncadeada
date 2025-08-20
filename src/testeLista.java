public class testeLista {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();

        System.out.println("TESTANDO LISTA ENCADEADA");

        // Adicionando elementos
        lista.adicionar("João");
        lista.adicionar("Maria");
        lista.adicionar("Pedro");
        lista.exibir();

        // Adicionando no início
        lista.adicionarInicio("Ana");
        lista.exibir();

        // Adicionando em posição específica
        lista.adicionarPosicao(2, "Carlos");
        lista.exibir();

        // Buscando elementos
        System.out.println("Posição de Maria: " + lista.buscar("Maria"));
        System.out.println("Elemento na posição 1: " + lista.obter(1));

        // Removendo elementos
        System.out.println("Removido do início: " + lista.removerPrimeiro());
        lista.exibir();

        System.out.println("Removido do final: " + lista.removerUltimo());
        lista.exibir();

        System.out.println("Removido da posição 1: " + lista.removerPosicao(1));
        lista.exibir();

        System.out.println("Tamanho final: " + lista.getTamanho());
    }
}