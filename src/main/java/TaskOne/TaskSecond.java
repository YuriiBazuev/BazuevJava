package TaskOne;

import java.util.Scanner;


public class TaskSecond extends ScannerInt {
    String nameOriginal = "Вячеслав";
    String noName = "Нет такого имени";
    String enterName ="Введите имя";
    String hello = "Привет";

    public void scannerSecond(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(enterName);
        String name = scanner.nextLine();
        equality(name);
        returnToMenu();
    }
    public void equality (String name) {
        String equalName = (name.equals(nameOriginal)) ? hello+", " + nameOriginal : noName;
        System.out.println(equalName);
        if (!name.equals(nameOriginal)) {
            scannerSecond();
        }
    }


}
