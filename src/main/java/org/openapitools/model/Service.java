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
 * Service
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class Service {

  private Integer serviceId;

  private JsonNullable<String> serviceName = JsonNullable.<String>undefined();

  private Double taxableAmount;

  private Double cgst;

  private Double sgst;

  private Boolean isActive;

  private Boolean isDeleted;

  public Service serviceId(Integer serviceId) {
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

  public Service serviceName(String serviceName) {
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

  public Service taxableAmount(Double taxableAmount) {
    this.taxableAmount = taxableAmount;
    return this;
  }

  /**
   * Get taxableAmount
   * @return taxableAmount
  */
  
  @Schema(name = "TaxableAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TaxableAmount")
  public Double getTaxableAmount() {
    return taxableAmount;
  }

  public void setTaxableAmount(Double taxableAmount) {
    this.taxableAmount = taxableAmount;
  }

  public Service cgst(Double cgst) {
    this.cgst = cgst;
    return this;
  }

  /**
   * Get cgst
   * @return cgst
  */
  
  @Schema(name = "Cgst", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Cgst")
  public Double getCgst() {
    return cgst;
  }

  public void setCgst(Double cgst) {
    this.cgst = cgst;
  }

  public Service sgst(Double sgst) {
    this.sgst = sgst;
    return this;
  }

  /**
   * Get sgst
   * @return sgst
  */
  
  @Schema(name = "Sgst", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Sgst")
  public Double getSgst() {
    return sgst;
  }

  public void setSgst(Double sgst) {
    this.sgst = sgst;
  }

  public Service isActive(Boolean isActive) {
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

  public Service isDeleted(Boolean isDeleted) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.serviceId, service.serviceId) &&
        equalsNullable(this.serviceName, service.serviceName) &&
        Objects.equals(this.taxableAmount, service.taxableAmount) &&
        Objects.equals(this.cgst, service.cgst) &&
        Objects.equals(this.sgst, service.sgst) &&
        Objects.equals(this.isActive, service.isActive) &&
        Objects.equals(this.isDeleted, service.isDeleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceId, hashCodeNullable(serviceName), taxableAmount, cgst, sgst, isActive, isDeleted);
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
    sb.append("class Service {\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    taxableAmount: ").append(toIndentedString(taxableAmount)).append("\n");
    sb.append("    cgst: ").append(toIndentedString(cgst)).append("\n");
    sb.append("    sgst: ").append(toIndentedString(sgst)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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

