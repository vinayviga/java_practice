package test;

public class SDETCoding4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] source = "tu beer hai BC".split(" ");
		String result = "";
		
		for(int i=source.length-1; i>=0;i--)
		{
			result += source[i]+" ";
		}
		
		System.out.println(result);
		

	}

}
