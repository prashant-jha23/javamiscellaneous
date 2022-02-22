package javamiscellaneous;

public class Reverse {

	public static void main(String[] args) {
		String str= "We are learning java";
		String rev=" ";
		String[] arr=str.split(" ");
		String reverse="";
		for(String word:arr) 
		{
			
	
		for(int i=word.length()-1;i>=0;i--) {
				reverse=reverse+word.charAt(i);
				
			}
		}System.out.println(reverse);
		 
	}

}
