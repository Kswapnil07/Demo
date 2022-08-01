package Array;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,6,7,8,9,10,11};

	
int cnt=1;
for(int i=0;i<arr.length;) {
	if(arr[i]==cnt) {
		i++;
		cnt++;
	}
	else {
		System.out.println(cnt);
		//cnt=cnt+2;
		cnt++;
	}
}

	}
}