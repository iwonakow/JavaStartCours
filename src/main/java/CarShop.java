public class CarShop {
    public static void main(String[]args){
        Car audi = new Car();//audi jest referencją na obiekt typu Car. Należy to rozumieć w ten sposób, że w pamięci komputera osobno przechowywane są dane oraz wskaźniki na te dane. W skrócie referencja określa miejsce w pamięci gdzie jest zapisany obiekt, a obiekt przechowuje już konkretne informacje
        audi.carBrand = "Audi";
        audi.carModel = "A4";
        audi.doors = 4;
        audi.carColor = "Czarny";
        audi.carTiresColor = "Czarny";
        audi.carWheelsColor = "Srebrny";
        String audiInfo = audi.carBrand + " "+audi.carModel
                + " Drzwi: " + audi.doors
                + " Kolor nadwozia: "+ audi.carColor
                + " Kolor felg: " + audi.carWheelsColor
                + " Kolor opon: " + audi.carTiresColor;
        System.out.println("Wybrałeś następujący samochód: ");
        System.out.println(audiInfo);
        boolean isCar = audi instanceof Car;//sprawdzenie czy zmienna jest typu Car
        System.out.println(isCar);

    }
}
