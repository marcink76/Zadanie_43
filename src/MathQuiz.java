import java.util.Scanner;

public class MathQuiz {

    public int point = 0;

    public static boolean question1(){
        Scanner answerInput = new Scanner(System.in);
        boolean answer;
        System.out.println("Jaki jest wynik mnożenia 3 x 5?");
        int solution = answerInput.nextInt();
            if (solution == 15){
                System.out.println("Dobrze!");
                answer = true;
            }else{
                System.out.println("Zle");
                answer = false;
            }
        return answer;
    }
    public static boolean question2(){
        Scanner answerInput = new Scanner(System.in);
        boolean answer;
        System.out.println("Jakie jest pole kwadratu o boku 12?");
        int solution = answerInput.nextInt();
        if (solution == Math.pow(12,2)){
            System.out.println("Dobrze!");
            answer = true;
        }else{
            System.out.println("Zle");
            answer = false;
        }
        return answer;
    }
    public static boolean question3(){
        Scanner answerInput = new Scanner(System.in);
        boolean answer;
        System.out.println("Jaki jest pierwiastek kwadratowy z liczby 15129?");
        int solution = answerInput.nextInt();
        if (solution == Math.sqrt(15129)){
            System.out.println("Dobrze!");
            answer = true;
        }else{
            System.out.println("Zle");
            answer = false;
        }
        return answer;
    }
}
