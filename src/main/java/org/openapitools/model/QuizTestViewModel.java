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
import org.openapitools.model.QuizTestQuestion;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * QuizTestViewModel
 */

@JsonTypeName("quizTestViewModel")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class QuizTestViewModel {

  private Integer testId;

  private JsonNullable<String> testName = JsonNullable.<String>undefined();

  private JsonNullable<String> description = JsonNullable.<String>undefined();

  private JsonNullable<String> duration = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid QuizTestQuestion>> quizTestQuestions = JsonNullable.<List<@Valid QuizTestQuestion>>undefined();

  public QuizTestViewModel testId(Integer testId) {
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

  public QuizTestViewModel testName(String testName) {
    this.testName = JsonNullable.of(testName);
    return this;
  }

  /**
   * Get testName
   * @return testName
  */
  
  @Schema(name = "testName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("testName")
  public JsonNullable<String> getTestName() {
    return testName;
  }

  public void setTestName(JsonNullable<String> testName) {
    this.testName = testName;
  }

  public QuizTestViewModel description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public QuizTestViewModel duration(String duration) {
    this.duration = JsonNullable.of(duration);
    return this;
  }

  /**
   * Get duration
   * @return duration
  */
  
  @Schema(name = "duration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("duration")
  public JsonNullable<String> getDuration() {
    return duration;
  }

  public void setDuration(JsonNullable<String> duration) {
    this.duration = duration;
  }

  public QuizTestViewModel quizTestQuestions(List<@Valid QuizTestQuestion> quizTestQuestions) {
    this.quizTestQuestions = JsonNullable.of(quizTestQuestions);
    return this;
  }

  public QuizTestViewModel addQuizTestQuestionsItem(QuizTestQuestion quizTestQuestionsItem) {
    if (this.quizTestQuestions == null || !this.quizTestQuestions.isPresent()) {
      this.quizTestQuestions = JsonNullable.of(new ArrayList<>());
    }
    this.quizTestQuestions.get().add(quizTestQuestionsItem);
    return this;
  }

  /**
   * Get quizTestQuestions
   * @return quizTestQuestions
  */
  @Valid 
  @Schema(name = "quizTestQuestions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quizTestQuestions")
  public JsonNullable<List<@Valid QuizTestQuestion>> getQuizTestQuestions() {
    return quizTestQuestions;
  }

  public void setQuizTestQuestions(JsonNullable<List<@Valid QuizTestQuestion>> quizTestQuestions) {
    this.quizTestQuestions = quizTestQuestions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuizTestViewModel quizTestViewModel = (QuizTestViewModel) o;
    return Objects.equals(this.testId, quizTestViewModel.testId) &&
        equalsNullable(this.testName, quizTestViewModel.testName) &&
        equalsNullable(this.description, quizTestViewModel.description) &&
        equalsNullable(this.duration, quizTestViewModel.duration) &&
        equalsNullable(this.quizTestQuestions, quizTestViewModel.quizTestQuestions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(testId, hashCodeNullable(testName), hashCodeNullable(description), hashCodeNullable(duration), hashCodeNullable(quizTestQuestions));
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
    sb.append("class QuizTestViewModel {\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    quizTestQuestions: ").append(toIndentedString(quizTestQuestions)).append("\n");
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

