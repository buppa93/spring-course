package it.springbootlearnbydoing.jareview.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import it.springbootlearnbydoing.jareview.enums.ArticleType;

@Entity
@Table(name = "articles")
public class Article implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "author_id", referencedColumnName = "id")
	private User author;
	
	@Column(name = "type", length = 10, nullable = false)
	@Enumerated(EnumType.STRING)
	private ArticleType type;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "publish_date", nullable = false)
	private Date publishDate;
	
	@Column(name = "title", length = 100, nullable = false)
	private String title;
	
	@Column(name = "body", nullable = false)
	private String body;
	
	@OneToMany()
	private List<Feedback> feedbacks;
	
	public Article() {}

	public Article(Long id, User author, ArticleType type, 
			Date publishDate, String title, String body) {
		this.id = id;
		this.author = author;
		this.type = type;
		this.publishDate = publishDate;
		this.title = title;
		this.body = body;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public ArticleType getType() {
		return type;
	}

	public void setType(ArticleType type) {
		this.type = type;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Article [id=");
		builder.append(id);
		builder.append(", author=");
		builder.append(author);
		builder.append(", type=");
		builder.append(type);
		builder.append(", publishDate=");
		builder.append(publishDate);
		builder.append(", title=");
		builder.append(title);
		builder.append(", body=");
		builder.append(body);
		builder.append("]");
		return builder.toString();
	}
}
