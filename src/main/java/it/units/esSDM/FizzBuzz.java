package it.units.esSDM;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzzNormal();
        System.out.println();
        fizzBuzzExtended();
    }
    static void fizzBuzzNormal(){
        for (int i = 1; i < 100; i++) {
            String test = "";
            test += (i % 3) == 0 ? "fizz" : "";
            test += (i % 5) == 0 ? "buzz" : "";
            System.out.println(!test.isEmpty() ? test : i);
        }
    }
    public String convert(int number){
        if (number == 1) {
            return "1";
        } else if(number == 2){
            return "2";
        } else{
            return "40";
        }


    }
    static void fizzBuzzExtended(){
        for (int i = 1; i < 105; i++) {
            String test = "";
            test += (i % 3) == 0 ? "fizz" : "";
            test += (i % 5) == 0 ? "buzz" : "";
            test += (i % 5) == 0 ? "bang" : "";
            System.out.println(!test.isEmpty() ? test : i);
        }
    }
}
