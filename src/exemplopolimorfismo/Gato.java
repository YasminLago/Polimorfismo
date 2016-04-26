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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Gato{" + "cor=" + cor + '}';
    }
    
    
}
