package objetos;

public class CuentaInstagram {

    private int numeroSeguidores;
    private int numeroSiguiendo;
    private String biografia;
    private String tipoCuenta;
    private String paisOrigen;
    private String alias;
    private boolean activo;

    //Constructor vacío (por defecto)
    public CuentaInstagram() { 
        this.numeroSeguidores = 0;
        this.numeroSiguiendo = 0;
        this.biografia = "Sin biografía";
        this.tipoCuenta = "Personal";
        this.paisOrigen = "Desconocido";
        this.alias = "usuarioNuevo";
        this.activo = true;
    }

    // Constructor con parámetros
    public CuentaInstagram(int numeroSeguidores, int numeroSiguiendo, String biografia, String tipoCuenta, String paisOrigen, String alias, boolean activo) {

        setNumeroSeguidores(numeroSeguidores);
        setNumeroSiguiendo(numeroSiguiendo);
        setBiografia(biografia);
        setTipoCuenta(tipoCuenta);
        setPaisOrigen(paisOrigen);
        setAlias(alias);
        setActivo(activo);
    }

    //Getters y Setters con validación
    public int getNumeroSeguidores() {
        return numeroSeguidores;
    }

    public void setNumeroSeguidores(int numeroSeguidores) {
        if (numeroSeguidores < 0) {
            this.numeroSeguidores = 0;
        } else {
            this.numeroSeguidores = numeroSeguidores;
        }
    }

    public int getNumeroSiguiendo() {
        return numeroSiguiendo;
    }

    public void setNumeroSiguiendo(int numeroSiguiendo) {
        if (numeroSiguiendo < 0) {
            this.numeroSiguiendo = 0;
        } else {
            this.numeroSiguiendo = numeroSiguiendo;
        }
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        if (biografia == null || biografia.isBlank()) {
            this.biografia = "Sin biografía";
        } else {
            this.biografia = biografia;
        }
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        if (tipoCuenta == null || tipoCuenta.isBlank()) {
            this.tipoCuenta = "Personal";
        } else {
            this.tipoCuenta = tipoCuenta;
        }
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        if (paisOrigen == null || paisOrigen.isBlank()) {
            this.paisOrigen = "Desconocido";
        } else {
            this.paisOrigen = paisOrigen;
        }
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        if (alias == null || alias.isBlank()) {
            this.alias = "usuarioNuevo";
        } else {
            this.alias = alias;
        }
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }


    public void cambiarTipoCuenta(String nuevoTipo) {
        if (nuevoTipo == null || nuevoTipo.isBlank()) {
            System.out.println("Tipo de cuenta inválido.");
        } else {
            this.tipoCuenta = nuevoTipo;
            System.out.println("Tipo de cuenta actualizado a: " + nuevoTipo);
        }
    }

    /** Desactiva la cuenta cambiando el estado a false */
    public void desactivarCuenta() {
        this.activo = false;
        System.out.println("✔ La cuenta ha sido desactivada.");
    }

    //  toString()
    @Override
    public String toString() {
        return "CuentaInstagram {" +
                "numeroSeguidores=" + numeroSeguidores +
                ", numeroSiguiendo=" + numeroSiguiendo +
                ", biografia='" + biografia + '\'' +
                ", tipoCuenta='" + tipoCuenta + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", alias='" + alias + '\'' +
                ", activo=" + activo +
                '}';
    }
}

