package TaskOne;
import java.util.Scanner;
public class TaskFourth extends ScannerInt{

    String result = "Данная скобочная последовательность является не правильной. " +
            "\n вначале лишняя \"(\" и в конце лишняя закрывающая квадратная скобка \"]\".  " +
            "\n Для того чтобы она стала правильной необходимо их убрать либо добавить им пару";

    public void resultQuest() {
        System.out.println(result);
        returnToMenu();
    }
}
