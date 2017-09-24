import java.util.Scanner;

public class MathQuiz {
    private static Scanner answerInput = new Scanner(System.in);

    public static boolean question1(){

        boolean answer;

        int factor1 = Randomize.randomize(10);
        int factor2 = Randomize.randomize(10);

        System.out.println("Jaki jest wynik mnożenia to: " + factor1 +" x " + factor2 + "?");

        int solution = answerInput.nextInt();
            if (solution == (factor1*factor2)){
                System.out.println("Dobrze!");
                answer = true;
            }else{
                System.out.println("Zle! Prawidłowy wynik to: " + factor1 * factor2 + "!");
                answer = false;
            }
        return answer;
    }
    public static boolean question2(){

        boolean answer;

        int squareSide = Randomize.randomize(10);
        System.out.println("Jakie jest pole kwadratu o boku " + squareSide + "?");
        int solution = answerInput.nextInt();
        if (solution == Math.pow(squareSide,2)){
            System.out.println("Dobrze!");
            answer = true;
        }else{
            System.out.println("Zle prawidłowy wynik to: "+Math.pow(squareSide,2)+"!");
            answer = false;
        }
        return answer;
    }
    public static boolean question3(){

        boolean answer;
        int square = Randomize.randomize(30);
        System.out.println("Jaki jest pierwiastek kwadratowy z liczby: "+square*square+"?");

        int solution = answerInput.nextInt();
        if (square == solution){
            System.out.println("Dobrze!");
            answer = true;
        }else{
            System.out.println("Zle prawidłowy wynik to: "+square+"!");

            answer = false;
        }
        return answer;
    }
}
