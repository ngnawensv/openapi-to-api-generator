package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.UserAddress;
import org.openapitools.model.UserSocialDetails;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * YouTubeUserBasicView
 */

@JsonTypeName("youTubeUserBasicView")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class YouTubeUserBasicView {

  private Integer userId;

  private String firstName;

  private String middleName;

  private String lastName;

  private String mobileNo;

  private String emailId;

  private JsonNullable<String> altMobileNo = JsonNullable.<String>undefined();

  private JsonNullable<String> password = JsonNullable.<String>undefined();

  private UserAddress userAddress;

  private UserSocialDetails userSocialDetails;

  public YouTubeUserBasicView() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public YouTubeUserBasicView(String firstName, String middleName, String lastName, String mobileNo, String emailId) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.mobileNo = mobileNo;
    this.emailId = emailId;
  }

  public YouTubeUserBasicView userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public YouTubeUserBasicView firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @NotNull 
  @Schema(name = "firstName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public YouTubeUserBasicView middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Get middleName
   * @return middleName
  */
  @NotNull 
  @Schema(name = "middleName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public YouTubeUserBasicView lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  @NotNull 
  @Schema(name = "lastName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public YouTubeUserBasicView mobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
    return this;
  }

  /**
   * Get mobileNo
   * @return mobileNo
  */
  @NotNull 
  @Schema(name = "mobileNo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mobileNo")
  public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }

  public YouTubeUserBasicView emailId(String emailId) {
    this.emailId = emailId;
    return this;
  }

  /**
   * Get emailId
   * @return emailId
  */
  @NotNull 
  @Schema(name = "emailId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("emailId")
  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public YouTubeUserBasicView altMobileNo(String altMobileNo) {
    this.altMobileNo = JsonNullable.of(altMobileNo);
    return this;
  }

  /**
   * Get altMobileNo
   * @return altMobileNo
  */
  
  @Schema(name = "altMobileNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("altMobileNo")
  public JsonNullable<String> getAltMobileNo() {
    return altMobileNo;
  }

  public void setAltMobileNo(JsonNullable<String> altMobileNo) {
    this.altMobileNo = altMobileNo;
  }

  public YouTubeUserBasicView password(String password) {
    this.password = JsonNullable.of(password);
    return this;
  }

  /**
   * Get password
   * @return password
  */
  
  @Schema(name = "password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public JsonNullable<String> getPassword() {
    return password;
  }

  public void setPassword(JsonNullable<String> password) {
    this.password = password;
  }

  public YouTubeUserBasicView userAddress(UserAddress userAddress) {
    this.userAddress = userAddress;
    return this;
  }

  /**
   * Get userAddress
   * @return userAddress
  */
  @Valid 
  @Schema(name = "userAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userAddress")
  public UserAddress getUserAddress() {
    return userAddress;
  }

  public void setUserAddress(UserAddress userAddress) {
    this.userAddress = userAddress;
  }

  public YouTubeUserBasicView userSocialDetails(UserSocialDetails userSocialDetails) {
    this.userSocialDetails = userSocialDetails;
    return this;
  }

  /**
   * Get userSocialDetails
   * @return userSocialDetails
  */
  @Valid 
  @Schema(name = "userSocialDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userSocialDetails")
  public UserSocialDetails getUserSocialDetails() {
    return userSocialDetails;
  }

  public void setUserSocialDetails(UserSocialDetails userSocialDetails) {
    this.userSocialDetails = userSocialDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YouTubeUserBasicView youTubeUserBasicView = (YouTubeUserBasicView) o;
    return Objects.equals(this.userId, youTubeUserBasicView.userId) &&
        Objects.equals(this.firstName, youTubeUserBasicView.firstName) &&
        Objects.equals(this.middleName, youTubeUserBasicView.middleName) &&
        Objects.equals(this.lastName, youTubeUserBasicView.lastName) &&
        Objects.equals(this.mobileNo, youTubeUserBasicView.mobileNo) &&
        Objects.equals(this.emailId, youTubeUserBasicView.emailId) &&
        equalsNullable(this.altMobileNo, youTubeUserBasicView.altMobileNo) &&
        equalsNullable(this.password, youTubeUserBasicView.password) &&
        Objects.equals(this.userAddress, youTubeUserBasicView.userAddress) &&
        Objects.equals(this.userSocialDetails, youTubeUserBasicView.userSocialDetails);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, firstName, middleName, lastName, mobileNo, emailId, hashCodeNullable(altMobileNo), hashCodeNullable(password), userAddress, userSocialDetails);
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
    sb.append("class YouTubeUserBasicView {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    altMobileNo: ").append(toIndentedString(altMobileNo)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    userAddress: ").append(toIndentedString(userAddress)).append("\n");
    sb.append("    userSocialDetails: ").append(toIndentedString(userSocialDetails)).append("\n");
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

