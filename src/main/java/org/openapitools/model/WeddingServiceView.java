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
 * WeddingServiceView
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class WeddingServiceView {

  private Integer serviceId;

  private Double rate;

  private Boolean isActive;

  private Boolean isDeleted;

  private Boolean isPax;

  private JsonNullable<String> message = JsonNullable.<String>undefined();

  private Integer orderNo;

  private Boolean result;

  private JsonNullable<String> serviceType = JsonNullable.<String>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public WeddingServiceView serviceId(Integer serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Get serviceId
   * @return serviceId
  */
  
  @Schema(name = "ServiceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServiceId")
  public Integer getServiceId() {
    return serviceId;
  }

  public void setServiceId(Integer serviceId) {
    this.serviceId = serviceId;
  }

  public WeddingServiceView rate(Double rate) {
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

  public WeddingServiceView isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
  */
  
  @Schema(name = "IsActive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsActive")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public WeddingServiceView isDeleted(Boolean isDeleted) {
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

  public WeddingServiceView isPax(Boolean isPax) {
    this.isPax = isPax;
    return this;
  }

  /**
   * Get isPax
   * @return isPax
  */
  
  @Schema(name = "IsPax", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsPax")
  public Boolean getIsPax() {
    return isPax;
  }

  public void setIsPax(Boolean isPax) {
    this.isPax = isPax;
  }

  public WeddingServiceView message(String message) {
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

  public WeddingServiceView orderNo(Integer orderNo) {
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

  public WeddingServiceView result(Boolean result) {
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

  public WeddingServiceView serviceType(String serviceType) {
    this.serviceType = JsonNullable.of(serviceType);
    return this;
  }

  /**
   * Get serviceType
   * @return serviceType
  */
  
  @Schema(name = "ServiceType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServiceType")
  public JsonNullable<String> getServiceType() {
    return serviceType;
  }

  public void setServiceType(JsonNullable<String> serviceType) {
    this.serviceType = serviceType;
  }

  public WeddingServiceView name(String name) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeddingServiceView weddingServiceView = (WeddingServiceView) o;
    return Objects.equals(this.serviceId, weddingServiceView.serviceId) &&
        Objects.equals(this.rate, weddingServiceView.rate) &&
        Objects.equals(this.isActive, weddingServiceView.isActive) &&
        Objects.equals(this.isDeleted, weddingServiceView.isDeleted) &&
        Objects.equals(this.isPax, weddingServiceView.isPax) &&
        equalsNullable(this.message, weddingServiceView.message) &&
        Objects.equals(this.orderNo, weddingServiceView.orderNo) &&
        Objects.equals(this.result, weddingServiceView.result) &&
        equalsNullable(this.serviceType, weddingServiceView.serviceType) &&
        equalsNullable(this.name, weddingServiceView.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceId, rate, isActive, isDeleted, isPax, hashCodeNullable(message), orderNo, result, hashCodeNullable(serviceType), hashCodeNullable(name));
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
    sb.append("class WeddingServiceView {\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    isPax: ").append(toIndentedString(isPax)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

