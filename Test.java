/** 
 * Armin Puffler: Verschenkbar.java, Einkaufstasche.java, Test.java
 * Jovan Zivanovic: Form.java, Kreis.java, Quadrat.java, Schachtel.java
 * Stefan Buttenhauser: Sechseck.java, Rechteck.java, SchachtelLager.java, Geschenk.java
 */
public class Test {
	public static void main(String[] args){
		/** Test 1 */
		System.out.println("--- Test 1 ---");
		SchachtelLager sl = new SchachtelLager();
		for (int i = 1; i < 20; i++){
			sl.addSchachtel(new Schachtel(i, new Rechteck(i,i,i)));
			sl.addSchachtel(new Schachtel(i, new Quadrat(i,i)));
			sl.addSchachtel(new Schachtel(i, new Kreis(i,i)));
			sl.addSchachtel(new Schachtel(i, new Sechseck(i,i)));
		}
		Einkaufstasche et = new Einkaufstasche();
		for(int i = 1; i < 20; i++){
			Schachtel h = null;
			Geschenk g1 = new Geschenk(new Rechteck(i,i,i), "Rechteck"+i);
			Geschenk g2 = new Geschenk(new Quadrat(i,i), "Quadrat"+i);
			Geschenk g3 = new Geschenk(new Kreis(i,i), "Kreis"+i);
			Geschenk g4 = new Geschenk(new Sechseck(i,i), "Sechseck"+i);
			h=g1.verpacke(sl);
			if(h == null){
				et.addGeschenk(g1);
			}else{
				et.addGeschenk(h);
			}
			h=g2.verpacke(sl);
			if(h == null){
				et.addGeschenk(g2);
			}else{
				et.addGeschenk(h);
			}
			h=g3.verpacke(sl);
			if(h == null){
				et.addGeschenk(g3);
			}else{
				et.addGeschenk(h);
			}
			h=g4.verpacke(sl);
			if(h == null){
				et.addGeschenk(g4);
			}else{
				et.addGeschenk(h);
			}
		}
		System.out.println("Einkaufstasche Volumen: " + et.volumen());
		et.inhalt();

		/** Test 2 */
		System.out.println("--- Test 2 ---");

		Einkaufstasche et2 = new Einkaufstasche();
		for (int i = 1; i < 3; i++){
			sl.addSchachtel(new Schachtel(i, new Rechteck(i,i,i)));
			sl.addSchachtel(new Schachtel(i, new Kreis(i,i)));
			sl.addSchachtel(new Schachtel(i, new Kreis(i,i)));
			sl.addSchachtel(new Schachtel(i, new Kreis(i,i)));
		}
		for(int i = 1; i < 3; i++){
			Schachtel h = null;
			Geschenk g1 = new Geschenk(new Rechteck(i,i,i), "Rechteck"+i);
			Geschenk g2 = new Geschenk(new Quadrat(i,i), "Quadrat"+i);
			Geschenk g3 = new Geschenk(new Kreis(i,i), "Kreis"+i);
			Geschenk g4 = new Geschenk(new Sechseck(i,i), "Sechseck"+i);
			h=g1.verpacke(sl);
			if(h == null){
				et2.addGeschenk(g1);
			}else{
				et2.addGeschenk(h);
			}
			h=g2.verpacke(sl);
			if(h == null){
				et2.addGeschenk(g2);
			}else{
				et2.addGeschenk(h);
			}
			h=g3.verpacke(sl);
			if(h == null){
				et2.addGeschenk(g3);
			}else{
				et2.addGeschenk(h);
			}
			h=g4.verpacke(sl);
			if(h == null){
				et2.addGeschenk(g4);
			}else{
				et2.addGeschenk(h);
			}
		}

		System.out.println("Einkaufstasche Volumen: " + et.volumen());
		et2.inhalt();

	}
}
