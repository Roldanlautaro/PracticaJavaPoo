package hamburguesas;

public abstract class Hamburguesa {


    protected int precioBase;

    public Hamburguesa(int precioBase) {
        this.precioBase = precioBase;
    }

    public abstract int precioTotal();
}
