import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class DishIngredient {
    private int id;
    private Dish dishId;
    private List<Ingredient> ingredientId;
    private double quantityRequired;
    private UnitTypeEnum unit;

    public DishIngredient(int id, Dish dishId, List<Ingredient> ingredientId, double quantityRequired, UnitTypeEnum unit) {
        this.id = id;
        this.dishId = dishId;
        this.ingredientId = ingredientId;
        this.quantityRequired = quantityRequired;
        this.unit = unit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dish getDishId() {
        return dishId;
    }

    public void setDishId(Dish dishId) {
        this.dishId = dishId;
    }

    public List<Ingredient> getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(List<Ingredient> ingredientId) {
        this.ingredientId = ingredientId;
    }

    public double getQuantityRequired() {
        return quantityRequired;
    }

    public void setQuantityRequired(double quantityRequired) {
        this.quantityRequired = quantityRequired;
    }

    public UnitTypeEnum getUnit() {
        return unit;
    }

    public void setUnit(UnitTypeEnum unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "DishIngredient{" +
                "id=" + id +
                ", dishId=" + dishId +
                ", ingredientId=" + ingredientId +
                ", quantityRequired=" + quantityRequired +
                ", unit=" + unit +
                '}';
    }
}
