import java.lang.Math.*;
public class Human
{
	private String Hair, Eyes, Skin;

	
	public Human ()
	{
		Hair = "";
		Eyes = "";
		Skin = "";

		
	}
	
	public Human(String h, String e, String s)
	{
		Hair = h;
		Eyes = e;
		Skin = s;

	}
	
	public void setHair (String h)
	{
		Hair = h;
	}
	
	public void setEyes (String e)
	{
		Eyes = e;
	}
	
	public void setSkin (String s)
	{
		Skin = s;
	}
	
	public String getHair ()
	{
		return Hair;
	}
	
	public String getEyes ()
	{
		return Eyes;
	}
	
	public String getSkin ()
	{
		return Skin;
	}
	

	
	
	
}
	
	
	
