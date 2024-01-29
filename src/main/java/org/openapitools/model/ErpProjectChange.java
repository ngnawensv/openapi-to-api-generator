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
 * ErpProjectChange
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class ErpProjectChange {

  private Integer projectChangeId;

  private Integer projectId;

  private JsonNullable<String> changeDetails = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime changeDate;

  private JsonNullable<Integer> approvedByEmpId = JsonNullable.<Integer>undefined();

  public ErpProjectChange projectChangeId(Integer projectChangeId) {
    this.projectChangeId = projectChangeId;
    return this;
  }

  /**
   * Get projectChangeId
   * @return projectChangeId
  */
  
  @Schema(name = "projectChangeId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectChangeId")
  public Integer getProjectChangeId() {
    return projectChangeId;
  }

  public void setProjectChangeId(Integer projectChangeId) {
    this.projectChangeId = projectChangeId;
  }

  public ErpProjectChange projectId(Integer projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
  */
  
  @Schema(name = "projectId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectId")
  public Integer getProjectId() {
    return projectId;
  }

  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }

  public ErpProjectChange changeDetails(String changeDetails) {
    this.changeDetails = JsonNullable.of(changeDetails);
    return this;
  }

  /**
   * Get changeDetails
   * @return changeDetails
  */
  
  @Schema(name = "changeDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changeDetails")
  public JsonNullable<String> getChangeDetails() {
    return changeDetails;
  }

  public void setChangeDetails(JsonNullable<String> changeDetails) {
    this.changeDetails = changeDetails;
  }

  public ErpProjectChange changeDate(OffsetDateTime changeDate) {
    this.changeDate = changeDate;
    return this;
  }

  /**
   * Get changeDate
   * @return changeDate
  */
  @Valid 
  @Schema(name = "changeDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changeDate")
  public OffsetDateTime getChangeDate() {
    return changeDate;
  }

  public void setChangeDate(OffsetDateTime changeDate) {
    this.changeDate = changeDate;
  }

  public ErpProjectChange approvedByEmpId(Integer approvedByEmpId) {
    this.approvedByEmpId = JsonNullable.of(approvedByEmpId);
    return this;
  }

  /**
   * Get approvedByEmpId
   * @return approvedByEmpId
  */
  
  @Schema(name = "approvedByEmpId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approvedByEmpId")
  public JsonNullable<Integer> getApprovedByEmpId() {
    return approvedByEmpId;
  }

  public void setApprovedByEmpId(JsonNullable<Integer> approvedByEmpId) {
    this.approvedByEmpId = approvedByEmpId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErpProjectChange erpProjectChange = (ErpProjectChange) o;
    return Objects.equals(this.projectChangeId, erpProjectChange.projectChangeId) &&
        Objects.equals(this.projectId, erpProjectChange.projectId) &&
        equalsNullable(this.changeDetails, erpProjectChange.changeDetails) &&
        Objects.equals(this.changeDate, erpProjectChange.changeDate) &&
        equalsNullable(this.approvedByEmpId, erpProjectChange.approvedByEmpId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectChangeId, projectId, hashCodeNullable(changeDetails), changeDate, hashCodeNullable(approvedByEmpId));
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
    sb.append("class ErpProjectChange {\n");
    sb.append("    projectChangeId: ").append(toIndentedString(projectChangeId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    changeDetails: ").append(toIndentedString(changeDetails)).append("\n");
    sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
    sb.append("    approvedByEmpId: ").append(toIndentedString(approvedByEmpId)).append("\n");
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

