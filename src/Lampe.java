public class Lampe {
	
	private static final int	PUISSANCE_DEFAUT	= 100;
	private boolean				estAllumee;
	
	private int					puissance;
	
	
	public Lampe() {
		
		this.puissance = PUISSANCE_DEFAUT;
		this.estAllumee = true;
	}
	
	public void allumer() {
		
		this.estAllumee = true;
	}
	
	public void eteindre() {
		this.estAllumee = false;
	}
	
	/**
	 * @param puissance
	 *            the puissance to set
	 */
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	
	/**
	 * @return the puissance
	 */
	public int getPuissance() {
		return this.puissance;
	}
	
	/**
	 * @return the estAllumee
	 */
	public boolean isEstAllumee() {
		return this.estAllumee;
	}	
}
