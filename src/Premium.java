import java.util.Set;

public class Premium extends Cuenta{
    private Boolean descuentoHabilitado;


    public Premium(Integer id, String nombre, Double valorBase, Boolean descuentoHabilitado) {
        super(id, nombre, valorBase);
        this.descuentoHabilitado = descuentoHabilitado;
    }




    @Override
    public Double calcularCostoTotal() {
        Double valorAdicional = getValorBase() * 0.05 * getPerfiles().size();
        ;
        Double costoTotal = getValorBase()+ valorAdicional;
        if (descuentoHabilitado) {
            costoTotal = getValorBase()+ valorAdicional - valorAdicional * 0.2;

        }

        return costoTotal;
    }
}
