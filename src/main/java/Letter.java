public class Letter {
    public String takeit() {
        String result = Askme.getAskmee();
        switch (result) {
            case "R":
            case "B":
            case "G":
            case "Y":
                result = result;
                break;
        }
        return result;
    }
}