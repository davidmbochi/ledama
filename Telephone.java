
import java.time.LocalTime;
import java.time.Duration;
import java.text.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class Telephone {

    int enter;
    int stop;
    double charge;
    double km;
    int network;
    

    Telephone() {

        String S = JOptionPane.showInputDialog("select safaricom or any other networks");
        DecimalFormat dm = new DecimalFormat("0.0000");
        if (S.equalsIgnoreCase("safaricom")) {
            JOptionPane.showMessageDialog(null, ("safaricom"));
            JButton button = new JButton("start call");
        JFrame myframe = new JFrame();
        myframe.add(button);
        JOptionPane.showMessageDialog(null, (myframe.add(button)));
        LocalTime t1 = LocalTime.now();
        JOptionPane.showMessageDialog(null, (t1) + " " + " is the start time");
        JButton button2 = new JButton("stop call");
        myframe.add(button2);
        JOptionPane.showMessageDialog(null, (myframe.add(button2)));
        LocalTime t2 = LocalTime.now();
        JOptionPane.showMessageDialog(null, (t2) + "  "+ " is the stop time ");
        Duration duration = Duration.between(t1, t2);
        km = (duration.getSeconds());
        JOptionPane.showMessageDialog(null, ("you talked for" + " " + km+" " + "seconds"));
        
            
            if ((t1.getHour() >= 6 && t2.getHour() <= 12||t1.getHour()>=13&&t2.getHour()<18)) {//daytime
                if (km > 120) {
                    charge = ((km * 4 / 60) + ((km * 4 / 60) * 0.16));
                    JOptionPane.showMessageDialog(null, ("you were charged" + " " + dm.format(charge)));
                    JOptionPane.showMessageDialog(null, ("daytime"));
                } else {
                    charge = ((km * 4) / 60);
                }
                JOptionPane.showMessageDialog(null, ("you were charged" + " " + dm.format(charge)));
                JOptionPane.showMessageDialog(null, ("daytime"));

            } else if ((t1.getHour() >= 18 && t2.getHour() <= 23||t1.getHour()>=0&&t2.getHour()<6)) {
                if (km > 120) {
                    charge = (km * 3 / 60) + ((km * 3 / 60) * 0.16);
                    JOptionPane.showMessageDialog(null, ("you were charged" + " " + dm.format(charge)));
                    JOptionPane.showMessageDialog(null, ("night time"));
                } else {
                    charge = (km * 3 / 60);
                }
                JOptionPane.showMessageDialog(null, ("you were charged" + " " + dm.format(charge)));
                JOptionPane.showMessageDialog(null, ("night time"));

            }
            
                    
                    

        } else {
             JOptionPane.showMessageDialog(null, ("other networks"));
            JButton button = new JButton("start call");
        JFrame myframe = new JFrame();
        myframe.add(button);
        JOptionPane.showMessageDialog(null, (myframe.add(button)));
        LocalTime t1 = LocalTime.now();
        JOptionPane.showMessageDialog(null, (t1) + " " + " is the start time");
        JButton button2 = new JButton("stop call");
        myframe.add(button2);
        JOptionPane.showMessageDialog(null, (myframe.add(button2)));
        LocalTime t2 = LocalTime.now();
        JOptionPane.showMessageDialog(null, (t2) + "  "+ " is the stop time ");
        Duration duration = Duration.between(t1, t2);
        km = (duration.getSeconds());
        JOptionPane.showMessageDialog(null, ("you talked for" + " " + km+" " + "seconds"));
           
            if (km > 120) {
                charge = ((km * 5 / 60) + ((km * 5 / 60) * 0.16));
                JOptionPane.showMessageDialog(null, ("you were charged" + " " + dm.format(charge)));
            } else {
                charge = ((km * 5) / 60);
                JOptionPane.showMessageDialog(null, (" you were charged shillings" + " " + dm.format(charge)));
            }
        }
       

    }
        
    public static void main(String arg[]) {
        Telephone david = new Telephone();
    }
}
