import java.util.*;  

public class StackPushPopExample   
{  
 public static void main(String args[])   
 {  
 //creating an object of stack
 Stack <Integer> stk = new Stack<>();
  
 System.out.print("stack: " + stk);
  
 //pushing elements into the stack  
 pushelmnt(stk, 20);  
 pushelmnt(stk, 13);  
 pushelmnt(stk, 89);  
 pushelmnt(stk, 90);  
 pushelmnt(stk, 11);  
 pushelmnt(stk, 45);  
 pushelmnt(stk, 18);  
 popelmnt(stk);  
 popelmnt(stk); 
  
 try   
 {  
  popelmnt(stk);  
 }   
 catch (EmptyStackException e)   
 {  
  System.out.print("empty stack");  
 }  
}  

static void pushelmnt(Stack stk, int x)   
{  
 //invoking push()     
 stk.push(new Integer(x));  
 System.out.print("push -> " + x);
 
 //prints modified stack  
 System.out.println("stack: " + stk);  
 }
 
 //performing pop operation  
 static void popelmnt(Stack stk)   
 {  
  System.out.print("pop -> ");  
 //invoking pop() method   
 Integer x = (Integer) stk.pop();  
 System.out.print(x);   
 System.out.println("stack: " + stk);  
 }  
}

//end

