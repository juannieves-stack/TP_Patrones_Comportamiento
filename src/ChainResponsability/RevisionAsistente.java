package ChainResponsability;

public class RevisionAsistente extends HandlerTutorias{
    protected boolean procesar(String solicitud, int nivel) {
        if (nivel <= 1) {
            System.out.println("El asistente resolvió la: " + solicitud);
            return true;
        }
        return false;
    }
}
