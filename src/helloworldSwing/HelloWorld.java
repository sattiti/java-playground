import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloWorld extends JFrame implements ActionListener
{
  /**
   * button
   *
   * @var Jbutton
   */
  private JButton button;

  /**
   * label.
   *
   * @var JLabel
   */
  private JLabel label;

  /**
   * constructor
   */
  public HelloWorld()
  {
    Container container = getContentPane();
    container.setLayout(new GridLayout(2, 1));

    label = new JLabel("");
    label.setHorizontalAlignment(JLabel.CENTER);
    container.add(label);

    button = new JButton("表示");
    button.addActionListener(this);
    container.add(button);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource().equals(button)) {
      label.setText("hello world!");
    }
  }

  /**
   * main
   */
  public static void main(String[] args)
  {
    HelloWorld hw = new HelloWorld();
  }
}
