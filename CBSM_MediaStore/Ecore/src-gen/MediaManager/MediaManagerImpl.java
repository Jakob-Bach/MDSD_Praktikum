package MediaManager;

import MediaStore_Repository.AudioDB;
import MediaStore_Repository.MediaStore;
import MediaStore_Repository.Sound;
import MediaStore_Repository.Helper;

public class MediaManagerImpl implements MediaStore {
	
	private AudioDB audioDB;
	private Sound sound;
	
	public void setAudioDB(AudioDB audioDB) {
		Helper.assertNull(this.audioDB);
		this.audioDB = audioDB;
	}
	
	public void setSound(Sound sound) {
		Helper.assertNull(this.sound);
		this.sound = sound;
	}
	
	//Implementing download from interface MediaStore
	@Override
	public void download() {
		Helper.assertNotNull(this.audioDB);
		Helper.assertNotNull(this.sound);
		// TODO: Insert code here
	}
	
	//Implementing upload from interface MediaStore
	@Override
	public void upload() {
		Helper.assertNotNull(this.audioDB);
		Helper.assertNotNull(this.sound);
		// TODO: Insert code here
	}
}
