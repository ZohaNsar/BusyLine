package FetchDecode;

public class Breaker {

    public String getOpcode(String instruction) {
        return instruction.substring(0, 6);
    }

    public String getFunction(String instruction) {
        return instruction.substring(27, 33);
    }

    public String getRs(String instruction) {
        return instruction.substring(6, 11);
    }

    public String getRt(String instruciton) {
        return instruciton.substring(11, 16);
    }

    public String getRd(String instruction) {
        return instruction.substring(16, 21);
    }

    // if beq, bnq
    public String getBeqRd (String instruction) {
        return instruction.substring(11, 16);
    }

    public String getOffset(String instruction) {
        return instruction.substring(16, 32);
    }

    //if jump
    public String getJOffset(String instruction) {
        return instruction.substring(6, 32);
    }


    public static void main(String[] args) {
        Breaker breaker = new Breaker();
        System.out.println(breaker.getRd("10000012345678912345678912345678"));
    }

}