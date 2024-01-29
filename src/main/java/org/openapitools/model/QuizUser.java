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
 * QuizUser
 */

@JsonTypeName("quizUser")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class QuizUser {

  private Integer userId;

  private JsonNullable<String> emailid = JsonNullable.<String>undefined();

  private JsonNullable<String> mobileNo = JsonNullable.<String>undefined();

  private JsonNullable<String> password = JsonNullable.<String>undefined();

  private JsonNullable<String> fullName = JsonNullable.<String>undefined();

  private JsonNullable<String> gender = JsonNullable.<String>undefined();

  private JsonNullable<String> registrationCode = JsonNullable.<String>undefined();

  private JsonNullable<String> collegeName = JsonNullable.<String>undefined();

  private JsonNullable<String> stream = JsonNullable.<String>undefined();

  private JsonNullable<String> role = JsonNullable.<String>undefined();

  public QuizUser userId(Integer userId) {
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

  public QuizUser emailid(String emailid) {
    this.emailid = JsonNullable.of(emailid);
    return this;
  }

  /**
   * Get emailid
   * @return emailid
  */
  
  @Schema(name = "emailid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailid")
  public JsonNullable<String> getEmailid() {
    return emailid;
  }

  public void setEmailid(JsonNullable<String> emailid) {
    this.emailid = emailid;
  }

  public QuizUser mobileNo(String mobileNo) {
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

  public QuizUser password(String password) {
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

  public QuizUser fullName(String fullName) {
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

  public QuizUser gender(String gender) {
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

  public QuizUser registrationCode(String registrationCode) {
    this.registrationCode = JsonNullable.of(registrationCode);
    return this;
  }

  /**
   * Get registrationCode
   * @return registrationCode
  */
  
  @Schema(name = "registrationCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registrationCode")
  public JsonNullable<String> getRegistrationCode() {
    return registrationCode;
  }

  public void setRegistrationCode(JsonNullable<String> registrationCode) {
    this.registrationCode = registrationCode;
  }

  public QuizUser collegeName(String collegeName) {
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

  public QuizUser stream(String stream) {
    this.stream = JsonNullable.of(stream);
    return this;
  }

  /**
   * Get stream
   * @return stream
  */
  
  @Schema(name = "stream", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stream")
  public JsonNullable<String> getStream() {
    return stream;
  }

  public void setStream(JsonNullable<String> stream) {
    this.stream = stream;
  }

  public QuizUser role(String role) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuizUser quizUser = (QuizUser) o;
    return Objects.equals(this.userId, quizUser.userId) &&
        equalsNullable(this.emailid, quizUser.emailid) &&
        equalsNullable(this.mobileNo, quizUser.mobileNo) &&
        equalsNullable(this.password, quizUser.password) &&
        equalsNullable(this.fullName, quizUser.fullName) &&
        equalsNullable(this.gender, quizUser.gender) &&
        equalsNullable(this.registrationCode, quizUser.registrationCode) &&
        equalsNullable(this.collegeName, quizUser.collegeName) &&
        equalsNullable(this.stream, quizUser.stream) &&
        equalsNullable(this.role, quizUser.role);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, hashCodeNullable(emailid), hashCodeNullable(mobileNo), hashCodeNullable(password), hashCodeNullable(fullName), hashCodeNullable(gender), hashCodeNullable(registrationCode), hashCodeNullable(collegeName), hashCodeNullable(stream), hashCodeNullable(role));
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
    sb.append("class QuizUser {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    emailid: ").append(toIndentedString(emailid)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    registrationCode: ").append(toIndentedString(registrationCode)).append("\n");
    sb.append("    collegeName: ").append(toIndentedString(collegeName)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

