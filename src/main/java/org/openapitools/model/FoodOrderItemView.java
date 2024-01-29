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
 * FoodOrderItemView
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class FoodOrderItemView {

  private Integer orderItemId;

  private Integer itemId;

  private Integer quantity;

  private Double rate;

  private JsonNullable<String> naration = JsonNullable.<String>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private Integer orderId;

  private Double total;

  public FoodOrderItemView orderItemId(Integer orderItemId) {
    this.orderItemId = orderItemId;
    return this;
  }

  /**
   * Get orderItemId
   * @return orderItemId
  */
  
  @Schema(name = "OrderItemId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OrderItemId")
  public Integer getOrderItemId() {
    return orderItemId;
  }

  public void setOrderItemId(Integer orderItemId) {
    this.orderItemId = orderItemId;
  }

  public FoodOrderItemView itemId(Integer itemId) {
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

  public FoodOrderItemView quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  */
  
  @Schema(name = "Quantity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public FoodOrderItemView rate(Double rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Get rate
   * @return rate
  */
  
  @Schema(name = "Rate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Rate")
  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }

  public FoodOrderItemView naration(String naration) {
    this.naration = JsonNullable.of(naration);
    return this;
  }

  /**
   * Get naration
   * @return naration
  */
  
  @Schema(name = "Naration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Naration")
  public JsonNullable<String> getNaration() {
    return naration;
  }

  public void setNaration(JsonNullable<String> naration) {
    this.naration = naration;
  }

  public FoodOrderItemView name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "Name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public FoodOrderItemView orderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
  */
  
  @Schema(name = "OrderId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OrderId")
  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public FoodOrderItemView total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  */
  
  @Schema(name = "Total", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Total")
  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FoodOrderItemView foodOrderItemView = (FoodOrderItemView) o;
    return Objects.equals(this.orderItemId, foodOrderItemView.orderItemId) &&
        Objects.equals(this.itemId, foodOrderItemView.itemId) &&
        Objects.equals(this.quantity, foodOrderItemView.quantity) &&
        Objects.equals(this.rate, foodOrderItemView.rate) &&
        equalsNullable(this.naration, foodOrderItemView.naration) &&
        equalsNullable(this.name, foodOrderItemView.name) &&
        Objects.equals(this.orderId, foodOrderItemView.orderId) &&
        Objects.equals(this.total, foodOrderItemView.total);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderItemId, itemId, quantity, rate, hashCodeNullable(naration), hashCodeNullable(name), orderId, total);
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
    sb.append("class FoodOrderItemView {\n");
    sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    naration: ").append(toIndentedString(naration)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

