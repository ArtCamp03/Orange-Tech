public class App {
    public static void main(String[] args) throws Exception {
        
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2: " + (b1 && b2));
        System.out.println("b1 && b3: " + (b1 && b3));

        System.out.println("b2 || b3: " + (b2 || b3));
        System.out.println("b2 || b4: " + (b2 || b4));

        System.out.println("b1 ^ b3: " + (b1 ^ b3));
        System.out.println("b4 ^ b1: " + (b4 ^ b1));

        System.out.println(!b1);
        System.out.println(!b2);

        int i1 = 20;
        int i2 = 8;
        float f1 = 30f;
        float f2 = 80f;
        System.out.println("((i1 * i2) < (f2 - f1)) && true " + (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("(i1 > i2) || (f2 < f1) " + ((i1 > i2) || (f2 < f1)));

    }
}
