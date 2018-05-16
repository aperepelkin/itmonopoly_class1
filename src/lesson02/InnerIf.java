package lesson02;

public class InnerIf {
    public static void main(String[] args) {
        int num = 4;

        if(num > 0)
            num = num * 1;
        else
            if(num == 0)
                num = 10;
            else
                num = num * -2;

        System.out.println(num);
    }
}
