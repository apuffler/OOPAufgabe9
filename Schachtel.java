
public class Schachtel implements Verschenkbar{
	protected Verschenkbar inhalt;
	protected int hoehe;
	protected Form grundflaeche;
	
	public Schachtel(int hoehe, Form grundflaeche){
		this.inhalt = null;
		this.hoehe = hoehe;
		this.grundflaeche = grundflaeche;
	}
	
	public Verschenkbar getInhalt(){
		return this.inhalt;
	}
	
	public void setInhalt(Verschenkbar geschenk){
		this.inhalt = geschenk;
	}
	
	public int getHoehe(){
		return this.hoehe;
	}
	
	@Override
	public String getName() {
		return this.inhalt.getName();
	}

	@Override
	public Form getForm() {
		return this.grundflaeche;
	}
	
	public int volumen(){
		return this.grundflaeche.getFlaecheninhalt() * (this.hoehe + 1);
	}
}
