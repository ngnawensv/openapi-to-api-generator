package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * FoodItemType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class FoodItemType {

  private Integer foodItemTypeId;

  private JsonNullable<String> foodItemName = JsonNullable.<String>undefined();

  private Boolean isDeleted;

  public FoodItemType foodItemTypeId(Integer foodItemTypeId) {
    this.foodItemTypeId = foodItemTypeId;
    return this;
  }

  /**
   * Get foodItemTypeId
   * @return foodItemTypeId
  */
  
  @Schema(name = "FoodItemTypeId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FoodItemTypeId")
  public Integer getFoodItemTypeId() {
    return foodItemTypeId;
  }

  public void setFoodItemTypeId(Integer foodItemTypeId) {
    this.foodItemTypeId = foodItemTypeId;
  }

  public FoodItemType foodItemName(String foodItemName) {
    this.foodItemName = JsonNullable.of(foodItemName);
    return this;
  }

  /**
   * Get foodItemName
   * @return foodItemName
  */
  
  @Schema(name = "FoodItemName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FoodItemName")
  public JsonNullable<String> getFoodItemName() {
    return foodItemName;
  }

  public void setFoodItemName(JsonNullable<String> foodItemName) {
    this.foodItemName = foodItemName;
  }

  public FoodItemType isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Get isDeleted
   * @return isDeleted
  */
  
  @Schema(name = "IsDeleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsDeleted")
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FoodItemType foodItemType = (FoodItemType) o;
    return Objects.equals(this.foodItemTypeId, foodItemType.foodItemTypeId) &&
        equalsNullable(this.foodItemName, foodItemType.foodItemName) &&
        Objects.equals(this.isDeleted, foodItemType.isDeleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(foodItemTypeId, hashCodeNullable(foodItemName), isDeleted);
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
    sb.append("class FoodItemType {\n");
    sb.append("    foodItemTypeId: ").append(toIndentedString(foodItemTypeId)).append("\n");
    sb.append("    foodItemName: ").append(toIndentedString(foodItemName)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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

