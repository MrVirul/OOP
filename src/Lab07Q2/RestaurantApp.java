package Lab07Q2;

public class RestaurantApp {
    public static void main(String[] args){

        RegularMeal regularMeal1 = new RegularMeal();
        ComboMeal comboMeal1 = new ComboMeal("C001", "John Doe",2,true);

        regularMeal1.CalculateBill();
        regularMeal1.CalculateBill(5);

        comboMeal1.CalculateBill();
        comboMeal1.CalculateBill(2);

        regularMeal1.displayOrderDetails();
        comboMeal1.displayOrderDetails();

    }
}
