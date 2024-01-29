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
 * VendorFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class VendorFilter {

  private JsonNullable<String> vendorName = JsonNullable.<String>undefined();

  private JsonNullable<String> contactNo = JsonNullable.<String>undefined();

  private JsonNullable<String> gstNo = JsonNullable.<String>undefined();

  private JsonNullable<Integer> shopTalukaId = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> cityId = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> districtId = JsonNullable.<Integer>undefined();

  public VendorFilter vendorName(String vendorName) {
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

  public VendorFilter contactNo(String contactNo) {
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

  public VendorFilter gstNo(String gstNo) {
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

  public VendorFilter shopTalukaId(Integer shopTalukaId) {
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

  public VendorFilter cityId(Integer cityId) {
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

  public VendorFilter districtId(Integer districtId) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorFilter vendorFilter = (VendorFilter) o;
    return equalsNullable(this.vendorName, vendorFilter.vendorName) &&
        equalsNullable(this.contactNo, vendorFilter.contactNo) &&
        equalsNullable(this.gstNo, vendorFilter.gstNo) &&
        equalsNullable(this.shopTalukaId, vendorFilter.shopTalukaId) &&
        equalsNullable(this.cityId, vendorFilter.cityId) &&
        equalsNullable(this.districtId, vendorFilter.districtId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(vendorName), hashCodeNullable(contactNo), hashCodeNullable(gstNo), hashCodeNullable(shopTalukaId), hashCodeNullable(cityId), hashCodeNullable(districtId));
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
    sb.append("class VendorFilter {\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    contactNo: ").append(toIndentedString(contactNo)).append("\n");
    sb.append("    gstNo: ").append(toIndentedString(gstNo)).append("\n");
    sb.append("    shopTalukaId: ").append(toIndentedString(shopTalukaId)).append("\n");
    sb.append("    cityId: ").append(toIndentedString(cityId)).append("\n");
    sb.append("    districtId: ").append(toIndentedString(districtId)).append("\n");
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

