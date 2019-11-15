package Observer;

import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class NoticeAdapter {
	
	public int numOfNotice;
	ArrayList<Subjects> noticeBoard=new ArrayList<Subjects>();
	
	GraphicsContext gc;
	Observer sub;
	public NoticeAdapter(Observer sub,GraphicsContext gc) {
		
		this.sub=sub;
		this.gc=gc;
	}
	
	public void addNoticeBoard(Subjects sub) {
		
		noticeBoard.add(sub);
	}
	
	public void notifyObserver(String s) {
		
		numOfNotice++;
		gc.setFont(Font.font("Droid Sans", FontWeight.BOLD, 15));	
		for(Subjects sub:noticeBoard) {
			
			gc.fillText(s,sub.x+30,sub.y+numOfNotice*20);
			
		}
		sub.notifyTheObserver(s);
	}
	
	public void updateNotice(String s,int num) {
		
		this.numOfNotice=num;
		gc.setFont(Font.font("Droid Sans", FontWeight.BOLD, 15));
		
		for(Subjects sub:noticeBoard) {
			
			gc.fillText(s,sub.x+30,sub.y+numOfNotice*20);	
		}
		
	}
	
	public int getNumOfNotice() {
		return numOfNotice;
	}

	public void setNumOfNotice(int numOfNotice) {
		this.numOfNotice = numOfNotice;
	}

}
