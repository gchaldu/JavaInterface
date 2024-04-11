public class Estudiante extends Persona implements IEstudiar , IEnsenar{
    private Integer nroLegajo;
    public Estudiante(String nombre, Integer dni, Integer nroLegajo) {
        super(nombre, dni);
        this.nroLegajo = nroLegajo;
    }
    @Override
    public void presentarse() {
        System.out.println("Soy = " + super.getNombre());
        System.out.println("Legajo = " + nroLegajo);
    }

    @Override
    public void estudiar() {

    }

    @Override
    public void ensenar() {

    }
}
