package client;

public class Demo {

	public static void main(String Args[]) {
		//int N=4;
		//int A[] = {-1,0,-1,-1}; 6+0+0+6 = 12
		
		int N =5;
				  2	, -1, -1, -1, 2
		int A[] = {2, 1, -1, -1, 2}; //2+1+1+2+2 = 8

		int result = solve(N, A);
		System.out.println(result);

	}

	static int solve(int N, int[] A) {
		int result = 0;
		int noBall = 0;
		int lastSuccessBall = 0;
		int illegalBal = 0;
		int correctBall = 0;
		for(int i=0; i<N;i++) {
			if(A[i] != -1) {
				result = result+A[i];
				lastSuccessBall = i;
			}else {
				if(lastSuccessBall == 0 || lastSuccessBall<noBall) {
					result = result + 6;
				}
				if(lastSuccessBall-noBall > 0) {
					result = result + A[lastSuccessBall-noBall];
					
				}
				noBall=noBall+1;
			}
		}
		return result;

	}

}
