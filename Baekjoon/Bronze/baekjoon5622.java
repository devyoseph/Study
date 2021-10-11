import java.io.*;
public class Main {
public static void main(String[] args) throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String s = br.readLine();
	   int sum = 0;
	   for(int i =0; i<s.length();i++) {
		   sum += time(s.charAt(i));
	   }
	   System.out.print(sum);
}


public static int time(char s) {
	byte num = (byte)s;
    int time = 0;
	if(num>=65 && num<68) {
		time = 3;
	}
	if(num>=68 && num<71) {
		time = 4;
	}
	if(num>=71 && num<74) {
		time = 5;
	}
	if(num>=74 && num<77) {
		time = 6;
	}
	if(num>=77 && num<80) {
		time = 7;
	}
	if(num>=80 && num<84) {
		time = 8;
	}
	if(num>=84 && num<87) {
		time = 9;
	}
	if(num>=87 && num<=90) {
		time = 10;
	}
	
	return time;
}
}
