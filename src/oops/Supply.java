package oops;

public class Supply {
    int Code;
    String FoodName;
    String Sticker;
    String FoodType;

    void GetType() {
        if (Sticker == "Green") {
            FoodType = "veg";
        } else if (Sticker == "Yellow") {
            FoodType = "Contains Egg";
        } else {
            FoodType = "Non Veg";
        }

    }

    void FoodIn(int Code, String FoodName, String FoodType) {
        this.Code = Code;
        this.FoodName = FoodName;
        this.Sticker = Sticker;
        this.FoodType = FoodType;
        GetType();
    }

    void FoodOut() {
        System.out.println(Code + " " + FoodName + " " + FoodType + " " + Sticker);
    }

    public static void main(String[] args) {
        Supply obj=new Supply();
        obj.FoodIn(23,"Misal","Yellow");
        obj.FoodOut();
    }
}
