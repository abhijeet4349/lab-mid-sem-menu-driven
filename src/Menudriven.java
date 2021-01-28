import java.util.Scanner;

public class Menudriven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("::Welcome to Menu driven code::");
        while(true){
			System.out.println("To execute Insersion Sort, Enter value 1");
            System.out.println("To execute LCS, Enter value 2");
            System.out.println("To execute Counting Sort, Enter value 3");
            System.out.println("To execute Mergesort, Enter value 4");
            System.out.println("To execute Quicksort, Enter value 5");
            System.out.println("To execute HeapSort, Enter value 6");
            System.out.println("To execute KMP Algo, Enter value 7");
            System.out.println("To execute Rabin Karp Algo, Enter value 8");
            System.out.println("To execute Linear Search, Enter value 9");
            System.out.println("To execute Binary Search, Enter value 10");
            System.out.println("To execute Insertion in bst, Enter value 11");
			System.out.println("To Exit, Enter value 12");
			
			System.out.println("Enter your choice::");
			int choice = scan.nextInt();
            int arr[]=new int[5];
			switch(choice){


			case 1: System.out.println("Enter array to be sorted");
			for(int i=0;i<5;i++)
			  arr[i]=scan.nextInt(); 
			InsertionSort ob = new InsertionSort();
			ob.sort(arr); 
			System.out.println("Sorted Array");
			ob.printArray(arr);
			break;
			

			case 2:
			lcs lcsobj = new lcs();
			System.out.println("Enter String 1"); 
			String s1 = scan.next(); 
			System.out.println("Enter String 2");
            String s2 = scan.next(); 

            char[] X = s1.toCharArray(); 
            char[] Y = s2.toCharArray(); 
            int m = X.length; 
            int n = Y.length; 
            System.out.println("Length of LCS is"+ " " + lcsobj.lcs1(X, Y, m, n));
			break;


			case 3: System.out.println("Enter array to be sorted");
			for(int i=0;i<5;i++)
			  arr[i]=scan.nextInt(); 
			Counting ob1 = new Counting();
			ob1.sort(arr); 
			System.out.println("Sorted Array");
			ob1.printArray(arr);
			break;
			

			case 4: System.out.println("Enter array to be sorted");
			for(int i=0;i<5;i++)
			  arr[i]=scan.nextInt(); 
			mergesort ob2 = new mergesort();
			ob2.sort(arr, 0, arr.length-1); 
			System.out.println("Sorted Array");
			ob2.printArray(arr);
			break;
			
			
			case 5: System.out.println("Enter array to be sorted");
			for(int i=0;i<5;i++)
			  arr[i]=scan.nextInt(); 
			QuickSort ob3 = new QuickSort();
			ob3.sort(arr, 0, arr.length-1); 
			System.out.println("Sorted Array");
			ob3.printArray(arr);
			break;
			
			case 6: System.out.println("Enter array to be sorted");
			for(int i=0;i<5;i++)
			  arr[i]=scan.nextInt(); 
			HeapSort4 ob4 = new HeapSort4();
			ob4.sort(arr); 
			System.out.println("Sorted Array");
			ob4.printArray(arr);
			break;
			
			case 7:
				Kmp_java kmp = new Kmp_java();
				System.out.println("Enter Text"); 
				String s3 = scan.next(); 
				System.out.println("Enter Pattern");
	            String s4 = scan.next(); 

	            kmp.KMPSearch(s3, s4);
				break;
			
			case 8:
				Rabin_karp rb = new Rabin_karp();
				System.out.println("Enter Text"); 
				String s5 = scan.next(); 
				System.out.println("Enter Pattern");
	            String s6 = scan.next(); 
                int q=101;
	            rb.search(s5, s6, q); 
				break;
				
			case 9:
				    LinearSearch lr=new LinearSearch();
				    System.out.println("Enter array to be searched");
					for(int i=0;i<5;i++)
					  arr[i]=scan.nextInt();
					System.out.println("Enter element to be searched");
					int x=scan.nextInt();
				    int index = lr.search(arr, arr.length, x); 
			        if (index == -1) 
			            System.out.println("Element is not present in the array"); 
			        else
			            System.out.println("Element found at position " + (index+1));
					break;
					
				  case 10:
					  System.out.println("Enter array to be searched");
						for(int i=0;i<5;i++)
						  arr[i]=scan.nextInt();
						int n1=arr.length;
						System.out.println("Enter element to be searched");
						int x1=scan.nextInt();					 
       					BinSearch ob5 = new BinSearch();
						ob5.binarySearch(arr, 0, n1 - 1, x1); 
						ob5.printarray();
                        break;
				  case 11:
					  Insertioninbst tree = new Insertioninbst();
					  System.out.println("Enter number of elements");
					  int x2=scan.nextInt();
					  int n2;
					  for(int i=0;i<x2;i++)
						  {
						  n2=scan.nextInt();
						  tree.insert(n2);
						  }
					  tree.inorder();
					  break;
			case 12: System.out.println("Exiting the application");
			System.exit(0);
			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
			}
        }
	}
}
	