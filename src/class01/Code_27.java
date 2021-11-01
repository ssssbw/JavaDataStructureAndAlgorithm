package class01;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2021-10-29 19:34
 */
public class Code_27
{
	public static void main(String[] args) {
		int count = 0;
		for (int i = 2;count < 100;i++){
			if (isPrime(i) && isPrime(reverse(i)) && !isPalindrome(i)){
				System.out.print(i + " ");
				count++;
				if (count % 10 == 0)
				{
					System.out.print("\n");
				}
			}
		}
	}
	public static boolean isPalindrome(int number) {
		return reverse(number) == number;
	}
	public static int reverse(int number) {
		int reverseNumber = 0;
		do {
			reverseNumber = reverseNumber * 10 + number % 10;
			number /= 10;
		}while(number > 0);
		return reverseNumber;
	}
	public static boolean isPrime(int number) {
		for(int i = 2;i <= Math.sqrt(number);i++)
		{
			if(number % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
