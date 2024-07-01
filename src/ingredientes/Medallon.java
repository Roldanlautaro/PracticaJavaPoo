package ingredientes;

public class Medallon {
    private int precio;

    public Medallon(int precio) {
        this.precio = precio;
    }

    public int quePrecioTenes() {
        return precio;
    }

    public void asignarPrecio(int precio) {
        this.precio = precio;
    }

}
