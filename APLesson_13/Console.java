public abstract class Console extends GameSystem
{
	public Console ()
	{
		super();
	}
	
	
	public abstract String getController();
	
	public String toString ()
	{
		return 	"Platform: " + platform +
				"Serial #: " + serialNo +
				"Controller: " + controller;
		
	}
	
	

	
}