
import java.awt.*;  
import java.awt.event.*;

//1st step  
public class Keylistener implements KeyListener{  
    Button b;
    TextField tf;
Keylistener(){
    tf = new TextField();
    tf.setBounds(100, 200, 400, 50);
    Frame f=new Frame("ActionListener Example");  
   //2nd step  
     f.add(tf);
     tf.addKeyListener(this);
   f.setSize(400,400);  
   f.setLayout(null);  
   f.setVisible(true);   
 
}
    public static void main(String[] args) {  
        new Keylistener();
   }  
//3rd step 
@Override
public void keyTyped(KeyEvent e) {
 tf.setText(  "Key is Typed");  
}
@Override
public void keyPressed(KeyEvent e) {
 tf.setText("Key is Pressed..");  
}
@Override
public void keyReleased(KeyEvent e) {
 tf.setText("keyy is Relased..");  
}  
}