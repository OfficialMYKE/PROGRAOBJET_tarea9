public class Laptop extends Dispositivo {
    private int ram;

    public Laptop(String marca, String modelo, double precio, int ram) throws DatoInvalidoException {
        super(marca, modelo, precio);
        this.ram = ram;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("--- Laptop ---");
        super.mostrarInfo();
        System.out.println("RAM: " + ram + "GB");
        System.out.println("-------------------");
    }
}
