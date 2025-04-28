package Lab07Q2;

class RegularMeal extends Meal{
    boolean isVegetarian;

    @Override
    public double calculateBill() {
        return super.calculateBill()*quantity;
    }


}
