package springHomework;

public class Bus extends Transport{
    public Bus(int number, int maxPassengers, int price) {
        super(number, maxPassengers, price);
    }

    @Override
    public String getStatus() {
        if (getNowFuel() < getStdFuel())
            return "차고지행";
        else if (isStatus())
            return "운행중";
        return "차고지행";
    }

    public int getPresentPrice(){
        return getPrice() * getNowPassengers();
    }
}
