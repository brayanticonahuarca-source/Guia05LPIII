package reto1;

public class PruebaPar {
	public static void main(String[] args) {
		Par<Double, Boolean> par1 = new Par<>(9.5, true);
        Par<Double, Boolean> par2 = new Par<>(9.5, true);
        Par<Double, Boolean> par3 = new Par<>(4.2, false);
        
        System.out.println("Par A: " + par1);
        System.out.println("Par B: " + par2);
        System.out.println("Par C: " + par3);
       
        System.out.println("-------------------------");
        System.out.println("¿Par A y Par B son iguales? " + par1.esIgual(par2));
        System.out.println("¿Par A y Par C son iguales? " + par2.esIgual(par3));
	}
}
