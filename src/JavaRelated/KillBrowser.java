package JavaRelated;

import java.io.IOException;

public class KillBrowser {
	public static void main(String[]args) throws IOException{
		String os = System.getProperty("os.name");
		if(os.contains("Windows")){
			
			Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
			
			Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
		}
	}
}

