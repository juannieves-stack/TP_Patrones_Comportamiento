import ChainResponsability.HandlerTutorias;
import ChainResponsability.RevisionAsistente;
import ChainResponsability.RevisionCoordinador;
import ChainResponsability.RevisionProfesor;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n----------Prueba patron Chain Responsability----------");
        HandlerTutorias basico = new RevisionAsistente();
        HandlerTutorias intermedio = new RevisionCoordinador();
        HandlerTutorias experto = new RevisionProfesor();
        basico.setNext(intermedio);
        intermedio.setNext(experto);
        basico.handle("consulta simple", 1);
        basico.handle("consulta compleja", 3);
    }
}