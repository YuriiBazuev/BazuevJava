package TaskOne;
import java.util.Scanner;

public class ScannerInt {
    String taskFirst = "1. Составить алгоритм: если введенное число больше 7, то вывести “Привет”";
    String taskSecond = "2. Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести \"Нет такого имени\"";
    String taskThird = "3. Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3";
    String taskFourth = "4. Дана скобочная последовательность: [((())()(())]]\n" +
            "- Можно ли считать эту последовательность правильной?\n" +
            "- Если ответ на предыдущий вопрос “нет”, то что необходимо в ней изменить, чтоб она стала правильной?\n";
    String enterName = "Введите ваше имя";
    String selectMenu = "Выберите пожалуйста нужный пункт задач: ";

    public void enterScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(enterName);
        String name = scanner.nextLine();
        System.out.println("Добрый день " + name + "!");
        System.out.println(selectMenu + "\n" +taskFirst + "\n" + taskSecond + "\n" + taskThird + "\n" + taskFourth);
    }
    public void returnToMenu() {
        System.out.println("\nВозвращаемся в меню... \n");
        System.out.println(selectMenu + "\n" +taskFirst + "\n" + taskSecond + "\n" + taskThird + "\n" + taskFourth);
        enterScannerTaskFirst();
    }
    public void enterScannerTaskFirst(){
        Scanner scanner = new Scanner(System.in);
        int task = scanner.nextInt();

        switch (task){
            case(1):{
                TaskFirst taskFirst = new TaskFirst();
                taskFirst.ageHello();
                break;
            }
            case (2):{TaskSecond taskSecond = new TaskSecond();
                taskSecond.scannerSecond();
                break;
            }
            case (3): {TaskThird taskThird = new TaskThird();
                taskThird.scannerThird();
                break;
            }
            case (4):{TaskFourth taskFourth = new TaskFourth();
                taskFourth.resultQuest();
                break;
            }
        }
    }


}
