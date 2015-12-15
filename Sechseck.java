public class Sechseck extends Form{
	protected int kantenlaenge;
	
	public Sechseck(int hoehe, int kantenlaenge){
		super(hoehe);
		this.kantenlaenge = kantenlaenge;
	}
	
	public int getKantenlaenge(){
		return this.kantenlaenge;
	}
	
	@Override
	public boolean fits(Verschenkbar inhalt) {
		Form form = inhalt.getForm();
		int kantenlaenge = this.kantenlaenge;
		
		if(!super.fits(inhalt))
			return false;
		
		if(inhalt instanceof Schachtel)
			--kantenlaenge;
		
		if(form instanceof Kreis){
			Kreis k = (Kreis)form;
			if(k.getRadius() == kantenlaenge)
				return true;
		}else if(form instanceof Rechteck){
			Rechteck q = (Rechteck)form;
			int diagonale1 = kantenlaenge * 2;
			int diagonale2 = (int) (kantenlaenge * Math.sqrt(3));
			if((diagonale1 == q.getLaenge() && diagonale2 == q.getBreite()) || (diagonale1 == q.getBreite() && diagonale2 == q.getLaenge()))
				return true;
		}else if(form instanceof Sechseck){
			Sechseck s = (Sechseck)form;
			if(s.getKantenlaenge() == kantenlaenge)
				return true;
		}
		return false;
	}

	@Override
	public int getFlaecheninhalt() {
		return (int) ((this.kantenlaenge + 1) * 3 / 2 * Math.sqrt(3));
	}
}
