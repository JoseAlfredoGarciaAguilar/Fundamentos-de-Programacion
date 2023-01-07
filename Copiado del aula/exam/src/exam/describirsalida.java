package exam;

public class describirsalida {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++){
			System.out.println(i);
			for(int j = i; j >= 1; j-=2)
				System.out.println(j);
		}
	}

}
