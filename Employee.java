package com.sreenu.java;
import java.util.ArrayList;
import java.util.*;


public class Employee {
         int ids;
		String names;
		double salarys;
		String locs;
		Employee(int ids,String names,double salarys,String locs)
		{
			this.ids=ids;
			this.names=names;
			this.salarys=salarys;
			this.locs=locs;
		}	
	}
	class Main {

		public static void main(String[] args) {
			
			int[] ids= {101,102,103,104,105};
			String []names= {"sasi","subbu","srinu","malli","harsha"};
			double[] salarys= {10000,20000,30000,40000,50000};
			String[] locs= {"hyd","chennai","mumbai","hyd","pune"};
		 List <Employee> list=new ArrayList<Employee>();
		 for(int i=0;i<=ids.length-1;i++)
		 {
			 Employee e= new Employee(ids[i],names[i],salarys[i],locs[i]);
			 list.add(e);
		 }
		 System.out.println("1.Display");
		 System.out.println("2.employee details with id number");
		 System.out.println("3.employee details belongs to hyd location");
		 System.out.println("4.employee details not belongs to hyd and pune");
		 System.out.println("5.display the name of the employee with id no 104");
		 System.out.println("6.employee details in reverse order");
		 System.out.println("7.employee details whose salry between 30000 and 40000");
		 System.out.println("8.check the employee with name");
		 
		 System.out.println("enter choice");
		 Scanner sc=new Scanner(System.in);
		  int ch=sc.nextInt();
		  if(ch==1)
		  {
		 for(Employee x: list)
		 {
			 System.out.println(x.ids+","+x.names+","+x.salarys+","+x.locs);
		 }
		  }
		  else if(ch==2)
		  {
			  for(int i=0;i<=ids.length-1;i++)
			  {
				 if(ids[i]==103) 
				 {
					 Employee x=list.get(i);
					 System.out.println(x.ids+","+x.names+","+x.salarys+","+x.locs);
					 
				 }
			  }
		  }
		  else if(ch==3)
		  {
			  for(int i=0;i<=ids.length-1;i++)
			  {
				  if(locs[i].equals("hyd"))
				  {
					  Employee x=list.get(i);
					  System.out.println(x.ids+","+x.names+","+x.salarys+","+x.locs);
				  }
			  }
		  

		  }
		else if(ch==4)
		  {
			  for(int i=0;i<=ids.length-1;i++)
			  {
				  if(!(locs[i].equals("hyd")))
				  {
					  Employee x=list.get(i);
					  System.out.println(x.ids+","+x.names+","+x.salarys+","+x.locs);
				  }
			  }
		  }
		else if(ch==5)
		  {
			  for(int i=0;i<=ids.length-1;i++)
			  {
				 if(ids[i]==104) 
				 {
					 Employee x=list.get(i);
					 System.out.println(x.names);
					 
				 }
			  }
		  }
		else if(ch==6)
		  {
			  for(int i=ids.length-1;i>=0;i--)
			  {
				 
			    Employee x=list.get(i);
			    System.out.println(x.ids+","+x.names+","+x.salarys+","+x.locs);
					 
				 
			  }
		  }
		else if(ch==7)
		  {
			  for(int i=0;i<=ids.length-1;i++)
			  {
				 if((salarys[i]>=30000&&salarys[i]<=40000)) 
				 {
					 Employee x=list.get(i);
					 System.out.println(x.ids+","+x.names+","+x.salarys+","+x.locs);
					 
				 }
			  }
		  }
		else if(ch==8)
		  {
			  for(int i=0;i<=ids.length-1;i++)
			  {
				 if(names[i].equals("harsha")) 
				 {
					 Employee x=list.get(i);
					 System.out.println("Employee present");
					 break;
				 }
			  
				 else
				 {
					 System.out.println("not present");		
					 }
				 
			  }
		  }
		else
		{
			System.out.println("not an choice");
			
			
		}
		}
	}
		

