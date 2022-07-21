public class Task4 {


    public static void main(String[] args) {

        int [][] arrayOne = new int [5];
        int [] arrayTwo = new int [5];

        for (int i = 0; i < arrayOne.length; i++) {
             arrayOne[i] = ((int)(Math.random()*5));
            System.out.print(arrayOne[i]+ " ");
        }

        System.out.println();
//
//        for (int j = 0; j < arrayTwo; j++) {
//            arrayTwo[j]=((int)(Math.random()*5));
//            System.out.print(arrayTwo[j]+ " ");
//        }
    }
}
