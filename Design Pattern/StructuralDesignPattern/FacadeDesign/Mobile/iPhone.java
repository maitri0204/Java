package StructuralDesignPattern.FacadeDesign.Mobile;

public class iPhone implements Phone {
    public String finalPhone;

    @Override
    public void builtPhone(String compoenentsRequired) {
        finalPhone = "iPhone with components: " + compoenentsRequired;
    }

    @Override
    public String deliverPhone() {
        return finalPhone;
    }
    
}
