import java.util.LinkedList;

public class Einkaufstasche {
	private LinkedList<Verschenkbar> inhalt;
	
	public Einkaufstasche() {
		this.inhalt = new LinkedList<Verschenkbar>();
	}
	
	public int volumen(){
		int volumen = 0;
		for(Verschenkbar v : this.inhalt){
			if(v instanceof Schachtel){
				Schachtel s = (Schachtel)v;
				volumen += s.volumen();
			}
		}
		return volumen;
	}
	
	public void inhalt(){
		for(Verschenkbar v : this.inhalt){
			System.out.println(v.getName());
		}
	}
	
	public void addGeschenk(Verschenkbar inhalt){
		this.inhalt.add(inhalt);
	}
}
