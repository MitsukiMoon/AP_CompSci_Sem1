import java.lang.Math.*;

public class UserClass
{
	private String FirstName, LastName, Avatar;
	private int UserID;
	
	public UserClass ()
	{
		FirstName = "";
		LastName = "";
		Avatar = "";
		UserID = 0;
	}
	
	public UserClass(String fN, String lN, String A)
	{
		FirstName = fN;
		LastName = lN;
		Avatar = A;
		UserID = (int)(Math.random() * 1000000) + 1;;		
	
	}
	
	public void setFirstName (String fN)
	{
		FirstName = fN;
	}
	
	public void setLastName (String lN)
	{
		LastName = lN;
	}
	
	public void setAvatar (String A)
	{
		Avatar = A;
	}
	
	public void setUserID (int UID)
	{
		UserID = UID;
	}
	
	
	public String getFirstName ()
	{
		return FirstName;
	}
	
	public String getLastName ()
	{
		return LastName;
	}
	
	public String getAvatar ()
	{
		return Avatar;
	}

	public int getUserID ()
	{
		return UserID;
	}
	
	public String toString()
	{
	   return "Customer Info...\nFirst Name: " + FirstName +
							   "\nLast Name: " + LastName +
							   "\nAvatar: " + Avatar +
							   "\nUser ID#: " + UserID;
	}
	
	
	
}
	
	
	
