package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * QuizAssignedtest
 */

@JsonTypeName("quizAssignedtest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class QuizAssignedtest {

  private Integer assignedTestId;

  private Integer userId;

  private Integer testId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime assignedDate;

  private JsonNullable<Boolean> isStarted = JsonNullable.<Boolean>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> startedDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<Boolean> isCompleted = JsonNullable.<Boolean>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> completedeDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<Integer> totalCorrectAnswers = JsonNullable.<Integer>undefined();

  public QuizAssignedtest assignedTestId(Integer assignedTestId) {
    this.assignedTestId = assignedTestId;
    return this;
  }

  /**
   * Get assignedTestId
   * @return assignedTestId
  */
  
  @Schema(name = "assignedTestId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignedTestId")
  public Integer getAssignedTestId() {
    return assignedTestId;
  }

  public void setAssignedTestId(Integer assignedTestId) {
    this.assignedTestId = assignedTestId;
  }

  public QuizAssignedtest userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public QuizAssignedtest testId(Integer testId) {
    this.testId = testId;
    return this;
  }

  /**
   * Get testId
   * @return testId
  */
  
  @Schema(name = "testId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("testId")
  public Integer getTestId() {
    return testId;
  }

  public void setTestId(Integer testId) {
    this.testId = testId;
  }

  public QuizAssignedtest assignedDate(OffsetDateTime assignedDate) {
    this.assignedDate = assignedDate;
    return this;
  }

  /**
   * Get assignedDate
   * @return assignedDate
  */
  @Valid 
  @Schema(name = "assignedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignedDate")
  public OffsetDateTime getAssignedDate() {
    return assignedDate;
  }

  public void setAssignedDate(OffsetDateTime assignedDate) {
    this.assignedDate = assignedDate;
  }

  public QuizAssignedtest isStarted(Boolean isStarted) {
    this.isStarted = JsonNullable.of(isStarted);
    return this;
  }

  /**
   * Get isStarted
   * @return isStarted
  */
  
  @Schema(name = "isStarted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isStarted")
  public JsonNullable<Boolean> getIsStarted() {
    return isStarted;
  }

  public void setIsStarted(JsonNullable<Boolean> isStarted) {
    this.isStarted = isStarted;
  }

  public QuizAssignedtest startedDate(OffsetDateTime startedDate) {
    this.startedDate = JsonNullable.of(startedDate);
    return this;
  }

  /**
   * Get startedDate
   * @return startedDate
  */
  @Valid 
  @Schema(name = "startedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startedDate")
  public JsonNullable<OffsetDateTime> getStartedDate() {
    return startedDate;
  }

  public void setStartedDate(JsonNullable<OffsetDateTime> startedDate) {
    this.startedDate = startedDate;
  }

  public QuizAssignedtest isCompleted(Boolean isCompleted) {
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

  public QuizAssignedtest completedeDate(OffsetDateTime completedeDate) {
    this.completedeDate = JsonNullable.of(completedeDate);
    return this;
  }

  /**
   * Get completedeDate
   * @return completedeDate
  */
  @Valid 
  @Schema(name = "completedeDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completedeDate")
  public JsonNullable<OffsetDateTime> getCompletedeDate() {
    return completedeDate;
  }

  public void setCompletedeDate(JsonNullable<OffsetDateTime> completedeDate) {
    this.completedeDate = completedeDate;
  }

  public QuizAssignedtest totalCorrectAnswers(Integer totalCorrectAnswers) {
    this.totalCorrectAnswers = JsonNullable.of(totalCorrectAnswers);
    return this;
  }

  /**
   * Get totalCorrectAnswers
   * @return totalCorrectAnswers
  */
  
  @Schema(name = "totalCorrectAnswers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalCorrectAnswers")
  public JsonNullable<Integer> getTotalCorrectAnswers() {
    return totalCorrectAnswers;
  }

  public void setTotalCorrectAnswers(JsonNullable<Integer> totalCorrectAnswers) {
    this.totalCorrectAnswers = totalCorrectAnswers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuizAssignedtest quizAssignedtest = (QuizAssignedtest) o;
    return Objects.equals(this.assignedTestId, quizAssignedtest.assignedTestId) &&
        Objects.equals(this.userId, quizAssignedtest.userId) &&
        Objects.equals(this.testId, quizAssignedtest.testId) &&
        Objects.equals(this.assignedDate, quizAssignedtest.assignedDate) &&
        equalsNullable(this.isStarted, quizAssignedtest.isStarted) &&
        equalsNullable(this.startedDate, quizAssignedtest.startedDate) &&
        equalsNullable(this.isCompleted, quizAssignedtest.isCompleted) &&
        equalsNullable(this.completedeDate, quizAssignedtest.completedeDate) &&
        equalsNullable(this.totalCorrectAnswers, quizAssignedtest.totalCorrectAnswers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedTestId, userId, testId, assignedDate, hashCodeNullable(isStarted), hashCodeNullable(startedDate), hashCodeNullable(isCompleted), hashCodeNullable(completedeDate), hashCodeNullable(totalCorrectAnswers));
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
    sb.append("class QuizAssignedtest {\n");
    sb.append("    assignedTestId: ").append(toIndentedString(assignedTestId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    assignedDate: ").append(toIndentedString(assignedDate)).append("\n");
    sb.append("    isStarted: ").append(toIndentedString(isStarted)).append("\n");
    sb.append("    startedDate: ").append(toIndentedString(startedDate)).append("\n");
    sb.append("    isCompleted: ").append(toIndentedString(isCompleted)).append("\n");
    sb.append("    completedeDate: ").append(toIndentedString(completedeDate)).append("\n");
    sb.append("    totalCorrectAnswers: ").append(toIndentedString(totalCorrectAnswers)).append("\n");
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

