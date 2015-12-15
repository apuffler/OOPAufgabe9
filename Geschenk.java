public class Geschenk implements Verschenkbar{
	protected Form grundflaeche;
	protected String name;
	
	public Geschenk(Form grundflaeche, String name){
		this.grundflaeche = grundflaeche;
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public Form getForm() {
		return grundflaeche;
	}
	
	public Schachtel verpacke(SchachtelLager lager){
		Schachtel s = lager.getSchachtel(this);
		if(s != null)
			s.setInhalt(this);
		return s;
	}
}
