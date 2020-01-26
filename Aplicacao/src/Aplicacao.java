
public class Aplicacao {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Bruno";	
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Monica";
	
		
		p1.receber(13);
		p2.receber(20);
		
		p2.dar(5, p1);
		
		System.out.println(p1.nome + " tem " + p1.numFigurinhas + " figurinhas!");
		System.out.println(p2.nome + " tem " + p2.numFigurinhas + " figurinhas!");
		
	}

}
