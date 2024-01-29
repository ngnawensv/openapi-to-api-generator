package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TestLogin
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class TestLogin {

  private String emailid;

  private String password;

  public TestLogin() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TestLogin(String emailid, String password) {
    this.emailid = emailid;
    this.password = password;
  }

  public TestLogin emailid(String emailid) {
    this.emailid = emailid;
    return this;
  }

  /**
   * Get emailid
   * @return emailid
  */
  @NotNull 
  @Schema(name = "emailid", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("emailid")
  public String getEmailid() {
    return emailid;
  }

  public void setEmailid(String emailid) {
    this.emailid = emailid;
  }

  public TestLogin password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  @NotNull 
  @Schema(name = "password", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestLogin testLogin = (TestLogin) o;
    return Objects.equals(this.emailid, testLogin.emailid) &&
        Objects.equals(this.password, testLogin.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailid, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestLogin {\n");
    sb.append("    emailid: ").append(toIndentedString(emailid)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

