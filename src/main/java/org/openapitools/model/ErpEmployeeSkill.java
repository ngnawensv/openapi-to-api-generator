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
 * ErpEmployeeSkill
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class ErpEmployeeSkill {

  private Integer empSkillId;

  private Integer empId;

  private JsonNullable<String> skill = JsonNullable.<String>undefined();

  private Integer totalYearExp;

  private JsonNullable<String> lastVersionUsed = JsonNullable.<String>undefined();

  public ErpEmployeeSkill empSkillId(Integer empSkillId) {
    this.empSkillId = empSkillId;
    return this;
  }

  /**
   * Get empSkillId
   * @return empSkillId
  */
  
  @Schema(name = "empSkillId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("empSkillId")
  public Integer getEmpSkillId() {
    return empSkillId;
  }

  public void setEmpSkillId(Integer empSkillId) {
    this.empSkillId = empSkillId;
  }

  public ErpEmployeeSkill empId(Integer empId) {
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

  public ErpEmployeeSkill skill(String skill) {
    this.skill = JsonNullable.of(skill);
    return this;
  }

  /**
   * Get skill
   * @return skill
  */
  
  @Schema(name = "skill", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skill")
  public JsonNullable<String> getSkill() {
    return skill;
  }

  public void setSkill(JsonNullable<String> skill) {
    this.skill = skill;
  }

  public ErpEmployeeSkill totalYearExp(Integer totalYearExp) {
    this.totalYearExp = totalYearExp;
    return this;
  }

  /**
   * Get totalYearExp
   * @return totalYearExp
  */
  
  @Schema(name = "totalYearExp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalYearExp")
  public Integer getTotalYearExp() {
    return totalYearExp;
  }

  public void setTotalYearExp(Integer totalYearExp) {
    this.totalYearExp = totalYearExp;
  }

  public ErpEmployeeSkill lastVersionUsed(String lastVersionUsed) {
    this.lastVersionUsed = JsonNullable.of(lastVersionUsed);
    return this;
  }

  /**
   * Get lastVersionUsed
   * @return lastVersionUsed
  */
  
  @Schema(name = "lastVersionUsed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastVersionUsed")
  public JsonNullable<String> getLastVersionUsed() {
    return lastVersionUsed;
  }

  public void setLastVersionUsed(JsonNullable<String> lastVersionUsed) {
    this.lastVersionUsed = lastVersionUsed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErpEmployeeSkill erpEmployeeSkill = (ErpEmployeeSkill) o;
    return Objects.equals(this.empSkillId, erpEmployeeSkill.empSkillId) &&
        Objects.equals(this.empId, erpEmployeeSkill.empId) &&
        equalsNullable(this.skill, erpEmployeeSkill.skill) &&
        Objects.equals(this.totalYearExp, erpEmployeeSkill.totalYearExp) &&
        equalsNullable(this.lastVersionUsed, erpEmployeeSkill.lastVersionUsed);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(empSkillId, empId, hashCodeNullable(skill), totalYearExp, hashCodeNullable(lastVersionUsed));
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
    sb.append("class ErpEmployeeSkill {\n");
    sb.append("    empSkillId: ").append(toIndentedString(empSkillId)).append("\n");
    sb.append("    empId: ").append(toIndentedString(empId)).append("\n");
    sb.append("    skill: ").append(toIndentedString(skill)).append("\n");
    sb.append("    totalYearExp: ").append(toIndentedString(totalYearExp)).append("\n");
    sb.append("    lastVersionUsed: ").append(toIndentedString(lastVersionUsed)).append("\n");
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

