
public class MyArrayStack
{
	public static final int CAPACITY=1024;
	Object [] S;
	int top=-1;
	int cap;
	
	
	public MyArrayStack() {
		this(CAPACITY);
	}
	public MyArrayStack(int cap)
	{
		this.cap=cap;
		S=new Object[cap];
		
	}
	
	
	
	public boolean isEmpty()
	{
		if(top<0)
		{
			return true;
		}
		return false;
	}
	
	
	
	public boolean isFull()
	{
		if (size()==cap)
		{
			return true;
		}
		return false;
	}
	
	
	
	
	public int size()
	{
		return (top+1);
	}
	
	
	
	
	public void push(Object o)throws StackFullException
	{
		if(isFull())
		{
			throw new StackFullException("Stack is full");
			
		}
		else
		{
			S[top+1]=o;
			top=top+1;
//			System.out.println("pushed "+o+" at "+"pos " + (top+1));
		}
		
	}
	
	
	
	
	public Object pop() 
	{
		Object o=null;
		if(isEmpty())
		{
			
		}
		else
		{
			o=S[top];
			S[top]=null;
			top=top-1;
		}
		return o;
	}
	
	public Object peek() throws StackEmptyException
	{
		if(isEmpty())
		{
			throw new StackEmptyException("Empty Stack");
		}
		return S[top];
	}
	
}
