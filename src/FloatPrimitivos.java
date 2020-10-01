public class FloatPrimitivos {
    public static void main(String[] args) {
        // Exponente 3E4F significa 3˄4F
        // Entre 1.4E-45 Hasta 3.4028235E38
        float realFloat = 3.1416F;

        System.out.println("realFloat = " + realFloat);
        System.out.println("Tipo de dato Float: " + Float.BYTES);
        System.out.println("Tipo Float En bits es: " + Float.SIZE);
        System.out.println("Valor máximo de un Float: " + Float.MAX_VALUE);
        System.out.println("El Valor mínimo en un Float es: " + Float.MIN_VALUE);

        // Entre 4.9E-324 Hasta 1.7976931348623157E308
        double realDouble = 4.7485455;

        System.out.println("realDouble = " + realFloat);
        System.out.println("Tipo de dato Double: " + Double.BYTES);
        System.out.println("Tipo Double En bits es: " + Double.SIZE);
        System.out.println("Valor máximo de un Double: " + Double.MAX_VALUE);
        System.out.println("El Valor mínimo en un Double es: " + Double.MIN_VALUE);
    }
}
