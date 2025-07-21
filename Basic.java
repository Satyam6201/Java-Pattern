public class Basic {
    /*     
           *
           * *
           * * *
           * * * *
    */
    public static void rightAngleTriangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
     
    /*     
           1 
           1 2 
           1 2 3 
           1 2 3 4 
           1 2 3 4 5
    */
    public static void numberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*     
               *
              **
             ***
            ****
           *****
    */
    public static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            //for space 
            for (int space = n - i; space >= 1; space--) {
                System.out.print(" ");
            }
            // for star
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            } 
            System.out.println(); 
        }
    }

    /*     
           * * * * * 
           * * * * 
           * * * 
           * * 
           * 
    */
    
    public static void invertedTriangle(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
/* 
    * 
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
*/

    public static void Diamon(int n) {
        for (int i = 1; i <= n; i++) {
            // for Space 
            for (int space = n - i; space >= 1; space--) {
                System.out.print(" ");
            }

            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int space = n - i; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

/*

* * * * *
*       *
*       *
*       *
* * * * *
     
*/

    public static void hollow(int row, int col) {
    for (int i = 1; i <= row; i++) {
        for (int j = 1; j <= col; j++) {
            if (i == 1 || i == row || j == 1 || j == col) {
                System.out.print("* ");
            } 
            else {
                System.out.print("  "); // Two spaces for alignment
            }
        }
        System.out.println();
    }
}

    /*
*                 * 
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *
     */
    
    public static void butterfly(int n) {
        // First half
        /*     
           *
           * *
           * * *
           * * * *
        */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= n - i; k++) {
                System.out.print("  ");
            }
        /*     
               *
              **
             ***
            ****
           *****
        */
            for (int k = 1; k <= n - i; k++) {
                System.out.print("  ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower Half:-

        /*
           * * * * * 
           * * * * 
           * * * 
           * * 
           * 
        */
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= n - i; k++) {
                System.out.print("  ");
            }

            /*
            * * * * *
              * * * *
                * * *
                  * *
                    *
            */
            for (int k = 1; k <= n - i; k++) {
                System.out.print("  ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
/*
12345
1234
123
12
1
 */
    public static void inverse_pyramid_number(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15
     */

    public static void floyd_num(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    /*
1
01
101
0101
10101
     */
    public static void zeroOne(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                }
                else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    /*
        * * * * *
       * * * * *
     * * * * *
   * * * * *
 * * * * *
 
    */

    public static void rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }
            for (int star = 1; star <= n; star++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void hollow_Rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for(int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }

             for(int j = 1; j <= n; j++){
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        int n = 5;
        // rightAngleTriangle(n);
        // numberTriangle(n);
        // pyramid(n);
        // invertedTriangle(n);
        // Diamon(n);
        // hollow(5, 5);
        // butterfly(n);
        // inverse_pyramid_number(n);
        // floyd_num(n);
        // zeroOne(n);
        // rhombus(n);
        hollow_Rhombus(n);
    }
}
