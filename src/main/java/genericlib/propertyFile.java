package genericlib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyFile {
public String gepropertyfiledata(String key) throws IOException
{
	Properties p=new Properties();
	FileInputStream fis=new FileInputStream(AutoConstant.propertyFilePath);
	p.load(fis);
	return p.getProperty(key);
}
}
