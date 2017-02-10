public class PC extends GameSystem
{
	private String platform;
	private int serialNo;
	
	public class PC
	{
		super();
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return 	"Platform: " + platform +
				"Serial #: " + serialNo +
				"Controller: " + systemInput();
	}
	
}