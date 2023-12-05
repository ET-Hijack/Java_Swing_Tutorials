import java.awt.Frame;

public class MyFrame extends Frame {
    public MyFrame(){
        super("My Frame Title");
        setSize(500,400);
        setVisible(true);
    }
    public static void main(String args[]){
        MyFrame frame = new MyFrame();
    }
}