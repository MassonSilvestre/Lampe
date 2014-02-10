
/**
 * @author massonfl/silvemax
 *
 */
public class main {
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {

		Lampe maLampe = new Lampe();
		
		maLampe.eteindre();
		System.out.println(maLampe.isEstAllumee());
		System.out.println(maLampe.getPuissance());
		
		maLampe.allumer();
		System.out.println(maLampe.isEstAllumee());
		System.out.println(maLampe.getPuissance());
		
		
	}	
}
