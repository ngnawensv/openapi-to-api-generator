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
 * WebinarRegistration
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class WebinarRegistration {

  private Integer registrationId;

  private String name;

  private String mobileNo;

  private JsonNullable<String> emailId = JsonNullable.<String>undefined();

  private JsonNullable<String> linkdinProfileUrl = JsonNullable.<String>undefined();

  private Boolean isWorking;

  private JsonNullable<String> collegeName = JsonNullable.<String>undefined();

  private JsonNullable<String> city = JsonNullable.<String>undefined();

  private JsonNullable<String> gender = JsonNullable.<String>undefined();

  public WebinarRegistration() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WebinarRegistration(String name, String mobileNo) {
    this.name = name;
    this.mobileNo = mobileNo;
  }

  public WebinarRegistration registrationId(Integer registrationId) {
    this.registrationId = registrationId;
    return this;
  }

  /**
   * Get registrationId
   * @return registrationId
  */
  
  @Schema(name = "registrationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registrationId")
  public Integer getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(Integer registrationId) {
    this.registrationId = registrationId;
  }

  public WebinarRegistration name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WebinarRegistration mobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
    return this;
  }

  /**
   * Get mobileNo
   * @return mobileNo
  */
  @NotNull @Size(min = 10, max = 10) 
  @Schema(name = "mobileNo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mobileNo")
  public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }

  public WebinarRegistration emailId(String emailId) {
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

  public WebinarRegistration linkdinProfileUrl(String linkdinProfileUrl) {
    this.linkdinProfileUrl = JsonNullable.of(linkdinProfileUrl);
    return this;
  }

  /**
   * Get linkdinProfileUrl
   * @return linkdinProfileUrl
  */
  
  @Schema(name = "linkdinProfileUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkdinProfileUrl")
  public JsonNullable<String> getLinkdinProfileUrl() {
    return linkdinProfileUrl;
  }

  public void setLinkdinProfileUrl(JsonNullable<String> linkdinProfileUrl) {
    this.linkdinProfileUrl = linkdinProfileUrl;
  }

  public WebinarRegistration isWorking(Boolean isWorking) {
    this.isWorking = isWorking;
    return this;
  }

  /**
   * Get isWorking
   * @return isWorking
  */
  
  @Schema(name = "isWorking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isWorking")
  public Boolean getIsWorking() {
    return isWorking;
  }

  public void setIsWorking(Boolean isWorking) {
    this.isWorking = isWorking;
  }

  public WebinarRegistration collegeName(String collegeName) {
    this.collegeName = JsonNullable.of(collegeName);
    return this;
  }

  /**
   * Get collegeName
   * @return collegeName
  */
  
  @Schema(name = "collegeName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("collegeName")
  public JsonNullable<String> getCollegeName() {
    return collegeName;
  }

  public void setCollegeName(JsonNullable<String> collegeName) {
    this.collegeName = collegeName;
  }

  public WebinarRegistration city(String city) {
    this.city = JsonNullable.of(city);
    return this;
  }

  /**
   * Get city
   * @return city
  */
  
  @Schema(name = "city", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public JsonNullable<String> getCity() {
    return city;
  }

  public void setCity(JsonNullable<String> city) {
    this.city = city;
  }

  public WebinarRegistration gender(String gender) {
    this.gender = JsonNullable.of(gender);
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  
  @Schema(name = "gender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public JsonNullable<String> getGender() {
    return gender;
  }

  public void setGender(JsonNullable<String> gender) {
    this.gender = gender;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebinarRegistration webinarRegistration = (WebinarRegistration) o;
    return Objects.equals(this.registrationId, webinarRegistration.registrationId) &&
        Objects.equals(this.name, webinarRegistration.name) &&
        Objects.equals(this.mobileNo, webinarRegistration.mobileNo) &&
        equalsNullable(this.emailId, webinarRegistration.emailId) &&
        equalsNullable(this.linkdinProfileUrl, webinarRegistration.linkdinProfileUrl) &&
        Objects.equals(this.isWorking, webinarRegistration.isWorking) &&
        equalsNullable(this.collegeName, webinarRegistration.collegeName) &&
        equalsNullable(this.city, webinarRegistration.city) &&
        equalsNullable(this.gender, webinarRegistration.gender);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(registrationId, name, mobileNo, hashCodeNullable(emailId), hashCodeNullable(linkdinProfileUrl), isWorking, hashCodeNullable(collegeName), hashCodeNullable(city), hashCodeNullable(gender));
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
    sb.append("class WebinarRegistration {\n");
    sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    linkdinProfileUrl: ").append(toIndentedString(linkdinProfileUrl)).append("\n");
    sb.append("    isWorking: ").append(toIndentedString(isWorking)).append("\n");
    sb.append("    collegeName: ").append(toIndentedString(collegeName)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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

