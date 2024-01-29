package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * AnnadataCustomer
 */

@JsonTypeName("annadataCustomer")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class AnnadataCustomer {

  private Integer customerId;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> mobileNo = JsonNullable.<String>undefined();

  private JsonNullable<String> altMobNo = JsonNullable.<String>undefined();

  private JsonNullable<String> emailId = JsonNullable.<String>undefined();

  private JsonNullable<String> aadharCardNo = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdOn;

  private Integer talukaId;

  public AnnadataCustomer customerId(Integer customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  */
  
  @Schema(name = "customerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customerId")
  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public AnnadataCustomer name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public AnnadataCustomer mobileNo(String mobileNo) {
    this.mobileNo = JsonNullable.of(mobileNo);
    return this;
  }

  /**
   * Get mobileNo
   * @return mobileNo
  */
  
  @Schema(name = "mobileNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mobileNo")
  public JsonNullable<String> getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(JsonNullable<String> mobileNo) {
    this.mobileNo = mobileNo;
  }

  public AnnadataCustomer altMobNo(String altMobNo) {
    this.altMobNo = JsonNullable.of(altMobNo);
    return this;
  }

  /**
   * Get altMobNo
   * @return altMobNo
  */
  
  @Schema(name = "altMobNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("altMobNo")
  public JsonNullable<String> getAltMobNo() {
    return altMobNo;
  }

  public void setAltMobNo(JsonNullable<String> altMobNo) {
    this.altMobNo = altMobNo;
  }

  public AnnadataCustomer emailId(String emailId) {
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

  public AnnadataCustomer aadharCardNo(String aadharCardNo) {
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

  public AnnadataCustomer createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * Get createdOn
   * @return createdOn
  */
  @Valid 
  @Schema(name = "createdOn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdOn")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public AnnadataCustomer talukaId(Integer talukaId) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnadataCustomer annadataCustomer = (AnnadataCustomer) o;
    return Objects.equals(this.customerId, annadataCustomer.customerId) &&
        equalsNullable(this.name, annadataCustomer.name) &&
        equalsNullable(this.mobileNo, annadataCustomer.mobileNo) &&
        equalsNullable(this.altMobNo, annadataCustomer.altMobNo) &&
        equalsNullable(this.emailId, annadataCustomer.emailId) &&
        equalsNullable(this.aadharCardNo, annadataCustomer.aadharCardNo) &&
        Objects.equals(this.createdOn, annadataCustomer.createdOn) &&
        Objects.equals(this.talukaId, annadataCustomer.talukaId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, hashCodeNullable(name), hashCodeNullable(mobileNo), hashCodeNullable(altMobNo), hashCodeNullable(emailId), hashCodeNullable(aadharCardNo), createdOn, talukaId);
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
    sb.append("class AnnadataCustomer {\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    altMobNo: ").append(toIndentedString(altMobNo)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    aadharCardNo: ").append(toIndentedString(aadharCardNo)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    talukaId: ").append(toIndentedString(talukaId)).append("\n");
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

