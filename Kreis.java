
public class Kreis extends Form{
	protected int radius;
	
	public Kreis(int hoehe, int radius) {
		super(hoehe);
		this.radius = radius;
	}
	
	public int getRadius(){
		return this.radius;
	}

	@Override
	public boolean fits(Verschenkbar inhalt) {
		Form form = inhalt.getForm();
		int radius = this.radius;
		
		if(!super.fits(inhalt))
			return false;
		
		if(inhalt instanceof Schachtel)
			--radius;
		
		if(form instanceof Kreis){
			Kreis k = (Kreis)form;
			if(k.getRadius() == radius)
				return true;
		}else if(form instanceof Quadrat){
			Quadrat q = (Quadrat)form;
			if(q.getSeitenlaenge() == 2*radius)
				return true;
		}else if(form instanceof Sechseck){
			Sechseck s = (Sechseck)form;
			int innkreisR = (int) (s.getKantenlaenge() * Math.sqrt(3) / 2);
			if(innkreisR == radius)
				return true;
		}
		return false;
	}

	@Override
	public int getFlaecheninhalt() {
		return (int) (Math.pow(this.radius + 1, 2) * Math.PI);
	}
}
