package principal;

public class Main {
    public Estoque material;
    Cliente titular;

    public boolean vender(int disponibilidade){
        if (this.disponibilidade >= 1) {
            System.out.println("Disponivel em estoque: " + this.disponibilidade + this.volume);
            return true;
        } else {
            System.out.println("Sem estoque");
        }
    }

}