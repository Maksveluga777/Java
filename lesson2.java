package geekbrains;

public class void main (String[] args) {

    int[] ar0 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
     System.out.println(Arrays.toString(ar0));
     change(ar0);
     System.out.println(Arrays.toString(ar0));
      }

     private static void change(int[] a) {

        for (int i = 0; i < a.length; i++) {
          if (a[i] == 0) {
              a[i] = 1;
        } else {

              a[i] = 0;
        }



public class void main (String[] args) {

        int[] ar0 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(ar0));
        change(ar0);
        System.out.println(Arrays.toString(ar0));

        int [] ar1 = new int [8];
        System.out.println(Arrays.toString(ar1));
        filler(ar1);
        System.out.println(Arrays.toString(ar1));



        private static void filler(int [] a) {

             for (int i = 0; i < a.lenght; i++) {
             a[i] = i;
             a[i] = i * 3;
             a[i] = i * 3 +1;

             }




             int [] ar2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
             System.out.println(Arrays.toString(ar2));
             doubling(ar2);
             System.out.println(Arrays.toString(ar2));


             private static void doubling(int[] a){
             for (int i = 0; 1 < a.lenght; i++) {
             if (a[i] < 6) {
                  a[i] *= 2;
        }





        int [] ar2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(ar2));
        doubling(ar2);
        System.out.println(Arrays.toString(ar2));



        private static int findMinimum(int[] a) {

             int min = a[0];
             for (int i = 1; 1 < a.lenght; i++) {
              if (a[i] < min) {
                   min = a[i];

               }
        }


        private static int findMaximum(int[] a) {
             int max = 0;
             for (int i = 1; i < a.lenght; i++) {
             if (a[i] > a[max])
                  max = i;

             return max;
             }



