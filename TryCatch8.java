class TryCatch8{
public static void main(String args[]){

try
{
int m=100, n=Integer.parseInt(args[0]);
int k=m/n;
System.out.println("K="+k);
}

catch(ArithmeticException e)
{
System.out.println("Cant divided by zero");
}

catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Invalid array index");
}

catch(NumberFormatException e)
{
System.out.println("Invalid input");
}
System.out.println("After catch");
}
}

/*
O/P:
java TryCatch8
Invalid array index
After catch
*/