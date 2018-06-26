
public class Temperature {
//page 468
	private float temp;
	
		
	Temperature(){
		temp = 0;
	}
	
	Temperature(float temp, char scale){
		if (Character.toUpperCase(scale) == 'C')//Character is a class
			this.temp = temp;
		
		if (Character.toUpperCase(scale) == 'F')
			this.temp = (temp-32)*(5/9);
	}
	
	Temperature(float temp){
		this.temp = temp;		
	}
	
	Temperature(char scale){
		temp = 0;
		if (Character.toUpperCase(scale) == 'C')//Character is a class
			this.temp = temp;
		
		if (Character.toUpperCase(scale) == 'F')
			this.temp = -17.78f;//because this represents F that is 0 degrees representation of C: (C = (F-32)*5/9)
			//this.temp = (0-32)*(5/9);
	}

	
	public float getCelsius() {
		return this.temp;
	}
	
	public float getFarenheit() {
		return ((this.temp * 9f /5f) + 32);//the f forces them to be float Also note F: (F = (C * 9/5) + 32)
		}
	
	public void setDegrees(float temp)
	{
		this.temp = temp;
	}
	
	public void setScale(char scale)
	{
		if (Character.toUpperCase(scale) == 'F')
			this.temp = ((this.temp - 32f)*5f/9f);
	}
	
	public void setDegreesAndScale(float temp, char scale)
	{
		if (Character.toUpperCase(scale) == 'C')//Character is a class
			this.temp = temp;
		
		if (Character.toUpperCase(scale) == 'F')
			this.temp = (temp-32)*(5/9);
	}
	
}
