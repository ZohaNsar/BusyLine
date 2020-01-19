package FetchDecode;

public class EvaluateType {

    Breaker breaker = new Breaker();
    String opcode = "";

    public void overallCheck (String instruction){

        opcode = breaker.getOpcode(instruction);

        if (opcode == "0000"){

            foundRType(instruction);
        }

        findAnotherType(instruction);
    }

    public void foundRType (String instruction){

        Breaker breaker = new Breaker();
        Register Rs = new Register();
        Register Rt = new Register();
        Register Rd = new Register();

        Rs.address = breaker.getRs(instruction);
        Rt.address = breaker.getRd(instruction);
        Rd.address = breaker.getRd(instruction);


    }

    public void findAnotherType (String instruction){
        Breaker breaker = new Breaker();
        String opcode = breaker.getOpcode(instruction);

        if (opcode == "100011" || opcode == "101011" || opcode == "000100" || opcode == "000101"){
            foundIType(instruction);
        }

        else if (opcode == "000010"){
            foundJType(instruction);

        }
    }

    public void foundIType (String instruction) {
        Breaker breaker = new Breaker();
        String opcode = breaker.getOpcode(instruction);

        if (opcode == "100011") {
            LW (instruction);
        }

        else if (opcode == "101011") {
            SW (instruction);
        }

        else if (opcode == "000100") {
            Beq (instruction);
        }

        else if(opcode == "000101") {
            Bnq (instruction);
        }
    }

    public void foundJType (String instruction) {
         Breaker breaker = new Breaker();
         String opcode = breaker.getOpcode(instruction);

         if (opcode == "000010") {
             Jump (instruction);
         }
    }


    public void LW (String instruction) {

    }

}
