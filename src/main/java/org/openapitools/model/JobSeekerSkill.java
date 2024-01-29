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
 * JobSeekerSkill
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class JobSeekerSkill {

  private Integer skillId;

  private Integer jobSeekarId;

  private JsonNullable<String> skillName = JsonNullable.<String>undefined();

  private JsonNullable<String> durationOfSkill = JsonNullable.<String>undefined();

  public JobSeekerSkill skillId(Integer skillId) {
    this.skillId = skillId;
    return this;
  }

  /**
   * Get skillId
   * @return skillId
  */
  
  @Schema(name = "SkillId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SkillId")
  public Integer getSkillId() {
    return skillId;
  }

  public void setSkillId(Integer skillId) {
    this.skillId = skillId;
  }

  public JobSeekerSkill jobSeekarId(Integer jobSeekarId) {
    this.jobSeekarId = jobSeekarId;
    return this;
  }

  /**
   * Get jobSeekarId
   * @return jobSeekarId
  */
  
  @Schema(name = "JobSeekarId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("JobSeekarId")
  public Integer getJobSeekarId() {
    return jobSeekarId;
  }

  public void setJobSeekarId(Integer jobSeekarId) {
    this.jobSeekarId = jobSeekarId;
  }

  public JobSeekerSkill skillName(String skillName) {
    this.skillName = JsonNullable.of(skillName);
    return this;
  }

  /**
   * Get skillName
   * @return skillName
  */
  
  @Schema(name = "SkillName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SkillName")
  public JsonNullable<String> getSkillName() {
    return skillName;
  }

  public void setSkillName(JsonNullable<String> skillName) {
    this.skillName = skillName;
  }

  public JobSeekerSkill durationOfSkill(String durationOfSkill) {
    this.durationOfSkill = JsonNullable.of(durationOfSkill);
    return this;
  }

  /**
   * Get durationOfSkill
   * @return durationOfSkill
  */
  
  @Schema(name = "DurationOfSkill", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DurationOfSkill")
  public JsonNullable<String> getDurationOfSkill() {
    return durationOfSkill;
  }

  public void setDurationOfSkill(JsonNullable<String> durationOfSkill) {
    this.durationOfSkill = durationOfSkill;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobSeekerSkill jobSeekerSkill = (JobSeekerSkill) o;
    return Objects.equals(this.skillId, jobSeekerSkill.skillId) &&
        Objects.equals(this.jobSeekarId, jobSeekerSkill.jobSeekarId) &&
        equalsNullable(this.skillName, jobSeekerSkill.skillName) &&
        equalsNullable(this.durationOfSkill, jobSeekerSkill.durationOfSkill);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(skillId, jobSeekarId, hashCodeNullable(skillName), hashCodeNullable(durationOfSkill));
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
    sb.append("class JobSeekerSkill {\n");
    sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
    sb.append("    jobSeekarId: ").append(toIndentedString(jobSeekarId)).append("\n");
    sb.append("    skillName: ").append(toIndentedString(skillName)).append("\n");
    sb.append("    durationOfSkill: ").append(toIndentedString(durationOfSkill)).append("\n");
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

