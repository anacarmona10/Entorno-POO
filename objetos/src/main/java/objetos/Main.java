package objetos;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // ===========================
        // 1️⃣ OBJETOS DE ACCESORIO
        // ===========================
        System.out.println("\n=== ACCESORIOS ===");

        Accesorio acc1 = new Accesorio(
                "Pulsera",
                "Hilaza multicolor",
                25000,
                "Pulsera tejida a mano",
                false,
                LocalDate.of(2024, 1, 15)
        );

        Accesorio acc2 = new Accesorio(); // usando constructor vacío
        acc2.setTipo("Collar");
        acc2.setPrecio(10000);

        System.out.println(acc1);

        acc1.aplicarDescuento(10);

        System.out.println(acc1);
        System.out.println(acc2);


        // ===========================
        // 2️⃣ OBJETOS CUENTA INSTAGRAM
        // ===========================
        System.out.println("\n=== CUENTAS INSTAGRAM ===");

        CuentaInstagram cuenta1 = new CuentaInstagram(
                30100000,
                15,
                "TWICE OFFICIAL INSTAGRAM",
                "Artista/Musical",
                "Corea",
                "twicetagram",
                true
        );


        CuentaInstagram cuenta2 = new CuentaInstagram(); // constructor vacío
        cuenta2.setAlias("jy_piece");

        System.out.println(cuenta1);
        cuenta1.cambiarTipoCuenta("Grupo Musical");
        System.out.println(cuenta1);

        
        System.out.println(cuenta2);
        cuenta2.desactivarCuenta();
        System.out.println(cuenta2);


        // ===========================
        // 3️⃣ OBJETOS CANCIÓN
        // ===========================
        System.out.println("\n=== CANCIONES ===");

        Cancion cancion1 = new Cancion(
                "MARS",
                "TWICE",
                "This is for",
                "2:21",
                2900000,
                LocalDate.of(2016, 5, 10)
        );

        Cancion cancion2 = new Cancion(); // usando valores por defecto
        cancion2.setTitulo("RADIOACTIVE");
        cancion2.setArtista("MARINA AND THE DIAMONDS");
        cancion2.setFechaLanzamiento(LocalDate.of(2011, 8, 22));

        System.out.println(cancion1);
        cancion1.reproducir();
        System.out.println(cancion1);


        System.out.println(cancion2);
        int años = cancion2.obtenerAniosDesdeLanzamiento();
        System.out.println("Años desde lanzamiento: " + años + " años");
        System.out.println(cancion2);


    }
}
