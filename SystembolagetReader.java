import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class SystembolagetReader {
	
	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse("systemet.xml");
			NodeList articleList = doc.getElementsByTagName("artikel");
			ArrayList<Element> beerList = new ArrayList();
			for(int i=0; i<articleList.getLength(); i++) {
				Element article = (Element)articleList.item(i);
				if(article.getAttribute("VaruGrupp").equals("Öl")&& article.getAttribute("Utgått").equals("0"));
					beerList.add(article);
			}
			System.out.println(beerList.size());
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
