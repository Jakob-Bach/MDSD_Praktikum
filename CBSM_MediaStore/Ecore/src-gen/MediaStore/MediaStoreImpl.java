package MediaStore;

import MediaStore_Repository.AudioDB;
import MediaStore_Repository.MediaStore;
import MediaStore_Repository.Helper;

public class MediaStoreImpl implements MediaStore {
	
	private AudioDB audioDB;
	
	public void setAudioDB(AudioDB audioDB) {
		Helper.assertNull(this.audioDB);
		this.audioDB = audioDB;
	}
	
	//Implementing download from interface MediaStore
	@Override
	public void download() {
		Helper.assertNotNull(this.audioDB);
		// TODO: Insert code here
	}
	
	//Implementing upload from interface MediaStore
	@Override
	public void upload() {
		Helper.assertNotNull(this.audioDB);
		// TODO: Insert code here
	}
}
