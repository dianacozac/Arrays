import java.util.Scanner;

public class Main {
//   public static void main(String[] args) {


 //       int[] myIntArray = new int[10];// {1,2 3, 4, 5,6 7, 8, 9, 10};
//        myIntArray[5] = 50;
//        myIntArray[0] = 45;
//        myIntArray[1] = 475;
//        System.out.println(myIntArray[5]);
  //      for (int i = 0; i < myIntArray.length; i++) {
 //           myIntArray[i] = i * 10;
//        }
//        printArray(myIntArray);
//        for (int i = 0; i < myIntArray.length; i++) {
//            System.out.println("Element" + i + " , value is " + myIntArray[i]);
//        }
//    }
    //metoda
//   public static void printArray(int[] array) {
//       for (int i = 0; i < array.length; i++) {
//           System.out.println("Element" + i + " , value is " + array[i]);
//       }

      private static Scanner scanner = new Scanner(System.in);

      public static void main (String[] args) {
          int[] myIntegers = getIntegers(5);
          for (int i = 0; i < myIntegers.length; i++) {
              System.out.println("Element" + i + "typed value was" + myIntegers[i]);
          }
      }
      public static int[] getIntegers( int number){
              System.out.println("Enter" + number + " integer values.\r");
              int[] values = new int[number];
              for (int i = 0; i < values.length; i++) {
                  values[i] = scanner.nextInt();
              }
              return values;
          }
      }