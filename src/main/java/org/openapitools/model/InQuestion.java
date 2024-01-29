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
 * InQuestion
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class InQuestion {

  private Integer questionId;

  private Integer languageTopicId;

  private JsonNullable<String> question = JsonNullable.<String>undefined();

  private JsonNullable<String> answer = JsonNullable.<String>undefined();

  private JsonNullable<Boolean> isPhotos = JsonNullable.<Boolean>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> createdDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<Boolean> isDelete = JsonNullable.<Boolean>undefined();

  private Integer orderNo;

  public InQuestion questionId(Integer questionId) {
    this.questionId = questionId;
    return this;
  }

  /**
   * Get questionId
   * @return questionId
  */
  
  @Schema(name = "QuestionId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("QuestionId")
  public Integer getQuestionId() {
    return questionId;
  }

  public void setQuestionId(Integer questionId) {
    this.questionId = questionId;
  }

  public InQuestion languageTopicId(Integer languageTopicId) {
    this.languageTopicId = languageTopicId;
    return this;
  }

  /**
   * Get languageTopicId
   * @return languageTopicId
  */
  
  @Schema(name = "LanguageTopicId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LanguageTopicId")
  public Integer getLanguageTopicId() {
    return languageTopicId;
  }

  public void setLanguageTopicId(Integer languageTopicId) {
    this.languageTopicId = languageTopicId;
  }

  public InQuestion question(String question) {
    this.question = JsonNullable.of(question);
    return this;
  }

  /**
   * Get question
   * @return question
  */
  
  @Schema(name = "Question", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Question")
  public JsonNullable<String> getQuestion() {
    return question;
  }

  public void setQuestion(JsonNullable<String> question) {
    this.question = question;
  }

  public InQuestion answer(String answer) {
    this.answer = JsonNullable.of(answer);
    return this;
  }

  /**
   * Get answer
   * @return answer
  */
  
  @Schema(name = "Answer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Answer")
  public JsonNullable<String> getAnswer() {
    return answer;
  }

  public void setAnswer(JsonNullable<String> answer) {
    this.answer = answer;
  }

  public InQuestion isPhotos(Boolean isPhotos) {
    this.isPhotos = JsonNullable.of(isPhotos);
    return this;
  }

  /**
   * Get isPhotos
   * @return isPhotos
  */
  
  @Schema(name = "IsPhotos", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsPhotos")
  public JsonNullable<Boolean> getIsPhotos() {
    return isPhotos;
  }

  public void setIsPhotos(JsonNullable<Boolean> isPhotos) {
    this.isPhotos = isPhotos;
  }

  public InQuestion createdDate(OffsetDateTime createdDate) {
    this.createdDate = JsonNullable.of(createdDate);
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  @Valid 
  @Schema(name = "CreatedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreatedDate")
  public JsonNullable<OffsetDateTime> getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(JsonNullable<OffsetDateTime> createdDate) {
    this.createdDate = createdDate;
  }

  public InQuestion isDelete(Boolean isDelete) {
    this.isDelete = JsonNullable.of(isDelete);
    return this;
  }

  /**
   * Get isDelete
   * @return isDelete
  */
  
  @Schema(name = "IsDelete", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsDelete")
  public JsonNullable<Boolean> getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(JsonNullable<Boolean> isDelete) {
    this.isDelete = isDelete;
  }

  public InQuestion orderNo(Integer orderNo) {
    this.orderNo = orderNo;
    return this;
  }

  /**
   * Get orderNo
   * @return orderNo
  */
  
  @Schema(name = "OrderNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OrderNo")
  public Integer getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(Integer orderNo) {
    this.orderNo = orderNo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InQuestion inQuestion = (InQuestion) o;
    return Objects.equals(this.questionId, inQuestion.questionId) &&
        Objects.equals(this.languageTopicId, inQuestion.languageTopicId) &&
        equalsNullable(this.question, inQuestion.question) &&
        equalsNullable(this.answer, inQuestion.answer) &&
        equalsNullable(this.isPhotos, inQuestion.isPhotos) &&
        equalsNullable(this.createdDate, inQuestion.createdDate) &&
        equalsNullable(this.isDelete, inQuestion.isDelete) &&
        Objects.equals(this.orderNo, inQuestion.orderNo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, languageTopicId, hashCodeNullable(question), hashCodeNullable(answer), hashCodeNullable(isPhotos), hashCodeNullable(createdDate), hashCodeNullable(isDelete), orderNo);
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
    sb.append("class InQuestion {\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    languageTopicId: ").append(toIndentedString(languageTopicId)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    isPhotos: ").append(toIndentedString(isPhotos)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    isDelete: ").append(toIndentedString(isDelete)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
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

