package objetos;

    import java.time.LocalDate;

public class Cancion {

    private String titulo;
    private String artista;
    private String album;
    private String duracion; 
    private int reproducciones;
    private LocalDate fechaLanzamiento;

    // Constructor vacío (por defecto)
    public Cancion() { // Constructor por defecto
        this.titulo = "Sin título";
        this.artista = "Desconocido";
        this.album = "Sin álbum";
        this.duracion = "0:00";
        this.reproducciones = 0;
        this.fechaLanzamiento = LocalDate.now(); // fecha actual como valor razonable
    }

    //Constructor con parámetros (usando setters)
    public Cancion(String titulo, String artista, String album, String duracion,
                   int reproducciones, LocalDate fechaLanzamiento) {

        setTitulo(titulo);
        setArtista(artista);
        setAlbum(album);
        setDuracion(duracion);
        setReproducciones(reproducciones);
        setFechaLanzamiento(fechaLanzamiento);
    }

    // Getters y Setters con validación

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            this.titulo = "Sin título";
        } else {
            this.titulo = titulo;
        }
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        if (artista == null || artista.isBlank()) {
            this.artista = "Desconocido";
        } else {
            this.artista = artista;
        }
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        if (album == null || album.isBlank()) {
            this.album = "Sin álbum";
        } else {
            this.album = album;
        }
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        if (duracion == null || duracion.isBlank()) {
            this.duracion = "0:00";
        } else {
            this.duracion = duracion;
        }
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = Math.max(0, reproducciones);
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        if (fechaLanzamiento == null) {
            this.fechaLanzamiento = LocalDate.now();
        } else {
            this.fechaLanzamiento = fechaLanzamiento;
        }
    }

    public void reproducir() {
    this.reproducciones++;
    }

    public int obtenerAniosDesdeLanzamiento() {
    if (fechaLanzamiento == null) {
        return 0; // O un valor especial
    }
    return java.time.Period.between(fechaLanzamiento, java.time.LocalDate.now()).getYears();
    }



    // toString()
    @Override
    public String toString() {
        return "Cancion {" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", album='" + album + '\'' +
                ", duracion='" + duracion + '\'' +
                ", reproducciones=" + reproducciones +
                ", fechaLanzamiento=" + fechaLanzamiento +
                '}';
    }
}


