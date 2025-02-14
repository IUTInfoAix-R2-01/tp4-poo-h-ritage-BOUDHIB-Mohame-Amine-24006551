package cycles;

import java.util.Random;

public class Velo {
	private double DEFAUT_BRAQUET = 13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea = new Random();
	
	public double getDEFAUT_BRAQUET() {
		return DEFAUT_BRAQUET;
	}
	
	public void setDEFAUT_BRAQUET(double dEFAUT_BRAQUET) {
		this.DEFAUT_BRAQUET = dEFAUT_BRAQUET;
	}
	
	public Velo(double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
	}
	
	public Velo(double braquet) {
		this.braquet = braquet;
	}
	
	public Velo() {
		braquet = DEFAUT_BRAQUET;
	}
	
	public Random getGenAlea() {
		return genAlea;
	}
	
	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}
	
	public double getBraquet() {
		return braquet;
	}
	
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}
	
	public double getDiamRoue() {
		return diamRoue;
	}
	
	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}
	@Override
	public String toString() {
		return "Velo[braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
	}
	public double getPuissance(double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale * braquet * diamRoue * genAlea.nextDouble();
	}
	
	public static void main(String[] args) {
		Velo V1 = new Velo(5.0, 6.50); 
//		Velo V2 = new Velo(5.0);
//		Velo V3 = new Velo();
		Random r = new Random();
		System.out.println(V1.getDEFAUT_BRAQUET());
		V1.setDEFAUT_BRAQUET(9.765);
		V1.setGenAlea(r);
		System.out.println(V1.toString());
		System.out.println(V1.getGenAlea().nextDouble());
		System.out.println(V1.getBraquet());
		V1.setBraquet(7.26);
		System.out.println(V1.getDiamRoue());
		V1.setDiamRoue(8.79);
		System.out.println(V1.toString());
		System.out.println(V1.getPuissance(10.76));
		
		//System.out.println(V2.getDEFAUT_BRAQUET());
//		V2.setDEFAUT_BRAQUET(9.765);
//		System.out.println(V2.toString());
//		System.out.println(V2.getGenAlea().nextDouble());
//		V2.setGenAlea(r);
//		System.out.println(V2.getBraquet());
//		V1.setBraquet(7.26);
//		System.out.println(V2.getDiamRoue());
//		V1.setDiamRoue(8.79);
//		System.out.println(V2.toString());
//		System.out.println(V2.getPuissance(10.76));
//		
//		System.out.println(V3.getDEFAUT_BRAQUET());
//		V3.setDEFAUT_BRAQUET(9.765);
//		System.out.println(V3.toString());
//		System.out.println(V3.getGenAlea().nextDouble());
//		V3.setGenAlea(r);
//		System.out.println(V3.getBraquet());
//		V3.setBraquet(7.26);
//		System.out.println(V3.getDiamRoue());
//		V3.setDiamRoue(8.79);
//		System.out.println(V3.toString());
//		System.out.println(V3.getPuissance(10.76));
		
	}
}
