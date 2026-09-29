package reto1;
import java.util.ArrayList;
public class Contenedor<F,S> {
	private ArrayList<Par<F,S>> listaPar;
	
	public Contenedor()
	{
		this.listaPar = new ArrayList<>();
	}
	
	public void agregarPar(F primero, S segundo)
	{
		Par<F, S> nuevoPar = new Par<>(primero, segundo);
		this.listaPar.add(nuevoPar);
	}
	public Par<F,S> obtenerPar(int i)
	{
		return this.listaPar.get(i);
	}
	public ArrayList<Par<F,S>> obtenerTodosLosPares()
	{
		return this.listaPar;
	}
	public void mostrarPares()
	{
		for(Par<F,S> par : this.listaPar )
		{
			System.out.println(par.toString());
		}
	}
	
	
}

