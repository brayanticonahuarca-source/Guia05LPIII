package reto1;
public class Main {
	public static <F, S> void imprimirPar(Par<F, S> par) {
        System.out.println(par.toString());
    }
	public static void main(String[] args) {
		Contenedor<String, Integer> csi = new Contenedor<>();
		Contenedor<Double, Boolean> cdb = new Contenedor<>();
		Contenedor<Persona, Integer> cpi = new Contenedor<>();
		Par<String, Integer> par1 = new Par<>("Hola", 3);
        Par<Double, Boolean> par2 = new Par<>(12.51, false);
        Par<Persona, Integer> par3 = new Par<>(new Persona("Brayan", 18), 1234);
        /*/
        imprimirPar(par1);
        imprimirPar(par2);
        imprimirPar(par3);
        /*/
        //Agregar Par
        csi.agregarPar(par1.getPrimero(), par1.getSegundo());
        csi.agregarPar("Mundo", 4);
        cdb.agregarPar(par2.getPrimero(), par2.getSegundo());
        cpi.agregarPar(par3.getPrimero(), par3.getSegundo());
        //Mostrar Pares
        System.out.println("\nContenedor <String, Integer>:");
        csi.mostrarPares();
        System.out.println("\nContenedor <Double, Boolean>");
        cdb.mostrarPares();
        System.out.println("\nContenedor <Persona, Integer>");
        cpi.mostrarPares();
        //Obtener Par
        System.out.println("Par en csi posicion 1: " + csi.obtenerPar(1));
        System.out.println("Par en cpi posicion 0: " + cpi.obtenerPar(0));
        //Obtener Pares
        System.out.println("Cantidad total de pares en csi: " + csi.obtenerTodosLosPares());
        System.out.println("Cantidad total de pares en cdb: " + cdb.obtenerTodosLosPares());
        System.out.println("Cantidad total de pares en cpi: " + cpi.obtenerTodosLosPares());
	}
}
