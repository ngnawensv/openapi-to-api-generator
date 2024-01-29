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
 * InLanguageTopic
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class InLanguageTopic {

  private Integer languageTopicId;

  private Integer languageId;

  private JsonNullable<String> topicName = JsonNullable.<String>undefined();

  private Integer orderNo;

  public InLanguageTopic languageTopicId(Integer languageTopicId) {
    this.languageTopicId = languageTopicId;
    return this;
  }

  /**
   * Get languageTopicId
   * @return languageTopicId
  */
  
  @Schema(name = "LanguageTopicId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LanguageTopicId")
  public Integer getLanguageTopicId() {
    return languageTopicId;
  }

  public void setLanguageTopicId(Integer languageTopicId) {
    this.languageTopicId = languageTopicId;
  }

  public InLanguageTopic languageId(Integer languageId) {
    this.languageId = languageId;
    return this;
  }

  /**
   * Get languageId
   * @return languageId
  */
  
  @Schema(name = "LanguageId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LanguageId")
  public Integer getLanguageId() {
    return languageId;
  }

  public void setLanguageId(Integer languageId) {
    this.languageId = languageId;
  }

  public InLanguageTopic topicName(String topicName) {
    this.topicName = JsonNullable.of(topicName);
    return this;
  }

  /**
   * Get topicName
   * @return topicName
  */
  
  @Schema(name = "TopicName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TopicName")
  public JsonNullable<String> getTopicName() {
    return topicName;
  }

  public void setTopicName(JsonNullable<String> topicName) {
    this.topicName = topicName;
  }

  public InLanguageTopic orderNo(Integer orderNo) {
    this.orderNo = orderNo;
    return this;
  }

  /**
   * Get orderNo
   * @return orderNo
  */
  
  @Schema(name = "OrderNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OrderNo")
  public Integer getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(Integer orderNo) {
    this.orderNo = orderNo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InLanguageTopic inLanguageTopic = (InLanguageTopic) o;
    return Objects.equals(this.languageTopicId, inLanguageTopic.languageTopicId) &&
        Objects.equals(this.languageId, inLanguageTopic.languageId) &&
        equalsNullable(this.topicName, inLanguageTopic.topicName) &&
        Objects.equals(this.orderNo, inLanguageTopic.orderNo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageTopicId, languageId, hashCodeNullable(topicName), orderNo);
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
    sb.append("class InLanguageTopic {\n");
    sb.append("    languageTopicId: ").append(toIndentedString(languageTopicId)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
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

