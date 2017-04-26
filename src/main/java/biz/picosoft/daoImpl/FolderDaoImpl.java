package biz.picosoft.daoImpl;

import java.util.Map;

import org.apache.chemistry.opencmis.client.api.CmisObject;
import org.apache.chemistry.opencmis.client.api.Folder;
import org.apache.chemistry.opencmis.client.api.ItemIterable;
import org.apache.chemistry.opencmis.client.api.Session;
import org.apache.chemistry.opencmis.commons.enums.UnfileObject;

import dao.FolderDao;

public class FolderDaoImpl implements FolderDao {

	public ItemIterable<CmisObject> getAllChildrens(Folder folder) {

		ItemIterable<CmisObject> children = folder.getChildren();
		return children;
	}

	public CmisObject getFolder(String path, Session session) {

		CmisObject cmisObject = session.getObjectByPath(path);

		return cmisObject;
	}

	public void updateFolder(Folder folder, Map<String, Object> updateProperties) {

		folder.updateProperties(updateProperties);
	}

	public void deleteFolder(Folder folder) {

		System.out.println("delete the 'ADGFolder1' tree");
		folder.deleteTree(true, UnfileObject.DELETE, true);
	}

}
