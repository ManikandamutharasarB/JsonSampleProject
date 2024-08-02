package org.india;

import org.andrapradesh.AndraPradesh;

public class India extends AndraPradesh{
	public void india() {
		System.out.println("South India");
	}
	
	public static void main(String[] args) {
		India i=new India();
		i.india();
		i.tamil();
		i.telugu();
		i.malayalam();
	}
}
