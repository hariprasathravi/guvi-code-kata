import java.util.*;
public class nearzero
 {
  public static void main(String args[])
   {
    int arr[]={-1,-3,-4,9,7,5,8};
    int index,index1,sum=0,fstele=0,scndele=0,start=1;
    for(index=0;index<arr.length;index++)
     {
    for(index1=0;index1<arr.length;index1++)
      {
         	if(index!=index1)
       		{
        			if(start==1)
        			 {
          				fstele=arr[index];
          				scndele=arr[index1];
          				sum=fstele+scndele;
									start=-1;
         				}
        		  else
         				{
         					 if(arr[index]+arr[index1]<sum)
          					 {
          							 	fstele=arr[index];
          								scndele=arr[index1];
           								sum=fstele+scndele;
          					 }
         				} 
       	  }
       } 
      }
			System.out.println(+fstele+"+"+scndele);
		}	
  }   
