package State;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Notify notificacion = new Notify();
        Active activa = new Active();
        Cleaner limpiador = new Cleaner();
        int option = 0;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                muestraMenu();
                option = sc.nextInt();
                switch (option) {
                    case 1:
                        notificacion.setEstado(activa);
                        break;
                    case 2:
                        notificacion.setEstado(limpiador);
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("wtf");
                }
                notificacion.ejecutarAccion();
            } while (option != 0);
        }
    }

    private static void muestraMenu() {
        StringBuffer menu = new StringBuffer();
        menu.append("Seleccione estado de la pagina\n");
        menu.append("1- activa 2-cerrada por mantenimiento 3-salir \n");
        System.out.println(menu.toString());
    }
}
