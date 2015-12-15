
public abstract class Form{
	protected int hoehe;
	
	public Form(int hoehe){
		this.hoehe = hoehe;
	}
	
	public int getHoehe(){
		return this.hoehe;
	}
	
	public boolean fits(Verschenkbar inhalt){
		int hoehe = this.hoehe;
		if(inhalt instanceof Schachtel)
			--hoehe;
		return inhalt.getForm().getHoehe() == hoehe;
	}

	public abstract int getFlaecheninhalt();
}
