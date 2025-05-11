class Estudiante extends Persona{
    private int legajo;
    public Estudiante(String nombre, int legajo) {
        super(nombre);
        this.legajo = legajo;
    }
    public int getLegajo() {
        return legajo;
    }
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    // Sobrescritura
    @Override
    public void accederSistema() {
        System.out.println("Estudiante " + getNombre() + " con legajo " + legajo + " accede al sistema.");
    }
    // Sobrecarga
    public void inscribirse(String materia) {
        System.out.println("Inscribiendo a " + getNombre() + " en la materia: " + materia);
    }
    public void inscribirse(String materia, int año) {
        System.out.println("Inscribiendo a " + getNombre() + " en " + materia + " del año " + año);
    }
}
