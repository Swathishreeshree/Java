package TheSecretMessageDecoder;

import java.util.Scanner;

public class MsgDeccoderApp {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		MsgDecoder decoder = new MsgDecoder();
		System.out.printf("%d\n",decoder.decodeCharacter(ch));
		System.out.printf("%d",decoder.decodeCharacter('A'));
		sc.close();
	}

}
