package observer;

public interface Publisher {
    public void subscribe(String event, Listener e);

    public void unsubscribe(String event, Listener e);

    public void removeEvent(String event);

    public void notify(String event, String msg);
}
