package at.ac.htlinn.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "teacher")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonTypeName("teacher") 
public class Teacher {
	
	public Teacher(User user) {
		this.user = user; 
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "teacher_id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="user_id", nullable = false)
	private User user;
}
