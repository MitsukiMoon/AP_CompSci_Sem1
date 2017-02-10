public abstract class Console extends GameSystem
{
	private String platform;
	private int serialNo;
	private String controller;
	
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