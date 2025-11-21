import java.util.ArrayList;

public class MainDispositivos {
    public static void main(String[] args) {

        ArrayList<Dispositivo> dispositivos = new ArrayList<>();

        try {
            dispositivos.add(new Laptop("Dell", "Inspiron 15", 750, 16));
            dispositivos.add(new Telefono("Samsung", "Galaxy A54", 450, "Android"));
            dispositivos.add(new Telefono("Apple", "iPhone SE", 999, "iOS"));

            // Intento con error
            dispositivos.add(new Laptop("", "ModeloX", -500, 8));

        } catch (DatoInvalidoException e) {
            System.out.println("Error al crear dispositivo: " + e.getMessage());
        }

        System.out.println(" --- Dispositivos Registrados ---");
        for (Dispositivo d : dispositivos) {
            d.mostrarInfo();
        }
    }
}
