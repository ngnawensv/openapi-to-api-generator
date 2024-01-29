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
import org.openapitools.model.QuizTestAnswerView;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * QuizAssignedtestViewModel
 */

@JsonTypeName("quizAssignedtestViewModel")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class QuizAssignedtestViewModel {

  private Integer assignedTestId;

  private Integer userId;

  private Integer testId;

  @Valid
  private JsonNullable<List<@Valid QuizTestAnswerView>> quizTestAnswerViews = JsonNullable.<List<@Valid QuizTestAnswerView>>undefined();

  public QuizAssignedtestViewModel assignedTestId(Integer assignedTestId) {
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

  public QuizAssignedtestViewModel userId(Integer userId) {
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

  public QuizAssignedtestViewModel testId(Integer testId) {
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

  public QuizAssignedtestViewModel quizTestAnswerViews(List<@Valid QuizTestAnswerView> quizTestAnswerViews) {
    this.quizTestAnswerViews = JsonNullable.of(quizTestAnswerViews);
    return this;
  }

  public QuizAssignedtestViewModel addQuizTestAnswerViewsItem(QuizTestAnswerView quizTestAnswerViewsItem) {
    if (this.quizTestAnswerViews == null || !this.quizTestAnswerViews.isPresent()) {
      this.quizTestAnswerViews = JsonNullable.of(new ArrayList<>());
    }
    this.quizTestAnswerViews.get().add(quizTestAnswerViewsItem);
    return this;
  }

  /**
   * Get quizTestAnswerViews
   * @return quizTestAnswerViews
  */
  @Valid 
  @Schema(name = "quizTestAnswerViews", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quizTestAnswerViews")
  public JsonNullable<List<@Valid QuizTestAnswerView>> getQuizTestAnswerViews() {
    return quizTestAnswerViews;
  }

  public void setQuizTestAnswerViews(JsonNullable<List<@Valid QuizTestAnswerView>> quizTestAnswerViews) {
    this.quizTestAnswerViews = quizTestAnswerViews;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuizAssignedtestViewModel quizAssignedtestViewModel = (QuizAssignedtestViewModel) o;
    return Objects.equals(this.assignedTestId, quizAssignedtestViewModel.assignedTestId) &&
        Objects.equals(this.userId, quizAssignedtestViewModel.userId) &&
        Objects.equals(this.testId, quizAssignedtestViewModel.testId) &&
        equalsNullable(this.quizTestAnswerViews, quizAssignedtestViewModel.quizTestAnswerViews);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedTestId, userId, testId, hashCodeNullable(quizTestAnswerViews));
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
    sb.append("class QuizAssignedtestViewModel {\n");
    sb.append("    assignedTestId: ").append(toIndentedString(assignedTestId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    quizTestAnswerViews: ").append(toIndentedString(quizTestAnswerViews)).append("\n");
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

