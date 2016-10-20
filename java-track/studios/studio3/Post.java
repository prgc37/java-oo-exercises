package studio3;

import java.util.Date;

public class Post {
	protected String title;
	protected String body;
	protected String author;
	protected final Date created;
	protected Date modified;
	
	public Post(String title, String body, String author){
		this.title = title;
		this.body = body;
		this.author = author;
		this.created = new Date();
		this.modified = new Date();
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public String getBody(){
		return this.body;
	}
	
	public String getAuthor(){
		return this.author;
	}
	
	public Date getCreated(){
		return this.created;
	}
	
	public void editTitle(String newTitle){
		this.modified = new Date();
		this.title = newTitle;
	}
	
	public void editBody(String newBody){
		this.modified = new Date();
		this.body = newBody;
	}
	
	public void editAuthor(String newAuthor){
		this.author = newAuthor;
	}
	
	public String toString(){
		return "this string";
	}
	
	public static void main (String[] args){
		
	}

}
