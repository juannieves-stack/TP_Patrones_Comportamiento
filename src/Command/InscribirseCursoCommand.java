package Command;

public class InscribirseCursoCommand implements Command{
    public Alumno alumno;

    public InscribirseCursoCommand(Alumno alumno) {
        this.alumno = alumno;
    };

    @Override
    public void execute() {
        alumno.InscribirseCursoCommand();
    }
}
