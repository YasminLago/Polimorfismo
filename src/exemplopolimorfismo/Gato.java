package exemplopolimorfismo;

/**
 *
 * @author ylagorebollar
 */
public class Gato extends Animal{
    private String cor;

    public Gato() {
        super();
    }

    public Gato(String cor, String nome) {
        super(nome);
        this.cor = cor;
    }
    
    @Override
    public void falar() {
        System.out.println("Miau Miau");
    }

    @Override
    public String toString() {
        return "Gato:"+"\n" + "Nome:"+getNome()+", Cor:" + cor;
    }
    
    
}
