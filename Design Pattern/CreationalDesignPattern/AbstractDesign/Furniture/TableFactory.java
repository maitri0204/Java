package CreationalDesignPattern.AbstractDesign.Furniture;

public class TableFactory implements FurnitureFactory {

    @Override
    public Types createTypes() {
        return new Table();
    }

    @Override
    public Material createMaterial() {
        return new Wooden();
    }

    @Override
    public Utility createUtility() {
        return new Office();
    }
    
}
