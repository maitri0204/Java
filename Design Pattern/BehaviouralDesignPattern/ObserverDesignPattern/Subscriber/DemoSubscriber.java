public class DemoSubscriber {
    public static void main(String[] args) {
        Newsletter newsletter = new Newsletter("Tech News");

        Subscriber subscriber1 = new NewsletterSubscriber("ABC");
        Subscriber subscriber2 = new NewsletterSubscriber("DEF");
        Subscriber subscriber3 = new NewsletterSubscriber("GHI");
        Subscriber subscriber4 = new NewsletterSubscriber("JKL");

        newsletter.addSubscriber(subscriber1);
        newsletter.addSubscriber(subscriber2);
        newsletter.addSubscriber(subscriber3);
        newsletter.addSubscriber(subscriber4);

        newsletter.uploadNewsLetter();

        newsletter.removeSubscriber(subscriber3);

        newsletter.uploadNewsLetter();

    }
}
