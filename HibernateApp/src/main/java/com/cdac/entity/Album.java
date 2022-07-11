package com.cdac.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "tbl_album")
public class Album {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int Album_Id;
  private String Name;
  private LocalDate releaseDate;
  private String Copyright;
  @OneToMany(mappedBy="album", cascade = CascadeType.ALL)
  private List<Song> songs;
public int getAlbum_Id() {
	return Album_Id;
}
public void setAlbum_Id(int album_Id) {
	Album_Id = album_Id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public LocalDate getReleaseDate() {
	return releaseDate;
}
public void setReleaseDate(LocalDate releaseDate) {
	this.releaseDate = releaseDate;
}
public String getCopyright() {
	return Copyright;
}
public void setCopyright(String copyright) {
	Copyright = copyright;
}
public List<Song> getSongs() {
	return songs;
}
public void setSongs(List<Song> songs) {
	this.songs = songs;
}
  
}
