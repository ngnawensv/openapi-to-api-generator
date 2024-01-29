package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GoalMileStone
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class GoalMileStone {

  private Integer milestoneId;

  private Integer goalId;

  private String milestoneTitle;

  private String milestoneDetails;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expectedEndDate;

  private JsonNullable<Boolean> isCompleted = JsonNullable.<Boolean>undefined();

  public GoalMileStone() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GoalMileStone(Integer goalId, String milestoneTitle, String milestoneDetails, OffsetDateTime expectedEndDate) {
    this.goalId = goalId;
    this.milestoneTitle = milestoneTitle;
    this.milestoneDetails = milestoneDetails;
    this.expectedEndDate = expectedEndDate;
  }

  public GoalMileStone milestoneId(Integer milestoneId) {
    this.milestoneId = milestoneId;
    return this;
  }

  /**
   * Get milestoneId
   * @return milestoneId
  */
  
  @Schema(name = "milestoneId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("milestoneId")
  public Integer getMilestoneId() {
    return milestoneId;
  }

  public void setMilestoneId(Integer milestoneId) {
    this.milestoneId = milestoneId;
  }

  public GoalMileStone goalId(Integer goalId) {
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

  public GoalMileStone milestoneTitle(String milestoneTitle) {
    this.milestoneTitle = milestoneTitle;
    return this;
  }

  /**
   * Get milestoneTitle
   * @return milestoneTitle
  */
  @NotNull 
  @Schema(name = "milestoneTitle", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("milestoneTitle")
  public String getMilestoneTitle() {
    return milestoneTitle;
  }

  public void setMilestoneTitle(String milestoneTitle) {
    this.milestoneTitle = milestoneTitle;
  }

  public GoalMileStone milestoneDetails(String milestoneDetails) {
    this.milestoneDetails = milestoneDetails;
    return this;
  }

  /**
   * Get milestoneDetails
   * @return milestoneDetails
  */
  @NotNull 
  @Schema(name = "milestoneDetails", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("milestoneDetails")
  public String getMilestoneDetails() {
    return milestoneDetails;
  }

  public void setMilestoneDetails(String milestoneDetails) {
    this.milestoneDetails = milestoneDetails;
  }

  public GoalMileStone expectedEndDate(OffsetDateTime expectedEndDate) {
    this.expectedEndDate = expectedEndDate;
    return this;
  }

  /**
   * Get expectedEndDate
   * @return expectedEndDate
  */
  @NotNull @Valid 
  @Schema(name = "expectedEndDate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expectedEndDate")
  public OffsetDateTime getExpectedEndDate() {
    return expectedEndDate;
  }

  public void setExpectedEndDate(OffsetDateTime expectedEndDate) {
    this.expectedEndDate = expectedEndDate;
  }

  public GoalMileStone isCompleted(Boolean isCompleted) {
    this.isCompleted = JsonNullable.of(isCompleted);
    return this;
  }

  /**
   * Get isCompleted
   * @return isCompleted
  */
  
  @Schema(name = "isCompleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isCompleted")
  public JsonNullable<Boolean> getIsCompleted() {
    return isCompleted;
  }

  public void setIsCompleted(JsonNullable<Boolean> isCompleted) {
    this.isCompleted = isCompleted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalMileStone goalMileStone = (GoalMileStone) o;
    return Objects.equals(this.milestoneId, goalMileStone.milestoneId) &&
        Objects.equals(this.goalId, goalMileStone.goalId) &&
        Objects.equals(this.milestoneTitle, goalMileStone.milestoneTitle) &&
        Objects.equals(this.milestoneDetails, goalMileStone.milestoneDetails) &&
        Objects.equals(this.expectedEndDate, goalMileStone.expectedEndDate) &&
        equalsNullable(this.isCompleted, goalMileStone.isCompleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(milestoneId, goalId, milestoneTitle, milestoneDetails, expectedEndDate, hashCodeNullable(isCompleted));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalMileStone {\n");
    sb.append("    milestoneId: ").append(toIndentedString(milestoneId)).append("\n");
    sb.append("    goalId: ").append(toIndentedString(goalId)).append("\n");
    sb.append("    milestoneTitle: ").append(toIndentedString(milestoneTitle)).append("\n");
    sb.append("    milestoneDetails: ").append(toIndentedString(milestoneDetails)).append("\n");
    sb.append("    expectedEndDate: ").append(toIndentedString(expectedEndDate)).append("\n");
    sb.append("    isCompleted: ").append(toIndentedString(isCompleted)).append("\n");
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

