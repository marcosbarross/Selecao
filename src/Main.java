public class Main {
    public static void main(String [] args){
        Pessoa pessoa = new Pessoa("Marcos", 21);
        Fila fila = new Fila();

        fila.AdicionarNaFila(pessoa);
    }
}
