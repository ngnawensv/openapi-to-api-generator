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
 * Offer
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class Offer {

  private Integer offerId;

  private JsonNullable<String> offerName = JsonNullable.<String>undefined();

  private JsonNullable<String> offerDetails = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdDate;

  private Boolean isDeleted;

  private Boolean isActive;

  private Double amount;

  public Offer offerId(Integer offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * Get offerId
   * @return offerId
  */
  
  @Schema(name = "OfferId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OfferId")
  public Integer getOfferId() {
    return offerId;
  }

  public void setOfferId(Integer offerId) {
    this.offerId = offerId;
  }

  public Offer offerName(String offerName) {
    this.offerName = JsonNullable.of(offerName);
    return this;
  }

  /**
   * Get offerName
   * @return offerName
  */
  
  @Schema(name = "OfferName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OfferName")
  public JsonNullable<String> getOfferName() {
    return offerName;
  }

  public void setOfferName(JsonNullable<String> offerName) {
    this.offerName = offerName;
  }

  public Offer offerDetails(String offerDetails) {
    this.offerDetails = JsonNullable.of(offerDetails);
    return this;
  }

  /**
   * Get offerDetails
   * @return offerDetails
  */
  
  @Schema(name = "OfferDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OfferDetails")
  public JsonNullable<String> getOfferDetails() {
    return offerDetails;
  }

  public void setOfferDetails(JsonNullable<String> offerDetails) {
    this.offerDetails = offerDetails;
  }

  public Offer createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  @Valid 
  @Schema(name = "CreatedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreatedDate")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public Offer isDeleted(Boolean isDeleted) {
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

  public Offer isActive(Boolean isActive) {
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

  public Offer amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  
  @Schema(name = "Amount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Offer offer = (Offer) o;
    return Objects.equals(this.offerId, offer.offerId) &&
        equalsNullable(this.offerName, offer.offerName) &&
        equalsNullable(this.offerDetails, offer.offerDetails) &&
        Objects.equals(this.createdDate, offer.createdDate) &&
        Objects.equals(this.isDeleted, offer.isDeleted) &&
        Objects.equals(this.isActive, offer.isActive) &&
        Objects.equals(this.amount, offer.amount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, hashCodeNullable(offerName), hashCodeNullable(offerDetails), createdDate, isDeleted, isActive, amount);
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
    sb.append("class Offer {\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    offerName: ").append(toIndentedString(offerName)).append("\n");
    sb.append("    offerDetails: ").append(toIndentedString(offerDetails)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

