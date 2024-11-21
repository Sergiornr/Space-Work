import java.util.Set;

public class Basica extends Cuenta {
    private Boolean estadoDePruebaActivado;

    public Basica(Integer id, String nombre, Double valorBase, Boolean estadoDePruebaActivado) {
        super(id, nombre, valorBase);
        this.estadoDePruebaActivado = estadoDePruebaActivado;
    }

    @Override
    public Double calcularCostoTotal() {
        Double valorAdicional = getValorBase() * 0.03 * getPerfiles().size();
        Double costoTotal = getValorBase() + valorAdicional;

        return costoTotal;
    }


    @Override
    public void agregarPerfil(Perfil perfil) throws LimiteExcedidoException {
        if (getPerfiles().size() > 5) {
            throw new LimiteExcedidoException("No hemos podido crear su perfil,ha superado la cantidad de perfiles habilitadospara este plan");
        } else {
            super.agregarPerfil(perfil);
        }


    }
}
