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
 * QuotationMaster
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class QuotationMaster {

  private Integer quotationId;

  private Integer farmerId;

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

  private JsonNullable<Integer> quotationAwardedTo = JsonNullable.<Integer>undefined();

  private JsonNullable<Double> awardedRate = JsonNullable.<Double>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> awardedDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<String> rfqName = JsonNullable.<String>undefined();

  public QuotationMaster quotationId(Integer quotationId) {
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

  public QuotationMaster farmerId(Integer farmerId) {
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

  public QuotationMaster foodItemId(Integer foodItemId) {
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

  public QuotationMaster quantity(String quantity) {
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

  public QuotationMaster quotationReleaseDate(OffsetDateTime quotationReleaseDate) {
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

  public QuotationMaster proposedRate(Double proposedRate) {
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

  public QuotationMaster biddingStartDate(OffsetDateTime biddingStartDate) {
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

  public QuotationMaster biddingEndDate(OffsetDateTime biddingEndDate) {
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

  public QuotationMaster farmVisitStartDate(OffsetDateTime farmVisitStartDate) {
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

  public QuotationMaster farmVisitEndDate(OffsetDateTime farmVisitEndDate) {
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

  public QuotationMaster foodMaterialReadyDate(OffsetDateTime foodMaterialReadyDate) {
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

  public QuotationMaster isTransportationProvided(Boolean isTransportationProvided) {
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

  public QuotationMaster extraDetails(String extraDetails) {
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

  public QuotationMaster photosUrls(String photosUrls) {
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

  public QuotationMaster quotationAwardedTo(Integer quotationAwardedTo) {
    this.quotationAwardedTo = JsonNullable.of(quotationAwardedTo);
    return this;
  }

  /**
   * Get quotationAwardedTo
   * @return quotationAwardedTo
  */
  
  @Schema(name = "quotationAwardedTo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quotationAwardedTo")
  public JsonNullable<Integer> getQuotationAwardedTo() {
    return quotationAwardedTo;
  }

  public void setQuotationAwardedTo(JsonNullable<Integer> quotationAwardedTo) {
    this.quotationAwardedTo = quotationAwardedTo;
  }

  public QuotationMaster awardedRate(Double awardedRate) {
    this.awardedRate = JsonNullable.of(awardedRate);
    return this;
  }

  /**
   * Get awardedRate
   * @return awardedRate
  */
  
  @Schema(name = "awardedRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("awardedRate")
  public JsonNullable<Double> getAwardedRate() {
    return awardedRate;
  }

  public void setAwardedRate(JsonNullable<Double> awardedRate) {
    this.awardedRate = awardedRate;
  }

  public QuotationMaster awardedDate(OffsetDateTime awardedDate) {
    this.awardedDate = JsonNullable.of(awardedDate);
    return this;
  }

  /**
   * Get awardedDate
   * @return awardedDate
  */
  @Valid 
  @Schema(name = "awardedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("awardedDate")
  public JsonNullable<OffsetDateTime> getAwardedDate() {
    return awardedDate;
  }

  public void setAwardedDate(JsonNullable<OffsetDateTime> awardedDate) {
    this.awardedDate = awardedDate;
  }

  public QuotationMaster rfqName(String rfqName) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotationMaster quotationMaster = (QuotationMaster) o;
    return Objects.equals(this.quotationId, quotationMaster.quotationId) &&
        Objects.equals(this.farmerId, quotationMaster.farmerId) &&
        Objects.equals(this.foodItemId, quotationMaster.foodItemId) &&
        equalsNullable(this.quantity, quotationMaster.quantity) &&
        equalsNullable(this.quotationReleaseDate, quotationMaster.quotationReleaseDate) &&
        Objects.equals(this.proposedRate, quotationMaster.proposedRate) &&
        Objects.equals(this.biddingStartDate, quotationMaster.biddingStartDate) &&
        equalsNullable(this.biddingEndDate, quotationMaster.biddingEndDate) &&
        equalsNullable(this.farmVisitStartDate, quotationMaster.farmVisitStartDate) &&
        equalsNullable(this.farmVisitEndDate, quotationMaster.farmVisitEndDate) &&
        equalsNullable(this.foodMaterialReadyDate, quotationMaster.foodMaterialReadyDate) &&
        equalsNullable(this.isTransportationProvided, quotationMaster.isTransportationProvided) &&
        equalsNullable(this.extraDetails, quotationMaster.extraDetails) &&
        equalsNullable(this.photosUrls, quotationMaster.photosUrls) &&
        equalsNullable(this.quotationAwardedTo, quotationMaster.quotationAwardedTo) &&
        equalsNullable(this.awardedRate, quotationMaster.awardedRate) &&
        equalsNullable(this.awardedDate, quotationMaster.awardedDate) &&
        equalsNullable(this.rfqName, quotationMaster.rfqName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(quotationId, farmerId, foodItemId, hashCodeNullable(quantity), hashCodeNullable(quotationReleaseDate), proposedRate, biddingStartDate, hashCodeNullable(biddingEndDate), hashCodeNullable(farmVisitStartDate), hashCodeNullable(farmVisitEndDate), hashCodeNullable(foodMaterialReadyDate), hashCodeNullable(isTransportationProvided), hashCodeNullable(extraDetails), hashCodeNullable(photosUrls), hashCodeNullable(quotationAwardedTo), hashCodeNullable(awardedRate), hashCodeNullable(awardedDate), hashCodeNullable(rfqName));
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
    sb.append("class QuotationMaster {\n");
    sb.append("    quotationId: ").append(toIndentedString(quotationId)).append("\n");
    sb.append("    farmerId: ").append(toIndentedString(farmerId)).append("\n");
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
    sb.append("    quotationAwardedTo: ").append(toIndentedString(quotationAwardedTo)).append("\n");
    sb.append("    awardedRate: ").append(toIndentedString(awardedRate)).append("\n");
    sb.append("    awardedDate: ").append(toIndentedString(awardedDate)).append("\n");
    sb.append("    rfqName: ").append(toIndentedString(rfqName)).append("\n");
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

