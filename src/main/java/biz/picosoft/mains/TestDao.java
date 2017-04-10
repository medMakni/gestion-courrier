package biz.picosoft.mains;

import java.util.ArrayList;
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
import org.apache.chemistry.opencmis.commons.data.Ace;
import org.apache.chemistry.opencmis.commons.enums.AclPropagation;
import org.apache.chemistry.opencmis.commons.enums.Action;
import org.apache.chemistry.opencmis.commons.enums.BindingType;

import biz.picosoft.daoImpl.FolderDaoImpl;

public class TestDao {
public static void main(String[] args) {
	
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
	Folder root = session.getRootFolder();
	FolderDaoImpl folderDaoImpl=new FolderDaoImpl();
	ItemIterable<CmisObject>  list=folderDaoImpl.getAllChildrens(root);
	  for (CmisObject o : list) {
          System.out.println(o.getName());
      }
	
	
	
}
}
