public class Perfil {
    private Integer id;
    private String nombreUsuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Perfil(Integer id, String nombreUsuario) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
    }
}
