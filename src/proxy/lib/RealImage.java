package lib;

public class RealImage implements IImage
{
    private String _filename;
    
    public RealImage(String filename)
    {
        _filename = filename;
        _loadImage();
    }
    
    private void _loadImage()
    {
        System.out.println("Loading " + _filename);
    }
    
    public void display()
    {
        System.out.println("show " + _filename);
    }
}
