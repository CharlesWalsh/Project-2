
public interface BalanceTree <E extends Comparable <E>>
{
	
	public void insert (E item);
	public E find (E item);
	public void delete (E items);
	public void printInorder();
	public boolean wellFormed();
	
}
