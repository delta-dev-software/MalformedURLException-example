import java.net.MalformedURLException;
import java.net.URL;

public class MalformedURLExceptionDemo
{
    public static void main(String[] args)  {
        try {
            URL url=new URL("http://www.example.com/$$$$invalid");
        }catch (MalformedURLException e)
        {
          e.printStackTrace();
        }
    }
}
