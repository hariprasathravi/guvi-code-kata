import java.util.*;
class array
{
 public static void main(String args[])
 {
  int arr[]={11,22,44,22,88,11,33,44};
  int index1,index2;
  for(index1=0;index1<arr.length;index1++)
   {
    for(index2=1;index2<arr.length;index2++)
     {
      if(arr[index1]==arr[index2])
       {
        System.out.println(+arr[index1]+",");
        break;
       }
     }
   }
  }
}  
