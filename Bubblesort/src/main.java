
public class main {

	public static void main(String[] args) {
		int list[] = {2,5,1,9,0,10,11,3,4,7};
		
		System.out.println("Unsorted list: ");
		printList(list);
		printList(bubbleSort(list.clone()));
		char[] listt = {'a','d','f'};
		System.out.println(findElement(listt, 'a'));
		System.out.println(findElement(listt, 'y'));
		}
	
	public static int[] bubbleSort(int[] list) {
		boolean swapped = true;
		while(swapped) {
			swapped = false;
			for(int i=0;i<=list.length-2;i++) {
				if(list[i] > list[i+1]) {
					int temp = list[i+1];
					list[i+1] = list[i];
					list[i] = temp;
					swapped = true;
				}
			}	
		}
		return list;
	}
	
	private static boolean findElement(char list[], char element) {
		for(int i = 0; i < list.length - 1; i++) {
			if(list[i] == element) {
				return true;
			}
		}
		return false;
	}
	
	public static void printList(int[] list) {
		if(list.length>0) {
			for(int l :  list){
				System.out.print(l);
			}
			System.out.println();
		}
	}
}
