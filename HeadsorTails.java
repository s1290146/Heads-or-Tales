class HeadsorTails {

    public static void main(String args[]){

	int N;
	int k;
	int c=0;
	int c1=0;
	
	System.out.println("Tossing a coin...");
	for(int i=0;i<3;i++){
	    k=i+1;
	    N=(int)(Math.random()*2);
	    System.out.print("Round "+k+": ");
	    if(N==0){
		System.out.println("Heads");
		c++;
	    }
	    if (N==1){
		System.out.println("Tails");
		c1++;
		
	    }
	}
	
	System.out.println("Heads: "+c+", Tails: "+c1);
    }
}
