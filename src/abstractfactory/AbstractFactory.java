package abstractfactory;

import generalclasses.Fauna;
import generalclasses.Flora;
import generalclasses.Hut;

public abstract class AbstractFactory {
	
	public abstract Flora getFlora();
	public abstract Fauna getFauna();
	public abstract Hut getHuts();

}
