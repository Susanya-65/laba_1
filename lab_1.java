import java.io.IOException;

public class lab1_1 {
	public static void main(String[] args) throws IOException {
		String str1="";
		char strIn;
		int i;
		System.out.println("Enter the text. Use \"Space\" as word separator, \".\" as sentence separator, \"!\" in the end of the text.");
		do {
			strIn = (char) System.in.read();
			str1 += strIn;
		} while(strIn != '!');
		char[] strMain = str1.toCharArray();
		int strlen = str1.length();
		
		System.out.print("\nResult: ");
		for(i=0;i<strlen;i++) {
			if((strMain[i]!=32) && (strMain[i]!=33) && (strMain[i]!=46)) {
				if(strMain[i]>='A' && strMain[i]<='Z') {
					System.out.print((int)strMain[i]-64 + " ");
				}
				else {
					System.out.print((int)strMain[i]-96 + " ");
				}
			}
			else {
				System.out.print(strMain[i] + " ");
			}
		}
	}
}