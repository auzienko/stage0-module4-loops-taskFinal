package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 0; j < cathetusLength * 2 - 1; j++) {

                int value = cathetusLength - j;
                int correctedValue = value > 0 ? value : (-value) + 2;

                if (correctedValue > i) {
                    if (value > 0) {
                        System.out.print(' ');
                    } else {
                        break;
                    }
                } else {
                    System.out.print(correctedValue);
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
