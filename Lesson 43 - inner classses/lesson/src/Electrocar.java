public class Electrocar {
    private int id;

    // Вложенный нестатический класс
    private class Motor {
        public void startMotor() {
            System.out.println("Motor" + id + "is starting");
        }
    }

    // Статический вложенный класс
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor  = new Motor();
        motor.startMotor();

        final int x = 1;

        class  SomeClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);
            }
        }

        SomeClass someObject = new SomeClass();


        System.out.println("Electrocar" + this.id + " is starting...");
    }
}
