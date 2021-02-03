class GFG{ 
	public static void main(String args[]){
		int []A=new int[8];
		int i=0;
		for(i=-1;i<A.length-1;){
			A[++i]=i;
		}
		String res=""+A[2]+(4%2)+(5%2)+i;
		System.out.print(res);
	}
}
