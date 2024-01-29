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
 * FoodOrder
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class FoodOrder {

  private Integer orderId;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<Integer> serviceId = JsonNullable.<Integer>undefined();

  private JsonNullable<String> mobileNo = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime orderDate;

  private Double orderTotal;

  private JsonNullable<Integer> bookingId = JsonNullable.<Integer>undefined();

  private Integer userId;

  private JsonNullable<String> orderStatus = JsonNullable.<String>undefined();

  private Integer orderNo;

  private JsonNullable<String> orderUniqeId = JsonNullable.<String>undefined();

  public FoodOrder orderId(Integer orderId) {
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

  public FoodOrder name(String name) {
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

  public FoodOrder serviceId(Integer serviceId) {
    this.serviceId = JsonNullable.of(serviceId);
    return this;
  }

  /**
   * Get serviceId
   * @return serviceId
  */
  
  @Schema(name = "ServiceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServiceId")
  public JsonNullable<Integer> getServiceId() {
    return serviceId;
  }

  public void setServiceId(JsonNullable<Integer> serviceId) {
    this.serviceId = serviceId;
  }

  public FoodOrder mobileNo(String mobileNo) {
    this.mobileNo = JsonNullable.of(mobileNo);
    return this;
  }

  /**
   * Get mobileNo
   * @return mobileNo
  */
  
  @Schema(name = "MobileNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MobileNo")
  public JsonNullable<String> getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(JsonNullable<String> mobileNo) {
    this.mobileNo = mobileNo;
  }

  public FoodOrder orderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
    return this;
  }

  /**
   * Get orderDate
   * @return orderDate
  */
  @Valid 
  @Schema(name = "OrderDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OrderDate")
  public OffsetDateTime getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
  }

  public FoodOrder orderTotal(Double orderTotal) {
    this.orderTotal = orderTotal;
    return this;
  }

  /**
   * Get orderTotal
   * @return orderTotal
  */
  
  @Schema(name = "OrderTotal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OrderTotal")
  public Double getOrderTotal() {
    return orderTotal;
  }

  public void setOrderTotal(Double orderTotal) {
    this.orderTotal = orderTotal;
  }

  public FoodOrder bookingId(Integer bookingId) {
    this.bookingId = JsonNullable.of(bookingId);
    return this;
  }

  /**
   * Get bookingId
   * @return bookingId
  */
  
  @Schema(name = "BookingId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BookingId")
  public JsonNullable<Integer> getBookingId() {
    return bookingId;
  }

  public void setBookingId(JsonNullable<Integer> bookingId) {
    this.bookingId = bookingId;
  }

  public FoodOrder userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "UserId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserId")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public FoodOrder orderStatus(String orderStatus) {
    this.orderStatus = JsonNullable.of(orderStatus);
    return this;
  }

  /**
   * Get orderStatus
   * @return orderStatus
  */
  
  @Schema(name = "OrderStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OrderStatus")
  public JsonNullable<String> getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(JsonNullable<String> orderStatus) {
    this.orderStatus = orderStatus;
  }

  public FoodOrder orderNo(Integer orderNo) {
    this.orderNo = orderNo;
    return this;
  }

  /**
   * Get orderNo
   * @return orderNo
  */
  
  @Schema(name = "OrderNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OrderNo")
  public Integer getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(Integer orderNo) {
    this.orderNo = orderNo;
  }

  public FoodOrder orderUniqeId(String orderUniqeId) {
    this.orderUniqeId = JsonNullable.of(orderUniqeId);
    return this;
  }

  /**
   * Get orderUniqeId
   * @return orderUniqeId
  */
  
  @Schema(name = "OrderUniqeId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OrderUniqeId")
  public JsonNullable<String> getOrderUniqeId() {
    return orderUniqeId;
  }

  public void setOrderUniqeId(JsonNullable<String> orderUniqeId) {
    this.orderUniqeId = orderUniqeId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FoodOrder foodOrder = (FoodOrder) o;
    return Objects.equals(this.orderId, foodOrder.orderId) &&
        equalsNullable(this.name, foodOrder.name) &&
        equalsNullable(this.serviceId, foodOrder.serviceId) &&
        equalsNullable(this.mobileNo, foodOrder.mobileNo) &&
        Objects.equals(this.orderDate, foodOrder.orderDate) &&
        Objects.equals(this.orderTotal, foodOrder.orderTotal) &&
        equalsNullable(this.bookingId, foodOrder.bookingId) &&
        Objects.equals(this.userId, foodOrder.userId) &&
        equalsNullable(this.orderStatus, foodOrder.orderStatus) &&
        Objects.equals(this.orderNo, foodOrder.orderNo) &&
        equalsNullable(this.orderUniqeId, foodOrder.orderUniqeId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, hashCodeNullable(name), hashCodeNullable(serviceId), hashCodeNullable(mobileNo), orderDate, orderTotal, hashCodeNullable(bookingId), userId, hashCodeNullable(orderStatus), orderNo, hashCodeNullable(orderUniqeId));
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
    sb.append("class FoodOrder {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    orderTotal: ").append(toIndentedString(orderTotal)).append("\n");
    sb.append("    bookingId: ").append(toIndentedString(bookingId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    orderUniqeId: ").append(toIndentedString(orderUniqeId)).append("\n");
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

