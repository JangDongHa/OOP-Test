package springHomework;

public class Test {
    private static void makeLine(){
        for (int i = 0 ; i < 20; i++)
            System.out.print("=");
        System.out.println();
    }

    private static void situation1(){
        Bus bus1 = new Bus(1, 30, 1000);
        Bus bus2 = new Bus(2, 30, 1000);

        makeLine();
        System.out.println("1번 버스 번호 : " + bus1.getNumber());
        System.out.println("2번 버스 번호 : " + bus2.getNumber());
        makeLine();

        // situation 1, 2
        makeLine();
        Bus mainBus = new Bus(3, 30, 1000);
        mainBus.passengerBoarding(2);
        System.out.println("탑승 승객 수 : " + mainBus.getNowPassengers());
        System.out.println("잔여 승객 수 : " + mainBus.getRemainPassengers());
        System.out.println("요금 확인 : " + mainBus.getPresentPrice());
        makeLine();

        // situation 3, 4
        makeLine();
        System.out.println("주유량 50 제거");
        mainBus.setNowFuel(mainBus.getNowFuel() - 50);
        System.out.println("주유량 : " + mainBus.getNowFuel());
        makeLine();

        // situation 5, 6, 7
        makeLine();
        mainBus.endDrive();
        mainBus.setNowFuel(mainBus.getNowFuel() + 10);
        System.out.println("상태 : " + mainBus.getStatus());
        System.out.println("주유량 : " + mainBus.getNowFuel());
        makeLine();

        // situation 8, 9, 10
        makeLine();
        mainBus.drive();
        mainBus.passengerBoarding(45);
        mainBus.endDrive();
        makeLine();

        // situation 11, 12
        makeLine();
        mainBus.drive();
        mainBus.passengerBoarding(5);
        System.out.println("탑승 승객 수 : " + mainBus.getNowPassengers());
        System.out.println("잔여 승객 수 : " + mainBus.getRemainPassengers());
        System.out.println("요금 : " + mainBus.getPresentPrice());
        makeLine();

        // situation 13, 14, 15
        makeLine();
        mainBus.setNowFuel(mainBus.getNowFuel() - 55);
        System.out.println("주유량 : " + mainBus.getNowFuel());
        System.out.println("상태 : " + mainBus.getStatus());
        makeLine();
    }

    private static void situation2(){
        Taxi taxi1 = new Taxi(1, 4, 3000, 1, 1000);
        Taxi taxi2 = new Taxi(2, 4, 3000, 1, 1000);

        makeLine();
        System.out.println("1번 택시 번호 : " + taxi1.getNumber());
        System.out.println("1번 택시 주유량 : " + taxi1.getNowFuel());
        System.out.println("1번 택시 상태 : " + taxi1.getStatus());
        System.out.println("2번 택시 번호 : " + taxi2.getNumber());
        System.out.println("2번 택시 주유량 : " + taxi2.getNowFuel());
        System.out.println("2번 택시 상태 : " + taxi2.getStatus());
        makeLine();

        Taxi mainTaxi = new Taxi(3, 4, 3000, 1, 1000);
        makeLine();
        mainTaxi.passengerBoarding(2);
        mainTaxi.setDestination("서울역");
        mainTaxi.setDestinationDistance(2);
        System.out.println("탑승 승객 수 : " + mainTaxi.getNowPassengers());
        System.out.println("잔여 승객 수 : " + mainTaxi.getRemainPassengers());
        System.out.println("기본 요금 확인 : " + mainTaxi.getPrice());
        System.out.println("목적지 : " + mainTaxi.getDestination());
        System.out.println("목적지까지 거리 : " + mainTaxi.getDestinationDistance() + "km");
        System.out.println("지불할 요금 : " + mainTaxi.finalPrice());
        System.out.println("상태 : " + mainTaxi.getStatus());
        makeLine();

        makeLine();
        mainTaxi.setNowFuel(mainTaxi.getNowFuel() - 80);
        mainTaxi.endDrive();
        System.out.println("주유량 : " + mainTaxi.getNowFuel());
        System.out.println("누적 요금 : " + mainTaxi.getMyMoney());
        makeLine();

        makeLine();
        mainTaxi.passengerBoarding(5);
        makeLine();

        makeLine();
        mainTaxi.setNowPassengers(3);
        mainTaxi.setDestination("구로디지털단지역");
        mainTaxi.setDestinationDistance(12);
        System.out.println("탑승 승객 수 : " + mainTaxi.getNowPassengers());
        System.out.println("잔여 승객 수 : " + mainTaxi.getRemainPassengers());
        System.out.println("기본 요금 확인 : " + mainTaxi.getPrice());
        System.out.println("목적지 : " + mainTaxi.getDestination());
        System.out.println("목적지까지 거리 : " + mainTaxi.getDestinationDistance() + "km");
        System.out.println("지불할 요금 : " + mainTaxi.finalPrice());
        makeLine();

        makeLine();
        mainTaxi.setNowFuel(mainTaxi.getNowFuel() - 20);
        mainTaxi.endDrive();
        System.out.println("주유량 : " + mainTaxi.getNowFuel());
        System.out.println("상태 : " + mainTaxi.getStatus());
        System.out.println("누적 요금 : " + mainTaxi.getMyMoney());
        makeLine();
    }

    public static void main(String[] args) {
//        situation1();
        situation2();
    }
}
