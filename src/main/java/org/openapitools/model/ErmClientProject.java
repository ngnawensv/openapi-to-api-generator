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
 * ErmClientProject
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class ErmClientProject {

  private Integer clientProjectId;

  private JsonNullable<String> projectName = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> expectedEndDate = JsonNullable.<OffsetDateTime>undefined();

  private Integer leadByEmpId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> completedDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<String> contactPerson = JsonNullable.<String>undefined();

  private JsonNullable<String> contactPersonContactNo = JsonNullable.<String>undefined();

  private Integer totalEmpWorking;

  private Double projectCost;

  private JsonNullable<String> projectDetails = JsonNullable.<String>undefined();

  private JsonNullable<String> contactPersonEmailId = JsonNullable.<String>undefined();

  private Integer clientId;

  public ErmClientProject clientProjectId(Integer clientProjectId) {
    this.clientProjectId = clientProjectId;
    return this;
  }

  /**
   * Get clientProjectId
   * @return clientProjectId
  */
  
  @Schema(name = "clientProjectId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientProjectId")
  public Integer getClientProjectId() {
    return clientProjectId;
  }

  public void setClientProjectId(Integer clientProjectId) {
    this.clientProjectId = clientProjectId;
  }

  public ErmClientProject projectName(String projectName) {
    this.projectName = JsonNullable.of(projectName);
    return this;
  }

  /**
   * Get projectName
   * @return projectName
  */
  
  @Schema(name = "projectName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectName")
  public JsonNullable<String> getProjectName() {
    return projectName;
  }

  public void setProjectName(JsonNullable<String> projectName) {
    this.projectName = projectName;
  }

  public ErmClientProject startDate(OffsetDateTime startDate) {
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

  public ErmClientProject expectedEndDate(OffsetDateTime expectedEndDate) {
    this.expectedEndDate = JsonNullable.of(expectedEndDate);
    return this;
  }

  /**
   * Get expectedEndDate
   * @return expectedEndDate
  */
  @Valid 
  @Schema(name = "expectedEndDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expectedEndDate")
  public JsonNullable<OffsetDateTime> getExpectedEndDate() {
    return expectedEndDate;
  }

  public void setExpectedEndDate(JsonNullable<OffsetDateTime> expectedEndDate) {
    this.expectedEndDate = expectedEndDate;
  }

  public ErmClientProject leadByEmpId(Integer leadByEmpId) {
    this.leadByEmpId = leadByEmpId;
    return this;
  }

  /**
   * Get leadByEmpId
   * @return leadByEmpId
  */
  
  @Schema(name = "leadByEmpId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("leadByEmpId")
  public Integer getLeadByEmpId() {
    return leadByEmpId;
  }

  public void setLeadByEmpId(Integer leadByEmpId) {
    this.leadByEmpId = leadByEmpId;
  }

  public ErmClientProject completedDate(OffsetDateTime completedDate) {
    this.completedDate = JsonNullable.of(completedDate);
    return this;
  }

  /**
   * Get completedDate
   * @return completedDate
  */
  @Valid 
  @Schema(name = "completedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completedDate")
  public JsonNullable<OffsetDateTime> getCompletedDate() {
    return completedDate;
  }

  public void setCompletedDate(JsonNullable<OffsetDateTime> completedDate) {
    this.completedDate = completedDate;
  }

  public ErmClientProject contactPerson(String contactPerson) {
    this.contactPerson = JsonNullable.of(contactPerson);
    return this;
  }

  /**
   * Get contactPerson
   * @return contactPerson
  */
  
  @Schema(name = "contactPerson", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactPerson")
  public JsonNullable<String> getContactPerson() {
    return contactPerson;
  }

  public void setContactPerson(JsonNullable<String> contactPerson) {
    this.contactPerson = contactPerson;
  }

  public ErmClientProject contactPersonContactNo(String contactPersonContactNo) {
    this.contactPersonContactNo = JsonNullable.of(contactPersonContactNo);
    return this;
  }

  /**
   * Get contactPersonContactNo
   * @return contactPersonContactNo
  */
  
  @Schema(name = "contactPersonContactNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactPersonContactNo")
  public JsonNullable<String> getContactPersonContactNo() {
    return contactPersonContactNo;
  }

  public void setContactPersonContactNo(JsonNullable<String> contactPersonContactNo) {
    this.contactPersonContactNo = contactPersonContactNo;
  }

  public ErmClientProject totalEmpWorking(Integer totalEmpWorking) {
    this.totalEmpWorking = totalEmpWorking;
    return this;
  }

  /**
   * Get totalEmpWorking
   * @return totalEmpWorking
  */
  
  @Schema(name = "totalEmpWorking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalEmpWorking")
  public Integer getTotalEmpWorking() {
    return totalEmpWorking;
  }

  public void setTotalEmpWorking(Integer totalEmpWorking) {
    this.totalEmpWorking = totalEmpWorking;
  }

  public ErmClientProject projectCost(Double projectCost) {
    this.projectCost = projectCost;
    return this;
  }

  /**
   * Get projectCost
   * @return projectCost
  */
  
  @Schema(name = "projectCost", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectCost")
  public Double getProjectCost() {
    return projectCost;
  }

  public void setProjectCost(Double projectCost) {
    this.projectCost = projectCost;
  }

  public ErmClientProject projectDetails(String projectDetails) {
    this.projectDetails = JsonNullable.of(projectDetails);
    return this;
  }

  /**
   * Get projectDetails
   * @return projectDetails
  */
  
  @Schema(name = "projectDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectDetails")
  public JsonNullable<String> getProjectDetails() {
    return projectDetails;
  }

  public void setProjectDetails(JsonNullable<String> projectDetails) {
    this.projectDetails = projectDetails;
  }

  public ErmClientProject contactPersonEmailId(String contactPersonEmailId) {
    this.contactPersonEmailId = JsonNullable.of(contactPersonEmailId);
    return this;
  }

  /**
   * Get contactPersonEmailId
   * @return contactPersonEmailId
  */
  
  @Schema(name = "contactPersonEmailId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactPersonEmailId")
  public JsonNullable<String> getContactPersonEmailId() {
    return contactPersonEmailId;
  }

  public void setContactPersonEmailId(JsonNullable<String> contactPersonEmailId) {
    this.contactPersonEmailId = contactPersonEmailId;
  }

  public ErmClientProject clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Get clientId
   * @return clientId
  */
  
  @Schema(name = "clientId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientId")
  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErmClientProject ermClientProject = (ErmClientProject) o;
    return Objects.equals(this.clientProjectId, ermClientProject.clientProjectId) &&
        equalsNullable(this.projectName, ermClientProject.projectName) &&
        Objects.equals(this.startDate, ermClientProject.startDate) &&
        equalsNullable(this.expectedEndDate, ermClientProject.expectedEndDate) &&
        Objects.equals(this.leadByEmpId, ermClientProject.leadByEmpId) &&
        equalsNullable(this.completedDate, ermClientProject.completedDate) &&
        equalsNullable(this.contactPerson, ermClientProject.contactPerson) &&
        equalsNullable(this.contactPersonContactNo, ermClientProject.contactPersonContactNo) &&
        Objects.equals(this.totalEmpWorking, ermClientProject.totalEmpWorking) &&
        Objects.equals(this.projectCost, ermClientProject.projectCost) &&
        equalsNullable(this.projectDetails, ermClientProject.projectDetails) &&
        equalsNullable(this.contactPersonEmailId, ermClientProject.contactPersonEmailId) &&
        Objects.equals(this.clientId, ermClientProject.clientId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientProjectId, hashCodeNullable(projectName), startDate, hashCodeNullable(expectedEndDate), leadByEmpId, hashCodeNullable(completedDate), hashCodeNullable(contactPerson), hashCodeNullable(contactPersonContactNo), totalEmpWorking, projectCost, hashCodeNullable(projectDetails), hashCodeNullable(contactPersonEmailId), clientId);
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
    sb.append("class ErmClientProject {\n");
    sb.append("    clientProjectId: ").append(toIndentedString(clientProjectId)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expectedEndDate: ").append(toIndentedString(expectedEndDate)).append("\n");
    sb.append("    leadByEmpId: ").append(toIndentedString(leadByEmpId)).append("\n");
    sb.append("    completedDate: ").append(toIndentedString(completedDate)).append("\n");
    sb.append("    contactPerson: ").append(toIndentedString(contactPerson)).append("\n");
    sb.append("    contactPersonContactNo: ").append(toIndentedString(contactPersonContactNo)).append("\n");
    sb.append("    totalEmpWorking: ").append(toIndentedString(totalEmpWorking)).append("\n");
    sb.append("    projectCost: ").append(toIndentedString(projectCost)).append("\n");
    sb.append("    projectDetails: ").append(toIndentedString(projectDetails)).append("\n");
    sb.append("    contactPersonEmailId: ").append(toIndentedString(contactPersonEmailId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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

