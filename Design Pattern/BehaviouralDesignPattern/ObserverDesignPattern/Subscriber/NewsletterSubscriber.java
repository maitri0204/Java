public class NewsletterSubscriber implements Subscriber{

    private String SubscriberName;

    public NewsletterSubscriber(String subscriberName){
        this.SubscriberName = subscriberName;
    }

    @Override
    public void update(String newsletter) {
        System.out.println(SubscriberName + " received newsletter: " + newsletter);
    }
}
