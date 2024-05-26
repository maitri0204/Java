package CreationalDesignPattern.AbstractDesign.Furniture;

public class SofaFactory implements FurnitureFactory {

    @Override
    public Types createTypes() {
        return new Sofa();
    }

    @Override
    public Material createMaterial() {
        return new Foam();
    }

    @Override
    public Utility createUtility() {
        return new Home();
    }
    
}
