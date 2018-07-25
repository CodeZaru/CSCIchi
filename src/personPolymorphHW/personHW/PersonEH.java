package personHW;

	public class PersonEH {
		
		private String name;
	//KS Note: set name equal to a default value
		public PersonEH() {
			name = "No name yet";
		}

		public PersonEH(String initialName) {
			name = initialName;
		}

		public void setName(String newName) {
			name = newName;
		}

		public String getName() {
			return name;
		}

		public void writeOutput() {
			System.out.println("Name: " + name);
		}
	//KS Note:  this is a boolean test..
		public boolean hasSameName(PersonEH otherPerson) {
			//KS Note: be clear and specify this. vs that. type syntax
			return this.name.equalsIgnoreCase(otherPerson.name);
		}
	}
