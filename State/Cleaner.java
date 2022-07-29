package State;

public class Cleaner implements State {
    @Override
    public void ejecutarAccion() {
        System.out.println("Pagina en Mantenimiento");
    }
}
