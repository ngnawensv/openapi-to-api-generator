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
 * WeddingFoodItemList
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class WeddingFoodItemList {

  private Integer weddingFoodItemId;

  private Integer foodItemId;

  private JsonNullable<String> foodItemName = JsonNullable.<String>undefined();

  private Double rateGiven;

  private Integer noOfPax;

  private JsonNullable<String> details = JsonNullable.<String>undefined();

  private Integer weddingId;

  private Integer detailId;

  private Integer weddingServiceId;

  private JsonNullable<String> serviceName = JsonNullable.<String>undefined();

  public WeddingFoodItemList weddingFoodItemId(Integer weddingFoodItemId) {
    this.weddingFoodItemId = weddingFoodItemId;
    return this;
  }

  /**
   * Get weddingFoodItemId
   * @return weddingFoodItemId
  */
  
  @Schema(name = "WeddingFoodItemId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("WeddingFoodItemId")
  public Integer getWeddingFoodItemId() {
    return weddingFoodItemId;
  }

  public void setWeddingFoodItemId(Integer weddingFoodItemId) {
    this.weddingFoodItemId = weddingFoodItemId;
  }

  public WeddingFoodItemList foodItemId(Integer foodItemId) {
    this.foodItemId = foodItemId;
    return this;
  }

  /**
   * Get foodItemId
   * @return foodItemId
  */
  
  @Schema(name = "FoodItemId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FoodItemId")
  public Integer getFoodItemId() {
    return foodItemId;
  }

  public void setFoodItemId(Integer foodItemId) {
    this.foodItemId = foodItemId;
  }

  public WeddingFoodItemList foodItemName(String foodItemName) {
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

  public WeddingFoodItemList rateGiven(Double rateGiven) {
    this.rateGiven = rateGiven;
    return this;
  }

  /**
   * Get rateGiven
   * @return rateGiven
  */
  
  @Schema(name = "RateGiven", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RateGiven")
  public Double getRateGiven() {
    return rateGiven;
  }

  public void setRateGiven(Double rateGiven) {
    this.rateGiven = rateGiven;
  }

  public WeddingFoodItemList noOfPax(Integer noOfPax) {
    this.noOfPax = noOfPax;
    return this;
  }

  /**
   * Get noOfPax
   * @return noOfPax
  */
  
  @Schema(name = "NoOfPax", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NoOfPax")
  public Integer getNoOfPax() {
    return noOfPax;
  }

  public void setNoOfPax(Integer noOfPax) {
    this.noOfPax = noOfPax;
  }

  public WeddingFoodItemList details(String details) {
    this.details = JsonNullable.of(details);
    return this;
  }

  /**
   * Get details
   * @return details
  */
  
  @Schema(name = "Details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Details")
  public JsonNullable<String> getDetails() {
    return details;
  }

  public void setDetails(JsonNullable<String> details) {
    this.details = details;
  }

  public WeddingFoodItemList weddingId(Integer weddingId) {
    this.weddingId = weddingId;
    return this;
  }

  /**
   * Get weddingId
   * @return weddingId
  */
  
  @Schema(name = "WeddingId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("WeddingId")
  public Integer getWeddingId() {
    return weddingId;
  }

  public void setWeddingId(Integer weddingId) {
    this.weddingId = weddingId;
  }

  public WeddingFoodItemList detailId(Integer detailId) {
    this.detailId = detailId;
    return this;
  }

  /**
   * Get detailId
   * @return detailId
  */
  
  @Schema(name = "DetailId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DetailId")
  public Integer getDetailId() {
    return detailId;
  }

  public void setDetailId(Integer detailId) {
    this.detailId = detailId;
  }

  public WeddingFoodItemList weddingServiceId(Integer weddingServiceId) {
    this.weddingServiceId = weddingServiceId;
    return this;
  }

  /**
   * Get weddingServiceId
   * @return weddingServiceId
  */
  
  @Schema(name = "WeddingServiceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("WeddingServiceId")
  public Integer getWeddingServiceId() {
    return weddingServiceId;
  }

  public void setWeddingServiceId(Integer weddingServiceId) {
    this.weddingServiceId = weddingServiceId;
  }

  public WeddingFoodItemList serviceName(String serviceName) {
    this.serviceName = JsonNullable.of(serviceName);
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
  */
  
  @Schema(name = "ServiceName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServiceName")
  public JsonNullable<String> getServiceName() {
    return serviceName;
  }

  public void setServiceName(JsonNullable<String> serviceName) {
    this.serviceName = serviceName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeddingFoodItemList weddingFoodItemList = (WeddingFoodItemList) o;
    return Objects.equals(this.weddingFoodItemId, weddingFoodItemList.weddingFoodItemId) &&
        Objects.equals(this.foodItemId, weddingFoodItemList.foodItemId) &&
        equalsNullable(this.foodItemName, weddingFoodItemList.foodItemName) &&
        Objects.equals(this.rateGiven, weddingFoodItemList.rateGiven) &&
        Objects.equals(this.noOfPax, weddingFoodItemList.noOfPax) &&
        equalsNullable(this.details, weddingFoodItemList.details) &&
        Objects.equals(this.weddingId, weddingFoodItemList.weddingId) &&
        Objects.equals(this.detailId, weddingFoodItemList.detailId) &&
        Objects.equals(this.weddingServiceId, weddingFoodItemList.weddingServiceId) &&
        equalsNullable(this.serviceName, weddingFoodItemList.serviceName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(weddingFoodItemId, foodItemId, hashCodeNullable(foodItemName), rateGiven, noOfPax, hashCodeNullable(details), weddingId, detailId, weddingServiceId, hashCodeNullable(serviceName));
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
    sb.append("class WeddingFoodItemList {\n");
    sb.append("    weddingFoodItemId: ").append(toIndentedString(weddingFoodItemId)).append("\n");
    sb.append("    foodItemId: ").append(toIndentedString(foodItemId)).append("\n");
    sb.append("    foodItemName: ").append(toIndentedString(foodItemName)).append("\n");
    sb.append("    rateGiven: ").append(toIndentedString(rateGiven)).append("\n");
    sb.append("    noOfPax: ").append(toIndentedString(noOfPax)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    weddingId: ").append(toIndentedString(weddingId)).append("\n");
    sb.append("    detailId: ").append(toIndentedString(detailId)).append("\n");
    sb.append("    weddingServiceId: ").append(toIndentedString(weddingServiceId)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
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

