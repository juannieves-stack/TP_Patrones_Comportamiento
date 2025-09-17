package ChainResponsability;

public abstract class HandlerTutorias {
    private HandlerTutorias next;

    public void setNext(HandlerTutorias next) {
        this.next = next;
    }

    public void handle(String solicitud, int nivel) {
        if (!procesar(solicitud, nivel) && next != null) {
            next.handle(solicitud, nivel);
        }
    }
    protected abstract boolean procesar(String solicitud, int nivel);
    }

