package it.springbootlearnbydoing.jareview.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "feedbacks")
public class Feedback implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne(mappedBy = "feedback", cascade = CascadeType.ALL)
	@MapsId
	@JoinColumn(name = "reviewer_id")
	private User reviewer;
	
	@OneToOne(mappedBy = "feedback", cascade = CascadeType.ALL)
	@MapsId
	@JoinColumn(name = "article_id")
	private Article article;
	
	@Column(name = "type", nullable = false)
	private int vote;
	
	@Column(name = "comment", nullable = true)
	private String comment;
	
	public Feedback() {}

	public Feedback(Long id, User reviewer, Article article, int vote, String comment) {
		this.id = id;
		this.reviewer = reviewer;
		this.article = article;
		this.vote = vote;
		this.comment = comment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getReviewer() {
		return reviewer;
	}

	public void setReviewer(User reviewer) {
		this.reviewer = reviewer;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public int getVote() {
		return vote;
	}

	public void setVote(int vote) {
		this.vote = vote;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Feedback [id=");
		builder.append(id);
		builder.append(", reviewer=");
		builder.append(reviewer);
		builder.append(", article=");
		builder.append(article);
		builder.append(", vote=");
		builder.append(vote);
		builder.append(", comment=");
		builder.append(comment);
		builder.append("]");
		return builder.toString();
	}
}
