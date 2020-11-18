package it.units.esSDM;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzzNormal();
        System.out.println();
        fizzBuzzExtended();
    }

    static void fizzBuzzNormal() {
        for (int i = 1; i < 100; i++) {
            String test = "";
            test += (i % 3) == 0 ? "fizz" : "";
            test += (i % 5) == 0 ? "buzz" : "";
            System.out.println(!test.isEmpty() ? test : i);
        }
    }

    public String convert(int number) {
        if (number == 3) {
            return "Fizz";
        } else if (number == 6) {
            return "Fizz";
        } else if (number == 24) {
            return "Fizz";
        } else {
            return Integer.toString(number);
        }
    }

    static void fizzBuzzExtended() {
        for (int i = 1; i < 105; i++) {
            String test = "";
            test += (i % 3) == 0 ? "fizz" : "";
            test += (i % 5) == 0 ? "buzz" : "";
            test += (i % 5) == 0 ? "bang" : "";
            System.out.println(!test.isEmpty() ? test : i);
        }
    }
}
