public class SistemaAcademico {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Paula", 123);
        Profesor profesor = new Profesor("Ing. Walter", "Ingeniería de Software");

        estudiante.accederSistema();
        profesor.accederSistema();

        SistemaAcademicoFacade sistema = new SistemaAcademicoFacade();
        sistema.verMaterias();
        sistema.inscribirEstudiante(estudiante, "Ingeniería de Software");
        sistema.cargarNotaEstudiante(estudiante, 9);

        estudiante.inscribirse("Matemática");
        estudiante.inscribirse("Física", 3);
    }
}
