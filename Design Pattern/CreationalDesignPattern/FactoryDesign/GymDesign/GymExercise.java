package CreationalDesignPattern.FactoryDesign.GymDesign;

import java.util.concurrent.Executor;

public class GymExercise {
    public GymDesign GymExercise(String str){
        if(str.equals("Back")){
            return new Back();
        }
        else if(str.equals("Biceps")){
            return new Biceps();
        }
        else{
            return new Shoulder();
        }
    }
}
