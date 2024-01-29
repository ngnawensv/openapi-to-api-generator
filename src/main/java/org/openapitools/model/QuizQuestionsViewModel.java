package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.QuizQuestionAnswer;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * QuizQuestionsViewModel
 */

@JsonTypeName("quizQuestionsViewModel")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class QuizQuestionsViewModel {

  private Integer questionId;

  private Integer categoryId;

  private JsonNullable<String> questionName = JsonNullable.<String>undefined();

  private Boolean isMultpleAnswer;

  private Boolean isCodeSnipet;

  private JsonNullable<String> codeSnipetText = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid QuizQuestionAnswer>> quizQuestionAnswers = JsonNullable.<List<@Valid QuizQuestionAnswer>>undefined();

  public QuizQuestionsViewModel questionId(Integer questionId) {
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

  public QuizQuestionsViewModel categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Get categoryId
   * @return categoryId
  */
  
  @Schema(name = "categoryId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryId")
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public QuizQuestionsViewModel questionName(String questionName) {
    this.questionName = JsonNullable.of(questionName);
    return this;
  }

  /**
   * Get questionName
   * @return questionName
  */
  
  @Schema(name = "questionName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("questionName")
  public JsonNullable<String> getQuestionName() {
    return questionName;
  }

  public void setQuestionName(JsonNullable<String> questionName) {
    this.questionName = questionName;
  }

  public QuizQuestionsViewModel isMultpleAnswer(Boolean isMultpleAnswer) {
    this.isMultpleAnswer = isMultpleAnswer;
    return this;
  }

  /**
   * Get isMultpleAnswer
   * @return isMultpleAnswer
  */
  
  @Schema(name = "isMultpleAnswer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isMultpleAnswer")
  public Boolean getIsMultpleAnswer() {
    return isMultpleAnswer;
  }

  public void setIsMultpleAnswer(Boolean isMultpleAnswer) {
    this.isMultpleAnswer = isMultpleAnswer;
  }

  public QuizQuestionsViewModel isCodeSnipet(Boolean isCodeSnipet) {
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

  public QuizQuestionsViewModel codeSnipetText(String codeSnipetText) {
    this.codeSnipetText = JsonNullable.of(codeSnipetText);
    return this;
  }

  /**
   * Get codeSnipetText
   * @return codeSnipetText
  */
  
  @Schema(name = "codeSnipetText", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("codeSnipetText")
  public JsonNullable<String> getCodeSnipetText() {
    return codeSnipetText;
  }

  public void setCodeSnipetText(JsonNullable<String> codeSnipetText) {
    this.codeSnipetText = codeSnipetText;
  }

  public QuizQuestionsViewModel quizQuestionAnswers(List<@Valid QuizQuestionAnswer> quizQuestionAnswers) {
    this.quizQuestionAnswers = JsonNullable.of(quizQuestionAnswers);
    return this;
  }

  public QuizQuestionsViewModel addQuizQuestionAnswersItem(QuizQuestionAnswer quizQuestionAnswersItem) {
    if (this.quizQuestionAnswers == null || !this.quizQuestionAnswers.isPresent()) {
      this.quizQuestionAnswers = JsonNullable.of(new ArrayList<>());
    }
    this.quizQuestionAnswers.get().add(quizQuestionAnswersItem);
    return this;
  }

  /**
   * Get quizQuestionAnswers
   * @return quizQuestionAnswers
  */
  @Valid 
  @Schema(name = "quizQuestionAnswers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quizQuestionAnswers")
  public JsonNullable<List<@Valid QuizQuestionAnswer>> getQuizQuestionAnswers() {
    return quizQuestionAnswers;
  }

  public void setQuizQuestionAnswers(JsonNullable<List<@Valid QuizQuestionAnswer>> quizQuestionAnswers) {
    this.quizQuestionAnswers = quizQuestionAnswers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuizQuestionsViewModel quizQuestionsViewModel = (QuizQuestionsViewModel) o;
    return Objects.equals(this.questionId, quizQuestionsViewModel.questionId) &&
        Objects.equals(this.categoryId, quizQuestionsViewModel.categoryId) &&
        equalsNullable(this.questionName, quizQuestionsViewModel.questionName) &&
        Objects.equals(this.isMultpleAnswer, quizQuestionsViewModel.isMultpleAnswer) &&
        Objects.equals(this.isCodeSnipet, quizQuestionsViewModel.isCodeSnipet) &&
        equalsNullable(this.codeSnipetText, quizQuestionsViewModel.codeSnipetText) &&
        equalsNullable(this.quizQuestionAnswers, quizQuestionsViewModel.quizQuestionAnswers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, categoryId, hashCodeNullable(questionName), isMultpleAnswer, isCodeSnipet, hashCodeNullable(codeSnipetText), hashCodeNullable(quizQuestionAnswers));
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
    sb.append("class QuizQuestionsViewModel {\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    questionName: ").append(toIndentedString(questionName)).append("\n");
    sb.append("    isMultpleAnswer: ").append(toIndentedString(isMultpleAnswer)).append("\n");
    sb.append("    isCodeSnipet: ").append(toIndentedString(isCodeSnipet)).append("\n");
    sb.append("    codeSnipetText: ").append(toIndentedString(codeSnipetText)).append("\n");
    sb.append("    quizQuestionAnswers: ").append(toIndentedString(quizQuestionAnswers)).append("\n");
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

