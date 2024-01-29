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
 * CreateGoalView
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class CreateGoalView {

  private Integer goalId;

  private Integer userId;

  private String goalTitle;

  private String goalDescription;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime goalStartDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> goalExpectedEndDate = JsonNullable.<OffsetDateTime>undefined();

  private Integer goalCategoryId;

  private Boolean isCompleted;

  @Valid
  private JsonNullable<List<@Valid GoalMileStone>> goalMileStones = JsonNullable.<List<@Valid GoalMileStone>>undefined();

  public CreateGoalView() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateGoalView(Integer userId, String goalTitle, String goalDescription, OffsetDateTime goalStartDate, Integer goalCategoryId) {
    this.userId = userId;
    this.goalTitle = goalTitle;
    this.goalDescription = goalDescription;
    this.goalStartDate = goalStartDate;
    this.goalCategoryId = goalCategoryId;
  }

  public CreateGoalView goalId(Integer goalId) {
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

  public CreateGoalView userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @NotNull 
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userId")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public CreateGoalView goalTitle(String goalTitle) {
    this.goalTitle = goalTitle;
    return this;
  }

  /**
   * Get goalTitle
   * @return goalTitle
  */
  @NotNull 
  @Schema(name = "goalTitle", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("goalTitle")
  public String getGoalTitle() {
    return goalTitle;
  }

  public void setGoalTitle(String goalTitle) {
    this.goalTitle = goalTitle;
  }

  public CreateGoalView goalDescription(String goalDescription) {
    this.goalDescription = goalDescription;
    return this;
  }

  /**
   * Get goalDescription
   * @return goalDescription
  */
  @NotNull 
  @Schema(name = "goalDescription", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("goalDescription")
  public String getGoalDescription() {
    return goalDescription;
  }

  public void setGoalDescription(String goalDescription) {
    this.goalDescription = goalDescription;
  }

  public CreateGoalView goalStartDate(OffsetDateTime goalStartDate) {
    this.goalStartDate = goalStartDate;
    return this;
  }

  /**
   * Get goalStartDate
   * @return goalStartDate
  */
  @NotNull @Valid 
  @Schema(name = "goalStartDate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("goalStartDate")
  public OffsetDateTime getGoalStartDate() {
    return goalStartDate;
  }

  public void setGoalStartDate(OffsetDateTime goalStartDate) {
    this.goalStartDate = goalStartDate;
  }

  public CreateGoalView goalExpectedEndDate(OffsetDateTime goalExpectedEndDate) {
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

  public CreateGoalView goalCategoryId(Integer goalCategoryId) {
    this.goalCategoryId = goalCategoryId;
    return this;
  }

  /**
   * Get goalCategoryId
   * @return goalCategoryId
  */
  @NotNull 
  @Schema(name = "goalCategoryId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("goalCategoryId")
  public Integer getGoalCategoryId() {
    return goalCategoryId;
  }

  public void setGoalCategoryId(Integer goalCategoryId) {
    this.goalCategoryId = goalCategoryId;
  }

  public CreateGoalView isCompleted(Boolean isCompleted) {
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

  public CreateGoalView goalMileStones(List<@Valid GoalMileStone> goalMileStones) {
    this.goalMileStones = JsonNullable.of(goalMileStones);
    return this;
  }

  public CreateGoalView addGoalMileStonesItem(GoalMileStone goalMileStonesItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGoalView createGoalView = (CreateGoalView) o;
    return Objects.equals(this.goalId, createGoalView.goalId) &&
        Objects.equals(this.userId, createGoalView.userId) &&
        Objects.equals(this.goalTitle, createGoalView.goalTitle) &&
        Objects.equals(this.goalDescription, createGoalView.goalDescription) &&
        Objects.equals(this.goalStartDate, createGoalView.goalStartDate) &&
        equalsNullable(this.goalExpectedEndDate, createGoalView.goalExpectedEndDate) &&
        Objects.equals(this.goalCategoryId, createGoalView.goalCategoryId) &&
        Objects.equals(this.isCompleted, createGoalView.isCompleted) &&
        equalsNullable(this.goalMileStones, createGoalView.goalMileStones);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(goalId, userId, goalTitle, goalDescription, goalStartDate, hashCodeNullable(goalExpectedEndDate), goalCategoryId, isCompleted, hashCodeNullable(goalMileStones));
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
    sb.append("class CreateGoalView {\n");
    sb.append("    goalId: ").append(toIndentedString(goalId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    goalTitle: ").append(toIndentedString(goalTitle)).append("\n");
    sb.append("    goalDescription: ").append(toIndentedString(goalDescription)).append("\n");
    sb.append("    goalStartDate: ").append(toIndentedString(goalStartDate)).append("\n");
    sb.append("    goalExpectedEndDate: ").append(toIndentedString(goalExpectedEndDate)).append("\n");
    sb.append("    goalCategoryId: ").append(toIndentedString(goalCategoryId)).append("\n");
    sb.append("    isCompleted: ").append(toIndentedString(isCompleted)).append("\n");
    sb.append("    goalMileStones: ").append(toIndentedString(goalMileStones)).append("\n");
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

