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
 * AnnadataUser
 */

@JsonTypeName("annadataUser")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class AnnadataUser {

  private Integer userId;

  private JsonNullable<String> userName = JsonNullable.<String>undefined();

  private JsonNullable<String> password = JsonNullable.<String>undefined();

  private JsonNullable<String> role = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdOn;

  private JsonNullable<Integer> vendorId = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> customerId = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> farmerId = JsonNullable.<Integer>undefined();

  public AnnadataUser userId(Integer userId) {
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

  public AnnadataUser userName(String userName) {
    this.userName = JsonNullable.of(userName);
    return this;
  }

  /**
   * Get userName
   * @return userName
  */
  
  @Schema(name = "userName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userName")
  public JsonNullable<String> getUserName() {
    return userName;
  }

  public void setUserName(JsonNullable<String> userName) {
    this.userName = userName;
  }

  public AnnadataUser password(String password) {
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

  public AnnadataUser role(String role) {
    this.role = JsonNullable.of(role);
    return this;
  }

  /**
   * Get role
   * @return role
  */
  
  @Schema(name = "role", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public JsonNullable<String> getRole() {
    return role;
  }

  public void setRole(JsonNullable<String> role) {
    this.role = role;
  }

  public AnnadataUser createdOn(OffsetDateTime createdOn) {
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

  public AnnadataUser vendorId(Integer vendorId) {
    this.vendorId = JsonNullable.of(vendorId);
    return this;
  }

  /**
   * Get vendorId
   * @return vendorId
  */
  
  @Schema(name = "vendorId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vendorId")
  public JsonNullable<Integer> getVendorId() {
    return vendorId;
  }

  public void setVendorId(JsonNullable<Integer> vendorId) {
    this.vendorId = vendorId;
  }

  public AnnadataUser customerId(Integer customerId) {
    this.customerId = JsonNullable.of(customerId);
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  */
  
  @Schema(name = "customerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customerId")
  public JsonNullable<Integer> getCustomerId() {
    return customerId;
  }

  public void setCustomerId(JsonNullable<Integer> customerId) {
    this.customerId = customerId;
  }

  public AnnadataUser farmerId(Integer farmerId) {
    this.farmerId = JsonNullable.of(farmerId);
    return this;
  }

  /**
   * Get farmerId
   * @return farmerId
  */
  
  @Schema(name = "farmerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("farmerId")
  public JsonNullable<Integer> getFarmerId() {
    return farmerId;
  }

  public void setFarmerId(JsonNullable<Integer> farmerId) {
    this.farmerId = farmerId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnadataUser annadataUser = (AnnadataUser) o;
    return Objects.equals(this.userId, annadataUser.userId) &&
        equalsNullable(this.userName, annadataUser.userName) &&
        equalsNullable(this.password, annadataUser.password) &&
        equalsNullable(this.role, annadataUser.role) &&
        Objects.equals(this.createdOn, annadataUser.createdOn) &&
        equalsNullable(this.vendorId, annadataUser.vendorId) &&
        equalsNullable(this.customerId, annadataUser.customerId) &&
        equalsNullable(this.farmerId, annadataUser.farmerId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, hashCodeNullable(userName), hashCodeNullable(password), hashCodeNullable(role), createdOn, hashCodeNullable(vendorId), hashCodeNullable(customerId), hashCodeNullable(farmerId));
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
    sb.append("class AnnadataUser {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    farmerId: ").append(toIndentedString(farmerId)).append("\n");
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

