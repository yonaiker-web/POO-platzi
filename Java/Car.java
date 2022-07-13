class Card {
    Integer id;
    String license;
    Account drive;
    Integer passenger;

    public Car(String license, Account driver)
    {
        this.license = license;
        this.drive = drive;
    }

    void printDataCar() 
    {
        System.out.println("License: " + license + " Driver: " + driver.name );
    }
}