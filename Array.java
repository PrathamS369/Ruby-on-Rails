package CoreJava;

class data {

}

public class Array {
    public static void main(String a[]) {
        int nums[][] = new int[4][4];
        ;
        int random = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 100);
            }

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }

}
