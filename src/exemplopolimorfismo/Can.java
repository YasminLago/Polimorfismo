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
    
    public void andar(){
        System.out.println("Anda o can");
    }

    @Override
    public void falar() {
        System.out.println("Guau Guau");
            
    }
    
    @Override
    public String toString() {
        return "Can: "+ "\n" +"Nome:"+getNome()+ ", Raza:" + raza;
    }
    
    
}
