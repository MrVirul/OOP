package Lab07Q2;

class RegularMeal extends Meal{
    boolean isVegetarian;

    public RegularMeal(String orderID, String customerName, int quantity, boolean isVegetarian) {
        super(orderID, customerName, quantity);
        this.isVegetarian = isVegetarian;
    }
    // Constructor with default values
    public RegularMeal() {
        super();
        this.isVegetarian = true;
    }
    @Override
    public double CalculateBill() {
        return super.CalculateBill()*quantity;
    }
    @Override
    public void displayOrderDetails(){
        System.out.println();
        System.out.println("----Regular Meal Details----");
        super.displayOrderDetails();
        System.out.println("Meal Type : " + (isVegetarian?"Vegetarian":"Non-Vegetarian"));
        System.out.println("Total Bill for Regular Meal: " + CalculateBill());
    }


}
