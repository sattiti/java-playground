
package lib.painter;

//import java.util.;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.Graphics;

import painter.IPainter;
import command.*;

public class DrawCanvas extends Canvas implements IPainter
{
    /**
     * color
     *
     * @var Color
     */
    private Color _color = Color.white;

    /**
     * color
     *
     * @var Color
     */
    private Color _bgColor = Color.black;

    /**
     * 半径
     *
     * @var int
     */
    private int _radius = 3;

    /**
     * width
     *
     * @var int
     */
    private int _width = 100;

    /**
     * height
     *
     * @var int
     */
    private int _height = 100;

    /**
     * 履歴
     * 
     * MacroCommand
     */
    private MacroCommand _history;



    /**
     * Constructor
     *
     * @param int
     * @param int
     * @param int
     * @param MacroCommand
     * @param Color
     * @param Color
     */
    public DrawCanvas(int width, int height, int radius, Color color, Color bgColor, MacroCommand histoy)
    {
        _width   = width;
        _height  = height;
        _radius  = radius;
        _color   = color;
        _bgColor = bgColor;
        _history = histoy;

        setSize(width, height);
        setBackground(_bgColor);
    }
    
    /**
     * Constructor
     *
     * @param int
     * @param int
     * @param MacroCommand
     */
    public DrawCanvas(int width, int height, MacroCommand histoy)
    {
        _width   = width;
        _height  = height;
        _history = histoy;

        setSize(_width, _height);
        setBackground(_bgColor);
    }

    /**
     * 履歴全体を再絵画
     *
     * @param  Craphics g
     * @return void
     */
    public void paint(Graphics g)
    {
        _history.execute();
    }

    /**
     * draw
     *
     * @param  int x
     * @param  int y
     * @return void
     */
    public void draw(int x, int y)
    {
        Graphics g = getGraphics();
        g.setColor(_color);
        g.fillOval(x - _radius, y - _radius, _radius * 2, _radius * 2);
    }
}
