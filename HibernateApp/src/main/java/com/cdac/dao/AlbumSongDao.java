package com.cdac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cdac.entity.Album;
import com.cdac.entity.Song;

public class AlbumSongDao extends GenericDao {
    public List<Song>fetchSongsSungBy(String artist){
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		try {
			EntityManager em = emf.createEntityManager();
			Query q = em.createQuery("select s from Song s where s.artist = :artist");
			q.setParameter("artist", artist);
			List<Song> list = q.getResultList();
			return list;
		}
		finally {
			emf.close();
		}
    }
    
    public Album fetchAlbumBy(String artist){
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		try {
			EntityManager em = emf.createEntityManager();
			Query q = em.createQuery("select a from Album a join a.songs ss where ss.artist = :artist");
			q.setParameter("artist", artist);
			Album name = (Album) q.getSingleResult();
			return name;
		}
		finally {
			emf.close();
		}
    }
}
