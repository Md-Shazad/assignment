package assignment5;


public class Q10 {

	public static void main(String[] args) {
		//repeat
		String str ="Hello !";
		System.out.println(str.repeat(3));
		
		//strip
		String strWithComplexSpace = "\u2005\u2005 This String";
		System.out.println(strWithComplexSpace.strip());
		
		//isBlank
		String strBlank = "\n\u2005  ";
		System.out.println(strBlank.isBlank());
		
		//stripIndent
		
		String loop = "\tfor(int i=0;i<10;i++){\n"
				+"\t\tif(true){\n"
				+"\t\t\tbreak;\n"
				+"\t\t}\n"
				+"\t}";
		System.out.println(loop);
		System.out.println("after stripIndent()\n"+loop.stripIndent());
		
		
		//Translate Escapes 
		System.out.println("\"Can\\n Push me to new line? \"".translateEscapes());
		
		//isEmpty
		System.out.println("\n\u2005  ".isEmpty());
		
		//format
		System.out.println(String.format("Format %s", "Executed"));
		
		//formatted
		System.out.println("Formatted %s".formatted("Executed"));
	}

}
