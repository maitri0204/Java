package CreationalDesignPattern.AbstractDesign.Furniture;

interface FurnitureFactory {
    Types createTypes();
    Material createMaterial();
    Utility createUtility();
}
