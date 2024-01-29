package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ZomatoUser
 */

@JsonTypeName("zomatoUser")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class ZomatoUser {

  private Integer userId;

  private String userName;

  private String role;

  private String password;

  private String mobileNo;

  private JsonNullable<String> emailId = JsonNullable.<String>undefined();

  private JsonNullable<Integer> restaurantId = JsonNullable.<Integer>undefined();

  public ZomatoUser() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ZomatoUser(String userName, String role, String password, String mobileNo) {
    this.userName = userName;
    this.role = role;
    this.password = password;
    this.mobileNo = mobileNo;
  }

  public ZomatoUser userId(Integer userId) {
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

  public ZomatoUser userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  */
  @NotNull 
  @Schema(name = "userName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public ZomatoUser role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  */
  @NotNull 
  @Schema(name = "role", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public ZomatoUser password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  @NotNull 
  @Schema(name = "password", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ZomatoUser mobileNo(String mobileNo) {
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

  public ZomatoUser emailId(String emailId) {
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

  public ZomatoUser restaurantId(Integer restaurantId) {
    this.restaurantId = JsonNullable.of(restaurantId);
    return this;
  }

  /**
   * Get restaurantId
   * @return restaurantId
  */
  
  @Schema(name = "restaurantId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("restaurantId")
  public JsonNullable<Integer> getRestaurantId() {
    return restaurantId;
  }

  public void setRestaurantId(JsonNullable<Integer> restaurantId) {
    this.restaurantId = restaurantId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZomatoUser zomatoUser = (ZomatoUser) o;
    return Objects.equals(this.userId, zomatoUser.userId) &&
        Objects.equals(this.userName, zomatoUser.userName) &&
        Objects.equals(this.role, zomatoUser.role) &&
        Objects.equals(this.password, zomatoUser.password) &&
        Objects.equals(this.mobileNo, zomatoUser.mobileNo) &&
        equalsNullable(this.emailId, zomatoUser.emailId) &&
        equalsNullable(this.restaurantId, zomatoUser.restaurantId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userName, role, password, mobileNo, hashCodeNullable(emailId), hashCodeNullable(restaurantId));
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
    sb.append("class ZomatoUser {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    restaurantId: ").append(toIndentedString(restaurantId)).append("\n");
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

