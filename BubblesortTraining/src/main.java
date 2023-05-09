
public class main {

	public static void main(String[] args) {
		int[] list = {3,2,4,6,3};
		int[] list2 = {13,2,7,4,43};
		printList(list);
		int[] slistasc = bubbleSortList(list.clone(), "asc");
		printList(slistasc);
		int[] slistdesc = bubbleSortList(list.clone(), "desc");
		printList(slistdesc);
		
		printList(list2);
		int[] slistasc2 = bubbleSortList(list2.clone(), "asc");
		printList(slistasc2);
		int[] slistdesc2 = bubbleSortList(list2.clone(), "desc");
		printList(slistdesc2);
		
		int[] emptylist = {};
		int[] emptylistasc = bubbleSortList(emptylist.clone(), "asc");
		printList(emptylistasc);
	}

	public static int[] bubbleSortList( int[] list, String sortorder) {
		boolean notsorted = true;
		int temp;
		if(list.length>0) {
			while(notsorted) {
				notsorted = false;
				for(int i=0; i<= list.length-2; i++) {
					if(sortorder == "asc") {
						if(list[i]>list[i+1]) {
							temp = list[i];
							list[i] = list[i+1];
							list[i+1] = temp;	
							notsorted = true;
						}	
					}
					else {
						if(list[i]<list[i+1]) {
							temp = list[i];
							list[i] = list[i+1];
							list[i+1] = temp;	
							notsorted = true;
						}
					}
									
				}			
			}
			return list;	
		}
		else {
			int l[] = {0};
			return l;
		}
		
	}
	private static void printList(int[] list) {
		if(list.length>0) {
			for(int l :  list){
				System.out.print(l);
			}
			System.out.println();
		}
	}
}
