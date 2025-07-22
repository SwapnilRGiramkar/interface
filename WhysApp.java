//This is Real-Time Example of Working WhatsApp
//Interface WhysApp
[[Opackage interfaces;

public interface WhysApp 
{
	int messageLimit=100;
	void message(long phno ,String msg);
	void voiceMessage(long phno,String msg);
	void status(String ip);
	public static void greeting(String name)
	{
		System.out.println("Hey ! "+name+"Welcome to WhysApp");
	}
}
//---------------------------------------------------------------------------
//class WhysAppImp
package interfaces;

public abstract class WhysAppImp implements WhysApp
{
	int messageCount;
	String user;
	long phno;
	
	public WhysAppImp() {
		// TODO Auto-generated constructor stub
	}
	public WhysAppImp(String user,long phno)
	{
		this.user=user;
		this.phno=phno;
		System.out.println("Account Created ");
	}
	
	public void message(long phno,String msg)
	{
		if(messageCount<=messageLimit)
		{
			System.out.println(msg);
			System.out.println("Text message sent");
			messageCount++;
		}
		else 
		{
			System.out.println("Daily Limit Exceeded...!");
		}
	}
	

	public void voiceMessage(long phno,String msg)
	{
		if(messageCount<=messageLimit)
		{
			System.out.println(msg);
			System.out.println("Voice  message sent");
			messageCount++;
		}
		else 
		{
			System.out.println("Daily Limit Exceeded...!");
		}
	}
	
}
//---------------------------------------------------------------------------
//class WhysAppImp2
package interfaces;

public class WhysAppImp2 extends WhysAppImp
{
	public WhysAppImp2() {
		// TODO Auto-generated constructor stub
	}
	WhysAppImp2(String user,long phno)
	{
		super(user,phno);
	}
	
	public void status(String ip)
	{
		System.out.println(ip);
		System.out.println("Status Updated");
	}
	
	public void message(long phno,String msg)
	{
		if(messageCount<=messageLimit)
		{
			System.out.println(msg);
			System.out.println("Text message sent by Whysapp");
			messageCount++;
		}
		else 
		{
			System.out.println("Daily Limit Exceeded...!");
		}
	}
}
//--------------------------------------------------------------------------
//class WhysAppDriver
package interfaces;

public class WhysAppDriver
{
	public static void main(String[] args) 
	{
		WhysApp w=new WhysAppImp2();
		w.message(9284094059l, "Hello....!I am Neil");
		w.voiceMessage(9284094059l, "How are you");
		w.status("I am Fine ");
	}
}
//-----------------------------------------------------------------------------
