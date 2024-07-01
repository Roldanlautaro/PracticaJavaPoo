package ingredientes;

public class Ingrediente {

    private int precio;


    public Ingrediente(int precio) {
        this.precio = precio;
    }

    public int quePrecioTenes() {
        return precio;
    }

    public void asignarPrecio (int precio) {
        this.precio = precio;
    }

}
