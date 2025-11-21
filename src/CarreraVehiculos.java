public class CarreraVehiculos extends Juego {
    private int cantidadVehiculos;

    public CarreraVehiculos(String nombre, String plataforma, double precio, int anioLanzamiento, int cantidadVehiculos){
        super(nombre, plataforma, precio, anioLanzamiento);
        if(cantidadVehiculos <= 0) throw new IllegalArgumentException("Cantidad inválida");
        this.cantidadVehiculos = cantidadVehiculos;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("--- Juego de Carreras ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Precio: $" + precio);
        System.out.println("Año de lanzamiento: " + anioLanzamiento);
        System.out.println("Vehículos disponibles: " + cantidadVehiculos);
    }
}
