// This for loop will print my initials N following with letter R below.

public class PrintIntitials {

    public static void main(String[] args) {

        int i, j, k, l;
        for (i = 0; i <= 8; i++) {
            for (j = 0; j < 2; j++) {
                System.out.printf("*");
            }// this loop as we will be using it again.

            for (k = 1; k <= i; k++) {
                System.out.print(" "); //one space
            }
            for (j = 0; j < 2; j++) {
                System.out.printf("*");
            }
            for (l = 7; l >= i; l--) {
                System.out.printf(" "); //one space
            }


            for (j = 0; j < 2; j++) {
                System.out.printf("*");
            }


            System.out.printf("\n");



        }
        System.out.printf("\n");


                int a, b, c, count = 11;
                for (a = 0; a <= 11; a++) {
                    for (b = 0; b <= 2; b++) {

                        System.out.printf("*");
                    }
                    for (c = 1; c <= 5; c++) {

                        if (a >= 0 && a < 2 || a > 4 && a < 7 || a >= 2 && a <= 4 && c == 5 || a >= 7 && a <= 11 && c == count) {
                            System.out.printf("**");
                        }
                        else {
                            System.out.printf("  ");//two spaces
                        }
                    }

                    if (a > 6) {
                        count++;
                    } else if (count > 5) {
                        count = 1;

                    }
                    System.out.printf("\n");
                }

            }
        }

        //Printing letter r




