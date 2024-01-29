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
 * JobApplication
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class JobApplication {

  private Integer applicationId;

  private Integer jobId;

  private Integer jobSeekerId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime appliedDate;

  private JsonNullable<String> applcationStatus = JsonNullable.<String>undefined();

  public JobApplication applicationId(Integer applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * Get applicationId
   * @return applicationId
  */
  
  @Schema(name = "ApplicationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ApplicationId")
  public Integer getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(Integer applicationId) {
    this.applicationId = applicationId;
  }

  public JobApplication jobId(Integer jobId) {
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

  public JobApplication jobSeekerId(Integer jobSeekerId) {
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

  public JobApplication appliedDate(OffsetDateTime appliedDate) {
    this.appliedDate = appliedDate;
    return this;
  }

  /**
   * Get appliedDate
   * @return appliedDate
  */
  @Valid 
  @Schema(name = "AppliedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AppliedDate")
  public OffsetDateTime getAppliedDate() {
    return appliedDate;
  }

  public void setAppliedDate(OffsetDateTime appliedDate) {
    this.appliedDate = appliedDate;
  }

  public JobApplication applcationStatus(String applcationStatus) {
    this.applcationStatus = JsonNullable.of(applcationStatus);
    return this;
  }

  /**
   * Get applcationStatus
   * @return applcationStatus
  */
  
  @Schema(name = "ApplcationStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ApplcationStatus")
  public JsonNullable<String> getApplcationStatus() {
    return applcationStatus;
  }

  public void setApplcationStatus(JsonNullable<String> applcationStatus) {
    this.applcationStatus = applcationStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobApplication jobApplication = (JobApplication) o;
    return Objects.equals(this.applicationId, jobApplication.applicationId) &&
        Objects.equals(this.jobId, jobApplication.jobId) &&
        Objects.equals(this.jobSeekerId, jobApplication.jobSeekerId) &&
        Objects.equals(this.appliedDate, jobApplication.appliedDate) &&
        equalsNullable(this.applcationStatus, jobApplication.applcationStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, jobId, jobSeekerId, appliedDate, hashCodeNullable(applcationStatus));
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
    sb.append("class JobApplication {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    jobSeekerId: ").append(toIndentedString(jobSeekerId)).append("\n");
    sb.append("    appliedDate: ").append(toIndentedString(appliedDate)).append("\n");
    sb.append("    applcationStatus: ").append(toIndentedString(applcationStatus)).append("\n");
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

