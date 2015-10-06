class Node{
	Node link;
	Object data;
	public Node(Object data){
		this.data=data;
		this.link=null;
	}
}
class Stack{
	Node sp;
	public Stack(){
		sp=null;
	}
	public Object pop()
	{
		Node temp;
		if(sp==null)
			System.out.println("stack empty");
		temp=sp;
		sp=temp.link;
		return temp.data; 
	}
	public void push(Object e){
		Node t=new Node(e);
		t.link=sp;
		sp=t;
		
	}
	public Object top(){
		return sp.data;
	}
	public boolean isEmpty()
	{
		return sp==null;
	}
	
}


public class ReverseStack {

	
	public static void reverse(Stack s)
	{
		Object temp;

		if(s.isEmpty()==false)
		{
			temp=s.pop();
			//using system function call to reverse
			reverse(s);
			insert_at_bottom(s,temp);
			
			
			
		}
	}
	private static void insert_at_bottom(Stack s, Object temp2) {
		Object t;
		if(s.isEmpty())
		{
			s.push(temp2);
		}
		else
		{
			t=s.pop();
			insert_at_bottom(s,temp2);			
			s.push(t);
		}
	}
	public static void main(String args[]){
	
		Stack s = new Stack();
		s.push(9);
		s.push(7);
		s.push('a');
		s.push('g');
		System.out.println(s.top());
		reverse(s);
		System.out.print(s.top());
		
		
		
		
	}
	
	
}
