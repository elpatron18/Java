package Sonstige;

public class main {

    public static void tausch(int [] array, int index) {
        int temp = array[index+1];
        array[index + 1] = array[index];
        array[index] = temp;
    }

    public static void main(String[] args) {

        int [] array = {51, 13, 9, 44, 93, 25};


        boolean getauscht = true;

        while (getauscht) {

            getauscht = false;

            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i+1]) {

                    tausch(array, i);

                    getauscht = true;

                }

            }
        }



        for (int i : array ) {
            System.out.println(i);
        }

    }

}
