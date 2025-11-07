package PizzaPersonalizada;

public class ChampinonesExtra extends IngredienteExtra {
    public ChampinonesExtra(Pizza pizzaDecorada) {
        super(pizzaDecorada);
    }

    @Override
    public String getDescripcion() {
        return pizzaDecorada.getDescripcion() + " + Champiñones Extra";
    }

    @Override
    public double getCosto() {
        return pizzaDecorada.getCosto() + 2.0;
    }
}

