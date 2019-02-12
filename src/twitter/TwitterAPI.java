import winterwell.jtwitter.*;
import java.util.List;
import java.util.ArrayList;

public class TwitterAPI
{
  /**
   * @var _twitter JTwitter instance.
   */
  private Twitter _twitter;


  /**
   * Constructor
   */
  public TwitterAPI()
  {
    _twitter = new Twitter();
  }

  /**
   * getUserTimeline
   *
   * @param  userId
   */
  public void getUserTimeline(String userId)
  {
    List tl = new ArrayList<Twitter.Status>();
    tl      = _twitter.getUserTimeline(userId);
    int len = tl.size();

    for(int i = 0; i < len; i++) {
      System.out.println(tl.get(i));
    }
  }

  /**
   * getPublicTimeline
   */
  public void getPublicTimeline()
  {
    List tl = new ArrayList<Twitter.Status>();
    tl      = t.getPublicTimeline();
    int len = tl.size();

    for(int i = 0; i < len; i++) {
      System.out.println(tl.get(i));
    }
  }
}
