public class FindDuplicates{
	
	// {1, 2, 5, 5, 6, 6, 7, 2};
	/*
		This code works fine when the array contain max duplicate occurance is 2. 
		1==2 , 1==5, 1==5,1==6,1==6,1==7,1==2 // no match i=0,j=1
		2==5,2==5,2==6,2==6,2==7,2==2 ( prints 2) // i=1,j=2
		....
	*/
	
	/*public void findDuplicates(int[] array){
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i] == array[j])
					System.out.println(array[i]);
			}
		}
	} */
	
	// for any given array
	int result[] = new int[1];
	int count =0;
	public int[] findDuplicates(int[] array){
		int[] temp = new int[array.length];
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i] == array[j] && !isContain(temp,array[i])) { // for checking wheather we capture this elemet or not.
					temp[count] = array[i];
					count++;
				}
			}
		}
		System.out.println("count : " + count );
		result = new int[count];
		for(int i=0;i<count;i++){
			result[i] = temp[i];
		}
		return result;
	}
	
	public boolean isContain(int[] a,int value){
		boolean contain = false;
		for(int i=0;i<a.length;i++){
			if(a[i]==value){
				contain=true;
				
			}
		}
		return contain;
	}
	
}