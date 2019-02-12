package lib.painter;

import java.awt.Point;

import command.ICommand;

public class DrawCommand implements ICommand
{
    /**
     * 描画対象
     *
     * @var IPainter _painter
     */
    protected IPainter _painter;

    /**
     * 描画位置
     *
     * @var Point _pt
     */
    private Point _pt;



    /**
     * Constructor
     *
     * @param IPainter painter
     * @param Point pt
     */
    public DrawCommand(IPainter painter, Point pt)
    {
        _painter = painter;
        _pt      = pt;
    }

    /**
     * execute
     *
     * @return void
     */
    public void execute()
    {
        _painter.draw(_pt.x, _pt.y);
    }
}
