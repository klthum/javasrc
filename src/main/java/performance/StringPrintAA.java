public class StringPrintC {
	public static void main(String[] argv) {
		Object o = "Hello World";
		for (int i=0; i<100000; i++) {
			System.out.println(
				new StringBuffer("<p><b>").append(o).append("</b></p>"));
		}
	}
}
