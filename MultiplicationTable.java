import java.io.*;
class MultiplicationTable
{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
int table,i,n,pro=0;
table=Integer.parseInt(in.readLine());
n=Integer.parseInt(in.readLine());
for(i=1;i<=n;i++)
{
pro=i*table;
System.out.println(i+"*"+table+"="+pro);
}
}
catch(Exception e)
{
}
}
}
