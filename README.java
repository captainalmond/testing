import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ifguihwk1 implements ChangeListener{
  //Properties
  JPanel panel;
  JFrame frame;
  JLabel labeldesc;
  JLabel result;
  JSlider slide;
  
  //Methods
  public void stateChanged(ChangeEvent evt){
    if(evt.getSource() ==  slide){
     int intMark;
     intMark = slide.getValue();
     if(intMark <= 49 && intMark >= 0){
       result.setText("Your final grade is: F");
     }else if(intMark <=59 && intMark >=50){
       result.setText("Your final grade is: D");
     }else if(intMark <=69 && intMark >= 60){
       result.setText("Your final grade is: C");
     }else if(intMark <=79 && intMark >= 70){
       result.setText("Your final grade is: B");
     }else if(intMark <= 89 && intMark >= 80){
       result.setText("Your final grade is: A");
     }else if(intMark <= 100 && intMark >=90){
       result.setText("Your final grade is: +A");
     }
    }
  }
  
  //Constructor
  public ifguihwk1(){
    panel = new JPanel();
    panel.setPreferredSize(new Dimension(1000,400));
    panel.setLayout(null);
    
    slide = new JSlider(0, 100);
    slide.setValue(0);
    slide.setMajorTickSpacing(10);
    slide.setPaintLabels(true);
    slide.setSize(500,50);
    slide.setLocation(0, 200);
    slide.addChangeListener(this);
    panel.add(slide);
    
    labeldesc = new JLabel("Please input your mark");
    labeldesc.setSize(500, 200);
    labeldesc.setLocation(500, 0);
    panel.add(labeldesc);
    
    result = new JLabel("Your final grade is: ");
    result.setSize(500, 200);
    result.setLocation(500, 200);
    panel.add(result);
    
    frame = new JFrame("Marking");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setContentPane(panel);
    frame.pack();
    frame.setVisible(true);
  }
  
  //Main program
  public static void main(String[] args){
    ifguihwk1 question1 = new ifguihwk1();
  }
}
