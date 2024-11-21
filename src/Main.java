import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cuenta cuentaBasica1 = new Basica(123456, "Aurelio", 5000.0, true);
        Cuenta cuentaBasica2 = new Basica(123445, "Alfonso", 5000.0, false);
        Cuenta cuentaPremium1 = new Premium(654321, "Lorenzo", 8000.0, true);
        Cuenta cuentaPremium2 = new Premium(654312, "Matias", 8000.0, false);
        Perfil perfil1 = new Perfil(321654, "Almiron");
        Perfil perfil2 = new Perfil(321645, "Orellana");
        Perfil perfil3 = new Perfil(321678, "Garnacho");
        Perfil perfil4 = new Perfil(321687, "Alderete");
        Perfil perfil5 = new Perfil(321691, "Rios");
        Perfil perfil6 = new Perfil(321683, "Davila");

        Set<Cuenta> cuentaset = new HashSet<>();
        cuentaset.add(cuentaBasica1);
        cuentaset.add(cuentaBasica2);
        cuentaset.add(cuentaPremium1);
        cuentaset.add(cuentaPremium2);
        cuentaset.forEach(cuenta -> System.out.println(cuenta));

        try {
            cuentaBasica1.agregarPerfil(perfil1);
            cuentaBasica2.agregarPerfil(perfil2);
            cuentaPremium1.agregarPerfil(perfil3);
            cuentaBasica2.eliminarPerfil(perfil2);
            cuentaBasica1.agregarPerfil(perfil2);
            cuentaBasica1.agregarPerfil(perfil3);
            cuentaBasica1.agregarPerfil(perfil4);
            cuentaBasica1.agregarPerfil(perfil5);
            cuentaBasica1.agregarPerfil(perfil6);
        } catch (LimiteExcedidoException e) {
            System.err.println("No hemos podido crear su perfil,ha superado la cantidad de perfiles habilitadospara este plan");
            ;
        } finally {
            System.out.println("terminar el proceso");
        }

        cuentaBasica1.compareTo(cuentaPremium1);
        cuentaBasica2.compareTo(cuentaPremium2);
        System.out.println("Metodo calcular costo total");
        System.out.println(cuentaBasica1.calcularCostoTotal() + "\n" +
                cuentaBasica2.calcularCostoTotal() + "\n" +
                cuentaPremium1.calcularCostoTotal() + "\n" +
                cuentaPremium2.calcularCostoTotal());
    }
}