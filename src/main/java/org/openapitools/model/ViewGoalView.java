package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GoalMileStone;
import org.openapitools.model.GoalProgressNote;
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
 * ViewGoalView
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class ViewGoalView {

  private Integer goalId;

  private Integer userId;

  private JsonNullable<String> goalTitle = JsonNullable.<String>undefined();

  private JsonNullable<String> goalDescription = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> goalStartDate = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> goalExpectedEndDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<Integer> goalCategoryId = JsonNullable.<Integer>undefined();

  private Boolean isCompleted;

  @Valid
  private JsonNullable<List<@Valid GoalMileStone>> goalMileStones = JsonNullable.<List<@Valid GoalMileStone>>undefined();

  @Valid
  private JsonNullable<List<@Valid GoalProgressNote>> goalProgressNotes = JsonNullable.<List<@Valid GoalProgressNote>>undefined();

  public ViewGoalView goalId(Integer goalId) {
    this.goalId = goalId;
    return this;
  }

  /**
   * Get goalId
   * @return goalId
  */
  
  @Schema(name = "goalId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("goalId")
  public Integer getGoalId() {
    return goalId;
  }

  public void setGoalId(Integer goalId) {
    this.goalId = goalId;
  }

  public ViewGoalView userId(Integer userId) {
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

  public ViewGoalView goalTitle(String goalTitle) {
    this.goalTitle = JsonNullable.of(goalTitle);
    return this;
  }

  /**
   * Get goalTitle
   * @return goalTitle
  */
  
  @Schema(name = "goalTitle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("goalTitle")
  public JsonNullable<String> getGoalTitle() {
    return goalTitle;
  }

  public void setGoalTitle(JsonNullable<String> goalTitle) {
    this.goalTitle = goalTitle;
  }

  public ViewGoalView goalDescription(String goalDescription) {
    this.goalDescription = JsonNullable.of(goalDescription);
    return this;
  }

  /**
   * Get goalDescription
   * @return goalDescription
  */
  
  @Schema(name = "goalDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("goalDescription")
  public JsonNullable<String> getGoalDescription() {
    return goalDescription;
  }

  public void setGoalDescription(JsonNullable<String> goalDescription) {
    this.goalDescription = goalDescription;
  }

  public ViewGoalView goalStartDate(OffsetDateTime goalStartDate) {
    this.goalStartDate = JsonNullable.of(goalStartDate);
    return this;
  }

  /**
   * Get goalStartDate
   * @return goalStartDate
  */
  @Valid 
  @Schema(name = "goalStartDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("goalStartDate")
  public JsonNullable<OffsetDateTime> getGoalStartDate() {
    return goalStartDate;
  }

  public void setGoalStartDate(JsonNullable<OffsetDateTime> goalStartDate) {
    this.goalStartDate = goalStartDate;
  }

  public ViewGoalView goalExpectedEndDate(OffsetDateTime goalExpectedEndDate) {
    this.goalExpectedEndDate = JsonNullable.of(goalExpectedEndDate);
    return this;
  }

  /**
   * Get goalExpectedEndDate
   * @return goalExpectedEndDate
  */
  @Valid 
  @Schema(name = "goalExpectedEndDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("goalExpectedEndDate")
  public JsonNullable<OffsetDateTime> getGoalExpectedEndDate() {
    return goalExpectedEndDate;
  }

  public void setGoalExpectedEndDate(JsonNullable<OffsetDateTime> goalExpectedEndDate) {
    this.goalExpectedEndDate = goalExpectedEndDate;
  }

  public ViewGoalView goalCategoryId(Integer goalCategoryId) {
    this.goalCategoryId = JsonNullable.of(goalCategoryId);
    return this;
  }

  /**
   * Get goalCategoryId
   * @return goalCategoryId
  */
  
  @Schema(name = "goalCategoryId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("goalCategoryId")
  public JsonNullable<Integer> getGoalCategoryId() {
    return goalCategoryId;
  }

  public void setGoalCategoryId(JsonNullable<Integer> goalCategoryId) {
    this.goalCategoryId = goalCategoryId;
  }

  public ViewGoalView isCompleted(Boolean isCompleted) {
    this.isCompleted = isCompleted;
    return this;
  }

  /**
   * Get isCompleted
   * @return isCompleted
  */
  
  @Schema(name = "isCompleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isCompleted")
  public Boolean getIsCompleted() {
    return isCompleted;
  }

  public void setIsCompleted(Boolean isCompleted) {
    this.isCompleted = isCompleted;
  }

  public ViewGoalView goalMileStones(List<@Valid GoalMileStone> goalMileStones) {
    this.goalMileStones = JsonNullable.of(goalMileStones);
    return this;
  }

  public ViewGoalView addGoalMileStonesItem(GoalMileStone goalMileStonesItem) {
    if (this.goalMileStones == null || !this.goalMileStones.isPresent()) {
      this.goalMileStones = JsonNullable.of(new ArrayList<>());
    }
    this.goalMileStones.get().add(goalMileStonesItem);
    return this;
  }

  /**
   * Get goalMileStones
   * @return goalMileStones
  */
  @Valid 
  @Schema(name = "GoalMileStones", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GoalMileStones")
  public JsonNullable<List<@Valid GoalMileStone>> getGoalMileStones() {
    return goalMileStones;
  }

  public void setGoalMileStones(JsonNullable<List<@Valid GoalMileStone>> goalMileStones) {
    this.goalMileStones = goalMileStones;
  }

  public ViewGoalView goalProgressNotes(List<@Valid GoalProgressNote> goalProgressNotes) {
    this.goalProgressNotes = JsonNullable.of(goalProgressNotes);
    return this;
  }

  public ViewGoalView addGoalProgressNotesItem(GoalProgressNote goalProgressNotesItem) {
    if (this.goalProgressNotes == null || !this.goalProgressNotes.isPresent()) {
      this.goalProgressNotes = JsonNullable.of(new ArrayList<>());
    }
    this.goalProgressNotes.get().add(goalProgressNotesItem);
    return this;
  }

  /**
   * Get goalProgressNotes
   * @return goalProgressNotes
  */
  @Valid 
  @Schema(name = "GoalProgressNotes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GoalProgressNotes")
  public JsonNullable<List<@Valid GoalProgressNote>> getGoalProgressNotes() {
    return goalProgressNotes;
  }

  public void setGoalProgressNotes(JsonNullable<List<@Valid GoalProgressNote>> goalProgressNotes) {
    this.goalProgressNotes = goalProgressNotes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewGoalView viewGoalView = (ViewGoalView) o;
    return Objects.equals(this.goalId, viewGoalView.goalId) &&
        Objects.equals(this.userId, viewGoalView.userId) &&
        equalsNullable(this.goalTitle, viewGoalView.goalTitle) &&
        equalsNullable(this.goalDescription, viewGoalView.goalDescription) &&
        equalsNullable(this.goalStartDate, viewGoalView.goalStartDate) &&
        equalsNullable(this.goalExpectedEndDate, viewGoalView.goalExpectedEndDate) &&
        equalsNullable(this.goalCategoryId, viewGoalView.goalCategoryId) &&
        Objects.equals(this.isCompleted, viewGoalView.isCompleted) &&
        equalsNullable(this.goalMileStones, viewGoalView.goalMileStones) &&
        equalsNullable(this.goalProgressNotes, viewGoalView.goalProgressNotes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(goalId, userId, hashCodeNullable(goalTitle), hashCodeNullable(goalDescription), hashCodeNullable(goalStartDate), hashCodeNullable(goalExpectedEndDate), hashCodeNullable(goalCategoryId), isCompleted, hashCodeNullable(goalMileStones), hashCodeNullable(goalProgressNotes));
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
    sb.append("class ViewGoalView {\n");
    sb.append("    goalId: ").append(toIndentedString(goalId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    goalTitle: ").append(toIndentedString(goalTitle)).append("\n");
    sb.append("    goalDescription: ").append(toIndentedString(goalDescription)).append("\n");
    sb.append("    goalStartDate: ").append(toIndentedString(goalStartDate)).append("\n");
    sb.append("    goalExpectedEndDate: ").append(toIndentedString(goalExpectedEndDate)).append("\n");
    sb.append("    goalCategoryId: ").append(toIndentedString(goalCategoryId)).append("\n");
    sb.append("    isCompleted: ").append(toIndentedString(isCompleted)).append("\n");
    sb.append("    goalMileStones: ").append(toIndentedString(goalMileStones)).append("\n");
    sb.append("    goalProgressNotes: ").append(toIndentedString(goalProgressNotes)).append("\n");
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

