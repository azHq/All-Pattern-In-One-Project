package generalclasses;

import Mediator.MediatorCafe;
import Mediator.User;
import Observer.Observer;

public abstract class Hut {
	
	public void createHut(Observer sub,MediatorCafe mediatorCafe) {
		
		createCityHut();
		createRuralHut(sub,mediatorCafe);
	}
	public abstract void createCityHut();
	
	public abstract void createRuralHut(Observer sub,MediatorCafe mediatorCafe);

}
