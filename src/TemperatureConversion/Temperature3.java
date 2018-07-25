
public class Temperature3 {
	private float temp;
	//default is 0 degrees C.
	Temperature3 () {
		temp = 0;
	}
	//if given temp, assume that is is C, and no conversion necessary
	Temperature3 (float temp) {
		this.temp = temp;		
	}
	//if they provide a scale but no specific degree then we assume 0 degrees C, and convert to F if that is the arg 
	Temperature3 (char scale) {
		if (Character.toUpperCase(scale) == 'C')
			this.temp = 0;
		
		if(Character.toUpperCase(scale) =='F')
			this.temp = -17.78f;
	}
	//if they give us temp and scale, we assume saving it to C so if F we convert in the CONSTUCTOR
	Temperature3 (float temp, char scale){
		if(Character.toUpperCase(scale)== 'C')
			this.temp = temp;
		
		if(Character.toUpperCase(scale) == 'F')
			this.temp = (temp - 32f) *(5f / 9f);
	}
	//the prof assumes that we have C and get C.  I would another get method have the opposite, so F and want C
	public float getCelsius() {
		return this.temp;
	}
	//this would assumes you have the opposite, so C and want F
	public float getFarenheit() {
		return this.temp * (9f / 5f) + 32f;
	}
	//if no scale provided assume C
	public void setDegrees(float temp) {
		this.temp = temp;
	}
	//this only sets scale if not C... if C it does nothing b/c that is the default anyway
	public final void setScale(char scale) {
		if (Character.toUpperCase(scale) == 'F')
			this.temp = (this.temp - 32f) * 5f / 9f;
	}
	
	public void setDegreesAndScale(float temp, char scale) {
	if (Character.toUpperCase(scale) == 'C')
		this.temp = temp;
	
	if (Character.toUpperCase(scale) == 'F')
		this.temp = (temp-32f) * 5f / 9f;
	}
	
	public boolean isSame(Temperature3 that) {
		return this.temp == that.temp;
	}
	
	public boolean isGreater(Temperature3 that) {
	return this.temp > that.temp;
	}
	
	public boolean isLess(Temperature3 that) {
	return this.temp < that.temp;
	}
	
}
