public class ClassementV2 {

	public static void main(String[] args) {

		int tab[] = {3,2,8,7,10,5,4,8,5,7,3,11};

		for (int i=0 ; i<tab.length ; i++) {
			if (tab[i] % 2 == 0) {
				for (int j=i ; j<tab.length ; j++) {
					if (tab[j] % 2 != 0) {
						int a = tab[i];
						tab[i] = tab[j];
						tab[j]=a;
					}else { continue; }
				}
			}else { continue;}
		}
		
		
		for (int k=0 ; k<tab.length ; k++) {
			System.out.print(tab[k] + " ");
		}








	}

}