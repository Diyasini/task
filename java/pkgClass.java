


package pkgTwo; import pkgOne.i1;

class pkgClass implements i1
{
@Override
public void print1()
{
System.out.println("Print 1\n");
}
public void print2()
{
System.out.println("Print 2\n");
}
public void print3()
{
System.out.println("Print 3\n");
}
}

class Main {
 
public static void main(String[] args) { pkgClass o1=new pkgClass();
o1.print1();	o1.print2(); o1.print3();
}
}
