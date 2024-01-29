package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.JobSeekerSkill;
import org.openapitools.model.JobSeekerWorkExperience;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * JobSeekerViewModel
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class JobSeekerViewModel {

  private Integer jobSeekerId;

  private JsonNullable<String> fullName = JsonNullable.<String>undefined();

  private JsonNullable<String> emailId = JsonNullable.<String>undefined();

  private JsonNullable<String> mobileNo = JsonNullable.<String>undefined();

  private JsonNullable<String> experienceStatus = JsonNullable.<String>undefined();

  private JsonNullable<String> resumeUrl = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid JobSeekerSkill>> jobSeekerSkills = JsonNullable.<List<@Valid JobSeekerSkill>>undefined();

  @Valid
  private JsonNullable<List<@Valid JobSeekerWorkExperience>> jobSeekerWorkExperiences = JsonNullable.<List<@Valid JobSeekerWorkExperience>>undefined();

  public JobSeekerViewModel jobSeekerId(Integer jobSeekerId) {
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

  public JobSeekerViewModel fullName(String fullName) {
    this.fullName = JsonNullable.of(fullName);
    return this;
  }

  /**
   * Get fullName
   * @return fullName
  */
  
  @Schema(name = "FullName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FullName")
  public JsonNullable<String> getFullName() {
    return fullName;
  }

  public void setFullName(JsonNullable<String> fullName) {
    this.fullName = fullName;
  }

  public JobSeekerViewModel emailId(String emailId) {
    this.emailId = JsonNullable.of(emailId);
    return this;
  }

  /**
   * Get emailId
   * @return emailId
  */
  
  @Schema(name = "EmailId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EmailId")
  public JsonNullable<String> getEmailId() {
    return emailId;
  }

  public void setEmailId(JsonNullable<String> emailId) {
    this.emailId = emailId;
  }

  public JobSeekerViewModel mobileNo(String mobileNo) {
    this.mobileNo = JsonNullable.of(mobileNo);
    return this;
  }

  /**
   * Get mobileNo
   * @return mobileNo
  */
  
  @Schema(name = "MobileNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MobileNo")
  public JsonNullable<String> getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(JsonNullable<String> mobileNo) {
    this.mobileNo = mobileNo;
  }

  public JobSeekerViewModel experienceStatus(String experienceStatus) {
    this.experienceStatus = JsonNullable.of(experienceStatus);
    return this;
  }

  /**
   * Get experienceStatus
   * @return experienceStatus
  */
  
  @Schema(name = "ExperienceStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExperienceStatus")
  public JsonNullable<String> getExperienceStatus() {
    return experienceStatus;
  }

  public void setExperienceStatus(JsonNullable<String> experienceStatus) {
    this.experienceStatus = experienceStatus;
  }

  public JobSeekerViewModel resumeUrl(String resumeUrl) {
    this.resumeUrl = JsonNullable.of(resumeUrl);
    return this;
  }

  /**
   * Get resumeUrl
   * @return resumeUrl
  */
  
  @Schema(name = "ResumeUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ResumeUrl")
  public JsonNullable<String> getResumeUrl() {
    return resumeUrl;
  }

  public void setResumeUrl(JsonNullable<String> resumeUrl) {
    this.resumeUrl = resumeUrl;
  }

  public JobSeekerViewModel jobSeekerSkills(List<@Valid JobSeekerSkill> jobSeekerSkills) {
    this.jobSeekerSkills = JsonNullable.of(jobSeekerSkills);
    return this;
  }

  public JobSeekerViewModel addJobSeekerSkillsItem(JobSeekerSkill jobSeekerSkillsItem) {
    if (this.jobSeekerSkills == null || !this.jobSeekerSkills.isPresent()) {
      this.jobSeekerSkills = JsonNullable.of(new ArrayList<>());
    }
    this.jobSeekerSkills.get().add(jobSeekerSkillsItem);
    return this;
  }

  /**
   * Get jobSeekerSkills
   * @return jobSeekerSkills
  */
  @Valid 
  @Schema(name = "JobSeekerSkills", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("JobSeekerSkills")
  public JsonNullable<List<@Valid JobSeekerSkill>> getJobSeekerSkills() {
    return jobSeekerSkills;
  }

  public void setJobSeekerSkills(JsonNullable<List<@Valid JobSeekerSkill>> jobSeekerSkills) {
    this.jobSeekerSkills = jobSeekerSkills;
  }

  public JobSeekerViewModel jobSeekerWorkExperiences(List<@Valid JobSeekerWorkExperience> jobSeekerWorkExperiences) {
    this.jobSeekerWorkExperiences = JsonNullable.of(jobSeekerWorkExperiences);
    return this;
  }

  public JobSeekerViewModel addJobSeekerWorkExperiencesItem(JobSeekerWorkExperience jobSeekerWorkExperiencesItem) {
    if (this.jobSeekerWorkExperiences == null || !this.jobSeekerWorkExperiences.isPresent()) {
      this.jobSeekerWorkExperiences = JsonNullable.of(new ArrayList<>());
    }
    this.jobSeekerWorkExperiences.get().add(jobSeekerWorkExperiencesItem);
    return this;
  }

  /**
   * Get jobSeekerWorkExperiences
   * @return jobSeekerWorkExperiences
  */
  @Valid 
  @Schema(name = "JobSeekerWorkExperiences", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("JobSeekerWorkExperiences")
  public JsonNullable<List<@Valid JobSeekerWorkExperience>> getJobSeekerWorkExperiences() {
    return jobSeekerWorkExperiences;
  }

  public void setJobSeekerWorkExperiences(JsonNullable<List<@Valid JobSeekerWorkExperience>> jobSeekerWorkExperiences) {
    this.jobSeekerWorkExperiences = jobSeekerWorkExperiences;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobSeekerViewModel jobSeekerViewModel = (JobSeekerViewModel) o;
    return Objects.equals(this.jobSeekerId, jobSeekerViewModel.jobSeekerId) &&
        equalsNullable(this.fullName, jobSeekerViewModel.fullName) &&
        equalsNullable(this.emailId, jobSeekerViewModel.emailId) &&
        equalsNullable(this.mobileNo, jobSeekerViewModel.mobileNo) &&
        equalsNullable(this.experienceStatus, jobSeekerViewModel.experienceStatus) &&
        equalsNullable(this.resumeUrl, jobSeekerViewModel.resumeUrl) &&
        equalsNullable(this.jobSeekerSkills, jobSeekerViewModel.jobSeekerSkills) &&
        equalsNullable(this.jobSeekerWorkExperiences, jobSeekerViewModel.jobSeekerWorkExperiences);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobSeekerId, hashCodeNullable(fullName), hashCodeNullable(emailId), hashCodeNullable(mobileNo), hashCodeNullable(experienceStatus), hashCodeNullable(resumeUrl), hashCodeNullable(jobSeekerSkills), hashCodeNullable(jobSeekerWorkExperiences));
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
    sb.append("class JobSeekerViewModel {\n");
    sb.append("    jobSeekerId: ").append(toIndentedString(jobSeekerId)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    experienceStatus: ").append(toIndentedString(experienceStatus)).append("\n");
    sb.append("    resumeUrl: ").append(toIndentedString(resumeUrl)).append("\n");
    sb.append("    jobSeekerSkills: ").append(toIndentedString(jobSeekerSkills)).append("\n");
    sb.append("    jobSeekerWorkExperiences: ").append(toIndentedString(jobSeekerWorkExperiences)).append("\n");
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

