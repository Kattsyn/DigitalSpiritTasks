import java.util.Scanner;

public class Main {

    static final String[][] QUESTIONS = new String[][]{
            {"Страна производитель?", "1) Германия", "2) Япония", "3) Корея"},
            {"Предпочитаемый кузов?", "1) Кроссовер/Внедорожник", "2) Лифтбек/Седан", "3) Универсал/Хетчбек"},
            {"По объему двигателя: ", "1) Малый объем - до 1.5л", "2) Средний объем - от 1.5л до 2.4л", "3) Большой объем - более 2.4л"}};
    static String[] answers = new String[QUESTIONS.length];
    static final String[][][] RESULTS = new String[][][]{
            {{"Volkswagen Tiguan 1.4AMT", "BMW X3 2.0AT", "BMW X6 3.0AT"},
                    {"BMW 3 Series 1.5AT", "Volkswagen Polo 1.6MT", "BMW 750d 3.0AT"},
                    {"Skoda Fabia 1.4MT", "BMW 1 Series 2.0AT", "Audi A6 Allroad Quattro 3.0AT"}},
            {{"Toyota Yaris Cross 1.5CVT", "Toyota RAV4 2.0 CVT", "Toyota Land Cruiser Prado 2.8AT"},
                    {"Toyota Cynos 1.3AT", "Toyota Sprinter Marino 1.6AT", "Toyota Supra 3.0MT"},
                    {"Toyota Starlet 1.3AT", "Honda Civic 1.6MT", "Nissan Stagea 2.5AT"}},
            {{"Hyundai Tucson 1.5AT", "Kia Sportage 2.0AT", "Hyundai Santa Fe 2.7AT"},
                    {"Hyundai Solaris 1.4AT", "Kia Rio 1.6AT", "Hyundai Sonata 2.5AT"},
                    {"Hyundai Getz 1.3AT", "Kia Ceed 1.6AT", "Hyundai Soul 2.0AT"}}};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = true;
        int questionNum = 0;

        System.out.println("Подбор автомобиля по параметрам.\n");

        while (validInput && questionNum < QUESTIONS.length) {
            for (int i = 0; i < QUESTIONS[questionNum].length; i++) {
                System.out.println(QUESTIONS[questionNum][i]);
            }
            System.out.print("Ваш ответ: ");
            answers[questionNum] = scanner.nextLine();
            if (!answers[questionNum].equals("1") && !answers[questionNum].equals("2") && !answers[questionNum].equals("3")) {
                validInput = false;
                System.out.println("Ошибка ввода. Закрытие программы.");
            }
            questionNum++;
        }
        if (validInput) {
            System.out.println("Вам подходит: " + RESULTS[Integer.parseInt(answers[0]) - 1][Integer.parseInt(answers[1]) - 1][Integer.parseInt(answers[2]) - 1]);
        }
    }
}