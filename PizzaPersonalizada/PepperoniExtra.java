package PizzaPersonalizada;

public class PepperoniExtra extends IngredienteExtra {

    public PepperoniExtra(Pizza pizzaDecorada) {
        super(pizzaDecorada);
    }

    @Override
    public String getDescripcion() {
        return pizzaDecorada.getDescripcion() + " + Pepperoni Extra";
    }

    @Override
    public double getCosto() {
        return pizzaDecorada.getCosto() + 3.5; // costo adicional por pepperoni extra
    }
}
