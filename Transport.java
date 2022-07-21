package springHomework;

public abstract class Transport { // 대중교통 공통사항에 대한 메서드 및 변수 명시
    private int maxPassengers;
    private int nowPassengers;
    private int price; // 기본적인 요금
    private int number; // 번호
    private int nowFuel; // 주유량
    private int nowSpeed; // 현재 속도
    private boolean status; // 상태 (운행중 or x)
    private int stdFuel = 10; // 주유 빨간불 기준
    
    private int remainPassengers; // 잔여 승객 수

    public Transport(int number, int maxPassengers, int price){
        this.number = number;
        this.status = true;
        this.nowFuel = 100;
        this.nowSpeed = 0;
        this.maxPassengers = maxPassengers;
        this.price = price;
    }

    public void drive(){
        if (nowFuel < stdFuel){
            System.out.println("주유가 필요하다.");
            return;
        }
        this.status = true;
    }

    public void endDrive(){
        setNowPassengers(0);
        this.status = false;
    }

    public void passengerBoarding(int people){
        if (isStatus()){
            if (nowPassengers + people > maxPassengers){
                System.out.println("승객 인원 초과!");
                System.out.println(maxPassengers - nowPassengers + "명만 탑승합니다.");
                nowPassengers = maxPassengers;
                return;
            }
            nowPassengers += people;
        }
        else
            System.out.println("탑승 불가");
    }

    public void changeSpeed(int speed){
        if (nowFuel < stdFuel){
            System.out.println("주유량을 확인해주세요.");
            return;
        }
        nowSpeed += speed;
    }

    public String getStatus(){
        return "";
    } // 현재 상태 String 출력
    public boolean isStatus(){
        return status;
    }

    public int getPrice() {
        return price;
    }

    public int getNowFuel() {
        return nowFuel;
    }

    public int getNowSpeed() {
        return nowSpeed;
    }

    public int getStdFuel() {
        return stdFuel;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setnumber(int number) {
        this.number = number;
    }

    public void setNowFuel(int nowFuel) {
        if (nowFuel < 0){
            System.out.println("주유량이 0 이하가 될 수 없습니다.");
            return;
        }
        else if (nowFuel <= getStdFuel()){
            System.out.println("주유 필요");
            setStatus(false);
        }
        this.nowFuel = nowFuel;
    }

    public void setNowSpeed(int nowSpeed) {
        this.nowSpeed = nowSpeed;
    }

    public void setStatus(boolean status) {
        if (getNowFuel() < getStdFuel())
            this.status = false;
        else
            this.status = status;
    }

    public void setStdFuel(int stdFuel) {
        this.stdFuel = stdFuel;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getNowPassengers() {
        return nowPassengers;
    }

    public void setNowPassengers(int nowPassengers) {
        this.nowPassengers = nowPassengers;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRemainPassengers() {
        return maxPassengers - nowPassengers;
    }
}
