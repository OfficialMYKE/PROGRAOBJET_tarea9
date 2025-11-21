import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Juego> juegos = new ArrayList<>();
        int opcion = 0;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Registrar Mario Bros");
            System.out.println("2. Registrar Carrera de Vehículos");
            System.out.println("3. Mostrar todos");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            try {
                if(opcion == 1){
                    System.out.print("Nombre: ");
                    String n = sc.nextLine();
                    System.out.print("Plataforma: ");
                    String p = sc.nextLine();
                    System.out.print("Precio: ");
                    double pr = sc.nextDouble();
                    System.out.print("Año: ");
                    int an = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Tipo: ");
                    String t = sc.nextLine();

                    juegos.add(new MarioBros(n,p,pr,an,t));
                }
                else if(opcion == 2){
                    System.out.print("Nombre: ");
                    String n = sc.nextLine();
                    System.out.print("Plataforma: ");
                    String p = sc.nextLine();
                    System.out.print("Precio: ");
                    double pr = sc.nextDouble();
                    System.out.print("Año: ");
                    int an = sc.nextInt();
                    System.out.print("Cantidad de vehículos: ");
                    int cv = sc.nextInt();

                    juegos.add(new CarreraVehiculos(n,p,pr,an,cv));
                }
                else if(opcion == 3){
                    for(Juego j : juegos){
                        j.mostrarDetalles();
                        System.out.println();
                    }
                }
            } catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }

        } while(opcion != 4);

        sc.close();
    }
}
