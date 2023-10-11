package races.main;

public abstract class Race {
    private String name;
    private int dexterity;

    public Race(String name, int dexterity) {
        this.name = name;
        this.dexterity = dexterity;
    }

    public abstract int getMaxLifePoints();

    public String getName() {
		return name;
	}

	public int getDexterity() {
		return dexterity;
	}

	public static int createdRacesInstances() {
        throw new UnsupportedOperationException("Not implemented");
    }
}