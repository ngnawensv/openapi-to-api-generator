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
 * QuizTestAnswerView
 */

@JsonTypeName("quizTestAnswerView")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class QuizTestAnswerView {

  private Integer questionId;

  private Integer selectedOptionId;

  public QuizTestAnswerView questionId(Integer questionId) {
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

  public QuizTestAnswerView selectedOptionId(Integer selectedOptionId) {
    this.selectedOptionId = selectedOptionId;
    return this;
  }

  /**
   * Get selectedOptionId
   * @return selectedOptionId
  */
  
  @Schema(name = "selectedOptionId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("selectedOptionId")
  public Integer getSelectedOptionId() {
    return selectedOptionId;
  }

  public void setSelectedOptionId(Integer selectedOptionId) {
    this.selectedOptionId = selectedOptionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuizTestAnswerView quizTestAnswerView = (QuizTestAnswerView) o;
    return Objects.equals(this.questionId, quizTestAnswerView.questionId) &&
        Objects.equals(this.selectedOptionId, quizTestAnswerView.selectedOptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, selectedOptionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuizTestAnswerView {\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    selectedOptionId: ").append(toIndentedString(selectedOptionId)).append("\n");
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

