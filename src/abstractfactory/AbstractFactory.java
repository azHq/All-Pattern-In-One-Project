package abstractfactory;

import generalclasses.Fauna;
import generalclasses.Flora;
import generalclasses.Huts;

public abstract class AbstractFactory {
	
	public abstract Flora getFlora(String type);
	public abstract Fauna getFauna();
	public abstract Huts getHuts(String type);

}
