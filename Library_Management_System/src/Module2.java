
public class Module2 {
	
	
	
     public void maths() {
		
		String chem[]= {"Algebra", "Real Analysis", "probability Theory",};
		
        for (int i=0; i< chem.length;i++) {
			
			System.out.println(chem[i]);
			
		}
	}

	
	
	
	public void computerscience() {
		System.out.println("");
		
		String phy[]= {"C","C++","Python","Asp.Net","Java"};
		
		System.out.println("The books available in Computer Science department are as follow:");
		
		for(int j=0; j<phy.length;j++) {
			
			System.out.println(phy[j]);
			
		}
	}
	
	public void chemistry() {
		
		String chem[]= {"Organic chemistry", "Physical chemistry", "Bio chemistry", "Inorganic chemistry"};
		
        for (int i=0; i< chem.length;i++) {
			
			System.out.println(chem[i]);
			
		}
	}
}
