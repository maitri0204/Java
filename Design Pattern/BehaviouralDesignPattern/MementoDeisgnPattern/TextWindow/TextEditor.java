package BehaviouralDesignPattern.MementoDeisgnPattern.TextWindow;

import org.w3c.dom.Text;

public class TextEditor {
    private TextWindow textWindow;
    private TextWindowState savedTextWindow;

    public TextEditor(TextWindow textWindow){
        this.textWindow = textWindow;
    }

    public void write(String text){
        textWindow.addText(text);
    }

    public void hitSave(){
        savedTextWindow = textWindow.save();
    }

    public void hitUndo(){
        textWindow.restore(savedTextWindow);
    }

    public String print(){
        return textWindow.getText();
    }

}
