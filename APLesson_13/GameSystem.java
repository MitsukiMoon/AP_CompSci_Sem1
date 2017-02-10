import java.lang.Math.*;

public class GameSystem
{
	public GameSystem()
	{
		String platform = "";
		int serialNo = 0;	
	}
	
	public GameSystem (String p)
	{
		platform = p;
		serialNo =  (int)(Math.random() * 9000000) + 1000000;
	}
	
	public String getPlatform ()
	{
		return platform;
	}
	
	public String getSerialNo ()
	{
		return serialNo;
	}
	
	

	
}