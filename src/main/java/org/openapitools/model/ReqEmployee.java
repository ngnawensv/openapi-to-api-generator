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
 * ReqEmployee
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class ReqEmployee {

  private Integer employeeId;

  private String employeeName;

  private String contactNo;

  private String emailId;

  private Integer deptId;

  private String password;

  private JsonNullable<String> gender = JsonNullable.<String>undefined();

  private JsonNullable<String> role = JsonNullable.<String>undefined();

  public ReqEmployee() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ReqEmployee(String employeeName, String contactNo, String emailId, Integer deptId, String password) {
    this.employeeName = employeeName;
    this.contactNo = contactNo;
    this.emailId = emailId;
    this.deptId = deptId;
    this.password = password;
  }

  public ReqEmployee employeeId(Integer employeeId) {
    this.employeeId = employeeId;
    return this;
  }

  /**
   * Get employeeId
   * @return employeeId
  */
  
  @Schema(name = "employeeId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("employeeId")
  public Integer getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(Integer employeeId) {
    this.employeeId = employeeId;
  }

  public ReqEmployee employeeName(String employeeName) {
    this.employeeName = employeeName;
    return this;
  }

  /**
   * Get employeeName
   * @return employeeName
  */
  @NotNull 
  @Schema(name = "employeeName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("employeeName")
  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public ReqEmployee contactNo(String contactNo) {
    this.contactNo = contactNo;
    return this;
  }

  /**
   * Get contactNo
   * @return contactNo
  */
  @NotNull 
  @Schema(name = "contactNo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contactNo")
  public String getContactNo() {
    return contactNo;
  }

  public void setContactNo(String contactNo) {
    this.contactNo = contactNo;
  }

  public ReqEmployee emailId(String emailId) {
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

  public ReqEmployee deptId(Integer deptId) {
    this.deptId = deptId;
    return this;
  }

  /**
   * Get deptId
   * @return deptId
  */
  @NotNull 
  @Schema(name = "deptId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deptId")
  public Integer getDeptId() {
    return deptId;
  }

  public void setDeptId(Integer deptId) {
    this.deptId = deptId;
  }

  public ReqEmployee password(String password) {
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

  public ReqEmployee gender(String gender) {
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

  public ReqEmployee role(String role) {
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
    ReqEmployee reqEmployee = (ReqEmployee) o;
    return Objects.equals(this.employeeId, reqEmployee.employeeId) &&
        Objects.equals(this.employeeName, reqEmployee.employeeName) &&
        Objects.equals(this.contactNo, reqEmployee.contactNo) &&
        Objects.equals(this.emailId, reqEmployee.emailId) &&
        Objects.equals(this.deptId, reqEmployee.deptId) &&
        Objects.equals(this.password, reqEmployee.password) &&
        equalsNullable(this.gender, reqEmployee.gender) &&
        equalsNullable(this.role, reqEmployee.role);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, employeeName, contactNo, emailId, deptId, password, hashCodeNullable(gender), hashCodeNullable(role));
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
    sb.append("class ReqEmployee {\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    employeeName: ").append(toIndentedString(employeeName)).append("\n");
    sb.append("    contactNo: ").append(toIndentedString(contactNo)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    deptId: ").append(toIndentedString(deptId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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

