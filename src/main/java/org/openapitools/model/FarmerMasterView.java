package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.FarmerFoodItem;
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
 * FarmerMasterView
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class FarmerMasterView {

  private Integer farmerId;

  private JsonNullable<String> fullName = JsonNullable.<String>undefined();

  private JsonNullable<String> aadharCardNo = JsonNullable.<String>undefined();

  private Integer talukaId;

  private JsonNullable<String> homeAddress = JsonNullable.<String>undefined();

  private JsonNullable<String> farmAddress = JsonNullable.<String>undefined();

  private JsonNullable<String> farmTotalAcre = JsonNullable.<String>undefined();

  private JsonNullable<Boolean> isDryLandFarming = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isFalbagAvailable = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isWellAvailable = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isOrganicFarming = JsonNullable.<Boolean>undefined();

  private Boolean isFarmHouse;

  private JsonNullable<Boolean> isTourAvailable = JsonNullable.<Boolean>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> createdDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<Boolean> isRoadAvailable = JsonNullable.<Boolean>undefined();

  private JsonNullable<String> photoUrl = JsonNullable.<String>undefined();

  private JsonNullable<String> contactNo = JsonNullable.<String>undefined();

  private JsonNullable<String> altContactNo = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid FarmerFoodItem>> farmerFoodItems = JsonNullable.<List<@Valid FarmerFoodItem>>undefined();

  public FarmerMasterView farmerId(Integer farmerId) {
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

  public FarmerMasterView fullName(String fullName) {
    this.fullName = JsonNullable.of(fullName);
    return this;
  }

  /**
   * Get fullName
   * @return fullName
  */
  
  @Schema(name = "fullName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fullName")
  public JsonNullable<String> getFullName() {
    return fullName;
  }

  public void setFullName(JsonNullable<String> fullName) {
    this.fullName = fullName;
  }

  public FarmerMasterView aadharCardNo(String aadharCardNo) {
    this.aadharCardNo = JsonNullable.of(aadharCardNo);
    return this;
  }

  /**
   * Get aadharCardNo
   * @return aadharCardNo
  */
  
  @Schema(name = "aadharCardNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aadharCardNo")
  public JsonNullable<String> getAadharCardNo() {
    return aadharCardNo;
  }

  public void setAadharCardNo(JsonNullable<String> aadharCardNo) {
    this.aadharCardNo = aadharCardNo;
  }

  public FarmerMasterView talukaId(Integer talukaId) {
    this.talukaId = talukaId;
    return this;
  }

  /**
   * Get talukaId
   * @return talukaId
  */
  
  @Schema(name = "talukaId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("talukaId")
  public Integer getTalukaId() {
    return talukaId;
  }

  public void setTalukaId(Integer talukaId) {
    this.talukaId = talukaId;
  }

  public FarmerMasterView homeAddress(String homeAddress) {
    this.homeAddress = JsonNullable.of(homeAddress);
    return this;
  }

  /**
   * Get homeAddress
   * @return homeAddress
  */
  
  @Schema(name = "homeAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("homeAddress")
  public JsonNullable<String> getHomeAddress() {
    return homeAddress;
  }

  public void setHomeAddress(JsonNullable<String> homeAddress) {
    this.homeAddress = homeAddress;
  }

  public FarmerMasterView farmAddress(String farmAddress) {
    this.farmAddress = JsonNullable.of(farmAddress);
    return this;
  }

  /**
   * Get farmAddress
   * @return farmAddress
  */
  
  @Schema(name = "farmAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("farmAddress")
  public JsonNullable<String> getFarmAddress() {
    return farmAddress;
  }

  public void setFarmAddress(JsonNullable<String> farmAddress) {
    this.farmAddress = farmAddress;
  }

  public FarmerMasterView farmTotalAcre(String farmTotalAcre) {
    this.farmTotalAcre = JsonNullable.of(farmTotalAcre);
    return this;
  }

  /**
   * Get farmTotalAcre
   * @return farmTotalAcre
  */
  
  @Schema(name = "farmTotalAcre", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("farmTotalAcre")
  public JsonNullable<String> getFarmTotalAcre() {
    return farmTotalAcre;
  }

  public void setFarmTotalAcre(JsonNullable<String> farmTotalAcre) {
    this.farmTotalAcre = farmTotalAcre;
  }

  public FarmerMasterView isDryLandFarming(Boolean isDryLandFarming) {
    this.isDryLandFarming = JsonNullable.of(isDryLandFarming);
    return this;
  }

  /**
   * Get isDryLandFarming
   * @return isDryLandFarming
  */
  
  @Schema(name = "isDryLandFarming", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isDryLandFarming")
  public JsonNullable<Boolean> getIsDryLandFarming() {
    return isDryLandFarming;
  }

  public void setIsDryLandFarming(JsonNullable<Boolean> isDryLandFarming) {
    this.isDryLandFarming = isDryLandFarming;
  }

  public FarmerMasterView isFalbagAvailable(Boolean isFalbagAvailable) {
    this.isFalbagAvailable = JsonNullable.of(isFalbagAvailable);
    return this;
  }

  /**
   * Get isFalbagAvailable
   * @return isFalbagAvailable
  */
  
  @Schema(name = "isFalbagAvailable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isFalbagAvailable")
  public JsonNullable<Boolean> getIsFalbagAvailable() {
    return isFalbagAvailable;
  }

  public void setIsFalbagAvailable(JsonNullable<Boolean> isFalbagAvailable) {
    this.isFalbagAvailable = isFalbagAvailable;
  }

  public FarmerMasterView isWellAvailable(Boolean isWellAvailable) {
    this.isWellAvailable = JsonNullable.of(isWellAvailable);
    return this;
  }

  /**
   * Get isWellAvailable
   * @return isWellAvailable
  */
  
  @Schema(name = "isWellAvailable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isWellAvailable")
  public JsonNullable<Boolean> getIsWellAvailable() {
    return isWellAvailable;
  }

  public void setIsWellAvailable(JsonNullable<Boolean> isWellAvailable) {
    this.isWellAvailable = isWellAvailable;
  }

  public FarmerMasterView isOrganicFarming(Boolean isOrganicFarming) {
    this.isOrganicFarming = JsonNullable.of(isOrganicFarming);
    return this;
  }

  /**
   * Get isOrganicFarming
   * @return isOrganicFarming
  */
  
  @Schema(name = "isOrganicFarming", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isOrganicFarming")
  public JsonNullable<Boolean> getIsOrganicFarming() {
    return isOrganicFarming;
  }

  public void setIsOrganicFarming(JsonNullable<Boolean> isOrganicFarming) {
    this.isOrganicFarming = isOrganicFarming;
  }

  public FarmerMasterView isFarmHouse(Boolean isFarmHouse) {
    this.isFarmHouse = isFarmHouse;
    return this;
  }

  /**
   * Get isFarmHouse
   * @return isFarmHouse
  */
  
  @Schema(name = "isFarmHouse", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isFarmHouse")
  public Boolean getIsFarmHouse() {
    return isFarmHouse;
  }

  public void setIsFarmHouse(Boolean isFarmHouse) {
    this.isFarmHouse = isFarmHouse;
  }

  public FarmerMasterView isTourAvailable(Boolean isTourAvailable) {
    this.isTourAvailable = JsonNullable.of(isTourAvailable);
    return this;
  }

  /**
   * Get isTourAvailable
   * @return isTourAvailable
  */
  
  @Schema(name = "isTourAvailable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isTourAvailable")
  public JsonNullable<Boolean> getIsTourAvailable() {
    return isTourAvailable;
  }

  public void setIsTourAvailable(JsonNullable<Boolean> isTourAvailable) {
    this.isTourAvailable = isTourAvailable;
  }

  public FarmerMasterView createdDate(OffsetDateTime createdDate) {
    this.createdDate = JsonNullable.of(createdDate);
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  @Valid 
  @Schema(name = "createdDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdDate")
  public JsonNullable<OffsetDateTime> getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(JsonNullable<OffsetDateTime> createdDate) {
    this.createdDate = createdDate;
  }

  public FarmerMasterView isRoadAvailable(Boolean isRoadAvailable) {
    this.isRoadAvailable = JsonNullable.of(isRoadAvailable);
    return this;
  }

  /**
   * Get isRoadAvailable
   * @return isRoadAvailable
  */
  
  @Schema(name = "isRoadAvailable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isRoadAvailable")
  public JsonNullable<Boolean> getIsRoadAvailable() {
    return isRoadAvailable;
  }

  public void setIsRoadAvailable(JsonNullable<Boolean> isRoadAvailable) {
    this.isRoadAvailable = isRoadAvailable;
  }

  public FarmerMasterView photoUrl(String photoUrl) {
    this.photoUrl = JsonNullable.of(photoUrl);
    return this;
  }

  /**
   * Get photoUrl
   * @return photoUrl
  */
  
  @Schema(name = "photoUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("photoUrl")
  public JsonNullable<String> getPhotoUrl() {
    return photoUrl;
  }

  public void setPhotoUrl(JsonNullable<String> photoUrl) {
    this.photoUrl = photoUrl;
  }

  public FarmerMasterView contactNo(String contactNo) {
    this.contactNo = JsonNullable.of(contactNo);
    return this;
  }

  /**
   * Get contactNo
   * @return contactNo
  */
  
  @Schema(name = "contactNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactNo")
  public JsonNullable<String> getContactNo() {
    return contactNo;
  }

  public void setContactNo(JsonNullable<String> contactNo) {
    this.contactNo = contactNo;
  }

  public FarmerMasterView altContactNo(String altContactNo) {
    this.altContactNo = JsonNullable.of(altContactNo);
    return this;
  }

  /**
   * Get altContactNo
   * @return altContactNo
  */
  
  @Schema(name = "altContactNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("altContactNo")
  public JsonNullable<String> getAltContactNo() {
    return altContactNo;
  }

  public void setAltContactNo(JsonNullable<String> altContactNo) {
    this.altContactNo = altContactNo;
  }

  public FarmerMasterView farmerFoodItems(List<@Valid FarmerFoodItem> farmerFoodItems) {
    this.farmerFoodItems = JsonNullable.of(farmerFoodItems);
    return this;
  }

  public FarmerMasterView addFarmerFoodItemsItem(FarmerFoodItem farmerFoodItemsItem) {
    if (this.farmerFoodItems == null || !this.farmerFoodItems.isPresent()) {
      this.farmerFoodItems = JsonNullable.of(new ArrayList<>());
    }
    this.farmerFoodItems.get().add(farmerFoodItemsItem);
    return this;
  }

  /**
   * Get farmerFoodItems
   * @return farmerFoodItems
  */
  @Valid 
  @Schema(name = "FarmerFoodItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FarmerFoodItems")
  public JsonNullable<List<@Valid FarmerFoodItem>> getFarmerFoodItems() {
    return farmerFoodItems;
  }

  public void setFarmerFoodItems(JsonNullable<List<@Valid FarmerFoodItem>> farmerFoodItems) {
    this.farmerFoodItems = farmerFoodItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FarmerMasterView farmerMasterView = (FarmerMasterView) o;
    return Objects.equals(this.farmerId, farmerMasterView.farmerId) &&
        equalsNullable(this.fullName, farmerMasterView.fullName) &&
        equalsNullable(this.aadharCardNo, farmerMasterView.aadharCardNo) &&
        Objects.equals(this.talukaId, farmerMasterView.talukaId) &&
        equalsNullable(this.homeAddress, farmerMasterView.homeAddress) &&
        equalsNullable(this.farmAddress, farmerMasterView.farmAddress) &&
        equalsNullable(this.farmTotalAcre, farmerMasterView.farmTotalAcre) &&
        equalsNullable(this.isDryLandFarming, farmerMasterView.isDryLandFarming) &&
        equalsNullable(this.isFalbagAvailable, farmerMasterView.isFalbagAvailable) &&
        equalsNullable(this.isWellAvailable, farmerMasterView.isWellAvailable) &&
        equalsNullable(this.isOrganicFarming, farmerMasterView.isOrganicFarming) &&
        Objects.equals(this.isFarmHouse, farmerMasterView.isFarmHouse) &&
        equalsNullable(this.isTourAvailable, farmerMasterView.isTourAvailable) &&
        equalsNullable(this.createdDate, farmerMasterView.createdDate) &&
        equalsNullable(this.isRoadAvailable, farmerMasterView.isRoadAvailable) &&
        equalsNullable(this.photoUrl, farmerMasterView.photoUrl) &&
        equalsNullable(this.contactNo, farmerMasterView.contactNo) &&
        equalsNullable(this.altContactNo, farmerMasterView.altContactNo) &&
        equalsNullable(this.farmerFoodItems, farmerMasterView.farmerFoodItems);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(farmerId, hashCodeNullable(fullName), hashCodeNullable(aadharCardNo), talukaId, hashCodeNullable(homeAddress), hashCodeNullable(farmAddress), hashCodeNullable(farmTotalAcre), hashCodeNullable(isDryLandFarming), hashCodeNullable(isFalbagAvailable), hashCodeNullable(isWellAvailable), hashCodeNullable(isOrganicFarming), isFarmHouse, hashCodeNullable(isTourAvailable), hashCodeNullable(createdDate), hashCodeNullable(isRoadAvailable), hashCodeNullable(photoUrl), hashCodeNullable(contactNo), hashCodeNullable(altContactNo), hashCodeNullable(farmerFoodItems));
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
    sb.append("class FarmerMasterView {\n");
    sb.append("    farmerId: ").append(toIndentedString(farmerId)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    aadharCardNo: ").append(toIndentedString(aadharCardNo)).append("\n");
    sb.append("    talukaId: ").append(toIndentedString(talukaId)).append("\n");
    sb.append("    homeAddress: ").append(toIndentedString(homeAddress)).append("\n");
    sb.append("    farmAddress: ").append(toIndentedString(farmAddress)).append("\n");
    sb.append("    farmTotalAcre: ").append(toIndentedString(farmTotalAcre)).append("\n");
    sb.append("    isDryLandFarming: ").append(toIndentedString(isDryLandFarming)).append("\n");
    sb.append("    isFalbagAvailable: ").append(toIndentedString(isFalbagAvailable)).append("\n");
    sb.append("    isWellAvailable: ").append(toIndentedString(isWellAvailable)).append("\n");
    sb.append("    isOrganicFarming: ").append(toIndentedString(isOrganicFarming)).append("\n");
    sb.append("    isFarmHouse: ").append(toIndentedString(isFarmHouse)).append("\n");
    sb.append("    isTourAvailable: ").append(toIndentedString(isTourAvailable)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    isRoadAvailable: ").append(toIndentedString(isRoadAvailable)).append("\n");
    sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
    sb.append("    contactNo: ").append(toIndentedString(contactNo)).append("\n");
    sb.append("    altContactNo: ").append(toIndentedString(altContactNo)).append("\n");
    sb.append("    farmerFoodItems: ").append(toIndentedString(farmerFoodItems)).append("\n");
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

