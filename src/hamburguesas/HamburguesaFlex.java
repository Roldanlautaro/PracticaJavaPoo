package hamburguesas;

public class HamburguesaFlex extends Hamburguesa{
    public HamburguesaFlex(int precioBase) {
        super(precioBase);
    }

    @Override
    public int precioTotal() {
        return 0;
    }
}
