package Command;

public class AbandonarCursoCommand implements Command{
    public Alumno alumno;

    public AbandonarCursoCommand(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public void execute() {
        alumno.AbandonarCursoCommand();
    }
}
