import java.util.Scanner;

public class Runner {
	static Scanner sc=new Scanner(System.in);
	static MyArrayStack stack;
	   
public static void main(String [] args) throws StackEmptyException, StackFullException {

    
//    
//	while (true)
//	{
//    System.out.println("Enter your choice");
//    System.out.println("1:create stack");
//    System.out.println("2: push");
//    System.out.println("3:pop");
//    System.out.println("4:top");
//    System.out.println("5:peek");
//    System.out.println("6:exit");
//    int choice=sc.nextInt();
//    switch(choice)
//    {
//    case 1:
//    {
//    	obj=new MyArrayStack();
//    	System.out.println("statck created");
//    	break;
//    }
//    case 2:
//    	System.out.println("enter the number you want to insert");
//    	int num=sc.nextInt();
//    	try
//    	{
//    		obj.push(new MyInteger(num));
//    	}
//    	catch (StackFullException e) 
//    	{
//		System.out.println(e.getMessage());
//    	}
//    	break;
//    case 3:
//    	try
//    	{
//    	System.out.println(obj.pop()+"popped");
//    	}
//    	catch(StackEmptyException e)
//    	{
//    		System.out.println(e.getMessage());
//    	}
//    	break;
//    case 5:
//    	try {
//               System.out.println(obj.peek());
//    	}
//    	catch(StackEmptyException e)
//    	{
//    	   System.out.println(e.getMessage());
//    	}
//    	break;
//    case 6:
//    	sc.close();
//    	System.exit(1);
//    }
//}
	stack=new MyArrayStack();
	try {
		stack.push(0);
	} 
	catch (StackFullException e1) 
	{}
	
	
	int [] stock={100,65,64,70,64,70,90,120};
	Integer[] stockSpan=new Integer[stock.length];
	stockSpan[0]=1;
	
	for(int i=1;i<stock.length;i++)
	{
		
		int h=(int)stack.peek();
		
		while(stock[i]>stock[(int)stack.peek()])
		{
			if(stack.isEmpty())
			{
				h=-1;
				
			}
			stack.pop();
			h=(int) stack.peek();
			
			
		}
		stockSpan[i]=i-h;
		stack.push(i);
		
	}
	
	for(int temp:stockSpan)
	{
		System.out.println(temp);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
