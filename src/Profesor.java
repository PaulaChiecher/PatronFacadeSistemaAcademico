class Profesor extends Persona {
    private String catedra;
    public Profesor(String nombre, String catedra) {
        super(nombre);
        this.catedra = catedra;
    }
    public String getCatedra() {
        return catedra;
    }
    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }
    // Sobrescritura
    @Override
    public void accederSistema() {
        System.out.println("Profesor " + getNombre() + " accede al sistema de cátedra " + catedra);
    }
}
