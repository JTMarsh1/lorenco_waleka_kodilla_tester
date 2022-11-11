public class Letter {
    public String takeit() {
        String Ask = Askme.getAskmeee();
        String a = Askme.getAskmee();
        String result = "You pick wrong letter, try again";
        switch (Ask) {
            case "R":
            case "B":
            case "G":
            case "Y":
                result = a;
                break;
        }
        return result;
    }
}





















