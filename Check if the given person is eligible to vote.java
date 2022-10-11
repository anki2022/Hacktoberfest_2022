import java.util.*;
class Prime{
void generatePrime(int n){
System.out.println("The prime numbers sequence from 1 to "+n+" is");
for(int i=1;i<n;i++){
int flag=1;
for (int j=2;j<=Math.sqrt(i);j++){
if(i%j==0){
flag=0;
break;
}
}
if(flag==1){
System.out.print(i+" ");
}
}
System.out.println("\n");
}
}
class Thread1 extends Thread{
Prime p;
Thread1(Prime p){
this.p=p;
}
public void run(){
synchronized (p){
p.generatePrime(25);
}
}
}
class Table{
void printTable(){
System.out.println("The Multiplication table of 11 is");
for(int i=1 ;i<10;i++){
System.out.println("11*"+i+" = "+11*i);
}
System.out.println("\n");
}
}
class Thread2 extends Thread{
Table t;
Thread2(Table t){
this.t=t;
}
public void run(){
synchronized (t){
t.printTable();
}
}
}
class Series{
void getSeries(int n){
System.out.println("The Series till "+n+"th place is: ");
int f=3;
int d=1;
for (int i=1;i<n;i++){
System.out.print(f*d+" ");
f=f*d;
d++;
}
System.out.println("\n");
}
}
class Thread3 extends Thread{
Series s;
Thread3(Series s){
this.s=s;
}
public void run(){
synchronized(s){
s.getSeries(8);
}
}
}
public class syncDisp1050{
public static void main(){
Prime p=new Prime();
Table t=new Table();
Series s=new Series();
Thread1 th1=new Thread1(p);
Thread2 th2=new Thread2(t);
Thread3 th3=new Thread3(s);
Thread t1=new Thread(th1);
Thread t2=new Thread(th2);
Thread t3=new Thread(th3);
t1.start();
t2.start();
t3.start();
t1.setPriority(1);
t2.setPriority(5);
t3.setPriority(7);
}
}
