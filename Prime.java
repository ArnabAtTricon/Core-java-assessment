

public class Prime {

	public static void main(String[] args) {	

		 int a[]={13,11,7,17,23,51,99};
		 Prime ob = new Prime();
		 
		 ob.isPrime(a); 
		 
	}
		 

	

	public static void isPrime(int a[]) {
		
		for(int i=0;i<a.length;i++) {
			
			int t = 0;
			int n=a[i];
			
			for(int j=2;j*j<n;j++) {
				if(n%j == 0) {
					t=1;
					break;
				}
					
			}
			
			if(t==1) {
				
				int l = 0;
				int s=0;
			
		    while(n != 0) {
				
				s= s + (n%10);
				n=n/10;
				
			}
			
			
			for(int j=2;j*j<s;j++) {
				if(s%j == 0)
					l=1;
					break;
			}
			
			if (l==0)
				System.out.print(a[i]+",");
		}
	}
}
}
