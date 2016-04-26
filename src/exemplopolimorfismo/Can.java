package exemplopolimorfismo;

/**
 *
 * @author ylagorebollar
 */
public class Can extends Animal{
    private String raza;

    public Can() {
        super();
    }

    public Can(String nome,String raza) {
        super(nome);
        this.raza = raza;
    }

    @Override
    public void falar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return "Can{" + "raza=" + raza + '}';
    }
    
    
}
