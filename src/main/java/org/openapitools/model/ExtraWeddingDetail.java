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
 * ExtraWeddingDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class ExtraWeddingDetail {

  private Integer detailId;

  private Integer serviceId;

  private Integer noOfPax;

  private Double rate;

  private Double total;

  private Integer weddingId;

  private JsonNullable<String> requirment = JsonNullable.<String>undefined();

  public ExtraWeddingDetail detailId(Integer detailId) {
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

  public ExtraWeddingDetail serviceId(Integer serviceId) {
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

  public ExtraWeddingDetail noOfPax(Integer noOfPax) {
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

  public ExtraWeddingDetail rate(Double rate) {
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

  public ExtraWeddingDetail total(Double total) {
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

  public ExtraWeddingDetail weddingId(Integer weddingId) {
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

  public ExtraWeddingDetail requirment(String requirment) {
    this.requirment = JsonNullable.of(requirment);
    return this;
  }

  /**
   * Get requirment
   * @return requirment
  */
  
  @Schema(name = "Requirment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Requirment")
  public JsonNullable<String> getRequirment() {
    return requirment;
  }

  public void setRequirment(JsonNullable<String> requirment) {
    this.requirment = requirment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtraWeddingDetail extraWeddingDetail = (ExtraWeddingDetail) o;
    return Objects.equals(this.detailId, extraWeddingDetail.detailId) &&
        Objects.equals(this.serviceId, extraWeddingDetail.serviceId) &&
        Objects.equals(this.noOfPax, extraWeddingDetail.noOfPax) &&
        Objects.equals(this.rate, extraWeddingDetail.rate) &&
        Objects.equals(this.total, extraWeddingDetail.total) &&
        Objects.equals(this.weddingId, extraWeddingDetail.weddingId) &&
        equalsNullable(this.requirment, extraWeddingDetail.requirment);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(detailId, serviceId, noOfPax, rate, total, weddingId, hashCodeNullable(requirment));
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
    sb.append("class ExtraWeddingDetail {\n");
    sb.append("    detailId: ").append(toIndentedString(detailId)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    noOfPax: ").append(toIndentedString(noOfPax)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    weddingId: ").append(toIndentedString(weddingId)).append("\n");
    sb.append("    requirment: ").append(toIndentedString(requirment)).append("\n");
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

