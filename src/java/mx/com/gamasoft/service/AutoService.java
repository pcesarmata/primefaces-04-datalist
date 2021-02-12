package mx.com.gamasoft.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import mx.com.gamasoft.beans.Auto;

/**
 *
 * @author Cesar
 */
@ManagedBean(name ="autoService")
@ApplicationScoped
public class AutoService {

    public AutoService(List<String> colores1, List<String> marca1) {
    }
    
    private final static String[] color;
    private final static String[] marca;
    
    static {
        color = new String[10];
        color[0] = "azul";
        color[1] = "blanco";
        color[2] = "rojo";
        color[3] = "verde";
        color[4] = "naranja";
        color[5] = "café";
        color[6] = "amarillo";
        color[7] = "gris";
        color[8] = "rosa";
        color[9] = "morado";
        
        marca = new String[10];
        marca[1] = "Mercedes";
        marca[1] = "Mercedes";
        marca[2] = "Volvo";
        marca[3] = "Audi";
        marca[4] = "Renault";
        marca[5] = "Fiat";
        marca[6] = "Volkswagen";
        marca[7] = "Honda";
        marca[8] = "Jaguar";
        marca[9] = "Ford";
    }

    public List<String> getColor() {
        return Arrays.asList(color);
    }
     
    public List<String> getMarca() {
        return Arrays.asList(marca);
    }
    
    public List<Auto> crearAutos(int tamanio){
        List<Auto> list = new ArrayList<Auto>();
        for(int i = 0; i < tamanio; i ++) {
            list.add(new AutoService(getColor(), getMarca()));
        }
        return list;
    }
}