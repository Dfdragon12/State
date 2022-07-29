package State;

public class Notify {
    private State myEstado;

    public void setEstado(State e) {
        this.myEstado = e;
    }

    public void ejecutarAccion() {
        myEstado.ejecutarAccion();
    }
}