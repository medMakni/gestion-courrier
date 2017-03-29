package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.chemistry.opencmis.client.api.CmisObject;
import org.apache.chemistry.opencmis.client.api.Folder;
import org.apache.chemistry.opencmis.client.api.ItemIterable;
import org.apache.chemistry.opencmis.client.api.Repository;
import org.apache.chemistry.opencmis.client.api.Session;
import org.apache.chemistry.opencmis.client.api.SessionFactory;
import org.apache.chemistry.opencmis.client.runtime.SessionFactoryImpl;
import org.apache.chemistry.opencmis.commons.PropertyIds;
import org.apache.chemistry.opencmis.commons.SessionParameter;
import org.apache.chemistry.opencmis.commons.enums.BindingType;
 
public class Test {
	public static void main(String args[]){
		Map<String, String> parameter = new HashMap<String, String>();
		 
		// user credentials
		parameter.put(SessionParameter.USER, "admin");
		parameter.put(SessionParameter.PASSWORD, "admin");

		// connection settings
		parameter.put(SessionParameter.ATOMPUB_URL, "http://localhost:8080/alfresco/cmisatom");
		 parameter.put(SessionParameter.BINDING_TYPE,
	                BindingType.ATOMPUB.value());

		// set the alfresco object factory
		parameter.put(SessionParameter.OBJECT_FACTORY_CLASS, "org.alfresco.cmis.client.impl.AlfrescoObjectFactoryImpl");

		// create session
		SessionFactory factory = SessionFactoryImpl.newInstance();
		Session session = factory.getRepositories(parameter).get(0).createSession();
		List<Repository> repositories = factory.getRepositories(parameter);
		for (Repository r : repositories) {
		    System.out.println("Found repository: " + r.getName());
		    System.out.println("teeeeeeeeeees");
		}
		Repository repository = repositories.get(0);


		System.out.println("Got a connection to repository: " 
		    + repository.getName() + ", with id: "
		    + repository.getId());
		Folder root = session.getRootFolder();
		ItemIterable<CmisObject> children = root.getChildren();

		System.out.println("Found the following objects in the root folder:-");
		for (CmisObject o : children) {
		    System.out.println(o.getName() + " which is of type " + o.getType().getDisplayName());
		}
		
		System.out.println("Creating 'ADGNewFolder' in the root folder");
		Map<String, String> newFolderProps = new HashMap<String, String>();
		newFolderProps.put(PropertyIds.OBJECT_TYPE_ID, "cmis:folder");
		newFolderProps.put(PropertyIds.NAME, "ADGNewFolder");

		Folder newFolder = root.createFolder(newFolderProps);

		// Did it work?
	 
		System.out.println("Now finding the following objects in the root folder:-");
		for (CmisObject o : children) {
		    System.out.println(o.getName());
		}
	}

}
