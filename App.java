public class App {
	public static void main(String[] args){
		FindDuplicates fd = new FindDuplicates();
		int a[]  ={1, 2, 5, 5, 6, 6, 7, 2,2,0,8,8};
		int[] result = fd.findDuplicates(a);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}
}