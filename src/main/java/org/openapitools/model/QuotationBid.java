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
 * QuotationBid
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class QuotationBid {

  private Integer bidId;

  private Integer quotationId;

  private Integer userId;

  private Double quotedRate;

  private JsonNullable<String> naration = JsonNullable.<String>undefined();

  private JsonNullable<Boolean> isAwarded = JsonNullable.<Boolean>undefined();

  private Integer vendorId;

  public QuotationBid bidId(Integer bidId) {
    this.bidId = bidId;
    return this;
  }

  /**
   * Get bidId
   * @return bidId
  */
  
  @Schema(name = "bidId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bidId")
  public Integer getBidId() {
    return bidId;
  }

  public void setBidId(Integer bidId) {
    this.bidId = bidId;
  }

  public QuotationBid quotationId(Integer quotationId) {
    this.quotationId = quotationId;
    return this;
  }

  /**
   * Get quotationId
   * @return quotationId
  */
  
  @Schema(name = "quotationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quotationId")
  public Integer getQuotationId() {
    return quotationId;
  }

  public void setQuotationId(Integer quotationId) {
    this.quotationId = quotationId;
  }

  public QuotationBid userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public QuotationBid quotedRate(Double quotedRate) {
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

  public QuotationBid naration(String naration) {
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

  public QuotationBid isAwarded(Boolean isAwarded) {
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

  public QuotationBid vendorId(Integer vendorId) {
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
    QuotationBid quotationBid = (QuotationBid) o;
    return Objects.equals(this.bidId, quotationBid.bidId) &&
        Objects.equals(this.quotationId, quotationBid.quotationId) &&
        Objects.equals(this.userId, quotationBid.userId) &&
        Objects.equals(this.quotedRate, quotationBid.quotedRate) &&
        equalsNullable(this.naration, quotationBid.naration) &&
        equalsNullable(this.isAwarded, quotationBid.isAwarded) &&
        Objects.equals(this.vendorId, quotationBid.vendorId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidId, quotationId, userId, quotedRate, hashCodeNullable(naration), hashCodeNullable(isAwarded), vendorId);
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
    sb.append("class QuotationBid {\n");
    sb.append("    bidId: ").append(toIndentedString(bidId)).append("\n");
    sb.append("    quotationId: ").append(toIndentedString(quotationId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

