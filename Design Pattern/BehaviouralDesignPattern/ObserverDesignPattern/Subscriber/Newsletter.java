import java.util.ArrayList;
import java.util.List;

public class Newsletter implements Subject {

    private List<Subscriber>subscribers = new ArrayList<>();
    private String newsletter;

    public Newsletter(String name){
        this.newsletter = name;
    }

    @Override
    public void addSubscriber(Subscriber SubscriberName) {
        subscribers.add(SubscriberName);
    }

    @Override
    public void removeSubscriber(Subscriber SubscriberName) {
        subscribers.remove(SubscriberName);
    }

    @Override
    public void notifySubscriber() {
        for(Subscriber subscriber : subscribers){
            subscriber.update(newsletter);
        }
    }

    @Override
    public void uploadNewsLetter() {
        System.out.println("Uploading newsletter: " + newsletter);
        notifySubscriber();
    }
}
