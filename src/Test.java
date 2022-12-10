import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class Test {
    public static void main ( String[] args) {

        //       int[] myArray = new int[ 10]; //am declarat o lista cu 10 elem ={1, 2, 3,4, 5, 6, 7, 8, 9,10}
        int[] myIntArray = {20, 30, 45, 67};
//        myIntArray[3] = 50;
//        myIntArray[0] = 45;
//        myIntArray[1] = 475;
//       System.out.println(myIntArray[2] );
//        System.out.println( myIntArray.length);
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }
//         for(int i=0; i< 4; i++){
//             System.out.println(myIntArray[i]);
//         }
        printArray(myIntArray);

        int[][] myNumbers = {{1, 2, 3, 4}, {6, 8, 7}};
        System.out.println(myNumbers[1][1]); //al 2-lea element din a doua lista

        int[][] myNumbers2 = { {1,2,3}, {4,5,6,7} };
        for (int i=0; i<myNumbers2.length; i++) {
            for(int j=0; j< myNumbers2[i].length; j++) {
                System.out.println( myNumbers[i][j]);
            }
        }

//        for (int i = 0; i < myIntArray.length; i++) {
//            System.out.println("Element" + i + " , value is " + myIntArray[i]);
//        }
    }
        //metoda
        private static void printArray ( int[] array){
            for (int i = 0; i < array.length; i++) {
                System.out.println("Element" + i + " , value is " + array[i]);
            }
        }
    }


