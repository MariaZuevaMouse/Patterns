package patternts.behavioral.mediator.example1;

public class ChatClient {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator, "Mari");
        User user2 = new UserImpl(mediator, "Lisa");
        User user3 = new UserImpl(mediator, "David");
        User user4 = new UserImpl(mediator, "Artur");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi @all!");
    }
}
