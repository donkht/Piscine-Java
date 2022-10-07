
public class Program {
    public static void main(String[] args) {
        User user1 = new User("Jack", 555);
        User user2 = new User("John", 222);

        System.out.println("User id = " + user1.getId() +
                " Name User is " + user1.getName() + " balance User = " + user1.getBalance());

        System.out.println("User id = " + user2.getId() +
                " Name User is " + user2.getName() + " balance User = " + user2.getBalance());
    }
}