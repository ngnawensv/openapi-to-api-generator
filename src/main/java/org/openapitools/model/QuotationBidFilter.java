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
 * QuotationBidFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class QuotationBidFilter {

  private JsonNullable<Integer> farmerId = JsonNullable.<Integer>undefined();

  private JsonNullable<String> rfqName = JsonNullable.<String>undefined();

  private JsonNullable<String> foodItemName = JsonNullable.<String>undefined();

  private JsonNullable<Integer> categoryId = JsonNullable.<Integer>undefined();

  private Double quotedRate;

  private JsonNullable<String> naration = JsonNullable.<String>undefined();

  private JsonNullable<Boolean> isAwarded = JsonNullable.<Boolean>undefined();

  private Integer vendorId;

  public QuotationBidFilter farmerId(Integer farmerId) {
    this.farmerId = JsonNullable.of(farmerId);
    return this;
  }

  /**
   * Get farmerId
   * @return farmerId
  */
  
  @Schema(name = "farmerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("farmerId")
  public JsonNullable<Integer> getFarmerId() {
    return farmerId;
  }

  public void setFarmerId(JsonNullable<Integer> farmerId) {
    this.farmerId = farmerId;
  }

  public QuotationBidFilter rfqName(String rfqName) {
    this.rfqName = JsonNullable.of(rfqName);
    return this;
  }

  /**
   * Get rfqName
   * @return rfqName
  */
  
  @Schema(name = "rfqName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rfqName")
  public JsonNullable<String> getRfqName() {
    return rfqName;
  }

  public void setRfqName(JsonNullable<String> rfqName) {
    this.rfqName = rfqName;
  }

  public QuotationBidFilter foodItemName(String foodItemName) {
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

  public QuotationBidFilter categoryId(Integer categoryId) {
    this.categoryId = JsonNullable.of(categoryId);
    return this;
  }

  /**
   * Get categoryId
   * @return categoryId
  */
  
  @Schema(name = "categoryId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryId")
  public JsonNullable<Integer> getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(JsonNullable<Integer> categoryId) {
    this.categoryId = categoryId;
  }

  public QuotationBidFilter quotedRate(Double quotedRate) {
    this.quotedRate = quotedRate;
    return this;
  }

  /**
   * Get quotedRate
   * @return quotedRate
  */
  
  @Schema(name = "quotedRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quotedRate")
  public Double getQuotedRate() {
    return quotedRate;
  }

  public void setQuotedRate(Double quotedRate) {
    this.quotedRate = quotedRate;
  }

  public QuotationBidFilter naration(String naration) {
    this.naration = JsonNullable.of(naration);
    return this;
  }

  /**
   * Get naration
   * @return naration
  */
  
  @Schema(name = "naration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("naration")
  public JsonNullable<String> getNaration() {
    return naration;
  }

  public void setNaration(JsonNullable<String> naration) {
    this.naration = naration;
  }

  public QuotationBidFilter isAwarded(Boolean isAwarded) {
    this.isAwarded = JsonNullable.of(isAwarded);
    return this;
  }

  /**
   * Get isAwarded
   * @return isAwarded
  */
  
  @Schema(name = "isAwarded", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isAwarded")
  public JsonNullable<Boolean> getIsAwarded() {
    return isAwarded;
  }

  public void setIsAwarded(JsonNullable<Boolean> isAwarded) {
    this.isAwarded = isAwarded;
  }

  public QuotationBidFilter vendorId(Integer vendorId) {
    this.vendorId = vendorId;
    return this;
  }

  /**
   * Get vendorId
   * @return vendorId
  */
  
  @Schema(name = "vendorId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vendorId")
  public Integer getVendorId() {
    return vendorId;
  }

  public void setVendorId(Integer vendorId) {
    this.vendorId = vendorId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotationBidFilter quotationBidFilter = (QuotationBidFilter) o;
    return equalsNullable(this.farmerId, quotationBidFilter.farmerId) &&
        equalsNullable(this.rfqName, quotationBidFilter.rfqName) &&
        equalsNullable(this.foodItemName, quotationBidFilter.foodItemName) &&
        equalsNullable(this.categoryId, quotationBidFilter.categoryId) &&
        Objects.equals(this.quotedRate, quotationBidFilter.quotedRate) &&
        equalsNullable(this.naration, quotationBidFilter.naration) &&
        equalsNullable(this.isAwarded, quotationBidFilter.isAwarded) &&
        Objects.equals(this.vendorId, quotationBidFilter.vendorId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(farmerId), hashCodeNullable(rfqName), hashCodeNullable(foodItemName), hashCodeNullable(categoryId), quotedRate, hashCodeNullable(naration), hashCodeNullable(isAwarded), vendorId);
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
    sb.append("class QuotationBidFilter {\n");
    sb.append("    farmerId: ").append(toIndentedString(farmerId)).append("\n");
    sb.append("    rfqName: ").append(toIndentedString(rfqName)).append("\n");
    sb.append("    foodItemName: ").append(toIndentedString(foodItemName)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    quotedRate: ").append(toIndentedString(quotedRate)).append("\n");
    sb.append("    naration: ").append(toIndentedString(naration)).append("\n");
    sb.append("    isAwarded: ").append(toIndentedString(isAwarded)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
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

