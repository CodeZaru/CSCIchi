
public class OOPNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// when looking at OOP
		
		//in general, when you have an object that has for example three properties, then it will have at least 6 methods (3 gets and 3 sets),
		//or a variation like a combined set method that sets all three properties.
		
		//can return something that is the result of an equation, like return population/ area

		//notice that we did down counting  (or count-down) for species predict population (ref. the count --; line)
		//NOTE that the down counting is the same thing as the up counting (count ++;) 
		//you just have to know to change the guard from count > 0 to count < 10;
		
	/*	
		do {
			testSpecies.setSpecies("Tribbles", testSpecies, testSpecies.predictPopulation(1), 15); 
//years = years + 1; (or years ++) so basically ++years means increment before we use and years++ means increment after use
//BASICALLY need to look this up in a textbook or online to get the difference.. Post increment vs pre increment.
			System.out.p  ("Years = " + (++years) + ", Population = " testSpecies.getPopulation());???)
//years = years + 1;
		}while (testSpecies.getDensity(1500)<1);
*/		
		
	//	constructor is same name as Object and has no return type..
		
//		Java gives you a default constructor automatically unless you create an overloaded constructor
		
		//if you have overloaded constructor, java no longer provides the default constructor for free (which allows you to do "Species testSpecies = new Sppecies; w/o actually even having a constructor in the object definition.
		

		
		
//		Species(String name, int populatio, double growthRate){
//this.name=name;
//this.population=population;
//this.growthRate=growthRate;
	}
		//		setSpecies(name, populatio, growthRate);//so don't have to have this.name b/c I passed it in (in fact if use this, then it won't get the parameter dropped in..
		//Species tesSpecies = new Species("Tibbles", 100, 15);
		
		
	//the constructor is called when the "new" operator is used like:
	// Pet myPet = new Pet (parameters);
	
	//Scanner keyboard = 
	
	//Ch 5 is default constructo..
	//Ch 6 is overloading the constructor... when and how to use the overloaded constructor.
	
	// constants are all caps
	// Object/class starts with captial
	// all other variables camel case
	
	//if you have a static variable defined, then it is shared by all ojects of that type
	//if you don't 
	
//static  variable defines it for all objects of that class
	
//	When you take out static means that everybody has their own copy of the variable, but if you use static means everybody shares the same copy.
//	static and final are optional modifiers.
// static vs no static has implications for memory usage etc... b/c everybody has copy vs share one copy
	
//	local variable is in a procedural program
	//instance variables are object oriented only
	//static (class) variable

	
//	public int age for her pet
//	public int age for your pet
//	public int age for my pet
	
	//it seems the ...
	
	
	
	//need to use static method to access static variable..
	
	
	//classes don't use the static modifier becaseu they are the template.
	
//}
		
		
		
		
		
//	}

}
