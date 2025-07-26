package knife;

import javax.swing.JMenuItem;

import base.FindUrlAction;
import burp.BurpExtender;


public class FindUrlAndRequest extends JMenuItem {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	//JMenuItem vs. JMenu
	public FindUrlAndRequest(BurpExtender burp) {
		this.setText("[批量查找URL并请求]");
		this.addActionListener(new FindUrlAction(burp, burp.invocation));
	}

	public static void main(String[] args) {
		String url = "./abac/aaa.jpg";
		if (url.startsWith("./")) {
			url = url.replaceFirst("\\./", "");
		}
		System.out.println(url);
	}
}
