package Clase2305.genericidad;

import java.util.List;

public class Caja <Tipo> {
    private List<Tipo> elemento;
    private Tipo elem;

    public Caja(List<Tipo> elemento) {
        this.elemento = elemento;
    }

    public List<Tipo> getElemento() {
        return elemento;
    }


    public void mostrar(){
        for (int i= 0; i < elemento.size(); i++){
            Tipo elem = elemento.get(i);

        }
    }

}
