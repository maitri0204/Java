public interface Subject {
    void addSubscriber(Subscriber SubscriberName);
    void removeSubscriber(Subscriber SubscriberName);
    void notifySubscriber();
    void uploadNewsLetter();
}
