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
 * Executive
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class Executive {

  private Integer executiveId;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> mobileNo = JsonNullable.<String>undefined();

  private JsonNullable<String> emailId = JsonNullable.<String>undefined();

  private Integer talukaId;

  private JsonNullable<String> highestEducation = JsonNullable.<String>undefined();

  private JsonNullable<String> aadharNo = JsonNullable.<String>undefined();

  private Integer parentExecutiveId;

  public Executive executiveId(Integer executiveId) {
    this.executiveId = executiveId;
    return this;
  }

  /**
   * Get executiveId
   * @return executiveId
  */
  
  @Schema(name = "executiveId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executiveId")
  public Integer getExecutiveId() {
    return executiveId;
  }

  public void setExecutiveId(Integer executiveId) {
    this.executiveId = executiveId;
  }

  public Executive name(String name) {
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

  public Executive mobileNo(String mobileNo) {
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

  public Executive emailId(String emailId) {
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

  public Executive talukaId(Integer talukaId) {
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

  public Executive highestEducation(String highestEducation) {
    this.highestEducation = JsonNullable.of(highestEducation);
    return this;
  }

  /**
   * Get highestEducation
   * @return highestEducation
  */
  
  @Schema(name = "highestEducation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("highestEducation")
  public JsonNullable<String> getHighestEducation() {
    return highestEducation;
  }

  public void setHighestEducation(JsonNullable<String> highestEducation) {
    this.highestEducation = highestEducation;
  }

  public Executive aadharNo(String aadharNo) {
    this.aadharNo = JsonNullable.of(aadharNo);
    return this;
  }

  /**
   * Get aadharNo
   * @return aadharNo
  */
  
  @Schema(name = "aadharNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aadharNo")
  public JsonNullable<String> getAadharNo() {
    return aadharNo;
  }

  public void setAadharNo(JsonNullable<String> aadharNo) {
    this.aadharNo = aadharNo;
  }

  public Executive parentExecutiveId(Integer parentExecutiveId) {
    this.parentExecutiveId = parentExecutiveId;
    return this;
  }

  /**
   * Get parentExecutiveId
   * @return parentExecutiveId
  */
  
  @Schema(name = "parentExecutiveId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentExecutiveId")
  public Integer getParentExecutiveId() {
    return parentExecutiveId;
  }

  public void setParentExecutiveId(Integer parentExecutiveId) {
    this.parentExecutiveId = parentExecutiveId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Executive executive = (Executive) o;
    return Objects.equals(this.executiveId, executive.executiveId) &&
        equalsNullable(this.name, executive.name) &&
        equalsNullable(this.mobileNo, executive.mobileNo) &&
        equalsNullable(this.emailId, executive.emailId) &&
        Objects.equals(this.talukaId, executive.talukaId) &&
        equalsNullable(this.highestEducation, executive.highestEducation) &&
        equalsNullable(this.aadharNo, executive.aadharNo) &&
        Objects.equals(this.parentExecutiveId, executive.parentExecutiveId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(executiveId, hashCodeNullable(name), hashCodeNullable(mobileNo), hashCodeNullable(emailId), talukaId, hashCodeNullable(highestEducation), hashCodeNullable(aadharNo), parentExecutiveId);
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
    sb.append("class Executive {\n");
    sb.append("    executiveId: ").append(toIndentedString(executiveId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    talukaId: ").append(toIndentedString(talukaId)).append("\n");
    sb.append("    highestEducation: ").append(toIndentedString(highestEducation)).append("\n");
    sb.append("    aadharNo: ").append(toIndentedString(aadharNo)).append("\n");
    sb.append("    parentExecutiveId: ").append(toIndentedString(parentExecutiveId)).append("\n");
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

