package principal;

public class TestaVenda {
    public static void main(String[] args) {
        Estoque produto = new Estoque();
        produto.departamento = "pintura";
        produto.tipoMarca = "Lata de tinta";
        produto.volume = "1L";
        produto.setValor(50);
        produto.disponibilidade = 10;


    }
}
