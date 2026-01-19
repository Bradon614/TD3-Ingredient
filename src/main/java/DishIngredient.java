import java.util.Objects;

public class DishIngredient {
    private int id;
    private int dishId;
    private int ingredientId;
    private double quantityRequired;
    private UnitTypeEnum unit;

    public DishIngredient() {
    }

    public DishIngredient(int id, int dishId, int ingredientId, double quantityRequired, UnitTypeEnum unit) {
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

    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
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


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DishIngredient that = (DishIngredient) o;
        return id == that.id && dishId == that.dishId && ingredientId == that.ingredientId && Double.compare(quantityRequired, that.quantityRequired) == 0 && unit == that.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dishId, ingredientId, quantityRequired, unit);
    }
}
