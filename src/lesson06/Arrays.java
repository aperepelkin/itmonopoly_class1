package lesson06;

public class Arrays {
    public static void main(String[] args) {
        int[] array = new int[10];

        int i = 0;
        while(i < array.length) {
            array[i++] = i;
        }

        i = 0;
        while (i < array.length)
            System.out.println(array[i++]);

//        System.out.println(array);
    }
}
