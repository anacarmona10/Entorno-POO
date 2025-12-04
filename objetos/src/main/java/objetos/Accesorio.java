package objetos;

import java.time.LocalDate;

public class Accesorio {

    private String tipo;
    private String material;
    private double precio;
    private String descripcion;
    private boolean economico;
    private LocalDate fechaRegistro;
    
    // Constructor vacío 
    public Accesorio() {
        this.tipo = "Sin tipo";
        this.material = "Desconocido";
        this.precio = 0.0;
        this.descripcion = "Sin descripción";
        this.economico = false;
        this.fechaRegistro = LocalDate.now();
    }

    // Constructor por defecto
    public Accesorio(boolean defaultConstructor) {
        this();
    }

    // Constructor con parámetros
    public Accesorio(String tipo, String material, double precio, String descripcion,
    boolean economico, LocalDate fechaRegistro) {

        setTipo(tipo);
        setMaterial(material);
        setPrecio(precio);
        setDescripcion(descripcion);
        setEconomico(economico);
        setFechaRegistro(fechaRegistro);
    }

    // Getters y Setters con validaciones

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null || tipo.isBlank()) {
            this.tipo = "Sin tipo";
        } else {
            this.tipo = tipo;
        }
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        if (material == null || material.isBlank()) {
            this.material = "Desconocido";
        } else {
            this.material = material;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            this.precio = 0;
        } else {
            this.precio = precio;
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion == null || descripcion.isBlank()) {
            this.descripcion = "Sin descripción";
        } else {
            this.descripcion = descripcion;
        }
    }

    public boolean esEconomico() {
        return economico;
    }

    public void setEconomico(boolean economico) {
        this.economico = economico;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        if (fechaRegistro == null) {
            this.fechaRegistro = LocalDate.now();
        } else {
            this.fechaRegistro = fechaRegistro;
        }
    }

    public void aplicarDescuento(double porcentaje) {
    if (porcentaje > 0 && porcentaje < 100) {
        double descuento = precio * (porcentaje / 100);
        precio -= descuento;
        System.out.println("Descuento aplicado. Nuevo precio: " + precio);
    } else {
        System.out.println("El porcentaje debe ser mayor que 0 y menor que 100.");
    }
}



    // toString()
    @Override
    public String toString() {
        return "Accesorio {" +
                "tipo='" + tipo + '\'' +
                ", material='" + material + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", economico=" + economico +
                ", fechaRegistro=" + fechaRegistro;
    }
}
