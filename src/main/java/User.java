public class User {
    private String name;
    private int age;


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        User betty = new User("betty", 20);
        User eva = new User("eva", 33);
        User david = new User("david", 57);
        User peter = new User("peter", 14);
        User eveline = new User("eveline", 45);
        User anna = new User("anna", 18);
        User[] users = {betty, eva, david, peter, eveline, anna};

        double averageOfAge = getAverageAge(users);

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < averageOfAge) {
                System.out.println(averageOfAge);
                System.out.println(users[i].name + users[i].age);
            }
        }
    }

    static double getAverageAge(User[] users) {
        double sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].age;
        }
        return sum / users.length;
    }
}