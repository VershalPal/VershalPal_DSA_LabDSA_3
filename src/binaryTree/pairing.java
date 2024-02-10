package binaryTree;

public class pairing
{
	private node one;
	private node two;
	
	public node getOne()
	{
		return one;
	}
	
	public void setOne(node one)
	{
		this.one=one;
	}
	
	public node getTwo()
	{
		return two;
	}
	
	public void setTwo(node two)
	{
		this.two=two;
	}
	
	@Override
	public String toString()
	{
		return "(" + this.getOne().getData() + ","+ this.getTwo().getData() + ") ";
	}
	
	public pairing()
	{
		super();
	}
	
	public pairing(node one, node two)
	{
		super();
		this.one=one;
		this.two=two;
	}
	
	static pairing of(node one, node two)
	{
		return new pairing(one, two); 
	}
	
    @Override
    public boolean equals(Object object)
    { 
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        pairing pair = (pairing) object;
        return (one == pair.one && two == pair.two) || (one == pair.two && two == pair.one);
    }
}