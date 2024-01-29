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
 * OfferView
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class OfferView {

  private Integer offerId;

  private JsonNullable<String> offerName = JsonNullable.<String>undefined();

  private JsonNullable<String> offerDetails = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdDate;

  private Boolean isDeleted;

  private Boolean isActive;

  private Double amount;

  private JsonNullable<String> message = JsonNullable.<String>undefined();

  private Boolean result;

  public OfferView offerId(Integer offerId) {
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

  public OfferView offerName(String offerName) {
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

  public OfferView offerDetails(String offerDetails) {
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

  public OfferView createdDate(OffsetDateTime createdDate) {
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

  public OfferView isDeleted(Boolean isDeleted) {
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

  public OfferView isActive(Boolean isActive) {
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

  public OfferView amount(Double amount) {
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

  public OfferView message(String message) {
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

  public OfferView result(Boolean result) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferView offerView = (OfferView) o;
    return Objects.equals(this.offerId, offerView.offerId) &&
        equalsNullable(this.offerName, offerView.offerName) &&
        equalsNullable(this.offerDetails, offerView.offerDetails) &&
        Objects.equals(this.createdDate, offerView.createdDate) &&
        Objects.equals(this.isDeleted, offerView.isDeleted) &&
        Objects.equals(this.isActive, offerView.isActive) &&
        Objects.equals(this.amount, offerView.amount) &&
        equalsNullable(this.message, offerView.message) &&
        Objects.equals(this.result, offerView.result);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, hashCodeNullable(offerName), hashCodeNullable(offerDetails), createdDate, isDeleted, isActive, amount, hashCodeNullable(message), result);
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
    sb.append("class OfferView {\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    offerName: ").append(toIndentedString(offerName)).append("\n");
    sb.append("    offerDetails: ").append(toIndentedString(offerDetails)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

