import java.sql.SQLOutput;

public class Bus {
    int maxPassengers;  //최대 승객수
    int passengers;     //현재 승객수
    int fee;            //요금
    int busNum;         //버스 번호
    int gas;            //주유량
    int speed;          //현재 속도
    boolean status;     //상태 ( 운행 : true, 차고지행 : false)
    void run() {
        while (true) {
            if (gas > 10) {
                System.out.println("달립니다.(gas 잔량: " + gas + ")");
                gas = -1;
            } else {
                System.out.println("멈춥니다.(gas 잔량: " + gas + ")");
                return;
            }
        }
    }
    void setGas(int gas) {
        this.gas = gas;
    }
    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas가 없습니다.");
            return false;
        }
        System.out.println("gas가 있습니다.");
        return true;
    }
}



