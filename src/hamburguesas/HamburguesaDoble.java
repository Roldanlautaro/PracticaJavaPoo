package hamburguesas;

import ingredientes.Ingrediente;
import ingredientes.Medallon;

public class HamburguesaDoble extends Hamburguesa {

    private Medallon primerMedallon;

    private Medallon segundoMedallon;
    private Ingrediente unIngrediente;

    private Ingrediente segundoIngrediente;


    public void asignarUnMedallon(Medallon unMedallon) {
        if (this.primerMedallon == null) {
            this.primerMedallon = unMedallon;
        } else if (this.segundoMedallon == null) {
            this.segundoMedallon = unMedallon;
        } else {
            throw new IllegalStateException("Una Hamburguesa Doble No Puede Tener Mas De Dos Medallones");
        }
    }

    public void asignarUnIngrediente(Ingrediente unIngrediente) {
        this.unIngrediente = unIngrediente;
    }
    public void asignarSegundoIngrediente(Ingrediente segundoIngrediente) {
        this.segundoIngrediente = segundoIngrediente;
    }
    public HamburguesaDoble(int precioBase) {
        super(precioBase);
    }

    @Override
    public int precioTotal() {
        return precioBase + primerMedallon.quePrecioTenes()
                + segundoMedallon.quePrecioTenes()
                + unIngrediente.quePrecioTenes()
                + segundoIngrediente.quePrecioTenes();
    }
}
