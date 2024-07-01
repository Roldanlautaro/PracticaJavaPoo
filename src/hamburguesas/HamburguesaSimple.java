package hamburguesas;

import ingredientes.Ingrediente;
import ingredientes.Medallon;

public class HamburguesaSimple extends Hamburguesa{

    private Medallon unMedallon;

    private Ingrediente unIngrediente;

    public void asignarUnMedallon(Medallon unMedallon) {
        if (this.unMedallon != null){
            throw new IllegalStateException("La Hamburguesa Simple Solo Puede Tener Un Medallon");
        }
        this.unMedallon = unMedallon;

    }

    public void asignarUnIngrediente(Ingrediente unIngrediente) {
        this.unIngrediente = unIngrediente;
    }

    public HamburguesaSimple(int precioBase) {
        super(precioBase);
    }

    @Override
    public int precioTotal() {
        return precioBase +
                unIngrediente.quePrecioTenes()
                + unMedallon.quePrecioTenes();
    }
}
