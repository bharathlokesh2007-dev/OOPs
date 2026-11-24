class Device{
    String Powersource = "Device powered on";
    void turnOn()
    {
        System.out.println("calling....");
    }
}
class Mobile extends Device{
    double ScreenSize = 23;
    void makeCall(){

       System.out.println("calling...");
    }
}
class Android extends Mobile{
   void openplaystore(){
        
        System.out.println("Playstore opened!");
    }
}
class iphone extends Mobile{
    void openAppstore()
    {
        
        System.out.println("Appstore opened!");
    }
}
public class Demo3
{
    public static void main(String[] args) {
     Android c = new Android();
        c.openplaystore();
    iphone i = new iphone();
        i.openAppstore();
    }
}

