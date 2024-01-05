package exercicio_7;

public class Main {
    public static void main(String[] args) {
        // inicializando a classe como True, para acender o fogão
        Fogao fogao = new Fogao(true);
        // chamando o método de fritar frangos se o fogão estiver aceso.
        fogao.FritarFrango(5);
    }
}
