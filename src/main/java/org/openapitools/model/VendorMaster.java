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
 * VendorMaster
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class VendorMaster {

  private Integer vendorId;

  private JsonNullable<String> vendorName = JsonNullable.<String>undefined();

  private JsonNullable<String> contactNo = JsonNullable.<String>undefined();

  private JsonNullable<String> altContactNo = JsonNullable.<String>undefined();

  private JsonNullable<String> emailId = JsonNullable.<String>undefined();

  private JsonNullable<String> gstNo = JsonNullable.<String>undefined();

  private JsonNullable<Boolean> isShopAvailable = JsonNullable.<Boolean>undefined();

  private JsonNullable<String> personalPanNo = JsonNullable.<String>undefined();

  private JsonNullable<String> businessPanNo = JsonNullable.<String>undefined();

  private JsonNullable<String> shopAddess = JsonNullable.<String>undefined();

  private JsonNullable<String> homeAddress = JsonNullable.<String>undefined();

  private JsonNullable<Integer> shopTalukaId = JsonNullable.<Integer>undefined();

  private Integer homeTalukaId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> createdDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<Boolean> isOwnTransporation = JsonNullable.<Boolean>undefined();

  private Boolean isVerified;

  private Integer verifiedBy;

  public VendorMaster vendorId(Integer vendorId) {
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

  public VendorMaster vendorName(String vendorName) {
    this.vendorName = JsonNullable.of(vendorName);
    return this;
  }

  /**
   * Get vendorName
   * @return vendorName
  */
  
  @Schema(name = "vendorName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vendorName")
  public JsonNullable<String> getVendorName() {
    return vendorName;
  }

  public void setVendorName(JsonNullable<String> vendorName) {
    this.vendorName = vendorName;
  }

  public VendorMaster contactNo(String contactNo) {
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

  public VendorMaster altContactNo(String altContactNo) {
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

  public VendorMaster emailId(String emailId) {
    this.emailId = JsonNullable.of(emailId);
    return this;
  }

  /**
   * Get emailId
   * @return emailId
  */
  
  @Schema(name = "emailId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailId")
  public JsonNullable<String> getEmailId() {
    return emailId;
  }

  public void setEmailId(JsonNullable<String> emailId) {
    this.emailId = emailId;
  }

  public VendorMaster gstNo(String gstNo) {
    this.gstNo = JsonNullable.of(gstNo);
    return this;
  }

  /**
   * Get gstNo
   * @return gstNo
  */
  
  @Schema(name = "gstNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gstNo")
  public JsonNullable<String> getGstNo() {
    return gstNo;
  }

  public void setGstNo(JsonNullable<String> gstNo) {
    this.gstNo = gstNo;
  }

  public VendorMaster isShopAvailable(Boolean isShopAvailable) {
    this.isShopAvailable = JsonNullable.of(isShopAvailable);
    return this;
  }

  /**
   * Get isShopAvailable
   * @return isShopAvailable
  */
  
  @Schema(name = "isShopAvailable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isShopAvailable")
  public JsonNullable<Boolean> getIsShopAvailable() {
    return isShopAvailable;
  }

  public void setIsShopAvailable(JsonNullable<Boolean> isShopAvailable) {
    this.isShopAvailable = isShopAvailable;
  }

  public VendorMaster personalPanNo(String personalPanNo) {
    this.personalPanNo = JsonNullable.of(personalPanNo);
    return this;
  }

  /**
   * Get personalPanNo
   * @return personalPanNo
  */
  
  @Schema(name = "personalPanNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("personalPanNo")
  public JsonNullable<String> getPersonalPanNo() {
    return personalPanNo;
  }

  public void setPersonalPanNo(JsonNullable<String> personalPanNo) {
    this.personalPanNo = personalPanNo;
  }

  public VendorMaster businessPanNo(String businessPanNo) {
    this.businessPanNo = JsonNullable.of(businessPanNo);
    return this;
  }

  /**
   * Get businessPanNo
   * @return businessPanNo
  */
  
  @Schema(name = "businessPanNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("businessPanNo")
  public JsonNullable<String> getBusinessPanNo() {
    return businessPanNo;
  }

  public void setBusinessPanNo(JsonNullable<String> businessPanNo) {
    this.businessPanNo = businessPanNo;
  }

  public VendorMaster shopAddess(String shopAddess) {
    this.shopAddess = JsonNullable.of(shopAddess);
    return this;
  }

  /**
   * Get shopAddess
   * @return shopAddess
  */
  
  @Schema(name = "shopAddess", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shopAddess")
  public JsonNullable<String> getShopAddess() {
    return shopAddess;
  }

  public void setShopAddess(JsonNullable<String> shopAddess) {
    this.shopAddess = shopAddess;
  }

  public VendorMaster homeAddress(String homeAddress) {
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

  public VendorMaster shopTalukaId(Integer shopTalukaId) {
    this.shopTalukaId = JsonNullable.of(shopTalukaId);
    return this;
  }

  /**
   * Get shopTalukaId
   * @return shopTalukaId
  */
  
  @Schema(name = "shopTalukaId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shopTalukaId")
  public JsonNullable<Integer> getShopTalukaId() {
    return shopTalukaId;
  }

  public void setShopTalukaId(JsonNullable<Integer> shopTalukaId) {
    this.shopTalukaId = shopTalukaId;
  }

  public VendorMaster homeTalukaId(Integer homeTalukaId) {
    this.homeTalukaId = homeTalukaId;
    return this;
  }

  /**
   * Get homeTalukaId
   * @return homeTalukaId
  */
  
  @Schema(name = "homeTalukaId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("homeTalukaId")
  public Integer getHomeTalukaId() {
    return homeTalukaId;
  }

  public void setHomeTalukaId(Integer homeTalukaId) {
    this.homeTalukaId = homeTalukaId;
  }

  public VendorMaster createdDate(OffsetDateTime createdDate) {
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

  public VendorMaster isOwnTransporation(Boolean isOwnTransporation) {
    this.isOwnTransporation = JsonNullable.of(isOwnTransporation);
    return this;
  }

  /**
   * Get isOwnTransporation
   * @return isOwnTransporation
  */
  
  @Schema(name = "isOwnTransporation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isOwnTransporation")
  public JsonNullable<Boolean> getIsOwnTransporation() {
    return isOwnTransporation;
  }

  public void setIsOwnTransporation(JsonNullable<Boolean> isOwnTransporation) {
    this.isOwnTransporation = isOwnTransporation;
  }

  public VendorMaster isVerified(Boolean isVerified) {
    this.isVerified = isVerified;
    return this;
  }

  /**
   * Get isVerified
   * @return isVerified
  */
  
  @Schema(name = "isVerified", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isVerified")
  public Boolean getIsVerified() {
    return isVerified;
  }

  public void setIsVerified(Boolean isVerified) {
    this.isVerified = isVerified;
  }

  public VendorMaster verifiedBy(Integer verifiedBy) {
    this.verifiedBy = verifiedBy;
    return this;
  }

  /**
   * Get verifiedBy
   * @return verifiedBy
  */
  
  @Schema(name = "verifiedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verifiedBy")
  public Integer getVerifiedBy() {
    return verifiedBy;
  }

  public void setVerifiedBy(Integer verifiedBy) {
    this.verifiedBy = verifiedBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorMaster vendorMaster = (VendorMaster) o;
    return Objects.equals(this.vendorId, vendorMaster.vendorId) &&
        equalsNullable(this.vendorName, vendorMaster.vendorName) &&
        equalsNullable(this.contactNo, vendorMaster.contactNo) &&
        equalsNullable(this.altContactNo, vendorMaster.altContactNo) &&
        equalsNullable(this.emailId, vendorMaster.emailId) &&
        equalsNullable(this.gstNo, vendorMaster.gstNo) &&
        equalsNullable(this.isShopAvailable, vendorMaster.isShopAvailable) &&
        equalsNullable(this.personalPanNo, vendorMaster.personalPanNo) &&
        equalsNullable(this.businessPanNo, vendorMaster.businessPanNo) &&
        equalsNullable(this.shopAddess, vendorMaster.shopAddess) &&
        equalsNullable(this.homeAddress, vendorMaster.homeAddress) &&
        equalsNullable(this.shopTalukaId, vendorMaster.shopTalukaId) &&
        Objects.equals(this.homeTalukaId, vendorMaster.homeTalukaId) &&
        equalsNullable(this.createdDate, vendorMaster.createdDate) &&
        equalsNullable(this.isOwnTransporation, vendorMaster.isOwnTransporation) &&
        Objects.equals(this.isVerified, vendorMaster.isVerified) &&
        Objects.equals(this.verifiedBy, vendorMaster.verifiedBy);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorId, hashCodeNullable(vendorName), hashCodeNullable(contactNo), hashCodeNullable(altContactNo), hashCodeNullable(emailId), hashCodeNullable(gstNo), hashCodeNullable(isShopAvailable), hashCodeNullable(personalPanNo), hashCodeNullable(businessPanNo), hashCodeNullable(shopAddess), hashCodeNullable(homeAddress), hashCodeNullable(shopTalukaId), homeTalukaId, hashCodeNullable(createdDate), hashCodeNullable(isOwnTransporation), isVerified, verifiedBy);
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
    sb.append("class VendorMaster {\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    contactNo: ").append(toIndentedString(contactNo)).append("\n");
    sb.append("    altContactNo: ").append(toIndentedString(altContactNo)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    gstNo: ").append(toIndentedString(gstNo)).append("\n");
    sb.append("    isShopAvailable: ").append(toIndentedString(isShopAvailable)).append("\n");
    sb.append("    personalPanNo: ").append(toIndentedString(personalPanNo)).append("\n");
    sb.append("    businessPanNo: ").append(toIndentedString(businessPanNo)).append("\n");
    sb.append("    shopAddess: ").append(toIndentedString(shopAddess)).append("\n");
    sb.append("    homeAddress: ").append(toIndentedString(homeAddress)).append("\n");
    sb.append("    shopTalukaId: ").append(toIndentedString(shopTalukaId)).append("\n");
    sb.append("    homeTalukaId: ").append(toIndentedString(homeTalukaId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    isOwnTransporation: ").append(toIndentedString(isOwnTransporation)).append("\n");
    sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
    sb.append("    verifiedBy: ").append(toIndentedString(verifiedBy)).append("\n");
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

