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
 * FoodItemView
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class FoodItemView {

  private Integer itemId;

  private JsonNullable<String> itemName = JsonNullable.<String>undefined();

  private Boolean isVeg;

  private Double fullPrice;

  private Double halfPrice;

  private Boolean isAvailable;

  private JsonNullable<Boolean> isHalf = JsonNullable.<Boolean>undefined();

  private Integer foodItemTypeId;

  private JsonNullable<String> message = JsonNullable.<String>undefined();

  private Boolean result;

  public FoodItemView itemId(Integer itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * Get itemId
   * @return itemId
  */
  
  @Schema(name = "ItemId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ItemId")
  public Integer getItemId() {
    return itemId;
  }

  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }

  public FoodItemView itemName(String itemName) {
    this.itemName = JsonNullable.of(itemName);
    return this;
  }

  /**
   * Get itemName
   * @return itemName
  */
  
  @Schema(name = "ItemName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ItemName")
  public JsonNullable<String> getItemName() {
    return itemName;
  }

  public void setItemName(JsonNullable<String> itemName) {
    this.itemName = itemName;
  }

  public FoodItemView isVeg(Boolean isVeg) {
    this.isVeg = isVeg;
    return this;
  }

  /**
   * Get isVeg
   * @return isVeg
  */
  
  @Schema(name = "IsVeg", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsVeg")
  public Boolean getIsVeg() {
    return isVeg;
  }

  public void setIsVeg(Boolean isVeg) {
    this.isVeg = isVeg;
  }

  public FoodItemView fullPrice(Double fullPrice) {
    this.fullPrice = fullPrice;
    return this;
  }

  /**
   * Get fullPrice
   * @return fullPrice
  */
  
  @Schema(name = "FullPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FullPrice")
  public Double getFullPrice() {
    return fullPrice;
  }

  public void setFullPrice(Double fullPrice) {
    this.fullPrice = fullPrice;
  }

  public FoodItemView halfPrice(Double halfPrice) {
    this.halfPrice = halfPrice;
    return this;
  }

  /**
   * Get halfPrice
   * @return halfPrice
  */
  
  @Schema(name = "HalfPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HalfPrice")
  public Double getHalfPrice() {
    return halfPrice;
  }

  public void setHalfPrice(Double halfPrice) {
    this.halfPrice = halfPrice;
  }

  public FoodItemView isAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
    return this;
  }

  /**
   * Get isAvailable
   * @return isAvailable
  */
  
  @Schema(name = "IsAvailable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsAvailable")
  public Boolean getIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  public FoodItemView isHalf(Boolean isHalf) {
    this.isHalf = JsonNullable.of(isHalf);
    return this;
  }

  /**
   * Get isHalf
   * @return isHalf
  */
  
  @Schema(name = "IsHalf", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsHalf")
  public JsonNullable<Boolean> getIsHalf() {
    return isHalf;
  }

  public void setIsHalf(JsonNullable<Boolean> isHalf) {
    this.isHalf = isHalf;
  }

  public FoodItemView foodItemTypeId(Integer foodItemTypeId) {
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

  public FoodItemView message(String message) {
    this.message = JsonNullable.of(message);
    return this;
  }

  /**
   * Get message
   * @return message
  */
  
  @Schema(name = "Message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Message")
  public JsonNullable<String> getMessage() {
    return message;
  }

  public void setMessage(JsonNullable<String> message) {
    this.message = message;
  }

  public FoodItemView result(Boolean result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  */
  
  @Schema(name = "Result", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Result")
  public Boolean getResult() {
    return result;
  }

  public void setResult(Boolean result) {
    this.result = result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FoodItemView foodItemView = (FoodItemView) o;
    return Objects.equals(this.itemId, foodItemView.itemId) &&
        equalsNullable(this.itemName, foodItemView.itemName) &&
        Objects.equals(this.isVeg, foodItemView.isVeg) &&
        Objects.equals(this.fullPrice, foodItemView.fullPrice) &&
        Objects.equals(this.halfPrice, foodItemView.halfPrice) &&
        Objects.equals(this.isAvailable, foodItemView.isAvailable) &&
        equalsNullable(this.isHalf, foodItemView.isHalf) &&
        Objects.equals(this.foodItemTypeId, foodItemView.foodItemTypeId) &&
        equalsNullable(this.message, foodItemView.message) &&
        Objects.equals(this.result, foodItemView.result);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, hashCodeNullable(itemName), isVeg, fullPrice, halfPrice, isAvailable, hashCodeNullable(isHalf), foodItemTypeId, hashCodeNullable(message), result);
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
    sb.append("class FoodItemView {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    isVeg: ").append(toIndentedString(isVeg)).append("\n");
    sb.append("    fullPrice: ").append(toIndentedString(fullPrice)).append("\n");
    sb.append("    halfPrice: ").append(toIndentedString(halfPrice)).append("\n");
    sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
    sb.append("    isHalf: ").append(toIndentedString(isHalf)).append("\n");
    sb.append("    foodItemTypeId: ").append(toIndentedString(foodItemTypeId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

