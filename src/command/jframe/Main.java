import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import lib.painter.*;
import lib.command.*;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener
{
  /**
   *
   */
  private MacroCommand _history = new MacroCommand();

  /**
   *
   *
   * @var DrawCanvas
   */
  private DrawCanvas _canvas = new DrawCanvas(400, 400, _history);

  /**
   * clear button
   *
   * @JButton
   */
  private JButton _clearButton = new JButton("Clear");




  /**
   * Constructor
   *
   * @var String
   */
  public Main(String title)
  {
    super(title);
    addWindowListener(this);
    _canvas.addMouseMotionListener(this);
    _clearButton.addActionListener(this);

    Box buttonBox = new Box(BoxLayout.X_AXIS);
    buttonBox.add(_clearButton);

    Box mainBox = new Box(BoxLayout.Y_AXIS);
    mainBox.add(buttonBox);
    mainBox.add(_canvas);
    getContentPane().add(mainBox);

    pack();
    show();
  }


  /**
   * ActionEvent
   */
  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource() == _clearButton) {
      _history.clear();
      _canvas.repaint();
    }
  }

  /**
   * MouseEvent
   */
  public void mouseMoved(MouseEvent e)
  {
  }

  public void mouseDragged(MouseEvent e)
  {
    ICommand cmd = new DrawCommand(_canvas, e.getPoint());
    _history.append(cmd);
    cmd.execute();
  }

  /**
   * WindowEvent
   */
  public void windowActivated(WindowEvent e)
  {}

  public void windowClosed(WindowEvent e)
  {}

  public void windowClosing(WindowEvent e)
  {
    System.exit(0);
  }

  public void windowDeactivated(WindowEvent e)
  {}

  public void windowDeiconified(WindowEvent e)
  {}

  public void windowIconified(WindowEvent e)
  {}

  public void windowOpened(WindowEvent e)
  {}

  public static void main(String[] args)
  {
    new Main("Command Pattern Window");
  }
}
