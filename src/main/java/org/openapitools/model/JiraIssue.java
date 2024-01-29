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
 * JiraIssue
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class JiraIssue {

  private Integer ticketId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> createdDate = JsonNullable.<OffsetDateTime>undefined();

  private String summary;

  private String status;

  private String description;

  private JsonNullable<Integer> parentId = JsonNullable.<Integer>undefined();

  private Integer storyPoint;

  private JsonNullable<String> ticketGuid = JsonNullable.<String>undefined();

  private Integer assignedTo;

  private Integer createdBy;

  private Integer projectId;

  public JiraIssue() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JiraIssue(String summary, String status, String description, Integer projectId) {
    this.summary = summary;
    this.status = status;
    this.description = description;
    this.projectId = projectId;
  }

  public JiraIssue ticketId(Integer ticketId) {
    this.ticketId = ticketId;
    return this;
  }

  /**
   * Get ticketId
   * @return ticketId
  */
  
  @Schema(name = "ticketId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketId")
  public Integer getTicketId() {
    return ticketId;
  }

  public void setTicketId(Integer ticketId) {
    this.ticketId = ticketId;
  }

  public JiraIssue createdDate(OffsetDateTime createdDate) {
    this.createdDate = JsonNullable.of(createdDate);
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  @Valid 
  @Schema(name = "createdDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdDate")
  public JsonNullable<OffsetDateTime> getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(JsonNullable<OffsetDateTime> createdDate) {
    this.createdDate = createdDate;
  }

  public JiraIssue summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
  */
  @NotNull 
  @Schema(name = "summary", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("summary")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public JiraIssue status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public JiraIssue description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @NotNull 
  @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public JiraIssue parentId(Integer parentId) {
    this.parentId = JsonNullable.of(parentId);
    return this;
  }

  /**
   * Get parentId
   * @return parentId
  */
  
  @Schema(name = "parentId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentId")
  public JsonNullable<Integer> getParentId() {
    return parentId;
  }

  public void setParentId(JsonNullable<Integer> parentId) {
    this.parentId = parentId;
  }

  public JiraIssue storyPoint(Integer storyPoint) {
    this.storyPoint = storyPoint;
    return this;
  }

  /**
   * Get storyPoint
   * @return storyPoint
  */
  
  @Schema(name = "storyPoint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("storyPoint")
  public Integer getStoryPoint() {
    return storyPoint;
  }

  public void setStoryPoint(Integer storyPoint) {
    this.storyPoint = storyPoint;
  }

  public JiraIssue ticketGuid(String ticketGuid) {
    this.ticketGuid = JsonNullable.of(ticketGuid);
    return this;
  }

  /**
   * Get ticketGuid
   * @return ticketGuid
  */
  
  @Schema(name = "ticketGuid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketGuid")
  public JsonNullable<String> getTicketGuid() {
    return ticketGuid;
  }

  public void setTicketGuid(JsonNullable<String> ticketGuid) {
    this.ticketGuid = ticketGuid;
  }

  public JiraIssue assignedTo(Integer assignedTo) {
    this.assignedTo = assignedTo;
    return this;
  }

  /**
   * Get assignedTo
   * @return assignedTo
  */
  
  @Schema(name = "assignedTo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignedTo")
  public Integer getAssignedTo() {
    return assignedTo;
  }

  public void setAssignedTo(Integer assignedTo) {
    this.assignedTo = assignedTo;
  }

  public JiraIssue createdBy(Integer createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  */
  
  @Schema(name = "createdBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdBy")
  public Integer getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }

  public JiraIssue projectId(Integer projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
  */
  @NotNull 
  @Schema(name = "projectId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("projectId")
  public Integer getProjectId() {
    return projectId;
  }

  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraIssue jiraIssue = (JiraIssue) o;
    return Objects.equals(this.ticketId, jiraIssue.ticketId) &&
        equalsNullable(this.createdDate, jiraIssue.createdDate) &&
        Objects.equals(this.summary, jiraIssue.summary) &&
        Objects.equals(this.status, jiraIssue.status) &&
        Objects.equals(this.description, jiraIssue.description) &&
        equalsNullable(this.parentId, jiraIssue.parentId) &&
        Objects.equals(this.storyPoint, jiraIssue.storyPoint) &&
        equalsNullable(this.ticketGuid, jiraIssue.ticketGuid) &&
        Objects.equals(this.assignedTo, jiraIssue.assignedTo) &&
        Objects.equals(this.createdBy, jiraIssue.createdBy) &&
        Objects.equals(this.projectId, jiraIssue.projectId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticketId, hashCodeNullable(createdDate), summary, status, description, hashCodeNullable(parentId), storyPoint, hashCodeNullable(ticketGuid), assignedTo, createdBy, projectId);
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
    sb.append("class JiraIssue {\n");
    sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    storyPoint: ").append(toIndentedString(storyPoint)).append("\n");
    sb.append("    ticketGuid: ").append(toIndentedString(ticketGuid)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

