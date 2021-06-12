package it.springbootlearnbydoing.jareview.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import it.springbootlearnbydoing.jareview.enums.UserType;

@Entity
@Table(name = "users")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "type", length = 8, nullable = false)
	private UserType type;
	
	@Column(name = "name", length = 50, nullable = false)
	private String name;
	
//	@JsonIgnore
//    @OneToOne(fetch = FetchType.LAZY, mappedBy = "author")
//	private User author	;
	
	@OneToMany()
    private List<Article> articles;
	
	@OneToMany()
	private List<Feedback> feedbacks;
	
	public User() {}
	
	public User(Long id, UserType type, String name) {
		this.id = id;
		this.type = type;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", type=");
		builder.append(type);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
}
