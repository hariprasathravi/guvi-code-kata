import java.util.*;
class arraysubset
 {
    public issubset(int arr1[],int arr2[])
     {
       int i = 0;
         int j = 0;
         n=arr2.length;
         m=arr1.length;
         for (i=0; i<n; i++){
         for (j = 0; j<m; j++){
           if(arr2[i] == arr1[j])
              break;
        }
        if (j == m)
           return 0;
    }
    return 1;
}
    public static void main(string args[])
      {
         int arr1[]={11,22,33,66,55}
         int arr2[]={11,66,33}
         if(issubset(arr1,arr2))
          System.out.println("a2 is a subset of a1");
         else
          System.out.println("a2 is not a subset of a1");
       }   
 }        
