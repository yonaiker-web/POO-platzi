
class Main {
    public static void main(String[] args) {
        System.out.println("Hello word");
        Car car = new Car("AM344Q", new Account("Yonaiker Ocando", "YO123"));
        car.passenger = " 3";
        car.printDataCar();

        Car car2 = new Car("9LKAQ1", new Account("Yonaiker Morocho", "YO456"));
        car.passenger = " 7";
        car.printDataCar();
        
    }
}