package selenium;


public class Lesson15 {
    public static void main(String[] args) {


        //Задача 1
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести сумму всех значений массива

        int[] array = new int[]{9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);


        //Задача 2
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести максимальное значение массива

        int arr[] = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);


        //Задача 3
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести минимальное значение массива

        int[] numbers = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i])
                min = numbers[i];
        }
        System.out.println(min);


        //Задача 4
        //Дан массив:
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        //необходимо вывести среднее арифметическое всех значений массива

        double[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        double result = 0;

        for (double d : nums) {
            result += d;
        }
        System.out.println("Srednee arifmeticheskoe " + result / nums.length);


//Задача 5
//Дан массив:
//int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//необходимо вывести сумму элементов массива
// Я не смогла решить задачу


//        Задача 6
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести максимальное значение массива
// Я не смогла решить задачу

    }
}









