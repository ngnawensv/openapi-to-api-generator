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
 * JobEmployer
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class JobEmployer {

  private Integer employerId;

  private JsonNullable<String> companyName = JsonNullable.<String>undefined();

  private JsonNullable<String> emailId = JsonNullable.<String>undefined();

  private JsonNullable<String> mobileNo = JsonNullable.<String>undefined();

  private JsonNullable<String> phoneNo = JsonNullable.<String>undefined();

  private JsonNullable<String> companyAddress = JsonNullable.<String>undefined();

  private JsonNullable<String> city = JsonNullable.<String>undefined();

  private JsonNullable<String> state = JsonNullable.<String>undefined();

  private JsonNullable<String> pinCode = JsonNullable.<String>undefined();

  private JsonNullable<String> logoURL = JsonNullable.<String>undefined();

  private JsonNullable<String> gstNo = JsonNullable.<String>undefined();

  public JobEmployer employerId(Integer employerId) {
    this.employerId = employerId;
    return this;
  }

  /**
   * Get employerId
   * @return employerId
  */
  
  @Schema(name = "EmployerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EmployerId")
  public Integer getEmployerId() {
    return employerId;
  }

  public void setEmployerId(Integer employerId) {
    this.employerId = employerId;
  }

  public JobEmployer companyName(String companyName) {
    this.companyName = JsonNullable.of(companyName);
    return this;
  }

  /**
   * Get companyName
   * @return companyName
  */
  
  @Schema(name = "CompanyName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CompanyName")
  public JsonNullable<String> getCompanyName() {
    return companyName;
  }

  public void setCompanyName(JsonNullable<String> companyName) {
    this.companyName = companyName;
  }

  public JobEmployer emailId(String emailId) {
    this.emailId = JsonNullable.of(emailId);
    return this;
  }

  /**
   * Get emailId
   * @return emailId
  */
  
  @Schema(name = "EmailId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EmailId")
  public JsonNullable<String> getEmailId() {
    return emailId;
  }

  public void setEmailId(JsonNullable<String> emailId) {
    this.emailId = emailId;
  }

  public JobEmployer mobileNo(String mobileNo) {
    this.mobileNo = JsonNullable.of(mobileNo);
    return this;
  }

  /**
   * Get mobileNo
   * @return mobileNo
  */
  
  @Schema(name = "MobileNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MobileNo")
  public JsonNullable<String> getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(JsonNullable<String> mobileNo) {
    this.mobileNo = mobileNo;
  }

  public JobEmployer phoneNo(String phoneNo) {
    this.phoneNo = JsonNullable.of(phoneNo);
    return this;
  }

  /**
   * Get phoneNo
   * @return phoneNo
  */
  
  @Schema(name = "PhoneNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PhoneNo")
  public JsonNullable<String> getPhoneNo() {
    return phoneNo;
  }

  public void setPhoneNo(JsonNullable<String> phoneNo) {
    this.phoneNo = phoneNo;
  }

  public JobEmployer companyAddress(String companyAddress) {
    this.companyAddress = JsonNullable.of(companyAddress);
    return this;
  }

  /**
   * Get companyAddress
   * @return companyAddress
  */
  
  @Schema(name = "CompanyAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CompanyAddress")
  public JsonNullable<String> getCompanyAddress() {
    return companyAddress;
  }

  public void setCompanyAddress(JsonNullable<String> companyAddress) {
    this.companyAddress = companyAddress;
  }

  public JobEmployer city(String city) {
    this.city = JsonNullable.of(city);
    return this;
  }

  /**
   * Get city
   * @return city
  */
  
  @Schema(name = "City", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("City")
  public JsonNullable<String> getCity() {
    return city;
  }

  public void setCity(JsonNullable<String> city) {
    this.city = city;
  }

  public JobEmployer state(String state) {
    this.state = JsonNullable.of(state);
    return this;
  }

  /**
   * Get state
   * @return state
  */
  
  @Schema(name = "State", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("State")
  public JsonNullable<String> getState() {
    return state;
  }

  public void setState(JsonNullable<String> state) {
    this.state = state;
  }

  public JobEmployer pinCode(String pinCode) {
    this.pinCode = JsonNullable.of(pinCode);
    return this;
  }

  /**
   * Get pinCode
   * @return pinCode
  */
  
  @Schema(name = "PinCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PinCode")
  public JsonNullable<String> getPinCode() {
    return pinCode;
  }

  public void setPinCode(JsonNullable<String> pinCode) {
    this.pinCode = pinCode;
  }

  public JobEmployer logoURL(String logoURL) {
    this.logoURL = JsonNullable.of(logoURL);
    return this;
  }

  /**
   * Get logoURL
   * @return logoURL
  */
  
  @Schema(name = "LogoURL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LogoURL")
  public JsonNullable<String> getLogoURL() {
    return logoURL;
  }

  public void setLogoURL(JsonNullable<String> logoURL) {
    this.logoURL = logoURL;
  }

  public JobEmployer gstNo(String gstNo) {
    this.gstNo = JsonNullable.of(gstNo);
    return this;
  }

  /**
   * Get gstNo
   * @return gstNo
  */
  
  @Schema(name = "GstNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GstNo")
  public JsonNullable<String> getGstNo() {
    return gstNo;
  }

  public void setGstNo(JsonNullable<String> gstNo) {
    this.gstNo = gstNo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobEmployer jobEmployer = (JobEmployer) o;
    return Objects.equals(this.employerId, jobEmployer.employerId) &&
        equalsNullable(this.companyName, jobEmployer.companyName) &&
        equalsNullable(this.emailId, jobEmployer.emailId) &&
        equalsNullable(this.mobileNo, jobEmployer.mobileNo) &&
        equalsNullable(this.phoneNo, jobEmployer.phoneNo) &&
        equalsNullable(this.companyAddress, jobEmployer.companyAddress) &&
        equalsNullable(this.city, jobEmployer.city) &&
        equalsNullable(this.state, jobEmployer.state) &&
        equalsNullable(this.pinCode, jobEmployer.pinCode) &&
        equalsNullable(this.logoURL, jobEmployer.logoURL) &&
        equalsNullable(this.gstNo, jobEmployer.gstNo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(employerId, hashCodeNullable(companyName), hashCodeNullable(emailId), hashCodeNullable(mobileNo), hashCodeNullable(phoneNo), hashCodeNullable(companyAddress), hashCodeNullable(city), hashCodeNullable(state), hashCodeNullable(pinCode), hashCodeNullable(logoURL), hashCodeNullable(gstNo));
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
    sb.append("class JobEmployer {\n");
    sb.append("    employerId: ").append(toIndentedString(employerId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    phoneNo: ").append(toIndentedString(phoneNo)).append("\n");
    sb.append("    companyAddress: ").append(toIndentedString(companyAddress)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    pinCode: ").append(toIndentedString(pinCode)).append("\n");
    sb.append("    logoURL: ").append(toIndentedString(logoURL)).append("\n");
    sb.append("    gstNo: ").append(toIndentedString(gstNo)).append("\n");
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

