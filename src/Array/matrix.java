public class matrix {
    public static void main(String[] args) {
        int [] []array_2d = new int[3][3];
        array_2d[0][1]= 25;
        array_2d[0][0]=50;
        for (int[] ints : array_2d) {
            for (int anInt : ints) {
                System.out.println(anInt);

            }
        }

    }
}
