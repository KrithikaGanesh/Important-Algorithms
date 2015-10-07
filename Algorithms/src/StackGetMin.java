class Node1{
	Node link;
	Object data;
	public Node1(Object data){
		this.data=data;
		this.link=null;
	}
}
class Stack2{
	Node sp;
	public Stack2(){
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

class minStack{
	Node sp;
	public minStack(){
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

public class StackGetMin{
	Stack2 s= new Stack2();
	minStack ms=new minStack();
	public void push(int e)
	{
		s.push(e);
		if(ms.isEmpty()||(Integer)ms.top()>e){
			ms.push(e);
		}
		else
		{
			ms.push(ms.top());
		}
	}
	public Object pop()
	{
		if(s.isEmpty()) return null;
		ms.pop();
		return s.pop();
	}
	public Object getmin()
	{
		return ms.top();
	}
	public static void main(String args[])
	{
		StackGetMin st=new StackGetMin();
		st.push(6);
		st.push(1);
		st.push(3);
		System.out.println("min: "+st.getmin());
	}
}