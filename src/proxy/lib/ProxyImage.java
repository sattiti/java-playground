package lib;

public class ProxyImage implements IImage
{
    private String _filename;
    private IImage _image;
    
    public ProxyImage(String filename)
    {
        _filename = filename;
    }
    
    public void display()
    {
        if(_image == null) _image = new RealImage(_filename);
        _image.display();
    }
}
