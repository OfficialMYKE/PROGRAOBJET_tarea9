public class Telefono extends Dispositivo {
    private String sistemaOperativo;

    public Telefono(String marca, String modelo, double precio, String sistemaOperativo) throws DatoInvalidoException {
        super(marca, modelo, precio);
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("--- Teléfono ---");
        super.mostrarInfo();
        System.out.println("Sistema Operativo: " + sistemaOperativo);
        System.out.println("----------------------");
    }
}
