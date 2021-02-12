package mx.com.gamasoft.beans;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import mx.com.gamasoft.service.AutoService;

/**
 *
 * @author Cesar
 */
@ManagedBean
@ViewScoped
public class AutoBean implements Serializable {
    
    private List<Auto> auto;
    
    @ManagedProperty("#{autoService}")
    private AutoService servicio;
    
    public void init(){
        auto = servicio.crearAutos(10);
    }

    public void setAuto(List<AutoService> auto) {
        this.auto = auto;
    }
}