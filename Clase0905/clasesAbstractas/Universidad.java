package clasesAbstractas;

public class Universidad {
    private String nombre;
    private Materia[] materias;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.materias = new Materia[10];
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Materia[] getMaterias() {
        return materias;
    }
    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }

    public void agregarMateria(Materia materia){
        int i = 0;
        while(i < materias.length){
            if(materias[i] == null){
                break;
            }
            i++;
        }
        if(i < materias.length){
            materias[i] = materia;
        }else{
            System.out.println("No se pueden agregar más materias");
        }
    }
}
