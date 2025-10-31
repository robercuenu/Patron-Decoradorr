package PizzaPersonalizada;

public abstract class IngredienteExtra implements Pizza {
    protected Pizza pizzaDecorada;

    public IngredienteExtra(Pizza pizza) {
        this.pizzaDecorada = pizza;
    }

    @Override
    public String getDescripcion() {
        return pizzaDecorada.getDescripcion();
    }

    @Override
    public double getCosto() {
        return pizzaDecorada.getCosto();
    }
}
