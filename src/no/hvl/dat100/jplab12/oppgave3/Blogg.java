package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {

	// TODO: objektvariable 
	private int nesteLedig;
	private Innlegg[] innleggtabell;
	
	public Blogg() {
		this.innleggtabell = new Innlegg[20];
		this.nesteLedig = 0;
		
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		int antall = 0;
		for(Innlegg innlegg : innleggtabell) {
			if (innlegg != null) {
				antall++;
			}
		}
		return antall;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int innleggPos = -1;
		for(int i = 0; i < innleggtabell.length; i++) {
			if(innlegg.erLik(innleggtabell[i])) {
				innleggPos = i;
				break;
			}
		}
		return innleggPos;
		
		
	}

	public boolean finnes(Innlegg innlegg) {
		boolean finnes = false;
		for(Innlegg innleggTab : innleggtabell) {
			if(innleggTab != null && innleggTab.getId() == innlegg.getId()) {
				finnes = true;
				break;
			}
		}
		return finnes;
	}

	public boolean ledigPlass() {
		boolean ledigPlass = false;
		for(Innlegg innlegg : innleggtabell) {
			if(innlegg == null) {
				ledigPlass = true;
				break;
			}
		}
		return ledigPlass;

	}
	
	public boolean leggTil(Innlegg innlegg) {
		
		boolean lagtTil = false;
		if(!finnes(innlegg) && ledigPlass()) {
			innleggtabell[nesteLedig] = innlegg;
			lagtTil = true;
			nesteLedig++;
		}
		return lagtTil;
	}
	
	public String toString() {
		String str = getAntall() + "\n";
		for(Innlegg innlegg : innleggtabell) {
			if(innlegg != null) {
				str = str + innlegg.toString();
			}
		}
		return str;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}