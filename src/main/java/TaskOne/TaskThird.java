package TaskOne;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class TaskThird extends  ScannerInt{
   final String oneArraySize = "Введите размер одномерного массива, который будет заполнен по порядку";
   final String sizeArrays = "Выберите:";
    final String sizeArraysOne = "1. Одномерный массив, заполненый по порядку";
   final String sizeArraysRandom = "2. Одномерный массив, заполненый рандомно";
   final String randomArraySize = "Введите размер одномерного массива, который будет заполнен ранодомно";
    public void scannerThird(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(sizeArrays + "\n" + sizeArraysOne + "\n" + sizeArraysRandom);

        int numberInit = scanner.nextInt();

        switch (numberInit){
            case (1):{System.out.println(oneArraySize);
                int sizeArray = scanner.nextInt();
                oneArray(sizeArray);}
            break;
            case (2):{
                System.out.println(randomArraySize);
                int sizeArray = scanner.nextInt();
                randomArray(sizeArray);}
            break;
        }
    }
    public void oneArray(int sizeArray) {
        int [] array = new int[sizeArray];
        for (int i = 0; i<array.length; i++){
            array[i] = i+1;
        }
        System.out.println("\n Массив, заполненный значениями по порядку:");
        System.out.println(Arrays.toString(array));
        findNumberOne(array);
        returnToMenu();
    }
    public void randomArray (int sizeArray){
        int [] randomsArray = new int [sizeArray];
        Random random = new Random();
        for (int i = 0; i < randomsArray.length; i ++){
            randomsArray [i] = random.nextInt(sizeArray);
        }
        System.out.println("\n Массив, заполненный рандомными значениями:");
        System.out.println(Arrays.toString(randomsArray));
        findNumberRandom(randomsArray);
        returnToMenu();
    }
    public void findNumberRandom(int [] randomArray){
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] != 0 && randomArray[i] % 3 == 0) {
                System.out.println("Результат кратный трем:" + randomArray[i]);

            }
        }
    }
    public void findNumberOne(int [] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] % 3 == 0) {
                System.out.println("Результат кратный трем:" + array[i]);

            }
        }
    }
}

