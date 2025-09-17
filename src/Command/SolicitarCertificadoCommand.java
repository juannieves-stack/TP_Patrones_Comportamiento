package Command;

public class SolicitarCertificadoCommand implements Command{
    public Alumno alumno;

    public SolicitarCertificadoCommand(Alumno alumno){
        this.alumno = alumno;
    }

    @Override
    public void execute() {
        alumno.SolicitarCertificadoCommand();
    }
}
