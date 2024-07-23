package oops;

public class CarRental {
    int CarId;
    String CarType;
    float rent;

    void Getcar(int CarId, String CarType) {
        this.CarId = CarId;
        this.CarType = CarType;
    }

    void GetRent() {
        if (CarType == "small") {
            rent = 1000;
        }
        if (CarType == "Van") {
            rent = 8000;
        } else {
            rent = 25000;
        }
    }

    void ShowCar(){
        System.out.println(CarId+" "+CarType+" "+rent);
    }

    public static void main(String[] args) {
        CarRental obj=new CarRental();
        obj.Getcar(90,"small");
        obj.GetRent();
        obj.ShowCar();
    }
}

