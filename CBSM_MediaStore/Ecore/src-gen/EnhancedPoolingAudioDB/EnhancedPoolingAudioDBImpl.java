package EnhancedPoolingAudioDB;

import MediaStore_Repository.EnhancedAudioDB;
import MediaStore_Repository.Sound;
import MediaStore_Repository.Helper;

public class EnhancedPoolingAudioDBImpl implements EnhancedAudioDB {
	
	private Sound sound;
	
	public void setSound(Sound sound) {
		Helper.assertNull(this.sound);
		this.sound = sound;
	}
	
	//Implementing removeFile from interface EnhancedAudioDB
	@Override
	public boolean removeFile(Object file) {
		Helper.assertNotNull(this.sound);
		// TODO: Insert code here
		return false;
	}
	
	//Implementing queryDB from interface AudioDB
	@Override
	public void queryDB() {
		Helper.assertNotNull(this.sound);
		// TODO: Insert code here
	}
	
	//Implementing addFile from interface AudioDB
	@Override
	public void addFile() {
		Helper.assertNotNull(this.sound);
		// TODO: Insert code here
	}
}
