public abstract class Persona {
    private String nombre;
    private Integer dni;

    public Persona(String nombre, Integer dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public abstract void presentarse();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void datosPersonales(){
        System.out.println("nombre = " + nombre);
        System.out.println("dni = " + dni);
    }


}
