package hamburguesas;

import ingredientes.Ingrediente;
import ingredientes.Medallon;

import java.util.ArrayList;
import java.util.List;

public class HamburguesaFlex extends Hamburguesa{

    private List<Medallon> medallones = new ArrayList<>();

    private List<Ingrediente> ingredientes = new ArrayList<>();

    public void asignarIngrediente(Ingrediente unIngrediente){
        this.ingredientes.add(unIngrediente);
    }

    public void asignarMedallon(Medallon unmedallon){
        this.medallones.add(unmedallon);
    }

    public HamburguesaFlex(int precioBase) {
        super(precioBase);
    }

    @Override
    public int precioTotal() {
        int total = precioBase;

        for (Medallon medallon : medallones) {
            total += medallon.quePrecioTenes();
        }

        for (Ingrediente ingrediente : ingredientes) {
            total += ingrediente.quePrecioTenes();
        }
        return total;
    }
}


