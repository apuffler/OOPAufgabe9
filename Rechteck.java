
public class Rechteck extends Form{
	protected int laenge;
	protected int breite;
	
	public Rechteck(int hoehe, int laenge, int breite) {
		super(hoehe);
		this.laenge = laenge;
		this.breite = breite;
	}
	
	public int getBreite(){
		return this.breite;
	}
	
	public int getLaenge(){
		return this.laenge;
	}
	
	@Override
	public boolean fits(Verschenkbar inhalt) {
		int breite = this.breite;
		int laenge = this.laenge;
		Form form = inhalt.getForm();
		
		if(!super.fits(inhalt))
			return false;
		
		if(inhalt instanceof Schachtel){
			--breite;
			--laenge;
		}
		
		if(form instanceof Rechteck){
			Rechteck r = (Rechteck)form;
			if(r.getLaenge() == laenge && r.getBreite() == breite)
				return true;
		}
			
		return false;
	}

	@Override
	public int getFlaecheninhalt() {
		return (this.laenge + 1) * (this.breite + 1);
	}
}
