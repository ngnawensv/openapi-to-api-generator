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
 * JobSeekerWorkExperience
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class JobSeekerWorkExperience {

  private Integer workExpId;

  private Integer jobSeekerId;

  private JsonNullable<String> companyName = JsonNullable.<String>undefined();

  private Boolean isCurrentCompany;

  private JsonNullable<String> profile = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> endDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<String> jobDescription = JsonNullable.<String>undefined();

  public JobSeekerWorkExperience workExpId(Integer workExpId) {
    this.workExpId = workExpId;
    return this;
  }

  /**
   * Get workExpId
   * @return workExpId
  */
  
  @Schema(name = "WorkExpId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("WorkExpId")
  public Integer getWorkExpId() {
    return workExpId;
  }

  public void setWorkExpId(Integer workExpId) {
    this.workExpId = workExpId;
  }

  public JobSeekerWorkExperience jobSeekerId(Integer jobSeekerId) {
    this.jobSeekerId = jobSeekerId;
    return this;
  }

  /**
   * Get jobSeekerId
   * @return jobSeekerId
  */
  
  @Schema(name = "JobSeekerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("JobSeekerId")
  public Integer getJobSeekerId() {
    return jobSeekerId;
  }

  public void setJobSeekerId(Integer jobSeekerId) {
    this.jobSeekerId = jobSeekerId;
  }

  public JobSeekerWorkExperience companyName(String companyName) {
    this.companyName = JsonNullable.of(companyName);
    return this;
  }

  /**
   * Get companyName
   * @return companyName
  */
  
  @Schema(name = "CompanyName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CompanyName")
  public JsonNullable<String> getCompanyName() {
    return companyName;
  }

  public void setCompanyName(JsonNullable<String> companyName) {
    this.companyName = companyName;
  }

  public JobSeekerWorkExperience isCurrentCompany(Boolean isCurrentCompany) {
    this.isCurrentCompany = isCurrentCompany;
    return this;
  }

  /**
   * Get isCurrentCompany
   * @return isCurrentCompany
  */
  
  @Schema(name = "IsCurrentCompany", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsCurrentCompany")
  public Boolean getIsCurrentCompany() {
    return isCurrentCompany;
  }

  public void setIsCurrentCompany(Boolean isCurrentCompany) {
    this.isCurrentCompany = isCurrentCompany;
  }

  public JobSeekerWorkExperience profile(String profile) {
    this.profile = JsonNullable.of(profile);
    return this;
  }

  /**
   * Get profile
   * @return profile
  */
  
  @Schema(name = "Profile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Profile")
  public JsonNullable<String> getProfile() {
    return profile;
  }

  public void setProfile(JsonNullable<String> profile) {
    this.profile = profile;
  }

  public JobSeekerWorkExperience startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  @Valid 
  @Schema(name = "StartDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StartDate")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public JobSeekerWorkExperience endDate(OffsetDateTime endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  @Valid 
  @Schema(name = "EndDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EndDate")
  public JsonNullable<OffsetDateTime> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<OffsetDateTime> endDate) {
    this.endDate = endDate;
  }

  public JobSeekerWorkExperience jobDescription(String jobDescription) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobSeekerWorkExperience jobSeekerWorkExperience = (JobSeekerWorkExperience) o;
    return Objects.equals(this.workExpId, jobSeekerWorkExperience.workExpId) &&
        Objects.equals(this.jobSeekerId, jobSeekerWorkExperience.jobSeekerId) &&
        equalsNullable(this.companyName, jobSeekerWorkExperience.companyName) &&
        Objects.equals(this.isCurrentCompany, jobSeekerWorkExperience.isCurrentCompany) &&
        equalsNullable(this.profile, jobSeekerWorkExperience.profile) &&
        Objects.equals(this.startDate, jobSeekerWorkExperience.startDate) &&
        equalsNullable(this.endDate, jobSeekerWorkExperience.endDate) &&
        equalsNullable(this.jobDescription, jobSeekerWorkExperience.jobDescription);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(workExpId, jobSeekerId, hashCodeNullable(companyName), isCurrentCompany, hashCodeNullable(profile), startDate, hashCodeNullable(endDate), hashCodeNullable(jobDescription));
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
    sb.append("class JobSeekerWorkExperience {\n");
    sb.append("    workExpId: ").append(toIndentedString(workExpId)).append("\n");
    sb.append("    jobSeekerId: ").append(toIndentedString(jobSeekerId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    isCurrentCompany: ").append(toIndentedString(isCurrentCompany)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    jobDescription: ").append(toIndentedString(jobDescription)).append("\n");
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

