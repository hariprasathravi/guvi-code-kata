import java.util.*;
public class unique
{
 public static void main(String args[])
  {
   int arr[]={1,2,3,4,4,5,3,2,1};
   int index1=0,index2,count=0;
   for(index1=0;index1<arr.length;index1++,count=0)
    {
     for(index2=0;index2<arr.length;index2++)
      {
       if(arr[index1]==arr[index2])
        count=count+1;
      }  
     if(count<2)
     System.out.println(+arr[index1]);
    } 
  }
} 
