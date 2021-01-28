public class Counting { 
    void sort(int arr[]) 
    { 
        int n = arr.length; 
        int output[] = new int[n]; 
  
        int count[] = new int[256]; 
        for (int i = 0; i < 256; i++) 
            count[i] = 0; 
  
        for (int i = 0; i < n; i++) 
            ++count[arr[i]]; 
  
        for (int i = 1; i <= 255; i++) 
            count[i] += count[i - 1]; 
  
        for (int i = 0; i < n; i++) { 
            output[count[arr[i]] - 1] = arr[i]; 
            --count[arr[i]]; 
        } 
  
        for (int i = 0; i < n; ++i) 
            arr[i] = output[i]; 
    } 
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
} 