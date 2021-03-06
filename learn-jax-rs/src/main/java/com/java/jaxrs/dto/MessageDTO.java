package com.java.jaxrs.dto;

import java.util.Date;

//@XmlRootElement
public class MessageDTO {

	private int id;
	private String message;
	private Date created;
	private String author;

	public MessageDTO() {

	}

	public MessageDTO(int id, String message, String author) {
		this.id = id;
		this.message = message;
		this.author = author;
		this.created = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
