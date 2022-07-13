var car = new Car(
  "AW344",
  new Account("Andres Herrere", "12345667", "andres@platzi.com", "123456789")
);
car.passenger = 9;
car.printDataCar();

console.log("UberX");

var uberX = new UberX(
  "ADD221",
  new Account("Pepito Perez", "pepito@platzi.com", "OPL321"),
  "Chevrolet",
  "Spark"
);
uberX.passenger = 12;
uberX.printDataCar();

console.log("***user*****");
var user = new User("Damian Rios", "KL8OP", "damian@platzi.com", "123454321");
user.printDataCar();
