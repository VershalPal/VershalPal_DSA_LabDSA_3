package stackParenthesis;

import java.util.Stack;

public class myStack
{
	public boolean validate(String input)
	{
		Stack<Character> stack=new Stack<>();
		for(char i:input.toCharArray())
		{
			if(i=='{' || i=='[' || i=='(')
			{
				stack.push(i);
				continue;
			}
			
			if(stack.isEmpty())
			return false;
			
			char z;
			switch(i)
			{
				case '}':	z=stack.pop();
							if(z=='(' || z=='[')
							return false;
				break;
				
				case ']':	z=stack.pop();
							if(z=='(' || z=='{')
							return false;
				break;
				
				case ')':	z=stack.pop();
							if(z=='{' || z=='[')
							return false;
				break;
			}
		}
		return(stack.isEmpty());
	}
}