package Lab07Q2;

public class ComboMeal extends Meal {
    boolean includesDrinkAndDessert;

    public ComboMeal(String orderID, String customerName,int quantity, boolean includesDrinkAndDessert) {
        super(orderID, customerName, quantity);
        this.includesDrinkAndDessert = includesDrinkAndDessert;
    }
    // Constructor with default values
    public ComboMeal() {
        super();
        this.includesDrinkAndDessert = true;
    }

  @Override
    public double CalculateBill() {
        return (includesDrinkAndDessert ? 15.0 * quantity + 5.0 : 15.0 * quantity);
    }
    @Override
    public void displayOrderDetails(){
        System.out.println();
        System.out.println("----Combo Meal Details----");
        super.displayOrderDetails();
        System.out.println("Includes Drink and Dessert: " + includesDrinkAndDessert);
        System.out.println("Total Bill for Combo Meal: " + CalculateBill());
    }
    }

