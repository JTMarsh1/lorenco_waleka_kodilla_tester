public class Application {
    public static void main(String[] args) {
        People adam = new People("Adam", 40.5, 178);
        People diana= new People("Diana", 30, 159);
        if (adam.age > 30 && adam.height > 160) {
            System.out.println("User is older than 30 and taller than 160cm");
        } else {
            System.out.println("User is 30 (or younger) or 160cm (or shorter)");
        }
        if (diana.age > 30 && diana.height >160) {
            System.out.println("User is older than 30 and taller than 160cm");
        }else{
            System.out.println("User is 30 (or younger) or 160cm (or shorter)");

        }
    }
}
