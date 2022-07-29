package State;

public class Active implements State {
    @Override
    public void ejecutarAccion() {
        System.out.println("Pagina Activa");
    }
}
