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
 * FoodItemMaster
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class FoodItemMaster {

  private Integer foodItemId;

  private Integer foodCategoryId;

  private JsonNullable<String> foodItemName = JsonNullable.<String>undefined();

  private JsonNullable<Boolean> isActive = JsonNullable.<Boolean>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> createdDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<Boolean> isSeasonal = JsonNullable.<Boolean>undefined();

  private JsonNullable<String> packagingType = JsonNullable.<String>undefined();

  private JsonNullable<String> shelfLifePeriod = JsonNullable.<String>undefined();

  private JsonNullable<String> imageUrl = JsonNullable.<String>undefined();

  public FoodItemMaster foodItemId(Integer foodItemId) {
    this.foodItemId = foodItemId;
    return this;
  }

  /**
   * Get foodItemId
   * @return foodItemId
  */
  
  @Schema(name = "foodItemId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("foodItemId")
  public Integer getFoodItemId() {
    return foodItemId;
  }

  public void setFoodItemId(Integer foodItemId) {
    this.foodItemId = foodItemId;
  }

  public FoodItemMaster foodCategoryId(Integer foodCategoryId) {
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

  public FoodItemMaster foodItemName(String foodItemName) {
    this.foodItemName = JsonNullable.of(foodItemName);
    return this;
  }

  /**
   * Get foodItemName
   * @return foodItemName
  */
  
  @Schema(name = "foodItemName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("foodItemName")
  public JsonNullable<String> getFoodItemName() {
    return foodItemName;
  }

  public void setFoodItemName(JsonNullable<String> foodItemName) {
    this.foodItemName = foodItemName;
  }

  public FoodItemMaster isActive(Boolean isActive) {
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

  public FoodItemMaster createdDate(OffsetDateTime createdDate) {
    this.createdDate = JsonNullable.of(createdDate);
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  @Valid 
  @Schema(name = "createdDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdDate")
  public JsonNullable<OffsetDateTime> getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(JsonNullable<OffsetDateTime> createdDate) {
    this.createdDate = createdDate;
  }

  public FoodItemMaster isSeasonal(Boolean isSeasonal) {
    this.isSeasonal = JsonNullable.of(isSeasonal);
    return this;
  }

  /**
   * Get isSeasonal
   * @return isSeasonal
  */
  
  @Schema(name = "isSeasonal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isSeasonal")
  public JsonNullable<Boolean> getIsSeasonal() {
    return isSeasonal;
  }

  public void setIsSeasonal(JsonNullable<Boolean> isSeasonal) {
    this.isSeasonal = isSeasonal;
  }

  public FoodItemMaster packagingType(String packagingType) {
    this.packagingType = JsonNullable.of(packagingType);
    return this;
  }

  /**
   * Get packagingType
   * @return packagingType
  */
  
  @Schema(name = "packagingType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("packagingType")
  public JsonNullable<String> getPackagingType() {
    return packagingType;
  }

  public void setPackagingType(JsonNullable<String> packagingType) {
    this.packagingType = packagingType;
  }

  public FoodItemMaster shelfLifePeriod(String shelfLifePeriod) {
    this.shelfLifePeriod = JsonNullable.of(shelfLifePeriod);
    return this;
  }

  /**
   * Get shelfLifePeriod
   * @return shelfLifePeriod
  */
  
  @Schema(name = "shelfLifePeriod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shelfLifePeriod")
  public JsonNullable<String> getShelfLifePeriod() {
    return shelfLifePeriod;
  }

  public void setShelfLifePeriod(JsonNullable<String> shelfLifePeriod) {
    this.shelfLifePeriod = shelfLifePeriod;
  }

  public FoodItemMaster imageUrl(String imageUrl) {
    this.imageUrl = JsonNullable.of(imageUrl);
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
  */
  
  @Schema(name = "imageUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imageUrl")
  public JsonNullable<String> getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(JsonNullable<String> imageUrl) {
    this.imageUrl = imageUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FoodItemMaster foodItemMaster = (FoodItemMaster) o;
    return Objects.equals(this.foodItemId, foodItemMaster.foodItemId) &&
        Objects.equals(this.foodCategoryId, foodItemMaster.foodCategoryId) &&
        equalsNullable(this.foodItemName, foodItemMaster.foodItemName) &&
        equalsNullable(this.isActive, foodItemMaster.isActive) &&
        equalsNullable(this.createdDate, foodItemMaster.createdDate) &&
        equalsNullable(this.isSeasonal, foodItemMaster.isSeasonal) &&
        equalsNullable(this.packagingType, foodItemMaster.packagingType) &&
        equalsNullable(this.shelfLifePeriod, foodItemMaster.shelfLifePeriod) &&
        equalsNullable(this.imageUrl, foodItemMaster.imageUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(foodItemId, foodCategoryId, hashCodeNullable(foodItemName), hashCodeNullable(isActive), hashCodeNullable(createdDate), hashCodeNullable(isSeasonal), hashCodeNullable(packagingType), hashCodeNullable(shelfLifePeriod), hashCodeNullable(imageUrl));
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
    sb.append("class FoodItemMaster {\n");
    sb.append("    foodItemId: ").append(toIndentedString(foodItemId)).append("\n");
    sb.append("    foodCategoryId: ").append(toIndentedString(foodCategoryId)).append("\n");
    sb.append("    foodItemName: ").append(toIndentedString(foodItemName)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    isSeasonal: ").append(toIndentedString(isSeasonal)).append("\n");
    sb.append("    packagingType: ").append(toIndentedString(packagingType)).append("\n");
    sb.append("    shelfLifePeriod: ").append(toIndentedString(shelfLifePeriod)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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

