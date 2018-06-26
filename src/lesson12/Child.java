package lesson12;

public class Child extends Parent {

    int fld = 3; // 4.

    {
        System.out.println("Int Child " + fld + super.fld); //5.
//        privateField = 0; ERROR
        protectedField = 6;
    }

    public Child() {
        super(4);
        System.out.println("Child"); //6.
    }
}
