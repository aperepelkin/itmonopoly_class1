package homework.lesson10;

public class Car {
    private final int wheelsQuantity = 4;
    private String brandName;
    private String modelName;
    private String color;
    private int doorsQuantity;
    private boolean rightHandDrive;
    private double engineCapacity;
    private int mileage = 0;

    public Car(String _brandName, String _modelName, String _color, int _doorsQuantity, boolean _rightHandDrive, double _engineCapacity) {
        this.brandName = _brandName;
        this.modelName = _modelName;
        this.color = _color;
        this.doorsQuantity = _doorsQuantity;
        this.rightHandDrive = _rightHandDrive;
        this.engineCapacity = _engineCapacity;
    }

    public void getInfo() {
        System.out.println("Название бренда: " + brandName);
        System.out.println("Модель: " + modelName);
        System.out.println("Цвет: " + color);
        System.out.println("Количество дверей: "+ doorsQuantity);
        System.out.println("Правый руль: "+ rightHandDrive);
        System.out.println("Объём двигателя: "+ engineCapacity);
        System.out.println("Количество колёс: "+ wheelsQuantity);
        System.out.println("Пробег: " + mileage);
    }

    public void driveForward(int _meters) {
        mileage += _meters;
        System.out.println("Вы проехали " + _meters + " метров");
    }

    public void findOutMileage() {
        System.out.println("Общий пробег данного авто: " + mileage + " метров" );
    }
}