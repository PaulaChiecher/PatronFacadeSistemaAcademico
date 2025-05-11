class SistemaAcademicoFacade {
    private Inscripcion inscripcion;
    private Notas notas;
    private Materias materias;
    public SistemaAcademicoFacade() {
        inscripcion = new Inscripcion();
        notas = new Notas();
        materias = new Materias();
    }
    public void inscribirEstudiante(Estudiante estudiante, String materia) {
        inscripcion.procesarInscripcion(estudiante.getNombre(), materia);
    }
    public void cargarNotaEstudiante(Estudiante estudiante, int nota) {
        notas.cargarNota(estudiante.getNombre(), nota);
    }
    public void verMaterias() {
        materias.mostrarMateriasDisponibles();
    }
}
