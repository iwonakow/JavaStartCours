public class Calculate {
    public static void main (String[]args) {
        Calculator calculator = new Calculator();
        double a = 15;
        double b = 2.5;
        double c = 1;
        System.out.println(" A = "+a+ "B= "+ b);
        System.out.println("A+B = " + calculator.add(a,b,c));
        System.out.println("A+B+C= "+ calculator.add(a,b));
        System.out.println("A-B = "+ calculator.subtract(a,b));
        System.out.println("A-B-C = " + calculator.subtract(a,b,c));
        System.out.println("A*B = " + calculator.multiply(a,b));
        System.out.println("A/B = " + calculator.divide(a,b));

    }
}
