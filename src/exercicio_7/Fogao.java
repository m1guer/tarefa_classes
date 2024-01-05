package exercicio_7;

public class Fogao {
	boolean acender;
	
	public Fogao(boolean acender) {
		this.acender = acender;
	}
	public boolean isAcender() {
		return acender;
	}
	public  int FritarFrango(int qntd) {
		if(acender) {
			System.out.println(qntd + " Franguinnhos frito");
			return qntd;
		}else {
			 System.out.println("Não é possível fritar o frango, o fogão está apagado.");
	            return 0;
		}
	
	
	}
}
