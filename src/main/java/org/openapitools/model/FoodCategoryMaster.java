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
 * FoodCategoryMaster
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class FoodCategoryMaster {

  private Integer foodCategoryId;

  private JsonNullable<String> foodCategoryName = JsonNullable.<String>undefined();

  private JsonNullable<Boolean> isActive = JsonNullable.<Boolean>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdDate;

  public FoodCategoryMaster foodCategoryId(Integer foodCategoryId) {
    this.foodCategoryId = foodCategoryId;
    return this;
  }

  /**
   * Get foodCategoryId
   * @return foodCategoryId
  */
  
  @Schema(name = "foodCategoryId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("foodCategoryId")
  public Integer getFoodCategoryId() {
    return foodCategoryId;
  }

  public void setFoodCategoryId(Integer foodCategoryId) {
    this.foodCategoryId = foodCategoryId;
  }

  public FoodCategoryMaster foodCategoryName(String foodCategoryName) {
    this.foodCategoryName = JsonNullable.of(foodCategoryName);
    return this;
  }

  /**
   * Get foodCategoryName
   * @return foodCategoryName
  */
  
  @Schema(name = "foodCategoryName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("foodCategoryName")
  public JsonNullable<String> getFoodCategoryName() {
    return foodCategoryName;
  }

  public void setFoodCategoryName(JsonNullable<String> foodCategoryName) {
    this.foodCategoryName = foodCategoryName;
  }

  public FoodCategoryMaster isActive(Boolean isActive) {
    this.isActive = JsonNullable.of(isActive);
    return this;
  }

  /**
   * Get isActive
   * @return isActive
  */
  
  @Schema(name = "isActive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isActive")
  public JsonNullable<Boolean> getIsActive() {
    return isActive;
  }

  public void setIsActive(JsonNullable<Boolean> isActive) {
    this.isActive = isActive;
  }

  public FoodCategoryMaster createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  @Valid 
  @Schema(name = "createdDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdDate")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FoodCategoryMaster foodCategoryMaster = (FoodCategoryMaster) o;
    return Objects.equals(this.foodCategoryId, foodCategoryMaster.foodCategoryId) &&
        equalsNullable(this.foodCategoryName, foodCategoryMaster.foodCategoryName) &&
        equalsNullable(this.isActive, foodCategoryMaster.isActive) &&
        Objects.equals(this.createdDate, foodCategoryMaster.createdDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(foodCategoryId, hashCodeNullable(foodCategoryName), hashCodeNullable(isActive), createdDate);
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
    sb.append("class FoodCategoryMaster {\n");
    sb.append("    foodCategoryId: ").append(toIndentedString(foodCategoryId)).append("\n");
    sb.append("    foodCategoryName: ").append(toIndentedString(foodCategoryName)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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

