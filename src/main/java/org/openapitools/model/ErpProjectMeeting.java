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
 * ErpProjectMeeting
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class ErpProjectMeeting {

  private Integer projectMeetingId;

  private Integer projectId;

  private Integer meetingLeadByEmpId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime meetingDate;

  private JsonNullable<String> startTime = JsonNullable.<String>undefined();

  private JsonNullable<String> endTime = JsonNullable.<String>undefined();

  private JsonNullable<String> meetingMedium = JsonNullable.<String>undefined();

  private JsonNullable<Boolean> isRecordingAvailable = JsonNullable.<Boolean>undefined();

  private JsonNullable<String> recordingUrl = JsonNullable.<String>undefined();

  private JsonNullable<String> meetingNotes = JsonNullable.<String>undefined();

  private JsonNullable<String> clientPersonNames = JsonNullable.<String>undefined();

  private JsonNullable<String> meetingTitle = JsonNullable.<String>undefined();

  private JsonNullable<String> meetingStatus = JsonNullable.<String>undefined();

  public ErpProjectMeeting projectMeetingId(Integer projectMeetingId) {
    this.projectMeetingId = projectMeetingId;
    return this;
  }

  /**
   * Get projectMeetingId
   * @return projectMeetingId
  */
  
  @Schema(name = "projectMeetingId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectMeetingId")
  public Integer getProjectMeetingId() {
    return projectMeetingId;
  }

  public void setProjectMeetingId(Integer projectMeetingId) {
    this.projectMeetingId = projectMeetingId;
  }

  public ErpProjectMeeting projectId(Integer projectId) {
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

  public ErpProjectMeeting meetingLeadByEmpId(Integer meetingLeadByEmpId) {
    this.meetingLeadByEmpId = meetingLeadByEmpId;
    return this;
  }

  /**
   * Get meetingLeadByEmpId
   * @return meetingLeadByEmpId
  */
  
  @Schema(name = "meetingLeadByEmpId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("meetingLeadByEmpId")
  public Integer getMeetingLeadByEmpId() {
    return meetingLeadByEmpId;
  }

  public void setMeetingLeadByEmpId(Integer meetingLeadByEmpId) {
    this.meetingLeadByEmpId = meetingLeadByEmpId;
  }

  public ErpProjectMeeting meetingDate(OffsetDateTime meetingDate) {
    this.meetingDate = meetingDate;
    return this;
  }

  /**
   * Get meetingDate
   * @return meetingDate
  */
  @Valid 
  @Schema(name = "meetingDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("meetingDate")
  public OffsetDateTime getMeetingDate() {
    return meetingDate;
  }

  public void setMeetingDate(OffsetDateTime meetingDate) {
    this.meetingDate = meetingDate;
  }

  public ErpProjectMeeting startTime(String startTime) {
    this.startTime = JsonNullable.of(startTime);
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  */
  
  @Schema(name = "startTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTime")
  public JsonNullable<String> getStartTime() {
    return startTime;
  }

  public void setStartTime(JsonNullable<String> startTime) {
    this.startTime = startTime;
  }

  public ErpProjectMeeting endTime(String endTime) {
    this.endTime = JsonNullable.of(endTime);
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  */
  
  @Schema(name = "endTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endTime")
  public JsonNullable<String> getEndTime() {
    return endTime;
  }

  public void setEndTime(JsonNullable<String> endTime) {
    this.endTime = endTime;
  }

  public ErpProjectMeeting meetingMedium(String meetingMedium) {
    this.meetingMedium = JsonNullable.of(meetingMedium);
    return this;
  }

  /**
   * Get meetingMedium
   * @return meetingMedium
  */
  
  @Schema(name = "meetingMedium", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("meetingMedium")
  public JsonNullable<String> getMeetingMedium() {
    return meetingMedium;
  }

  public void setMeetingMedium(JsonNullable<String> meetingMedium) {
    this.meetingMedium = meetingMedium;
  }

  public ErpProjectMeeting isRecordingAvailable(Boolean isRecordingAvailable) {
    this.isRecordingAvailable = JsonNullable.of(isRecordingAvailable);
    return this;
  }

  /**
   * Get isRecordingAvailable
   * @return isRecordingAvailable
  */
  
  @Schema(name = "isRecordingAvailable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isRecordingAvailable")
  public JsonNullable<Boolean> getIsRecordingAvailable() {
    return isRecordingAvailable;
  }

  public void setIsRecordingAvailable(JsonNullable<Boolean> isRecordingAvailable) {
    this.isRecordingAvailable = isRecordingAvailable;
  }

  public ErpProjectMeeting recordingUrl(String recordingUrl) {
    this.recordingUrl = JsonNullable.of(recordingUrl);
    return this;
  }

  /**
   * Get recordingUrl
   * @return recordingUrl
  */
  
  @Schema(name = "recordingUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recordingUrl")
  public JsonNullable<String> getRecordingUrl() {
    return recordingUrl;
  }

  public void setRecordingUrl(JsonNullable<String> recordingUrl) {
    this.recordingUrl = recordingUrl;
  }

  public ErpProjectMeeting meetingNotes(String meetingNotes) {
    this.meetingNotes = JsonNullable.of(meetingNotes);
    return this;
  }

  /**
   * Get meetingNotes
   * @return meetingNotes
  */
  
  @Schema(name = "meetingNotes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("meetingNotes")
  public JsonNullable<String> getMeetingNotes() {
    return meetingNotes;
  }

  public void setMeetingNotes(JsonNullable<String> meetingNotes) {
    this.meetingNotes = meetingNotes;
  }

  public ErpProjectMeeting clientPersonNames(String clientPersonNames) {
    this.clientPersonNames = JsonNullable.of(clientPersonNames);
    return this;
  }

  /**
   * Get clientPersonNames
   * @return clientPersonNames
  */
  
  @Schema(name = "clientPersonNames", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientPersonNames")
  public JsonNullable<String> getClientPersonNames() {
    return clientPersonNames;
  }

  public void setClientPersonNames(JsonNullable<String> clientPersonNames) {
    this.clientPersonNames = clientPersonNames;
  }

  public ErpProjectMeeting meetingTitle(String meetingTitle) {
    this.meetingTitle = JsonNullable.of(meetingTitle);
    return this;
  }

  /**
   * Get meetingTitle
   * @return meetingTitle
  */
  
  @Schema(name = "meetingTitle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("meetingTitle")
  public JsonNullable<String> getMeetingTitle() {
    return meetingTitle;
  }

  public void setMeetingTitle(JsonNullable<String> meetingTitle) {
    this.meetingTitle = meetingTitle;
  }

  public ErpProjectMeeting meetingStatus(String meetingStatus) {
    this.meetingStatus = JsonNullable.of(meetingStatus);
    return this;
  }

  /**
   * Get meetingStatus
   * @return meetingStatus
  */
  
  @Schema(name = "meetingStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("meetingStatus")
  public JsonNullable<String> getMeetingStatus() {
    return meetingStatus;
  }

  public void setMeetingStatus(JsonNullable<String> meetingStatus) {
    this.meetingStatus = meetingStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErpProjectMeeting erpProjectMeeting = (ErpProjectMeeting) o;
    return Objects.equals(this.projectMeetingId, erpProjectMeeting.projectMeetingId) &&
        Objects.equals(this.projectId, erpProjectMeeting.projectId) &&
        Objects.equals(this.meetingLeadByEmpId, erpProjectMeeting.meetingLeadByEmpId) &&
        Objects.equals(this.meetingDate, erpProjectMeeting.meetingDate) &&
        equalsNullable(this.startTime, erpProjectMeeting.startTime) &&
        equalsNullable(this.endTime, erpProjectMeeting.endTime) &&
        equalsNullable(this.meetingMedium, erpProjectMeeting.meetingMedium) &&
        equalsNullable(this.isRecordingAvailable, erpProjectMeeting.isRecordingAvailable) &&
        equalsNullable(this.recordingUrl, erpProjectMeeting.recordingUrl) &&
        equalsNullable(this.meetingNotes, erpProjectMeeting.meetingNotes) &&
        equalsNullable(this.clientPersonNames, erpProjectMeeting.clientPersonNames) &&
        equalsNullable(this.meetingTitle, erpProjectMeeting.meetingTitle) &&
        equalsNullable(this.meetingStatus, erpProjectMeeting.meetingStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectMeetingId, projectId, meetingLeadByEmpId, meetingDate, hashCodeNullable(startTime), hashCodeNullable(endTime), hashCodeNullable(meetingMedium), hashCodeNullable(isRecordingAvailable), hashCodeNullable(recordingUrl), hashCodeNullable(meetingNotes), hashCodeNullable(clientPersonNames), hashCodeNullable(meetingTitle), hashCodeNullable(meetingStatus));
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
    sb.append("class ErpProjectMeeting {\n");
    sb.append("    projectMeetingId: ").append(toIndentedString(projectMeetingId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    meetingLeadByEmpId: ").append(toIndentedString(meetingLeadByEmpId)).append("\n");
    sb.append("    meetingDate: ").append(toIndentedString(meetingDate)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    meetingMedium: ").append(toIndentedString(meetingMedium)).append("\n");
    sb.append("    isRecordingAvailable: ").append(toIndentedString(isRecordingAvailable)).append("\n");
    sb.append("    recordingUrl: ").append(toIndentedString(recordingUrl)).append("\n");
    sb.append("    meetingNotes: ").append(toIndentedString(meetingNotes)).append("\n");
    sb.append("    clientPersonNames: ").append(toIndentedString(clientPersonNames)).append("\n");
    sb.append("    meetingTitle: ").append(toIndentedString(meetingTitle)).append("\n");
    sb.append("    meetingStatus: ").append(toIndentedString(meetingStatus)).append("\n");
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

