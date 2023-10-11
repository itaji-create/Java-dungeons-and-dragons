package races.main;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dwarf gimli  = new Dwarf("Gimli", 70);
		gimli.setMaxLifePoints(60);
		System.out.println(gimli.getMaxLifePoints());
		System.out.println(gimli.getName());
		System.out.println(gimli.getDexterity());
	}

}
