import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

class BinarySearch
{
 /**
 *
 * @author Ravi
 */
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size of The Array:");
		int size=sc.nextInt();					                    //Take Input from The user
		int ar[]=new int[size];					                    //Create The Array of Size Input by the User
		System.out.println("Enter The Sorted Array:");
		for(int i=0;i<ar.length;i++)				                //Take Array Elements
			ar[i]=sc.nextInt();
		System.out.println("Enter The key Element:");
		int key=sc.nextInt();					                      //The Element To be Searched
		
		int index=search(ar,key);				                    //Calling Of Iterative Method search(ar,key) to perform the Searching
		if(index==-1)
			System.out.println("The Key Is Not Found:");
		else
			System.out.println("The Key "+key+" is Found At The Index :"+(index+1));
	}

	static int search(int ar[],int key)				            //Method To implement the Binary Search Logic
	{
		int low=0;
		int high=ar.length-1;
		int mid;
		while(high>low)
		{
			mid=low+(high-low)/2;
			if(ar[mid]==key)
				return mid;
			if(ar[mid]<key)
				low=mid+1;
			if(ar[mid]>key)
				high=mid-1;
		}
		return -1;
	}
}
