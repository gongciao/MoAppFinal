package com.example.domenico.Zarathustra.backend.server;

public class EventPost extends Post{
	private LocalDateTime date;

	public EventPost(String title, User author, String content,LocalDateTime	submittingTime, LocalDateTime date){
		super(title, author, content, submittingTime);
		this.date = date;
	}
	
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	public LocalDateTime getDate(){
		return this.date;
	}
}