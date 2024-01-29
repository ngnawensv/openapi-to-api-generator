package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ZomatoOrderViewModel
 */

@JsonTypeName("zomatoOrderViewModel")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class ZomatoOrderViewModel {

  private Integer userId;

  private Double totalAmount;

  private Integer restaurantId;

  private String deliveryAddress;

  public ZomatoOrderViewModel() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ZomatoOrderViewModel(Integer userId, Double totalAmount, Integer restaurantId, String deliveryAddress) {
    this.userId = userId;
    this.totalAmount = totalAmount;
    this.restaurantId = restaurantId;
    this.deliveryAddress = deliveryAddress;
  }

  public ZomatoOrderViewModel userId(Integer userId) {
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

  public ZomatoOrderViewModel totalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Get totalAmount
   * @return totalAmount
  */
  @NotNull 
  @Schema(name = "totalAmount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalAmount")
  public Double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public ZomatoOrderViewModel restaurantId(Integer restaurantId) {
    this.restaurantId = restaurantId;
    return this;
  }

  /**
   * Get restaurantId
   * @return restaurantId
  */
  @NotNull 
  @Schema(name = "restaurantId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("restaurantId")
  public Integer getRestaurantId() {
    return restaurantId;
  }

  public void setRestaurantId(Integer restaurantId) {
    this.restaurantId = restaurantId;
  }

  public ZomatoOrderViewModel deliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

  /**
   * Get deliveryAddress
   * @return deliveryAddress
  */
  @NotNull 
  @Schema(name = "deliveryAddress", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deliveryAddress")
  public String getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZomatoOrderViewModel zomatoOrderViewModel = (ZomatoOrderViewModel) o;
    return Objects.equals(this.userId, zomatoOrderViewModel.userId) &&
        Objects.equals(this.totalAmount, zomatoOrderViewModel.totalAmount) &&
        Objects.equals(this.restaurantId, zomatoOrderViewModel.restaurantId) &&
        Objects.equals(this.deliveryAddress, zomatoOrderViewModel.deliveryAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, totalAmount, restaurantId, deliveryAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZomatoOrderViewModel {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    restaurantId: ").append(toIndentedString(restaurantId)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
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

