package springHomework;

public class Taxi extends Transport{
    private String destination; // 목적지
    private int stdDistance; // 기본 거리
    private int destinationDistance; // 목적지까지의 거리
    private int pricePerDistance; // 거리당 요금
    private int myMoney; // 택시기사 주머니
    public Taxi(int number, int maxPassengers, int price, int stdDistance, int pricePerDistance) {
        super(number, maxPassengers, price);
        this.stdDistance = stdDistance;
        this.pricePerDistance = pricePerDistance;
    }

    @Override
    public void passengerBoarding(int people) {
        if (people > getRemainPassengers()){
            System.out.println("최대 승객 수 초과");
            return;
        }

        setNowPassengers(people);
        setStatus(false);

    }

    @Override
    public String getStatus() {
        if (getNowFuel() < getStdFuel())
            return "운행불가";
        else if (!isStatus())
            return "운행중";
        return "일반";
    }

    @Override
    public void endDrive(){
        setNowPassengers(0); // 손님이 내리고
        myMoney += finalPrice(); // 돈을 받으면서
        initialMachine(); // 택시기사가 기계를 초기화함
    }

    private void initialMachine(){
        setDestination("");
        setDestinationDistance(0);
        setStatus(true);
    }

    public int finalPrice(){
        int exceedDistance = destinationDistance - stdDistance;
        int finalPrice = getPrice();
        if (exceedDistance > 0){
            finalPrice += exceedDistance * pricePerDistance;
        }

        return finalPrice;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getStdDistance() {
        return stdDistance;
    }

    public void setStdDistance(int stdDistance) {
        this.stdDistance = stdDistance;
    }

    public int getDestinationDistance() {
        return destinationDistance;
    }

    public void setDestinationDistance(int destinationDistance) {
        this.destinationDistance = destinationDistance;
    }

    public int getPricePerDistance() {
        return pricePerDistance;
    }

    public void setPricePerDistance(int pricePerDistance) {
        this.pricePerDistance = pricePerDistance;
    }

    public int getMyMoney() {
        return myMoney;
    }

    public void setMyMoney(int myMoney) {
        this.myMoney = myMoney;
    }
}
