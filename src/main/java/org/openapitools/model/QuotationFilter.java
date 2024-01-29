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
 * QuotationFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class QuotationFilter {

  private JsonNullable<Integer> farmerId = JsonNullable.<Integer>undefined();

  private JsonNullable<String> rfqName = JsonNullable.<String>undefined();

  private JsonNullable<String> foodItemName = JsonNullable.<String>undefined();

  private JsonNullable<Integer> categoryId = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> talukaId = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> cityId = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> districtId = JsonNullable.<Integer>undefined();

  public QuotationFilter farmerId(Integer farmerId) {
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

  public QuotationFilter rfqName(String rfqName) {
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

  public QuotationFilter foodItemName(String foodItemName) {
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

  public QuotationFilter categoryId(Integer categoryId) {
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

  public QuotationFilter talukaId(Integer talukaId) {
    this.talukaId = JsonNullable.of(talukaId);
    return this;
  }

  /**
   * Get talukaId
   * @return talukaId
  */
  
  @Schema(name = "talukaId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("talukaId")
  public JsonNullable<Integer> getTalukaId() {
    return talukaId;
  }

  public void setTalukaId(JsonNullable<Integer> talukaId) {
    this.talukaId = talukaId;
  }

  public QuotationFilter cityId(Integer cityId) {
    this.cityId = JsonNullable.of(cityId);
    return this;
  }

  /**
   * Get cityId
   * @return cityId
  */
  
  @Schema(name = "cityId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cityId")
  public JsonNullable<Integer> getCityId() {
    return cityId;
  }

  public void setCityId(JsonNullable<Integer> cityId) {
    this.cityId = cityId;
  }

  public QuotationFilter districtId(Integer districtId) {
    this.districtId = JsonNullable.of(districtId);
    return this;
  }

  /**
   * Get districtId
   * @return districtId
  */
  
  @Schema(name = "districtId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("districtId")
  public JsonNullable<Integer> getDistrictId() {
    return districtId;
  }

  public void setDistrictId(JsonNullable<Integer> districtId) {
    this.districtId = districtId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotationFilter quotationFilter = (QuotationFilter) o;
    return equalsNullable(this.farmerId, quotationFilter.farmerId) &&
        equalsNullable(this.rfqName, quotationFilter.rfqName) &&
        equalsNullable(this.foodItemName, quotationFilter.foodItemName) &&
        equalsNullable(this.categoryId, quotationFilter.categoryId) &&
        equalsNullable(this.talukaId, quotationFilter.talukaId) &&
        equalsNullable(this.cityId, quotationFilter.cityId) &&
        equalsNullable(this.districtId, quotationFilter.districtId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(farmerId), hashCodeNullable(rfqName), hashCodeNullable(foodItemName), hashCodeNullable(categoryId), hashCodeNullable(talukaId), hashCodeNullable(cityId), hashCodeNullable(districtId));
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
    sb.append("class QuotationFilter {\n");
    sb.append("    farmerId: ").append(toIndentedString(farmerId)).append("\n");
    sb.append("    rfqName: ").append(toIndentedString(rfqName)).append("\n");
    sb.append("    foodItemName: ").append(toIndentedString(foodItemName)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    talukaId: ").append(toIndentedString(talukaId)).append("\n");
    sb.append("    cityId: ").append(toIndentedString(cityId)).append("\n");
    sb.append("    districtId: ").append(toIndentedString(districtId)).append("\n");
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

