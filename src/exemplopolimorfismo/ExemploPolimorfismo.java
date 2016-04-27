package exemplopolimorfismo;

import java.util.ArrayList;

/**
 *
 * @author ylagorebollar
 */
public class ExemploPolimorfismo {

    public static void main(String[] args) {
        ArrayList <Animal> listaAnimais = new ArrayList();
        Animal can = new Can("Brisa","Dogo");
        Animal ga = new Gato("Minino","Blanco");
        listaAnimais.add(can);
        listaAnimais.add(ga);
        for(Animal ani:listaAnimais)
            System.out.println(ani.toString());
        for(Animal ani:listaAnimais){
            ani.falar();
            if(ani instanceof Can)
                ((Can)ani).andar();
        }
        for(Animal ani:listaAnimais)
            falarPolimorfico(ani);
        
    }
    //Metodo con paramatre xeralista
    public static void falarPolimorfico(Animal a){
        a.falar();  
        
    }
}
