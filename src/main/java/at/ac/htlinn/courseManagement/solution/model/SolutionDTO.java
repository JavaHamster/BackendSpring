package at.ac.htlinn.courseManagement.solution.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SolutionDTO {
	public SolutionDTO(Solution solution) {
		this.id = solution.getId();
		this.exerciseId = solution.getExercise().getId();
		this.studentId = solution.getStudent().getId();
		this.code = solution.getCode();
		this.submitted = solution.isSubmitted();
		this.submissionDate = solution.getSubmissionDate();
		this.feedback = solution.getFeedback();
	}

	@JsonProperty("solution_id")
	private int id;
	@JsonProperty("exercise_id")
	private int exerciseId;
	@JsonProperty("student_id")
	private int studentId;
	private String code;
	private boolean submitted;
	@JsonProperty("submission-date")
	private Date submissionDate;
	private String feedback;
}
