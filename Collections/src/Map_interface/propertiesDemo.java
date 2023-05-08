
package Map_interface;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    Properties p=new Properties();
    FileInputStream fis=new  FileInputStream("\\Users\\JOTHIKA\\eclipse-workspace\\Collections\\src\\Map_interface\\txt.property");
    p.load(fis);
    System.out.println(p);
    String s=p.getProperty("briyani");
    System.out.println(s);
    p.setProperty("briyani", "190");
    FileOutputStream fos=new  FileOutputStream("\\Users\\JOTHIKA\\eclipse-workspace\\Collections\\src\\Map_interface\\txt.property");
    p.store(fos,"Updated file");

	}

}
