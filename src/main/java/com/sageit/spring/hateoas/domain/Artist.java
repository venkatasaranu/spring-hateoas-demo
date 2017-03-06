package com.sageit.spring.hateoas.domain;

public class Artist {
	
	private final String id;
	private final String name;
	private final String gender;
	private int age;
	public Artist(final String id, final String name,final String gender,final int age) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
