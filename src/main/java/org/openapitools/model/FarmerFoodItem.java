package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FarmerFoodItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class FarmerFoodItem {

  private Integer farmerFoodItemId;

  private Integer foodItemId;

  private Integer farmerId;

  public FarmerFoodItem farmerFoodItemId(Integer farmerFoodItemId) {
    this.farmerFoodItemId = farmerFoodItemId;
    return this;
  }

  /**
   * Get farmerFoodItemId
   * @return farmerFoodItemId
  */
  
  @Schema(name = "farmerFoodItemId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("farmerFoodItemId")
  public Integer getFarmerFoodItemId() {
    return farmerFoodItemId;
  }

  public void setFarmerFoodItemId(Integer farmerFoodItemId) {
    this.farmerFoodItemId = farmerFoodItemId;
  }

  public FarmerFoodItem foodItemId(Integer foodItemId) {
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

  public FarmerFoodItem farmerId(Integer farmerId) {
    this.farmerId = farmerId;
    return this;
  }

  /**
   * Get farmerId
   * @return farmerId
  */
  
  @Schema(name = "farmerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("farmerId")
  public Integer getFarmerId() {
    return farmerId;
  }

  public void setFarmerId(Integer farmerId) {
    this.farmerId = farmerId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FarmerFoodItem farmerFoodItem = (FarmerFoodItem) o;
    return Objects.equals(this.farmerFoodItemId, farmerFoodItem.farmerFoodItemId) &&
        Objects.equals(this.foodItemId, farmerFoodItem.foodItemId) &&
        Objects.equals(this.farmerId, farmerFoodItem.farmerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(farmerFoodItemId, foodItemId, farmerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FarmerFoodItem {\n");
    sb.append("    farmerFoodItemId: ").append(toIndentedString(farmerFoodItemId)).append("\n");
    sb.append("    foodItemId: ").append(toIndentedString(foodItemId)).append("\n");
    sb.append("    farmerId: ").append(toIndentedString(farmerId)).append("\n");
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

