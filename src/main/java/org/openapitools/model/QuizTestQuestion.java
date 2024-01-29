package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * QuizTestQuestion
 */

@JsonTypeName("quizTestQuestion")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class QuizTestQuestion {

  private Integer testQuestionId;

  private Integer questionId;

  private Integer testId;

  public QuizTestQuestion testQuestionId(Integer testQuestionId) {
    this.testQuestionId = testQuestionId;
    return this;
  }

  /**
   * Get testQuestionId
   * @return testQuestionId
  */
  
  @Schema(name = "testQuestionId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("testQuestionId")
  public Integer getTestQuestionId() {
    return testQuestionId;
  }

  public void setTestQuestionId(Integer testQuestionId) {
    this.testQuestionId = testQuestionId;
  }

  public QuizTestQuestion questionId(Integer questionId) {
    this.questionId = questionId;
    return this;
  }

  /**
   * Get questionId
   * @return questionId
  */
  
  @Schema(name = "questionId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("questionId")
  public Integer getQuestionId() {
    return questionId;
  }

  public void setQuestionId(Integer questionId) {
    this.questionId = questionId;
  }

  public QuizTestQuestion testId(Integer testId) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuizTestQuestion quizTestQuestion = (QuizTestQuestion) o;
    return Objects.equals(this.testQuestionId, quizTestQuestion.testQuestionId) &&
        Objects.equals(this.questionId, quizTestQuestion.questionId) &&
        Objects.equals(this.testId, quizTestQuestion.testId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testQuestionId, questionId, testId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuizTestQuestion {\n");
    sb.append("    testQuestionId: ").append(toIndentedString(testQuestionId)).append("\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
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

