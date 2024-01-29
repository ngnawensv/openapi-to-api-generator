package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * ErmEmpExperience
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class ErmEmpExperience {

  private Integer empExpId;

  private Integer empId;

  private JsonNullable<String> companyName = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDate;

  private JsonNullable<String> designation = JsonNullable.<String>undefined();

  private JsonNullable<String> projectsWorkedOn = JsonNullable.<String>undefined();

  public ErmEmpExperience empExpId(Integer empExpId) {
    this.empExpId = empExpId;
    return this;
  }

  /**
   * Get empExpId
   * @return empExpId
  */
  
  @Schema(name = "empExpId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("empExpId")
  public Integer getEmpExpId() {
    return empExpId;
  }

  public void setEmpExpId(Integer empExpId) {
    this.empExpId = empExpId;
  }

  public ErmEmpExperience empId(Integer empId) {
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

  public ErmEmpExperience companyName(String companyName) {
    this.companyName = JsonNullable.of(companyName);
    return this;
  }

  /**
   * Get companyName
   * @return companyName
  */
  
  @Schema(name = "companyName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("companyName")
  public JsonNullable<String> getCompanyName() {
    return companyName;
  }

  public void setCompanyName(JsonNullable<String> companyName) {
    this.companyName = companyName;
  }

  public ErmEmpExperience startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  @Valid 
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public ErmEmpExperience endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  @Valid 
  @Schema(name = "endDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public ErmEmpExperience designation(String designation) {
    this.designation = JsonNullable.of(designation);
    return this;
  }

  /**
   * Get designation
   * @return designation
  */
  
  @Schema(name = "designation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("designation")
  public JsonNullable<String> getDesignation() {
    return designation;
  }

  public void setDesignation(JsonNullable<String> designation) {
    this.designation = designation;
  }

  public ErmEmpExperience projectsWorkedOn(String projectsWorkedOn) {
    this.projectsWorkedOn = JsonNullable.of(projectsWorkedOn);
    return this;
  }

  /**
   * Get projectsWorkedOn
   * @return projectsWorkedOn
  */
  
  @Schema(name = "projectsWorkedOn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectsWorkedOn")
  public JsonNullable<String> getProjectsWorkedOn() {
    return projectsWorkedOn;
  }

  public void setProjectsWorkedOn(JsonNullable<String> projectsWorkedOn) {
    this.projectsWorkedOn = projectsWorkedOn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErmEmpExperience ermEmpExperience = (ErmEmpExperience) o;
    return Objects.equals(this.empExpId, ermEmpExperience.empExpId) &&
        Objects.equals(this.empId, ermEmpExperience.empId) &&
        equalsNullable(this.companyName, ermEmpExperience.companyName) &&
        Objects.equals(this.startDate, ermEmpExperience.startDate) &&
        Objects.equals(this.endDate, ermEmpExperience.endDate) &&
        equalsNullable(this.designation, ermEmpExperience.designation) &&
        equalsNullable(this.projectsWorkedOn, ermEmpExperience.projectsWorkedOn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(empExpId, empId, hashCodeNullable(companyName), startDate, endDate, hashCodeNullable(designation), hashCodeNullable(projectsWorkedOn));
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
    sb.append("class ErmEmpExperience {\n");
    sb.append("    empExpId: ").append(toIndentedString(empExpId)).append("\n");
    sb.append("    empId: ").append(toIndentedString(empId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    designation: ").append(toIndentedString(designation)).append("\n");
    sb.append("    projectsWorkedOn: ").append(toIndentedString(projectsWorkedOn)).append("\n");
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

