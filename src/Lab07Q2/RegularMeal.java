package Lab07Q2;

class RegularMeal extends Meal{
    boolean isVegetarian;

    @Override
    public double calculateBill() {
        return super.calculateBill()*quantity;
    }
    @Override
    public void displayOrderDetails(){
        System.out.println();
        System.out.println("----Regular Meal Details----");
        super.displayOrderDetails();
        System.out.println("Meal Type : " + (isVegetarian?"Vegetarian":"Non-Vegetarian"));
        System.out.println("Total Bill for Regular Meal: " + calculateBill());
    }


}
