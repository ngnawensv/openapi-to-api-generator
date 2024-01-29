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
 * JobListing
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class JobListing {

  private Integer jobId;

  private JsonNullable<String> jobName = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdDate;

  private Integer employerId;

  private Integer categoryId;

  private JsonNullable<String> experience = JsonNullable.<String>undefined();

  private JsonNullable<String> _package = JsonNullable.<String>undefined();

  private JsonNullable<String> location = JsonNullable.<String>undefined();

  private JsonNullable<String> jobDescription = JsonNullable.<String>undefined();

  private Boolean isActive;

  public JobListing jobId(Integer jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * Get jobId
   * @return jobId
  */
  
  @Schema(name = "JobId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("JobId")
  public Integer getJobId() {
    return jobId;
  }

  public void setJobId(Integer jobId) {
    this.jobId = jobId;
  }

  public JobListing jobName(String jobName) {
    this.jobName = JsonNullable.of(jobName);
    return this;
  }

  /**
   * Get jobName
   * @return jobName
  */
  
  @Schema(name = "JobName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("JobName")
  public JsonNullable<String> getJobName() {
    return jobName;
  }

  public void setJobName(JsonNullable<String> jobName) {
    this.jobName = jobName;
  }

  public JobListing createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  @Valid 
  @Schema(name = "CreatedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreatedDate")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public JobListing employerId(Integer employerId) {
    this.employerId = employerId;
    return this;
  }

  /**
   * Get employerId
   * @return employerId
  */
  
  @Schema(name = "EmployerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EmployerId")
  public Integer getEmployerId() {
    return employerId;
  }

  public void setEmployerId(Integer employerId) {
    this.employerId = employerId;
  }

  public JobListing categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Get categoryId
   * @return categoryId
  */
  
  @Schema(name = "CategoryId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CategoryId")
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public JobListing experience(String experience) {
    this.experience = JsonNullable.of(experience);
    return this;
  }

  /**
   * Get experience
   * @return experience
  */
  
  @Schema(name = "Experience", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Experience")
  public JsonNullable<String> getExperience() {
    return experience;
  }

  public void setExperience(JsonNullable<String> experience) {
    this.experience = experience;
  }

  public JobListing _package(String _package) {
    this._package = JsonNullable.of(_package);
    return this;
  }

  /**
   * Get _package
   * @return _package
  */
  
  @Schema(name = "Package", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Package")
  public JsonNullable<String> getPackage() {
    return _package;
  }

  public void setPackage(JsonNullable<String> _package) {
    this._package = _package;
  }

  public JobListing location(String location) {
    this.location = JsonNullable.of(location);
    return this;
  }

  /**
   * Get location
   * @return location
  */
  
  @Schema(name = "Location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Location")
  public JsonNullable<String> getLocation() {
    return location;
  }

  public void setLocation(JsonNullable<String> location) {
    this.location = location;
  }

  public JobListing jobDescription(String jobDescription) {
    this.jobDescription = JsonNullable.of(jobDescription);
    return this;
  }

  /**
   * Get jobDescription
   * @return jobDescription
  */
  
  @Schema(name = "JobDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("JobDescription")
  public JsonNullable<String> getJobDescription() {
    return jobDescription;
  }

  public void setJobDescription(JsonNullable<String> jobDescription) {
    this.jobDescription = jobDescription;
  }

  public JobListing isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
  */
  
  @Schema(name = "IsActive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsActive")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobListing jobListing = (JobListing) o;
    return Objects.equals(this.jobId, jobListing.jobId) &&
        equalsNullable(this.jobName, jobListing.jobName) &&
        Objects.equals(this.createdDate, jobListing.createdDate) &&
        Objects.equals(this.employerId, jobListing.employerId) &&
        Objects.equals(this.categoryId, jobListing.categoryId) &&
        equalsNullable(this.experience, jobListing.experience) &&
        equalsNullable(this._package, jobListing._package) &&
        equalsNullable(this.location, jobListing.location) &&
        equalsNullable(this.jobDescription, jobListing.jobDescription) &&
        Objects.equals(this.isActive, jobListing.isActive);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, hashCodeNullable(jobName), createdDate, employerId, categoryId, hashCodeNullable(experience), hashCodeNullable(_package), hashCodeNullable(location), hashCodeNullable(jobDescription), isActive);
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
    sb.append("class JobListing {\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    employerId: ").append(toIndentedString(employerId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    jobDescription: ").append(toIndentedString(jobDescription)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

