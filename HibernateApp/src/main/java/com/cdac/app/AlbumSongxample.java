package com.cdac.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.cdac.dao.AlbumSongDao;
import com.cdac.entity.Album;
import com.cdac.entity.Song;

public class AlbumSongxample {
   public static void main(String args[]){
	 //GenericDao dao = new GenericDao();
	 		AlbumSongDao dao = new AlbumSongDao();
	 		
	 		
			
	 		/*Album album = new Album();
	 		album.setName("Hits of 2021");
	 		album.setReleaseDate(LocalDate.of(2021, 9, 25));
	 		album.setCopyright("Sony Music");*/
	 		
	 		Album album = (Album) dao.fetchById(Album.class, 2);
	 		
			Song song1=new Song();
			song1.setTitle("pqr");
			song1.setArtist("Taylor Swift");
			song1.setDuration(5.15);
			Song song2=new Song();
			song2.setTitle("mno");
			song2.setArtist("Taylor Swift");
			song2.setDuration(4.15);
			//List<Song> list=new ArrayList<Song>();
			//list.add(song1);
			//list.add(song2);
			
			song1.setAlbum(album);
			song2.setAlbum(album);
			dao.save(song1);
			dao.save(song2);
	 		
	 		
	 		//adding song to an album
	 		/*Album album = (Album) dao.fetchById(Album.class, 1);
	 		Song song = new Song();
	 		song.setTitle("pqr");
	 		song.setArtist("Taylor Swift");
	 		song.setDuration(5.15);*/
	 		/*song.setTitle("adt");
	 		song.setArtist("Ed Sheeran");
	 		song.setDuration(4.15);*/
	 		
	 		//song.setAlbum(album);
	 		//dao.save(song);
			/*List<Song> songs=dao.fetchSongsSungBy("Taylor Swift");
			for(Song song:songs)
				System.out.println(song.getTitle()+" "+song.getArtist()+" "+song.getDuration());*/
			Album name=dao.fetchAlbumBy("Taylor Swift");
			System.out.println(name.getName());
   }
}
