package TaskOne;
import java.util.Scanner;
public class TaskFirst extends ScannerInt{
    final String wordHello = "Привет";
    final String age = "Введите возраст:";
    final String els ="Попробуйте снова";


    public void ageHello (){
     Scanner scanner = new Scanner(System.in);
        System.out.println(age);
        int ageInput = scanner.nextInt();
        System.out.println(els);

        while (ageInput <= 7) {

            ageInput = scanner.nextInt();

            if (ageInput > 7) {
                System.out.println(wordHello);
            } else {
                System.out.println(els);
            }
        }
        returnToMenu();
    }}
