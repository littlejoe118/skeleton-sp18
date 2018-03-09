public class HelloNumbers{
	public static void main(String[] args) {
		int x = 0;
		int count = 0;
		while(count < 10)
		{
			System.out.print(x + " ");
			++count;
			x = x + count;
		}
	}
}