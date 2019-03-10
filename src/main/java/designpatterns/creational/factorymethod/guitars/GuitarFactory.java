package designpatterns.creational.factorymethod.guitars;

public class GuitarFactory extends BaseGuitarFactory {

	public Guitar createGuitar(String brand) {

		Guitar guitar;

		switch (brand.toLowerCase()) {
		case "ibanez":
			guitar = new Ibanez();
			break;
		case "fender":
			guitar = new Fender();
			break;
		case "jackson":
			guitar = new Jackson();
			break;
		default:
			throw new IllegalArgumentException("No such Guitar brand");
		}

		return guitar;
	}

}
