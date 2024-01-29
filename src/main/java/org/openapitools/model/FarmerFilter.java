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
 * FarmerFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class FarmerFilter {

  private JsonNullable<String> fullName = JsonNullable.<String>undefined();

  private JsonNullable<String> aadharCardNo = JsonNullable.<String>undefined();

  private JsonNullable<Integer> talukaId = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> cityId = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> districtId = JsonNullable.<Integer>undefined();

  private JsonNullable<Boolean> isDryLandFarming = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isFalbagAvailable = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isOrganicFarming = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isFarmHouse = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isTourAvailable = JsonNullable.<Boolean>undefined();

  private JsonNullable<String> contactNo = JsonNullable.<String>undefined();

  public FarmerFilter fullName(String fullName) {
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

  public FarmerFilter aadharCardNo(String aadharCardNo) {
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

  public FarmerFilter talukaId(Integer talukaId) {
    this.talukaId = JsonNullable.of(talukaId);
    return this;
  }

  /**
   * Get talukaId
   * @return talukaId
  */
  
  @Schema(name = "talukaId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("talukaId")
  public JsonNullable<Integer> getTalukaId() {
    return talukaId;
  }

  public void setTalukaId(JsonNullable<Integer> talukaId) {
    this.talukaId = talukaId;
  }

  public FarmerFilter cityId(Integer cityId) {
    this.cityId = JsonNullable.of(cityId);
    return this;
  }

  /**
   * Get cityId
   * @return cityId
  */
  
  @Schema(name = "cityId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cityId")
  public JsonNullable<Integer> getCityId() {
    return cityId;
  }

  public void setCityId(JsonNullable<Integer> cityId) {
    this.cityId = cityId;
  }

  public FarmerFilter districtId(Integer districtId) {
    this.districtId = JsonNullable.of(districtId);
    return this;
  }

  /**
   * Get districtId
   * @return districtId
  */
  
  @Schema(name = "districtId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("districtId")
  public JsonNullable<Integer> getDistrictId() {
    return districtId;
  }

  public void setDistrictId(JsonNullable<Integer> districtId) {
    this.districtId = districtId;
  }

  public FarmerFilter isDryLandFarming(Boolean isDryLandFarming) {
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

  public FarmerFilter isFalbagAvailable(Boolean isFalbagAvailable) {
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

  public FarmerFilter isOrganicFarming(Boolean isOrganicFarming) {
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

  public FarmerFilter isFarmHouse(Boolean isFarmHouse) {
    this.isFarmHouse = JsonNullable.of(isFarmHouse);
    return this;
  }

  /**
   * Get isFarmHouse
   * @return isFarmHouse
  */
  
  @Schema(name = "isFarmHouse", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isFarmHouse")
  public JsonNullable<Boolean> getIsFarmHouse() {
    return isFarmHouse;
  }

  public void setIsFarmHouse(JsonNullable<Boolean> isFarmHouse) {
    this.isFarmHouse = isFarmHouse;
  }

  public FarmerFilter isTourAvailable(Boolean isTourAvailable) {
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

  public FarmerFilter contactNo(String contactNo) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FarmerFilter farmerFilter = (FarmerFilter) o;
    return equalsNullable(this.fullName, farmerFilter.fullName) &&
        equalsNullable(this.aadharCardNo, farmerFilter.aadharCardNo) &&
        equalsNullable(this.talukaId, farmerFilter.talukaId) &&
        equalsNullable(this.cityId, farmerFilter.cityId) &&
        equalsNullable(this.districtId, farmerFilter.districtId) &&
        equalsNullable(this.isDryLandFarming, farmerFilter.isDryLandFarming) &&
        equalsNullable(this.isFalbagAvailable, farmerFilter.isFalbagAvailable) &&
        equalsNullable(this.isOrganicFarming, farmerFilter.isOrganicFarming) &&
        equalsNullable(this.isFarmHouse, farmerFilter.isFarmHouse) &&
        equalsNullable(this.isTourAvailable, farmerFilter.isTourAvailable) &&
        equalsNullable(this.contactNo, farmerFilter.contactNo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(fullName), hashCodeNullable(aadharCardNo), hashCodeNullable(talukaId), hashCodeNullable(cityId), hashCodeNullable(districtId), hashCodeNullable(isDryLandFarming), hashCodeNullable(isFalbagAvailable), hashCodeNullable(isOrganicFarming), hashCodeNullable(isFarmHouse), hashCodeNullable(isTourAvailable), hashCodeNullable(contactNo));
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
    sb.append("class FarmerFilter {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    aadharCardNo: ").append(toIndentedString(aadharCardNo)).append("\n");
    sb.append("    talukaId: ").append(toIndentedString(talukaId)).append("\n");
    sb.append("    cityId: ").append(toIndentedString(cityId)).append("\n");
    sb.append("    districtId: ").append(toIndentedString(districtId)).append("\n");
    sb.append("    isDryLandFarming: ").append(toIndentedString(isDryLandFarming)).append("\n");
    sb.append("    isFalbagAvailable: ").append(toIndentedString(isFalbagAvailable)).append("\n");
    sb.append("    isOrganicFarming: ").append(toIndentedString(isOrganicFarming)).append("\n");
    sb.append("    isFarmHouse: ").append(toIndentedString(isFarmHouse)).append("\n");
    sb.append("    isTourAvailable: ").append(toIndentedString(isTourAvailable)).append("\n");
    sb.append("    contactNo: ").append(toIndentedString(contactNo)).append("\n");
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

