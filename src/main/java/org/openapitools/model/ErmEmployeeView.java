package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ErmEmpExperience;
import org.openapitools.model.ErpEmployeeSkill;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ErmEmployeeView
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class ErmEmployeeView {

  private Integer empId;

  private JsonNullable<String> empName = JsonNullable.<String>undefined();

  private JsonNullable<String> empEmailId = JsonNullable.<String>undefined();

  private JsonNullable<String> empDesignation = JsonNullable.<String>undefined();

  private JsonNullable<String> empContactNo = JsonNullable.<String>undefined();

  private JsonNullable<String> empAltContactNo = JsonNullable.<String>undefined();

  private JsonNullable<String> empPersonalEmailId = JsonNullable.<String>undefined();

  private JsonNullable<Integer> empExpTotalYear = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> empExpTotalMonth = JsonNullable.<Integer>undefined();

  private JsonNullable<String> empCity = JsonNullable.<String>undefined();

  private JsonNullable<String> empState = JsonNullable.<String>undefined();

  private JsonNullable<String> empPinCode = JsonNullable.<String>undefined();

  private JsonNullable<String> empAddress = JsonNullable.<String>undefined();

  private JsonNullable<String> empPerCity = JsonNullable.<String>undefined();

  private JsonNullable<String> empPerState = JsonNullable.<String>undefined();

  private JsonNullable<String> empPerPinCode = JsonNullable.<String>undefined();

  private JsonNullable<String> empPerAddress = JsonNullable.<String>undefined();

  private JsonNullable<String> password = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid ErpEmployeeSkill>> erpEmployeeSkills = JsonNullable.<List<@Valid ErpEmployeeSkill>>undefined();

  @Valid
  private JsonNullable<List<@Valid ErmEmpExperience>> ermEmpExperiences = JsonNullable.<List<@Valid ErmEmpExperience>>undefined();

  public ErmEmployeeView empId(Integer empId) {
    this.empId = empId;
    return this;
  }

  /**
   * Get empId
   * @return empId
  */
  
  @Schema(name = "empId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("empId")
  public Integer getEmpId() {
    return empId;
  }

  public void setEmpId(Integer empId) {
    this.empId = empId;
  }

  public ErmEmployeeView empName(String empName) {
    this.empName = JsonNullable.of(empName);
    return this;
  }

  /**
   * Get empName
   * @return empName
  */
  
  @Schema(name = "empName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("empName")
  public JsonNullable<String> getEmpName() {
    return empName;
  }

  public void setEmpName(JsonNullable<String> empName) {
    this.empName = empName;
  }

  public ErmEmployeeView empEmailId(String empEmailId) {
    this.empEmailId = JsonNullable.of(empEmailId);
    return this;
  }

  /**
   * Get empEmailId
   * @return empEmailId
  */
  
  @Schema(name = "empEmailId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("empEmailId")
  public JsonNullable<String> getEmpEmailId() {
    return empEmailId;
  }

  public void setEmpEmailId(JsonNullable<String> empEmailId) {
    this.empEmailId = empEmailId;
  }

  public ErmEmployeeView empDesignation(String empDesignation) {
    this.empDesignation = JsonNullable.of(empDesignation);
    return this;
  }

  /**
   * Get empDesignation
   * @return empDesignation
  */
  
  @Schema(name = "empDesignation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("empDesignation")
  public JsonNullable<String> getEmpDesignation() {
    return empDesignation;
  }

  public void setEmpDesignation(JsonNullable<String> empDesignation) {
    this.empDesignation = empDesignation;
  }

  public ErmEmployeeView empContactNo(String empContactNo) {
    this.empContactNo = JsonNullable.of(empContactNo);
    return this;
  }

  /**
   * Get empContactNo
   * @return empContactNo
  */
  
  @Schema(name = "empContactNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("empContactNo")
  public JsonNullable<String> getEmpContactNo() {
    return empContactNo;
  }

  public void setEmpContactNo(JsonNullable<String> empContactNo) {
    this.empContactNo = empContactNo;
  }

  public ErmEmployeeView empAltContactNo(String empAltContactNo) {
    this.empAltContactNo = JsonNullable.of(empAltContactNo);
    return this;
  }

  /**
   * Get empAltContactNo
   * @return empAltContactNo
  */
  
  @Schema(name = "empAltContactNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("empAltContactNo")
  public JsonNullable<String> getEmpAltContactNo() {
    return empAltContactNo;
  }

  public void setEmpAltContactNo(JsonNullable<String> empAltContactNo) {
    this.empAltContactNo = empAltContactNo;
  }

  public ErmEmployeeView empPersonalEmailId(String empPersonalEmailId) {
    this.empPersonalEmailId = JsonNullable.of(empPersonalEmailId);
    return this;
  }

  /**
   * Get empPersonalEmailId
   * @return empPersonalEmailId
  */
  
  @Schema(name = "empPersonalEmailId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("empPersonalEmailId")
  public JsonNullable<String> getEmpPersonalEmailId() {
    return empPersonalEmailId;
  }

  public void setEmpPersonalEmailId(JsonNullable<String> empPersonalEmailId) {
    this.empPersonalEmailId = empPersonalEmailId;
  }

  public ErmEmployeeView empExpTotalYear(Integer empExpTotalYear) {
    this.empExpTotalYear = JsonNullable.of(empExpTotalYear);
    return this;
  }

  /**
   * Get empExpTotalYear
   * @return empExpTotalYear
  */
  
  @Schema(name = "empExpTotalYear", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("empExpTotalYear")
  public JsonNullable<Integer> getEmpExpTotalYear() {
    return empExpTotalYear;
  }

  public void setEmpExpTotalYear(JsonNullable<Integer> empExpTotalYear) {
    this.empExpTotalYear = empExpTotalYear;
  }

  public ErmEmployeeView empExpTotalMonth(Integer empExpTotalMonth) {
    this.empExpTotalMonth = JsonNullable.of(empExpTotalMonth);
    return this;
  }

  /**
   * Get empExpTotalMonth
   * @return empExpTotalMonth
  */
  
  @Schema(name = "empExpTotalMonth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("empExpTotalMonth")
  public JsonNullable<Integer> getEmpExpTotalMonth() {
    return empExpTotalMonth;
  }

  public void setEmpExpTotalMonth(JsonNullable<Integer> empExpTotalMonth) {
    this.empExpTotalMonth = empExpTotalMonth;
  }

  public ErmEmployeeView empCity(String empCity) {
    this.empCity = JsonNullable.of(empCity);
    return this;
  }

  /**
   * Get empCity
   * @return empCity
  */
  
  @Schema(name = "empCity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("empCity")
  public JsonNullable<String> getEmpCity() {
    return empCity;
  }

  public void setEmpCity(JsonNullable<String> empCity) {
    this.empCity = empCity;
  }

  public ErmEmployeeView empState(String empState) {
    this.empState = JsonNullable.of(empState);
    return this;
  }

  /**
   * Get empState
   * @return empState
  */
  
  @Schema(name = "empState", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("empState")
  public JsonNullable<String> getEmpState() {
    return empState;
  }

  public void setEmpState(JsonNullable<String> empState) {
    this.empState = empState;
  }

  public ErmEmployeeView empPinCode(String empPinCode) {
    this.empPinCode = JsonNullable.of(empPinCode);
    return this;
  }

  /**
   * Get empPinCode
   * @return empPinCode
  */
  
  @Schema(name = "empPinCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("empPinCode")
  public JsonNullable<String> getEmpPinCode() {
    return empPinCode;
  }

  public void setEmpPinCode(JsonNullable<String> empPinCode) {
    this.empPinCode = empPinCode;
  }

  public ErmEmployeeView empAddress(String empAddress) {
    this.empAddress = JsonNullable.of(empAddress);
    return this;
  }

  /**
   * Get empAddress
   * @return empAddress
  */
  
  @Schema(name = "empAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("empAddress")
  public JsonNullable<String> getEmpAddress() {
    return empAddress;
  }

  public void setEmpAddress(JsonNullable<String> empAddress) {
    this.empAddress = empAddress;
  }

  public ErmEmployeeView empPerCity(String empPerCity) {
    this.empPerCity = JsonNullable.of(empPerCity);
    return this;
  }

  /**
   * Get empPerCity
   * @return empPerCity
  */
  
  @Schema(name = "empPerCity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("empPerCity")
  public JsonNullable<String> getEmpPerCity() {
    return empPerCity;
  }

  public void setEmpPerCity(JsonNullable<String> empPerCity) {
    this.empPerCity = empPerCity;
  }

  public ErmEmployeeView empPerState(String empPerState) {
    this.empPerState = JsonNullable.of(empPerState);
    return this;
  }

  /**
   * Get empPerState
   * @return empPerState
  */
  
  @Schema(name = "empPerState", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("empPerState")
  public JsonNullable<String> getEmpPerState() {
    return empPerState;
  }

  public void setEmpPerState(JsonNullable<String> empPerState) {
    this.empPerState = empPerState;
  }

  public ErmEmployeeView empPerPinCode(String empPerPinCode) {
    this.empPerPinCode = JsonNullable.of(empPerPinCode);
    return this;
  }

  /**
   * Get empPerPinCode
   * @return empPerPinCode
  */
  
  @Schema(name = "empPerPinCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("empPerPinCode")
  public JsonNullable<String> getEmpPerPinCode() {
    return empPerPinCode;
  }

  public void setEmpPerPinCode(JsonNullable<String> empPerPinCode) {
    this.empPerPinCode = empPerPinCode;
  }

  public ErmEmployeeView empPerAddress(String empPerAddress) {
    this.empPerAddress = JsonNullable.of(empPerAddress);
    return this;
  }

  /**
   * Get empPerAddress
   * @return empPerAddress
  */
  
  @Schema(name = "empPerAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("empPerAddress")
  public JsonNullable<String> getEmpPerAddress() {
    return empPerAddress;
  }

  public void setEmpPerAddress(JsonNullable<String> empPerAddress) {
    this.empPerAddress = empPerAddress;
  }

  public ErmEmployeeView password(String password) {
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

  public ErmEmployeeView erpEmployeeSkills(List<@Valid ErpEmployeeSkill> erpEmployeeSkills) {
    this.erpEmployeeSkills = JsonNullable.of(erpEmployeeSkills);
    return this;
  }

  public ErmEmployeeView addErpEmployeeSkillsItem(ErpEmployeeSkill erpEmployeeSkillsItem) {
    if (this.erpEmployeeSkills == null || !this.erpEmployeeSkills.isPresent()) {
      this.erpEmployeeSkills = JsonNullable.of(new ArrayList<>());
    }
    this.erpEmployeeSkills.get().add(erpEmployeeSkillsItem);
    return this;
  }

  /**
   * Get erpEmployeeSkills
   * @return erpEmployeeSkills
  */
  @Valid 
  @Schema(name = "ErpEmployeeSkills", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ErpEmployeeSkills")
  public JsonNullable<List<@Valid ErpEmployeeSkill>> getErpEmployeeSkills() {
    return erpEmployeeSkills;
  }

  public void setErpEmployeeSkills(JsonNullable<List<@Valid ErpEmployeeSkill>> erpEmployeeSkills) {
    this.erpEmployeeSkills = erpEmployeeSkills;
  }

  public ErmEmployeeView ermEmpExperiences(List<@Valid ErmEmpExperience> ermEmpExperiences) {
    this.ermEmpExperiences = JsonNullable.of(ermEmpExperiences);
    return this;
  }

  public ErmEmployeeView addErmEmpExperiencesItem(ErmEmpExperience ermEmpExperiencesItem) {
    if (this.ermEmpExperiences == null || !this.ermEmpExperiences.isPresent()) {
      this.ermEmpExperiences = JsonNullable.of(new ArrayList<>());
    }
    this.ermEmpExperiences.get().add(ermEmpExperiencesItem);
    return this;
  }

  /**
   * Get ermEmpExperiences
   * @return ermEmpExperiences
  */
  @Valid 
  @Schema(name = "ErmEmpExperiences", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ErmEmpExperiences")
  public JsonNullable<List<@Valid ErmEmpExperience>> getErmEmpExperiences() {
    return ermEmpExperiences;
  }

  public void setErmEmpExperiences(JsonNullable<List<@Valid ErmEmpExperience>> ermEmpExperiences) {
    this.ermEmpExperiences = ermEmpExperiences;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErmEmployeeView ermEmployeeView = (ErmEmployeeView) o;
    return Objects.equals(this.empId, ermEmployeeView.empId) &&
        equalsNullable(this.empName, ermEmployeeView.empName) &&
        equalsNullable(this.empEmailId, ermEmployeeView.empEmailId) &&
        equalsNullable(this.empDesignation, ermEmployeeView.empDesignation) &&
        equalsNullable(this.empContactNo, ermEmployeeView.empContactNo) &&
        equalsNullable(this.empAltContactNo, ermEmployeeView.empAltContactNo) &&
        equalsNullable(this.empPersonalEmailId, ermEmployeeView.empPersonalEmailId) &&
        equalsNullable(this.empExpTotalYear, ermEmployeeView.empExpTotalYear) &&
        equalsNullable(this.empExpTotalMonth, ermEmployeeView.empExpTotalMonth) &&
        equalsNullable(this.empCity, ermEmployeeView.empCity) &&
        equalsNullable(this.empState, ermEmployeeView.empState) &&
        equalsNullable(this.empPinCode, ermEmployeeView.empPinCode) &&
        equalsNullable(this.empAddress, ermEmployeeView.empAddress) &&
        equalsNullable(this.empPerCity, ermEmployeeView.empPerCity) &&
        equalsNullable(this.empPerState, ermEmployeeView.empPerState) &&
        equalsNullable(this.empPerPinCode, ermEmployeeView.empPerPinCode) &&
        equalsNullable(this.empPerAddress, ermEmployeeView.empPerAddress) &&
        equalsNullable(this.password, ermEmployeeView.password) &&
        equalsNullable(this.erpEmployeeSkills, ermEmployeeView.erpEmployeeSkills) &&
        equalsNullable(this.ermEmpExperiences, ermEmployeeView.ermEmpExperiences);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(empId, hashCodeNullable(empName), hashCodeNullable(empEmailId), hashCodeNullable(empDesignation), hashCodeNullable(empContactNo), hashCodeNullable(empAltContactNo), hashCodeNullable(empPersonalEmailId), hashCodeNullable(empExpTotalYear), hashCodeNullable(empExpTotalMonth), hashCodeNullable(empCity), hashCodeNullable(empState), hashCodeNullable(empPinCode), hashCodeNullable(empAddress), hashCodeNullable(empPerCity), hashCodeNullable(empPerState), hashCodeNullable(empPerPinCode), hashCodeNullable(empPerAddress), hashCodeNullable(password), hashCodeNullable(erpEmployeeSkills), hashCodeNullable(ermEmpExperiences));
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
    sb.append("class ErmEmployeeView {\n");
    sb.append("    empId: ").append(toIndentedString(empId)).append("\n");
    sb.append("    empName: ").append(toIndentedString(empName)).append("\n");
    sb.append("    empEmailId: ").append(toIndentedString(empEmailId)).append("\n");
    sb.append("    empDesignation: ").append(toIndentedString(empDesignation)).append("\n");
    sb.append("    empContactNo: ").append(toIndentedString(empContactNo)).append("\n");
    sb.append("    empAltContactNo: ").append(toIndentedString(empAltContactNo)).append("\n");
    sb.append("    empPersonalEmailId: ").append(toIndentedString(empPersonalEmailId)).append("\n");
    sb.append("    empExpTotalYear: ").append(toIndentedString(empExpTotalYear)).append("\n");
    sb.append("    empExpTotalMonth: ").append(toIndentedString(empExpTotalMonth)).append("\n");
    sb.append("    empCity: ").append(toIndentedString(empCity)).append("\n");
    sb.append("    empState: ").append(toIndentedString(empState)).append("\n");
    sb.append("    empPinCode: ").append(toIndentedString(empPinCode)).append("\n");
    sb.append("    empAddress: ").append(toIndentedString(empAddress)).append("\n");
    sb.append("    empPerCity: ").append(toIndentedString(empPerCity)).append("\n");
    sb.append("    empPerState: ").append(toIndentedString(empPerState)).append("\n");
    sb.append("    empPerPinCode: ").append(toIndentedString(empPerPinCode)).append("\n");
    sb.append("    empPerAddress: ").append(toIndentedString(empPerAddress)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    erpEmployeeSkills: ").append(toIndentedString(erpEmployeeSkills)).append("\n");
    sb.append("    ermEmpExperiences: ").append(toIndentedString(ermEmpExperiences)).append("\n");
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

