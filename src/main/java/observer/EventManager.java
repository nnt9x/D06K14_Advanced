package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventManager implements Publisher {
    // Thuộc tinh: su kien - danh sach subscribe
    private HashMap<String, List<Listener>> subscribes;

    public EventManager() {
        this.subscribes = new HashMap<>();
    }

    @Override
    public void subscribe(String event, Listener e) {
        // Neu event chua co trong subscribes => tao moi
        if (!subscribes.containsKey(event)) {
            subscribes.put(event, new ArrayList<>());
        }
        subscribes.get(event).add(e);
    }

    @Override
    public void unsubscribe(String event, Listener e) {
        if (subscribes.containsKey(event)) {
            subscribes.get(event).remove(e);
        }
    }

    @Override
    public void removeEvent(String event) {
        if (subscribes.containsKey(event)) {
            subscribes.remove(event);
        }
    }

    @Override
    public void notify(String event, String msg) {
        List<Listener> listeners = subscribes.get(event);

        if (listeners == null || listeners.isEmpty()) return;

        for (Listener e : listeners) {
            e.callback(msg);
        }

    }
}
