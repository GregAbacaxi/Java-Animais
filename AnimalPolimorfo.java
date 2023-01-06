import javax.swing.JOptionPane;
public class AnimalPolimorfo {
	public static void main(String args[]){
		Animal animal = null;
		int tipo = Integer.parseInt(
			JOptionPane.showInputDialog("Forneça um número de 1 a 3"));
		switch (tipo) {
			case 1:
				animal = new Cachorro();
				break;
			case 2:
				animal = new Cavalo();
				break;
			case 3:
				animal = new Preguica();
				break;
			default: {
				System.out.println("tipo desconhecido");
				System.exit(0); 
			}
		}
		System.out.println(animal.emiteSom(animal.getClasse()));
        try { Thread.sleep (5000); } catch (InterruptedException ex) {}
	}
}