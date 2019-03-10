package designpatterns.creational.factorymethod;

import designpatterns.creational.factorymethod.guitars.BaseGuitarFactory;
import designpatterns.creational.factorymethod.guitars.Guitar;
import designpatterns.creational.factorymethod.guitars.GuitarFactory;

/**
 * @Author Lucas Favaro
 */

public class FactoryMethodExample {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		BaseGuitarFactory guitarFactory = new GuitarFactory();

		Guitar ibanezGuitar = guitarFactory.createGuitar("Ibanez");
		Guitar fenderGuitar = guitarFactory.createGuitar("Fender");
		Guitar jacksonGuitar = guitarFactory.createGuitar("Jackson");

		ibanezGuitar.play();
		fenderGuitar.play();
		jacksonGuitar.play();

	}

}
