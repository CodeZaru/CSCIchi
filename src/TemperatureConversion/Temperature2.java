public class Temperature2 {
    private float temp;

    Temperature2 () {
        temp = 0;
    }

    Temperature2(float temp){
        this.temp = temp;
    }

    Temperature2(char scale) {
        if (Character.toUpperCase(scale) == 'C')
            this.temp = 0;

        if (Character.toUpperCase(scale) == 'F') 
            this.temp = -17.78f;    // 0F = -17.78C
    }

    Temperature2(float temp , char scale) {
        if (Character.toUpperCase(scale) == 'C')
            this.temp = temp;

        if (Character.toUpperCase(scale) == 'F') 
            this.temp = (temp - 32f) * (5f / 9f);
    }        

    public float getCelsius() {
        return this.temp;
    }

    public float getFahrenheit() {
        return this.temp * 9f / 5f + 32f;
    }

    public void setDegrees(float temp) {
        this.temp = temp;
    }

    public final void setScale(char scale) {
        if (Character.toUpperCase(scale) == 'F') 
            this.temp = (this.temp - 32f) * 5f /9f;		
    }

    public void setDegreesAndScale(float temp, char scale) {
        if (Character.toUpperCase(scale) == 'C')
            this.temp = temp;

        if (Character.toUpperCase(scale) == 'F') 
            this.temp = (temp - 32f) * 5f / 9f;		
    }

    public boolean isSame(Temperature2 that) {
        return this.temp == that.temp;
    }

    public boolean isGreater(Temperature2 that) {
        return this.temp > that.temp;
    }

    public boolean isLess(Temperature2 that) {
        return this.temp < that.temp;
    }
    
	public String toString() {
		return this.temp + "C\n";
	}
}