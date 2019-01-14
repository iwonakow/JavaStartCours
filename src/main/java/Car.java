public class Car {
    int doors;
    int year;
    String carColor;
    String carWheelsColor;
    String carTiresColor;
    String carBrand;
    String carModel;
    //przeciązęnie metod ta sama nazwa metody może występować jeśli zawiera różną liczbę argumentów
    Car(int year, int doors, String brand, String model, String color){
        this(year,brand, model);
        this.carColor = color;

    }
    Car(int year, String brand,String model){
        this.year = year;
        this.carBrand = brand;
        this.carModel = model;
    }
}
