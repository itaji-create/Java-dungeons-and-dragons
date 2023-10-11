package races.main;

public class Dwarf extends Race {
    private int maxLifePoints;
    private static int instance;

    public Dwarf(String name, int dexterity) {
    	super(name, dexterity);
        maxLifePoints = 80;
    }

    @Override
    public int getMaxLifePoints() {
        return maxLifePoints;
    }

    public static int createdRacesInstances() {
        instance += 1;
        return instance;
    }

	public static int getInstance() {
		return instance;
	}

	public void setMaxLifePoints(int maxLifePoints) {
		this.maxLifePoints = maxLifePoints;
	}
}