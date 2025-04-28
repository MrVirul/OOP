package Lab07Q2;

public class RestaurantApp {
    public static void main(String[] args){

        RegularMeal regularMeal1 = new RegularMeal();
        ComboMeal comboMeal1 = new ComboMeal("C001", "John Doe", 2, true);

        Meal.calculateBill(12.0, 2);
        Meal.calculateBill(15.0, 5);

        regularMeal1.displayOrderDetails();
        comboMeal1.displayOrderDetails();

    }
}
