package Observer;

import java.util.ArrayList;

public class Observer {
	ArrayList<Subjects> list=new ArrayList<Subjects>();
	
	public Observer() {
		
	}
	public void addObserver(Subjects ob) {
		
		list.add(ob);
	}
	
	public void notifyTheObserver(String s) {
		
		for(Subjects ob:list) {
			
			ob.notify(s);
		}
	}

}
