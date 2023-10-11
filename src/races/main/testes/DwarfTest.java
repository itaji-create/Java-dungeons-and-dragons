package races.main.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import races.main.Dwarf;

@DisplayName("Eu sou a classe de teste da raça Dwarf")
class DwarfTest {

	@Test
	@DisplayName("testando método getMaxLifePoints...")
	final void testGetMaxLifePoints() {
		Dwarf gimli = new Dwarf("Gimli", 70);
		assertEquals(80, gimli.getMaxLifePoints()); 
	}

	@Test
	@DisplayName("testando método createdRacesInstances...")
	final void testCreatedRacesInstances() {
		assertEquals(1, Dwarf.createdRacesInstances());
		assertEquals(2, Dwarf.createdRacesInstances());
		assertEquals(3, Dwarf.createdRacesInstances());
	}

	@Test
	@DisplayName("testando método setMaxLifePoints...")
	final void testSetMaxLifePoints() {
		Dwarf gimli = new Dwarf("Gimli", 70);
		gimli.setMaxLifePoints(50);
		assertEquals(50, gimli.getMaxLifePoints());
	}

	@Test
	@DisplayName("testando instância da classe Dwarf...")
	final void testDwarf() {
		Dwarf gimli = new Dwarf("Gimli", 70);
		assertEquals("Gimli", gimli.getName());
		assertEquals(70, gimli.getDexterity()); 
	}

	@Test
	@DisplayName("testando método getName...")
	final void testGetName() {
		Dwarf gimli = new Dwarf("Gimli", 70);
		assertEquals("Gimli", gimli.getName());
	}

	@Test
	@DisplayName("testando método getDexterity...")
	final void testGetDexterity() {
		Dwarf gimli = new Dwarf("Gimli", 70);
		assertEquals(70, gimli.getDexterity());
	}

}
