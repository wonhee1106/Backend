package dao;

import java.util.ArrayList;

import dto.MusicDTO;

public class MusicDAO {


	private ArrayList<MusicDTO> musics = new ArrayList<>();


	public void addMusic(MusicDTO music) {
		this.musics.add(music);
	}

	public ArrayList<MusicDTO> getMusics(){
		return this.musics;
	}

	public int getSize() {
		return this.musics.size();
	}
	
	public void delMusic(String id) {
		for(int i=0; i < musics.size();i++) {
			if(musics.get(i).getId() .equals(id)) {
				musics.remove(i);
				break;
			}			
		}		
	}
	public void updateMusic(String id, String title, String singer) {
		for(int i=0; i < musics.size();i++) {
			if(musics.get(i).getId().equals(id)) {
				musics.set(i, new MusicDTO(id, title, singer));
			}
		}
	}
	public ArrayList<MusicDTO> searchByTitle(String title) {
		
		ArrayList<MusicDTO> result = new ArrayList<>();
		for(MusicDTO dto : musics) {
			if(dto.getTitle().contains(title)) {
				result.add(dto);
			}
		}
		return result;
	}
}
