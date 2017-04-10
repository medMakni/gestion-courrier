package dao;

import java.util.Map;

import org.apache.chemistry.opencmis.client.api.CmisObject;
import org.apache.chemistry.opencmis.client.api.Folder;
import org.apache.chemistry.opencmis.client.api.ItemIterable;
import org.apache.chemistry.opencmis.client.api.ObjectId;
import org.apache.chemistry.opencmis.client.api.Session;

public interface FolderDao {
	public ItemIterable<CmisObject> getAllChildrens(Folder folder);

	public CmisObject getFolder(String path, Session session);

	public void updateFolder(Folder folder, Map<String, Object> updateProperties);

	public void deleteFolder(Folder folder);
}
