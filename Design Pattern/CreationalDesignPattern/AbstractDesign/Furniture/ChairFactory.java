package CreationalDesignPattern.AbstractDesign.Furniture;

public class ChairFactory implements FurnitureFactory{

    @Override
    public Types createTypes() {
        return new Chair();
    }

    @Override
    public Material createMaterial() {
        return new Plastic();
    }

    @Override
    public Utility createUtility() {
        return new Public();
    }
    
}
