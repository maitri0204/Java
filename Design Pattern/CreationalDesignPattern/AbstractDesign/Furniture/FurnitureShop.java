package CreationalDesignPattern.AbstractDesign.Furniture;

public class FurnitureShop {
    public static void main(String[] args) {
        System.out.println("Godrej");
        FurnitureFactory chair = new ChairFactory();
        Types t_chair = chair.createTypes();
        Material m_chair = chair.createMaterial();
        Utility u_chair = chair.createUtility();

        t_chair.displayTypes();
        m_chair.displayMaterial();
        u_chair.displayUtility();
        System.out.println("");

        System.out.println("Urban Ladder");
        FurnitureFactory table = new TableFactory();
        Types t_table = table.createTypes();
        Material m_table = table.createMaterial();
        Utility u_table = table.createUtility();

        t_table.displayTypes();
        m_table.displayMaterial();
        u_table.displayUtility();
        System.out.println("");

        System.out.println("Artisanal Creations");
        FurnitureFactory sofa = new SofaFactory();
        Types t_sofa = sofa.createTypes();
        Material m_sofa = sofa.createMaterial();
        Utility u_sofa = sofa.createUtility();

        t_sofa.displayTypes();
        m_sofa.displayMaterial();
        u_sofa.displayUtility();
    }
}
