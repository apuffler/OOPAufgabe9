
public class Quadrat extends Form{
	protected int seitenlaenge;
	
	public Quadrat(int hoehe, int seitenlaenge){
		super(hoehe);
		this.seitenlaenge = seitenlaenge;
	}
	
	public int getSeitenlaenge(){
		return this.seitenlaenge;
	}

	@Override
	public boolean fits(Verschenkbar inhalt) {
		Form form = inhalt.getForm();
		int seitenlaenge = this.seitenlaenge;
		if(!super.fits(inhalt))
			return false;
		
		if(inhalt instanceof Schachtel)
			--seitenlaenge;
		
		if(form instanceof Quadrat){
			Quadrat q = (Quadrat)form;
			if(q.getSeitenlaenge() == seitenlaenge)
				return true;
		}
		return false;
	}

	@Override
	public int getFlaecheninhalt() {
		return (this.seitenlaenge + 1) * (this.seitenlaenge + 1);
	}
}
