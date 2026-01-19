import java.util.List;
import java.util.Objects;

public class Dish {
    private Integer id;
    private Double sellingPrice;
    private String name;
    private DishTypeEnum dishType;
    private List<Ingredient> ingredients;

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }


    public Double getDishCost() {
        double totalPrice = 0;
        for (int i = 0; i < ingredients.size(); i++) {
            Double quantity = ingredients.get(i).getQuantity();
            if(quantity == null) {
                throw new RuntimeException("...");
            }
            totalPrice = totalPrice + ingredients.get(i).getPrice() * quantity;
        }
        return totalPrice;
    }

    public Dish() {
    }

    public Dish(Integer id, String name, DishTypeEnum dishType, List<Ingredient> ingredients) {
        this.id = id;
        this.name = name;
        this.dishType = dishType;
        this.ingredients = ingredients;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DishTypeEnum getDishType() {
        return dishType;
    }

    public void setDishType(DishTypeEnum dishType) {
        this.dishType = dishType;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        if (ingredients == null) {
            this.ingredients = null;
            return;
        }
        for (int i = 0; i < ingredients.size(); i++) {
            ingredients.get(i).setDish(this);
        }
        this.ingredients = ingredients;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return Objects.equals(id, dish.id) && Objects.equals(name, dish.name) && dishType == dish.dishType && Objects.equals(ingredients, dish.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dishType, ingredients);
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", sellingPrice=" + sellingPrice +
                ", name='" + name + '\'' +
                ", dishType=" + dishType +
                ", ingredients=" + ingredients +
                '}';
    }

    public Double getGrossMargin() {
        if (sellingPrice == null) {
            throw new RuntimeException("Selling price not available for dish: " + name);
        }
        return sellingPrice - getDishCost();
    }
}
