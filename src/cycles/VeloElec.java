package cycles;

public class VeloElec extends Velo {
	private double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
	private double facteurPuissanceMoteur;
	
	public VeloElec(double braquet, double diamRoue, double coupleMoteur) {
		super(braquet, diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	public VeloElec(double diamRoue, double coupleMoteur) {
		super(diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	public VeloElec() {
		super();
		this.facteurPuissanceMoteur = DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public double getDEFAUT_COUPLE_MOTEUR() {
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public void setDEFAUT_COUPLE_MOTEUR(double DEFAUT_COUPLE_MOTEUR) {
		this.DEFAUT_FACTEUR_PUISSANCE_MOTEUR = DEFAUT_COUPLE_MOTEUR;
	}
	
	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}
	
	public void setFacteurPuissanceMoteur(double coupleMoteur) {
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	@Override
	public String toString() {
		return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	@Override
	public double getPuissance(double FrequenceCoupsDePedale) {
		return super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur;
	}
	
	public static void main(String[] args) {
		VeloElec VE1 = new VeloElec(5.0, 6.50, 4.0); 
		System.out.println(VE1.getDEFAUT_COUPLE_MOTEUR());
		VE1.setDEFAUT_COUPLE_MOTEUR(44.55);
		System.out.println(VE1.getFacteurPuissanceMoteur());
		VE1.setFacteurPuissanceMoteur(9.678);
		System.out.println(VE1.toString());
		System.out.println(VE1.getPuissance(10.97));
	}
	
}


