public abstract class Juego {
    protected String nombre;
    protected String plataforma;
    protected double precio;
    protected int anioLanzamiento;

    public Juego(String nombre, String plataforma, double precio, int anioLanzamiento){
        if(nombre == null || nombre.isEmpty()) throw new IllegalArgumentException("Nombre inválido");
        if(plataforma == null || plataforma.isEmpty()) throw new IllegalArgumentException("Plataforma inválida");
        if(precio < 0) throw new IllegalArgumentException("Precio inválido");
        if(anioLanzamiento < 1900) throw new IllegalArgumentException("Año inválido");
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.precio = precio;
        this.anioLanzamiento = anioLanzamiento;
    }

    public abstract void mostrarDetalles();
}
