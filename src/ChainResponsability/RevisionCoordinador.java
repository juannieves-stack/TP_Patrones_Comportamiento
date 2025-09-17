package ChainResponsability;

public class RevisionCoordinador extends HandlerTutorias{
    protected boolean procesar(String solicitud, int nivel) {
        if (nivel <= 2) {
            System.out.println("El coordinador resolvió la: " + solicitud);
            return true;
        }
        return false;
    }
}
