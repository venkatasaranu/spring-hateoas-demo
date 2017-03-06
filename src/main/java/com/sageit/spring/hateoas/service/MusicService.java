package com.sageit.spring.hateoas.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

import com.sageit.spring.hateoas.domain.Album;
import com.sageit.spring.hateoas.domain.Artist;


@Service
public class MusicService {

	private Map<String, Album> albums;
	private Map<String, Artist> artists;

	
	public MusicService() {

		albums = new HashMap<String, Album>();
		artists = new HashMap<String, Artist>();
		
		Artist artist1 = new Artist("balu", "S. P. Balasubrahmanyam","Male",70);
		Artist artist2 = new Artist("chitra", "Krishnan Nair Shantakumari Chithra","Female",53);
		Artist artist3 = new Artist("mano", "Nagoor Babu","Male",52);
		Artist artist4 = new Artist("janaki", "S. Janaki","Female",78);
		artists.put(artist1.getId(), artist1);
		artists.put(artist2.getId(), artist2);
		artists.put(artist3.getId(), artist3);
		artists.put(artist4.getId(), artist4);
		
		
		Album album1 = new Album("1", "Geethanjali", "balu", 2);
		Album album2 = new Album("2", "Roja", "chitra", 3);
		Album album3 = new Album("3", "Gokulamlo Seetha", "mano", 0);
		Album album4 = new Album("4", "Anthapuram", "janaki", 1);
		albums.put(album1.getId(), album1);
		albums.put(album2.getId(), album2);
		albums.put(album3.getId(), album3);
		albums.put(album4.getId(), album4);
		
	}

	public Collection<Album> getAllAlbums() {
		return albums.values();
	}

	public Album getAlbum(final String id) {
		return albums.get(id);
	}

	public Artist getArtist(final String id) {
		return artists.get(id);
	}
}