package com.fmc.service;

import org.springframework.stereotype.Component;

@Component
public class Song {
	private String title;
	private String singername;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getSingerName() {
		return singername;
	}
	public void setSingerName(String singerName) {
		this.singername=singerName;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", singername=" + singername + "]";
	}


	
}
