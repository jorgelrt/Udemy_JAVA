package aplicacao;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.graalvm.compiler.graph.NodeList;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class LeiaXML {

	public static void main(String[] args) {
		
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			//cria o doc
			Document doc = builder.parse("C:\\arquivos\\pessoa.xml");
			//obtendo os nós
			Node listaDePessoas = (Node) doc.getElementsByTagName("pessoa");
		} catch (ParserConfigurationException e) {
			//e.printStackTrace();
			Logger.getLogger(LeiaXML.class.getName()).log(Level.SEVERE, null, e);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
