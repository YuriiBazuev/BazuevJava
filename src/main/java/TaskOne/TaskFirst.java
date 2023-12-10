package TaskOne;
import java.util.Scanner;
public class TaskFirst extends ScannerInt{
    String wordHello = "Привет";
    String age = "Введите возраст:";
    String els ="Попробуйте снова";
    public void scannerFirst(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(age);
        int ageInput = scanner.nextInt();
        ageHello(ageInput);
    }
    public void ageHello (int ageInput){
        if ( ageInput > 7) {
            System.out.println(wordHello);
            returnToMenu();
        }
        else if (ageInput<=7){
            System.out.println(els);
            scannerFirst();
        }
    }
}
