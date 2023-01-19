public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

                int f = calc.abs.apply(-20);
        calc.println.accept(f);

        int a = calc.plus.apply(1, 2);
        calc.println.accept(a);

        int g = calc.abs.apply(a);
        calc.println.accept(g);


        int b = calc.minus.apply(1, 1);
        calc.println.accept(b);
        int e = calc.multiply.apply(2, 7);
        calc.println.accept(e);
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);





    }
}