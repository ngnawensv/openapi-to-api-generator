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
 * QuotationMasterView
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class QuotationMasterView {

  private Integer quotationId;

  private Integer farmerId;

  private JsonNullable<String> rfqName = JsonNullable.<String>undefined();

  private Integer foodItemId;

  private JsonNullable<String> quantity = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> quotationReleaseDate = JsonNullable.<OffsetDateTime>undefined();

  private Double proposedRate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime biddingStartDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> biddingEndDate = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> farmVisitStartDate = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> farmVisitEndDate = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> foodMaterialReadyDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<Boolean> isTransportationProvided = JsonNullable.<Boolean>undefined();

  private JsonNullable<String> extraDetails = JsonNullable.<String>undefined();

  private JsonNullable<String> photosUrls = JsonNullable.<String>undefined();

  public QuotationMasterView quotationId(Integer quotationId) {
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

  public QuotationMasterView farmerId(Integer farmerId) {
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

  public QuotationMasterView rfqName(String rfqName) {
    this.rfqName = JsonNullable.of(rfqName);
    return this;
  }

  /**
   * Get rfqName
   * @return rfqName
  */
  
  @Schema(name = "rfqName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rfqName")
  public JsonNullable<String> getRfqName() {
    return rfqName;
  }

  public void setRfqName(JsonNullable<String> rfqName) {
    this.rfqName = rfqName;
  }

  public QuotationMasterView foodItemId(Integer foodItemId) {
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

  public QuotationMasterView quantity(String quantity) {
    this.quantity = JsonNullable.of(quantity);
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  */
  
  @Schema(name = "quantity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quantity")
  public JsonNullable<String> getQuantity() {
    return quantity;
  }

  public void setQuantity(JsonNullable<String> quantity) {
    this.quantity = quantity;
  }

  public QuotationMasterView quotationReleaseDate(OffsetDateTime quotationReleaseDate) {
    this.quotationReleaseDate = JsonNullable.of(quotationReleaseDate);
    return this;
  }

  /**
   * Get quotationReleaseDate
   * @return quotationReleaseDate
  */
  @Valid 
  @Schema(name = "quotationReleaseDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quotationReleaseDate")
  public JsonNullable<OffsetDateTime> getQuotationReleaseDate() {
    return quotationReleaseDate;
  }

  public void setQuotationReleaseDate(JsonNullable<OffsetDateTime> quotationReleaseDate) {
    this.quotationReleaseDate = quotationReleaseDate;
  }

  public QuotationMasterView proposedRate(Double proposedRate) {
    this.proposedRate = proposedRate;
    return this;
  }

  /**
   * Get proposedRate
   * @return proposedRate
  */
  
  @Schema(name = "proposedRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("proposedRate")
  public Double getProposedRate() {
    return proposedRate;
  }

  public void setProposedRate(Double proposedRate) {
    this.proposedRate = proposedRate;
  }

  public QuotationMasterView biddingStartDate(OffsetDateTime biddingStartDate) {
    this.biddingStartDate = biddingStartDate;
    return this;
  }

  /**
   * Get biddingStartDate
   * @return biddingStartDate
  */
  @Valid 
  @Schema(name = "biddingStartDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("biddingStartDate")
  public OffsetDateTime getBiddingStartDate() {
    return biddingStartDate;
  }

  public void setBiddingStartDate(OffsetDateTime biddingStartDate) {
    this.biddingStartDate = biddingStartDate;
  }

  public QuotationMasterView biddingEndDate(OffsetDateTime biddingEndDate) {
    this.biddingEndDate = JsonNullable.of(biddingEndDate);
    return this;
  }

  /**
   * Get biddingEndDate
   * @return biddingEndDate
  */
  @Valid 
  @Schema(name = "biddingEndDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("biddingEndDate")
  public JsonNullable<OffsetDateTime> getBiddingEndDate() {
    return biddingEndDate;
  }

  public void setBiddingEndDate(JsonNullable<OffsetDateTime> biddingEndDate) {
    this.biddingEndDate = biddingEndDate;
  }

  public QuotationMasterView farmVisitStartDate(OffsetDateTime farmVisitStartDate) {
    this.farmVisitStartDate = JsonNullable.of(farmVisitStartDate);
    return this;
  }

  /**
   * Get farmVisitStartDate
   * @return farmVisitStartDate
  */
  @Valid 
  @Schema(name = "farmVisitStartDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("farmVisitStartDate")
  public JsonNullable<OffsetDateTime> getFarmVisitStartDate() {
    return farmVisitStartDate;
  }

  public void setFarmVisitStartDate(JsonNullable<OffsetDateTime> farmVisitStartDate) {
    this.farmVisitStartDate = farmVisitStartDate;
  }

  public QuotationMasterView farmVisitEndDate(OffsetDateTime farmVisitEndDate) {
    this.farmVisitEndDate = JsonNullable.of(farmVisitEndDate);
    return this;
  }

  /**
   * Get farmVisitEndDate
   * @return farmVisitEndDate
  */
  @Valid 
  @Schema(name = "farmVisitEndDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("farmVisitEndDate")
  public JsonNullable<OffsetDateTime> getFarmVisitEndDate() {
    return farmVisitEndDate;
  }

  public void setFarmVisitEndDate(JsonNullable<OffsetDateTime> farmVisitEndDate) {
    this.farmVisitEndDate = farmVisitEndDate;
  }

  public QuotationMasterView foodMaterialReadyDate(OffsetDateTime foodMaterialReadyDate) {
    this.foodMaterialReadyDate = JsonNullable.of(foodMaterialReadyDate);
    return this;
  }

  /**
   * Get foodMaterialReadyDate
   * @return foodMaterialReadyDate
  */
  @Valid 
  @Schema(name = "foodMaterialReadyDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("foodMaterialReadyDate")
  public JsonNullable<OffsetDateTime> getFoodMaterialReadyDate() {
    return foodMaterialReadyDate;
  }

  public void setFoodMaterialReadyDate(JsonNullable<OffsetDateTime> foodMaterialReadyDate) {
    this.foodMaterialReadyDate = foodMaterialReadyDate;
  }

  public QuotationMasterView isTransportationProvided(Boolean isTransportationProvided) {
    this.isTransportationProvided = JsonNullable.of(isTransportationProvided);
    return this;
  }

  /**
   * Get isTransportationProvided
   * @return isTransportationProvided
  */
  
  @Schema(name = "isTransportationProvided", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isTransportationProvided")
  public JsonNullable<Boolean> getIsTransportationProvided() {
    return isTransportationProvided;
  }

  public void setIsTransportationProvided(JsonNullable<Boolean> isTransportationProvided) {
    this.isTransportationProvided = isTransportationProvided;
  }

  public QuotationMasterView extraDetails(String extraDetails) {
    this.extraDetails = JsonNullable.of(extraDetails);
    return this;
  }

  /**
   * Get extraDetails
   * @return extraDetails
  */
  
  @Schema(name = "extraDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extraDetails")
  public JsonNullable<String> getExtraDetails() {
    return extraDetails;
  }

  public void setExtraDetails(JsonNullable<String> extraDetails) {
    this.extraDetails = extraDetails;
  }

  public QuotationMasterView photosUrls(String photosUrls) {
    this.photosUrls = JsonNullable.of(photosUrls);
    return this;
  }

  /**
   * Get photosUrls
   * @return photosUrls
  */
  
  @Schema(name = "photosUrls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("photosUrls")
  public JsonNullable<String> getPhotosUrls() {
    return photosUrls;
  }

  public void setPhotosUrls(JsonNullable<String> photosUrls) {
    this.photosUrls = photosUrls;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotationMasterView quotationMasterView = (QuotationMasterView) o;
    return Objects.equals(this.quotationId, quotationMasterView.quotationId) &&
        Objects.equals(this.farmerId, quotationMasterView.farmerId) &&
        equalsNullable(this.rfqName, quotationMasterView.rfqName) &&
        Objects.equals(this.foodItemId, quotationMasterView.foodItemId) &&
        equalsNullable(this.quantity, quotationMasterView.quantity) &&
        equalsNullable(this.quotationReleaseDate, quotationMasterView.quotationReleaseDate) &&
        Objects.equals(this.proposedRate, quotationMasterView.proposedRate) &&
        Objects.equals(this.biddingStartDate, quotationMasterView.biddingStartDate) &&
        equalsNullable(this.biddingEndDate, quotationMasterView.biddingEndDate) &&
        equalsNullable(this.farmVisitStartDate, quotationMasterView.farmVisitStartDate) &&
        equalsNullable(this.farmVisitEndDate, quotationMasterView.farmVisitEndDate) &&
        equalsNullable(this.foodMaterialReadyDate, quotationMasterView.foodMaterialReadyDate) &&
        equalsNullable(this.isTransportationProvided, quotationMasterView.isTransportationProvided) &&
        equalsNullable(this.extraDetails, quotationMasterView.extraDetails) &&
        equalsNullable(this.photosUrls, quotationMasterView.photosUrls);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(quotationId, farmerId, hashCodeNullable(rfqName), foodItemId, hashCodeNullable(quantity), hashCodeNullable(quotationReleaseDate), proposedRate, biddingStartDate, hashCodeNullable(biddingEndDate), hashCodeNullable(farmVisitStartDate), hashCodeNullable(farmVisitEndDate), hashCodeNullable(foodMaterialReadyDate), hashCodeNullable(isTransportationProvided), hashCodeNullable(extraDetails), hashCodeNullable(photosUrls));
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
    sb.append("class QuotationMasterView {\n");
    sb.append("    quotationId: ").append(toIndentedString(quotationId)).append("\n");
    sb.append("    farmerId: ").append(toIndentedString(farmerId)).append("\n");
    sb.append("    rfqName: ").append(toIndentedString(rfqName)).append("\n");
    sb.append("    foodItemId: ").append(toIndentedString(foodItemId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    quotationReleaseDate: ").append(toIndentedString(quotationReleaseDate)).append("\n");
    sb.append("    proposedRate: ").append(toIndentedString(proposedRate)).append("\n");
    sb.append("    biddingStartDate: ").append(toIndentedString(biddingStartDate)).append("\n");
    sb.append("    biddingEndDate: ").append(toIndentedString(biddingEndDate)).append("\n");
    sb.append("    farmVisitStartDate: ").append(toIndentedString(farmVisitStartDate)).append("\n");
    sb.append("    farmVisitEndDate: ").append(toIndentedString(farmVisitEndDate)).append("\n");
    sb.append("    foodMaterialReadyDate: ").append(toIndentedString(foodMaterialReadyDate)).append("\n");
    sb.append("    isTransportationProvided: ").append(toIndentedString(isTransportationProvided)).append("\n");
    sb.append("    extraDetails: ").append(toIndentedString(extraDetails)).append("\n");
    sb.append("    photosUrls: ").append(toIndentedString(photosUrls)).append("\n");
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

