package patternts.behavioral.mediator.example1;

public interface ChatMediator {
    public  void sendMessage(String msg, User user);
    void addUser(User user);
}
