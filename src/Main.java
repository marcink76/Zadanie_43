public class Main {
    public static void main(String[] args) {
        int wynik = 0;
        if (MathQuiz.question1()) {
            wynik++;
        }
        if (MathQuiz.question2()) {
            wynik++;
        }
        if (MathQuiz.question3()) {
            wynik++;
        }
        System.out.println("Zdobyłeś " + wynik + "/3");
    }
}