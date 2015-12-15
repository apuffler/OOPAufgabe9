import java.util.LinkedList;

public class SchachtelLager {
	private LinkedList<Schachtel> schachteln;
	
	public SchachtelLager(){
		this.schachteln = new LinkedList<Schachtel>();
	}
	
	public void addSchachtel(Schachtel schachtel){
		this.schachteln.add(schachtel);
	}
	
	public Schachtel getSchachtel(Verschenkbar inhalt){
		for(Schachtel s : this.schachteln){
			if(inhalt.getForm().fits(s)){
				this.schachteln.remove(s);
				return s;
			}
		}
		return null;
	}
}
