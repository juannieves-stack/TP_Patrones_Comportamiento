package ChainResponsability;

public class RevisionProfesor extends HandlerTutorias{
    protected boolean procesar(String solicitud, int nivel) {
        if (nivel <= 3) {
            System.out.println("El profesor resolvió la: " + solicitud);
            return true;
        }
        return false;
    }
}
