package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * QuizQuestionAnswer
 */

@JsonTypeName("quizQuestionAnswer")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class QuizQuestionAnswer {

  private Integer optionId;

  private Integer questionId;

  private JsonNullable<String> optionText = JsonNullable.<String>undefined();

  private Boolean isCodeSnipet;

  private Boolean isCorrect;

  public QuizQuestionAnswer optionId(Integer optionId) {
    this.optionId = optionId;
    return this;
  }

  /**
   * Get optionId
   * @return optionId
  */
  
  @Schema(name = "optionId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optionId")
  public Integer getOptionId() {
    return optionId;
  }

  public void setOptionId(Integer optionId) {
    this.optionId = optionId;
  }

  public QuizQuestionAnswer questionId(Integer questionId) {
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

  public QuizQuestionAnswer optionText(String optionText) {
    this.optionText = JsonNullable.of(optionText);
    return this;
  }

  /**
   * Get optionText
   * @return optionText
  */
  
  @Schema(name = "optionText", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optionText")
  public JsonNullable<String> getOptionText() {
    return optionText;
  }

  public void setOptionText(JsonNullable<String> optionText) {
    this.optionText = optionText;
  }

  public QuizQuestionAnswer isCodeSnipet(Boolean isCodeSnipet) {
    this.isCodeSnipet = isCodeSnipet;
    return this;
  }

  /**
   * Get isCodeSnipet
   * @return isCodeSnipet
  */
  
  @Schema(name = "isCodeSnipet", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isCodeSnipet")
  public Boolean getIsCodeSnipet() {
    return isCodeSnipet;
  }

  public void setIsCodeSnipet(Boolean isCodeSnipet) {
    this.isCodeSnipet = isCodeSnipet;
  }

  public QuizQuestionAnswer isCorrect(Boolean isCorrect) {
    this.isCorrect = isCorrect;
    return this;
  }

  /**
   * Get isCorrect
   * @return isCorrect
  */
  
  @Schema(name = "isCorrect", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isCorrect")
  public Boolean getIsCorrect() {
    return isCorrect;
  }

  public void setIsCorrect(Boolean isCorrect) {
    this.isCorrect = isCorrect;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuizQuestionAnswer quizQuestionAnswer = (QuizQuestionAnswer) o;
    return Objects.equals(this.optionId, quizQuestionAnswer.optionId) &&
        Objects.equals(this.questionId, quizQuestionAnswer.questionId) &&
        equalsNullable(this.optionText, quizQuestionAnswer.optionText) &&
        Objects.equals(this.isCodeSnipet, quizQuestionAnswer.isCodeSnipet) &&
        Objects.equals(this.isCorrect, quizQuestionAnswer.isCorrect);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(optionId, questionId, hashCodeNullable(optionText), isCodeSnipet, isCorrect);
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
    sb.append("class QuizQuestionAnswer {\n");
    sb.append("    optionId: ").append(toIndentedString(optionId)).append("\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    optionText: ").append(toIndentedString(optionText)).append("\n");
    sb.append("    isCodeSnipet: ").append(toIndentedString(isCodeSnipet)).append("\n");
    sb.append("    isCorrect: ").append(toIndentedString(isCorrect)).append("\n");
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

