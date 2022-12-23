public class Bus{
    int maxPassengers = 30;  //최대 승객수
    int passengers;     //현재 승객수
    int fee = 1500;            //요금
    int busNum;         //버스 번호
    int gas = 100;            //주유량
    int speed;          //현재 속도
    String status = "운행중";    //상태 ( 운행 : true, 차고지행 : false)

    //    void makeBus(int k){
//
//    }
    void run() {
        while (true) {
            if (isLeftGas()) {
                status = "운행중";
                speed = 10;
                System.out.println("달립니다.(gas 잔량: " + gas + ")");
                System.out.println("현재 속도 : "+speed);

                gas -= 10;
            } else {
                speed = 0;
                //status = false;
                System.out.println("멈춥니다.끼이이이이이이ㅣㄱ(gas 잔량: " + gas + ")");
                System.out.println("현재 속도 : "+speed);
                goGarage();
                return;
            }
        }
    }
    void setGas(int g) {
        this.gas += g;
        if (gas >= 10){
            System.out.println("잔여 Gas : "+gas+" 이므로 운행이 가능합니다.");
            status = "운행중";
        }else {
            status = "차고지 행";
            isLeftGas();
        }
    }
    boolean isLeftGas() {
        if (gas < 10) {
            System.out.println("gas가 없습니다. 주유가 필요합니다!");

            return false;
        }
        System.out.println("gas가 있습니다.");
        return true;
    }
    void goGarage() {
        status = "차고지 행";
        System.out.println("더이상 운행을 할 수 없어 차고지로 갑니다.");
    }
    void isPassengers(int p){
        passengers += p;
        System.out.println("현재 승객 수 : "+p);
        if (passengers >= maxPassengers) {
            System.out.println("최대 승객 수 초과입니다. 더이상 탑승할 수 없습니다.");
            passengers -=p;
        } else {
            System.out.println("탑승가능한 승객 수는 "+(maxPassengers - p)+"명입니다.");

        }
    }
    void setSpeed(int s){
        this.speed += s;
        System.out.println("속도가 변합니다. 현재속도 : "+ speed);
    }
    void setFee(int f){
        if (this.fee >f){
            System.out.println("요금 확인 = 1500");
        }else {
            System.out.println("거스름돈을 받아가세요! 거스름돈 : "+(f-this.fee)+"원입니다.");
        }
    }
    public static void main(String[] args) {
        Bus b1 = new Bus();
        b1.setFee(2000);
        b1.isPassengers(2);
        b1.setGas(-50);
        b1.run();
        b1.setGas(60);
        System.out.println(b1.status);
        b1.isPassengers(45);
        b1.isPassengers(5);
        b1.setFee(5000);
        b1.setGas(-55);
        b1.goGarage();

    }
}



