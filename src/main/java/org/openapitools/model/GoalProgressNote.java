package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GoalProgressNote
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class GoalProgressNote {

  private Integer progressNoteId;

  private Integer goalId;

  private String progressDetails;

  public GoalProgressNote() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GoalProgressNote(Integer goalId, String progressDetails) {
    this.goalId = goalId;
    this.progressDetails = progressDetails;
  }

  public GoalProgressNote progressNoteId(Integer progressNoteId) {
    this.progressNoteId = progressNoteId;
    return this;
  }

  /**
   * Get progressNoteId
   * @return progressNoteId
  */
  
  @Schema(name = "progressNoteId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("progressNoteId")
  public Integer getProgressNoteId() {
    return progressNoteId;
  }

  public void setProgressNoteId(Integer progressNoteId) {
    this.progressNoteId = progressNoteId;
  }

  public GoalProgressNote goalId(Integer goalId) {
    this.goalId = goalId;
    return this;
  }

  /**
   * Get goalId
   * @return goalId
  */
  @NotNull 
  @Schema(name = "goalId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("goalId")
  public Integer getGoalId() {
    return goalId;
  }

  public void setGoalId(Integer goalId) {
    this.goalId = goalId;
  }

  public GoalProgressNote progressDetails(String progressDetails) {
    this.progressDetails = progressDetails;
    return this;
  }

  /**
   * Get progressDetails
   * @return progressDetails
  */
  @NotNull 
  @Schema(name = "progressDetails", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("progressDetails")
  public String getProgressDetails() {
    return progressDetails;
  }

  public void setProgressDetails(String progressDetails) {
    this.progressDetails = progressDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalProgressNote goalProgressNote = (GoalProgressNote) o;
    return Objects.equals(this.progressNoteId, goalProgressNote.progressNoteId) &&
        Objects.equals(this.goalId, goalProgressNote.goalId) &&
        Objects.equals(this.progressDetails, goalProgressNote.progressDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(progressNoteId, goalId, progressDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalProgressNote {\n");
    sb.append("    progressNoteId: ").append(toIndentedString(progressNoteId)).append("\n");
    sb.append("    goalId: ").append(toIndentedString(goalId)).append("\n");
    sb.append("    progressDetails: ").append(toIndentedString(progressDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

