package DBCache;

import MediaStore_Repository.AudioDB;
import MediaStore_Repository.Helper;

public class DBCacheImpl implements AudioDB {
	
	private AudioDB audioDB;
	
	public void setAudioDB(AudioDB audioDB) {
		Helper.assertNull(this.audioDB);
		this.audioDB = audioDB;
	}
	
	//Implementing queryDB from interface AudioDB
	@Override
	public void queryDB() {
		Helper.assertNotNull(this.audioDB);
		// TODO: Insert code here
	}
	
	//Implementing addFile from interface AudioDB
	@Override
	public void addFile() {
		Helper.assertNotNull(this.audioDB);
		// TODO: Insert code here
	}
}
