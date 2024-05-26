package CreationalDesignPattern.AbstractDesign.Tech;

public class SamsungFactory implements MobileFactory{

    @Override
    public Mobile CreateMobile() {
        return new SamsungMobile();
    }

    @Override
    public OS CreateOS() {
        return new Android();
    }
    
}
