class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
    public String startEngine(){
        return "Car -> startEngine()";
    }
    public String accelerate(){
        return "car -> accelerate()";
    }
    public String brake(){
        return "car -> brake()";
    }
}

class Peugeot extends Car {
    public Peugeot(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Peugeot->StartEngine";
    }

    @Override
    public String accelerate() {
        return "Peugeot->accelerate";
    }

    @Override
    public String brake() {
        return "Peugeot-> brake";
    }
}

class Citroen extends Car {
    public Citroen(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Citroen->StartEngine";
    }

    @Override
    public String accelerate() {
        return "Citroen->accelerate";
    }

    @Override
    public String brake() {
        return "Citroen-> brake";
    }
}




public class Main {
    public static void main(String[] args) {
Car car = new Car("Base Car",8);
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println(car.startEngine());

        Peugeot peugeot = new Peugeot("405",6);
        System.out.println(peugeot.accelerate());
        System.out.println(peugeot.brake());
        System.out.println(peugeot.startEngine());

        Citroen citroen = new Citroen("C5",8);
        System.out.println(citroen.accelerate());
        System.out.println(citroen.brake());
        System.out.println(citroen.startEngine());

        Car ford = new Car("Mustang",12){
            @Override
            public String startEngine() {
                return "Main.Ford->StartEngine";
            }

            @Override
            public String accelerate() {
                return "Main.Ford->accelerate";
            }

            @Override
            public String brake() {
                return "Main.Ford-> brake";
            }
        };
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        System.out.println(ford.startEngine());
    }


    static class DS extends Car {
        public DS(String name, int cylinders) {
            super(name, cylinders);
        }

        @Override
        public String startEngine() {
            return "Citroen->StartEngine";
        }

        @Override
        public String accelerate() {
            return "Citroen->accelerate";
        }

        @Override
        public String brake() {
            return "Citroen-> brake";
        }
    }

    static class Ford extends Car {
        public Ford(String name, int cylinders) {
            super(name, cylinders);
        }

        @Override
        public String startEngine() {
            return getClass().getSimpleName() + "->StartEngine";
        }

        @Override
        public String accelerate() {
            return getClass().getSimpleName() + "->accelerate";
        }

        @Override
        public String brake() {
            return getClass().getSimpleName() + "-> brake";
        }
    }
}
