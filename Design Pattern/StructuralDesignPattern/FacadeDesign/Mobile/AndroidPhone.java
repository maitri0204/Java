package StructuralDesignPattern.FacadeDesign.Mobile;

public class AndroidPhone implements Phone {
    public String finalPhone;

    @Override
    public void builtPhone(String compoenentsRequired) {
        finalPhone = "Android Phone with Components: " + compoenentsRequired;
    }

    @Override
    public String deliverPhone() {
        return finalPhone;
    }
    
}
