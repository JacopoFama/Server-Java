package javahttpserver;

import java.io.File;
import java.net.Socket;
import javax.xml.bind.annotation.*;

@XmlRootElement
public class Config 
{ 
        @XmlElement
        public File WEB_ROOT = new File(".");
        @XmlElement
	public String DEFAULT_FILE = "index.html";
        @XmlElement
	public String FILE_NOT_FOUND = "404.html";
        @XmlElement
	public String METHOD_NOT_SUPPORTED = "not_supported.html";
	// port to listen connection
        @XmlElement
	public int PORT = 8080;
	
	// verbose mode
        @XmlElement
	public boolean verbose = true;
}
