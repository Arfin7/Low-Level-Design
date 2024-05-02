import java.util.ArrayList;
import java.util.*;

interface StockAvailableObserable
{
    void add(NotificatonObs obj);
    void remove(NotificatonObs obj);
    void notifySub();
    void setStock(int newstock);
    int getStock();

}

class IphoneObserverable implements StockAvailableObserable
{
    List<NotificatonObs> OberverList= new ArrayList<>();
    int oldcnt=0;

    public void add(NotificatonObs obj)
    {
        OberverList.add(obj);
        
    }
    public void remove(NotificatonObs obj)
    {
        OberverList.remove(obj);
        
    }
    public void notifySub()
    {
        for(NotificatonObs obj: OberverList)
        {
            obj.update();
        }
        
    }

    public void setStock(int newcnt)
    {
        if(oldcnt==0 && newcnt>0)
        {
            notifySub();
        }
        
        oldcnt=oldcnt+newcnt;
    }

    public int getStock()
    {
        return oldcnt;
    }

}


interface NotificatonObs
{
 void update();
}

class EmailObserver implements NotificatonObs
{
    StockAvailableObserable obj;
    String email="";

    public EmailObserver(String email,StockAvailableObserable o)
    {
        this.email=email;
        obj=o;
    }
    public void update()
    {
        sendMail(email," Hurry up in stock");
    }

    public void sendMail(String e,String out)
    {
        System.out.println("Alert send to: "+e+out);
    }
}
class MobileObserver implements NotificatonObs
{
    StockAvailableObserable obj;
    String phoneNum="";

    public MobileObserver(String phone,StockAvailableObserable o)
    {
        this.phoneNum=phone;
        obj=o;
    }
    public void update()
    {
        sendMail(phoneNum," Hurry up in stock");
    }

    public void sendMail(String e,String out)
    {
        System.out.println("Alert send to: "+e+out);
    }
}
public class ObserverPattern {
    public static void main(String[] args) {
        StockAvailableObserable obj=new IphoneObserverable();
        NotificatonObs n1=new EmailObserver("arfin123@gmail.com", obj);
        NotificatonObs n2=new MobileObserver("9359575780", obj);
        obj.add(n1);
        obj.add(n2);
        obj.setStock(100);
        obj.setStock(0);
        obj.setStock(11);

    }

    
}
