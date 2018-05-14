package action;

import servlet.AddInfoServlet;

public class Test {
	public static void main(String[] agrs){
		
		AddInfoServlet ss=new AddInfoServlet();
		String a=ss.addSpecialtyInfo("音乐学院", "bbbbbbb", "aaaaaaa");
		
		System.out.println(a);
		
	}

}
