package WebGUI;

import MediaStore_Repository.HTTP;
import MediaStore_Repository.MediaStore;
import MediaStore_Repository.Helper;

public class WebGUIImpl implements HTTP {
	
	private MediaStore mediaStore;
	
	public void setMediaStore(MediaStore mediaStore) {
		Helper.assertNull(this.mediaStore);
		this.mediaStore = mediaStore;
	}
	
	//Implementing HTTPDownload from interface HTTP
	@Override
	public void HTTPDownload() {
		Helper.assertNotNull(this.mediaStore);
		// TODO: Insert code here
	}
	
	//Implementing HTTPUpload from interface HTTP
	@Override
	public void HTTPUpload() {
		Helper.assertNotNull(this.mediaStore);
		// TODO: Insert code here
	}
}
