package studio3;

import static org.junit.Assert.*;


import org.junit.Test;

public class PostAndUserTest {

	//POST TESTS
	
	@Test
	public void testGetTitle() {
		Post p = new Post("title", "body", "author");
		assertEquals("title", p.getTitle());
	}
	
	@Test
	public void testGetBody() {
		Post p = new Post("title", "body", "author");
		assertEquals("body", p.getBody());
	}
	
	@Test
	public void testGetAuthor() {
		Post p = new Post("title", "body", "author");
		assertEquals("author", p.getAuthor());
	}
	
//	@Test
//	public void testGetCreated() {
//		Post p = new Post("title", "body", "author");
//		assertEquals("title", p.getCreated());
//	}
	
	@Test
	public void testEditTitle() {
		Post p = new Post("title", "body", "author");
		p.editTitle("newTitle");
		assertEquals("newTitle", p.getTitle());
	}
	
	@Test
	public void testEditAuthor() {
		Post p = new Post("title", "body", "author");
		p.editAuthor("newAuthor");
		assertEquals("newAuthor", p.getAuthor());
	}
	
	@Test
	public void testEditBody() {
		Post p = new Post("title", "body", "author");
		p.editBody("newBody");
		assertEquals("newBody", p.getBody());
	}
	
	//USER TESTS
	
	@Test
	public void testGetUsername() {
		User u = new User("Sam", "eyeAm");
		assertEquals("Sam", u.getUsername());
	}
	
	@Test
	public void testGetPassword() {
		User u = new User("Sam", "eyeAm");
		assertEquals("eyeAm", u.getPassword());
	}
	
	@Test
	public void testGetUserCount() {
		User u = new User("Sam", "eyeAm");
		assertEquals(1, User.getUserCount());
	}
	
}
