import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Cuenta implements Comparable<Cuenta> {
    private Integer id;
    private String nombre;
    private Set<Perfil> perfiles;
    private Double valorBase;

    public Cuenta(Integer id, String nombre, Double valorBase) {
        this.id = id;
        this.nombre = nombre;
        this.perfiles = new HashSet<>();
        this.valorBase = valorBase;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Perfil> getPerfiles() {
        return perfiles;
    }

    public void setPerfiles(Set<Perfil> perfiles) {
        this.perfiles = perfiles;
    }

    public Double getValorBase() {
        return valorBase;
    }

    public void setValorBase(Double valorBase) {
        this.valorBase = valorBase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuenta cuenta = (Cuenta) o;
        return Objects.equals(id, cuenta.id) && Objects.equals(nombre, cuenta.nombre) && Objects.equals(perfiles, cuenta.perfiles) && Objects.equals(valorBase, cuenta.valorBase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, perfiles, valorBase);
    }

    @Override
    public int compareTo(Cuenta o) {
        if (this.perfiles.size() == ((Cuenta) o).perfiles.size()) {
            System.out.println("Las cantidad de perfiles son las mismas");
            return 0;
        } else if (this.perfiles.size() > ((Cuenta) o).perfiles.size()){
            System.out.println("Las cantidad de perfiles son mayores");
            return 1;
        }else{
            System.out.println("Las cantidad de perfiles son menores");
            return -1;
        }

    }


    public abstract Double calcularCostoTotal();

    public void agregarPerfil(Perfil perfil) throws LimiteExcedidoException{
        perfiles.add(perfil);
    }

    public void eliminarPerfil(Perfil perfil) {
        perfiles.remove(perfil);
    }


    @Override
    public String toString() {
        return "Cuenta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", perfiles=" + perfiles +
                ", valorBase=" + valorBase +
                '}';

    }
}