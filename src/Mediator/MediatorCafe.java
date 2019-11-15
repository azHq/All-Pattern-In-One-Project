package Mediator;

import java.util.ArrayList;

public class MediatorCafe{
	
	ArrayList<User> list=new ArrayList<>();
	public void addUser(User user) {
		
		list.add(user);
	}
	
	public void sendMessage(String s,int type) {
		
		for(User user:list) {
			
		
			if(type==2&&user instanceof VillagerUser) {
				user.receiveMessage(s);
				
			}
			else if(type==1&&user instanceof CityUser) {
				user.receiveMessage(s);
				
			}
		}
	}

}
