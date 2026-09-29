package reto1;

public class Par<F,S>  {
	private F primero;
	private S segundo;
	public Par(F primero, S segundo)
	{
		this.primero = primero;
		this.segundo = segundo;
	}
	public F getPrimero()
	{
		return this.primero;
	}
	public S getSegundo()
	{
		return this.segundo;
	}
	public void setPrimero(F first)
	{
		this.primero = first;
	}
	public void setSegundo(S second)
	{
		this.segundo = second;
	}
	@Override
	public String toString()
	{
		return "(Primero:"+this.primero+" ,Segundo:"+this.segundo+").";
	}
	
	public boolean esIgual(Par<F,S> otro)
	{
		if (otro == null) {
            return false;
        }
        boolean primeroEsIgual = false;
        if (this.primero != null) {
            primeroEsIgual = this.primero.equals(otro.getPrimero());
        } else {
            primeroEsIgual = (otro.getPrimero() == null);
        }
        boolean segundoEsIgual = false;
        if (this.segundo != null) {
            segundoEsIgual = this.segundo.equals(otro.getSegundo());
        } else {
            segundoEsIgual = (otro.getSegundo() == null);
        }
        return primeroEsIgual && segundoEsIgual;
	}
}
