package ec.edu.espe.proyecto.protesis.web;

/*
 * Protesis Store
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Protesis Store Corp.
 */
import ec.edu.espe.proyecto.protesis.model.Proveedor;
import ec.edu.espe.proyecto.protesis.service.ProveedorService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Protesis Store Corp.
 */
@Named
@ViewScoped
public class ProveedorBean implements Serializable {
    
    private List<Proveedor> proveedores;
    
    private Proveedor proveedor;
    
    @Inject
    private ProveedorService proveedorService;
    
    @PostConstruct
    public void init() {
        this.proveedores = this.proveedorService.obtenerTodos();
        this.proveedor = new Proveedor();
    }
}
