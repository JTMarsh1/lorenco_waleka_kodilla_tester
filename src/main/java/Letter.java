public class Letter {
    public String takeit() {
        String Ask = Askme.getAskmeee();
        String a = Askme.getAskme();
        String b = Askme.getAskmee();
        String result = "You pick wrong letter, try again";
        switch (Ask) {
            case "R":
                result = a + b;
                break;
            case "B":
                result = a + b;
                break;
            case "G":
                result = a + b;
                break;
            case "Y":
                result = a + b;
                break;
        }
        return result;
    }
}





















