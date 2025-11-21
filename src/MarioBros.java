public class MarioBros extends Juego {
    private String tipo;

    public MarioBros(String nombre, String plataforma, double precio, int anioLanzamiento, String tipo){
        super(nombre, plataforma, precio, anioLanzamiento);
        if(tipo == null || tipo.isEmpty()) throw new IllegalArgumentException("Tipo inválido");
        this.tipo = tipo;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("--- Juego de Mario Bros ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Precio: $" + precio);
        System.out.println("Año de lanzamiento: " + anioLanzamiento);
        System.out.println("Tipo de mundo: " + tipo);
    }
}
