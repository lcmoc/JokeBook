package ch.bbw.jokebook.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Joke {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String text;
	private int rating;
	@Temporal(TemporalType.DATE)
	private Date date;
	private int section_idfs;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public int getSection_idfs() {
		return section_idfs;
	}

	public void setSection_idfs(int section_idfs) {
		this.section_idfs = section_idfs;
	}
}
