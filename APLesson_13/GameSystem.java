import java.lang.Math.*;

public class GameSystem
{
	private String platform;
	private int serialNo;
	
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
	
	public int getSerialNo ()
	{
		return serialNo;
	}
	
	

	
}