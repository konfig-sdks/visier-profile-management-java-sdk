/*
 * Visier Profile Management APIs
 * Visier APIs for managing the profiles assigned to users
 *
 * The version of the OpenAPI document: 22222222.99201.1200
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.AdditionalCapabilitiesDTO;
import com.konfigthis.client.model.CapabilitiesDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * ProfileAssignedForLocalTenantDTO
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProfileAssignedForLocalTenantDTO {
  public static final String SERIALIZED_NAME_PROFILE_ID = "profileId";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  private String profileId;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_VALIDITY_START_TIME = "validityStartTime";
  @SerializedName(SERIALIZED_NAME_VALIDITY_START_TIME)
  private String validityStartTime;

  public static final String SERIALIZED_NAME_VALIDITY_END_TIME = "validityEndTime";
  @SerializedName(SERIALIZED_NAME_VALIDITY_END_TIME)
  private String validityEndTime;

  public static final String SERIALIZED_NAME_CAPABILITIES = "capabilities";
  @SerializedName(SERIALIZED_NAME_CAPABILITIES)
  private List<CapabilitiesDTO> capabilities = null;

  public static final String SERIALIZED_NAME_ADDITIONAL_CAPABILITIES = "additionalCapabilities";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_CAPABILITIES)
  private AdditionalCapabilitiesDTO additionalCapabilities;

  public ProfileAssignedForLocalTenantDTO() {
  }

  public ProfileAssignedForLocalTenantDTO profileId(String profileId) {
    
    
    
    
    this.profileId = profileId;
    return this;
  }

   /**
   * The unique identifier associated with the profile.
   * @return profileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier associated with the profile.")

  public String getProfileId() {
    return profileId;
  }


  public void setProfileId(String profileId) {
    
    
    
    this.profileId = profileId;
  }


  public ProfileAssignedForLocalTenantDTO displayName(String displayName) {
    
    
    
    
    this.displayName = displayName;
    return this;
  }

   /**
   * An identifiable profile name to display in Visier, such as \&quot;Partner Service Manager\&quot;.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An identifiable profile name to display in Visier, such as \"Partner Service Manager\".")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    
    
    
    this.displayName = displayName;
  }


  public ProfileAssignedForLocalTenantDTO validityStartTime(String validityStartTime) {
    
    
    
    
    this.validityStartTime = validityStartTime;
    return this;
  }

   /**
   * An inclusive date-time when this profile is active.
   * @return validityStartTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An inclusive date-time when this profile is active.")

  public String getValidityStartTime() {
    return validityStartTime;
  }


  public void setValidityStartTime(String validityStartTime) {
    
    
    
    this.validityStartTime = validityStartTime;
  }


  public ProfileAssignedForLocalTenantDTO validityEndTime(String validityEndTime) {
    
    
    
    
    this.validityEndTime = validityEndTime;
    return this;
  }

   /**
   * An exclusive date-time when this profile is no longer active.
   * @return validityEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An exclusive date-time when this profile is no longer active.")

  public String getValidityEndTime() {
    return validityEndTime;
  }


  public void setValidityEndTime(String validityEndTime) {
    
    
    
    this.validityEndTime = validityEndTime;
  }


  public ProfileAssignedForLocalTenantDTO capabilities(List<CapabilitiesDTO> capabilities) {
    
    
    
    
    this.capabilities = capabilities;
    return this;
  }

  public ProfileAssignedForLocalTenantDTO addCapabilitiesItem(CapabilitiesDTO capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new ArrayList<>();
    }
    this.capabilities.add(capabilitiesItem);
    return this;
  }

   /**
   * A list of objects representing the access that this profile has for the capabilities of this profile.
   * @return capabilities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of objects representing the access that this profile has for the capabilities of this profile.")

  public List<CapabilitiesDTO> getCapabilities() {
    return capabilities;
  }


  public void setCapabilities(List<CapabilitiesDTO> capabilities) {
    
    
    
    this.capabilities = capabilities;
  }


  public ProfileAssignedForLocalTenantDTO additionalCapabilities(AdditionalCapabilitiesDTO additionalCapabilities) {
    
    
    
    
    this.additionalCapabilities = additionalCapabilities;
    return this;
  }

   /**
   * A list of the additional capabilities that are assigned to this profile.
   * @return additionalCapabilities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of the additional capabilities that are assigned to this profile.")

  public AdditionalCapabilitiesDTO getAdditionalCapabilities() {
    return additionalCapabilities;
  }


  public void setAdditionalCapabilities(AdditionalCapabilitiesDTO additionalCapabilities) {
    
    
    
    this.additionalCapabilities = additionalCapabilities;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ProfileAssignedForLocalTenantDTO instance itself
   */
  public ProfileAssignedForLocalTenantDTO putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileAssignedForLocalTenantDTO profileAssignedForLocalTenantDTO = (ProfileAssignedForLocalTenantDTO) o;
    return Objects.equals(this.profileId, profileAssignedForLocalTenantDTO.profileId) &&
        Objects.equals(this.displayName, profileAssignedForLocalTenantDTO.displayName) &&
        Objects.equals(this.validityStartTime, profileAssignedForLocalTenantDTO.validityStartTime) &&
        Objects.equals(this.validityEndTime, profileAssignedForLocalTenantDTO.validityEndTime) &&
        Objects.equals(this.capabilities, profileAssignedForLocalTenantDTO.capabilities) &&
        Objects.equals(this.additionalCapabilities, profileAssignedForLocalTenantDTO.additionalCapabilities)&&
        Objects.equals(this.additionalProperties, profileAssignedForLocalTenantDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileId, displayName, validityStartTime, validityEndTime, capabilities, additionalCapabilities, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileAssignedForLocalTenantDTO {\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    validityStartTime: ").append(toIndentedString(validityStartTime)).append("\n");
    sb.append("    validityEndTime: ").append(toIndentedString(validityEndTime)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    additionalCapabilities: ").append(toIndentedString(additionalCapabilities)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("profileId");
    openapiFields.add("displayName");
    openapiFields.add("validityStartTime");
    openapiFields.add("validityEndTime");
    openapiFields.add("capabilities");
    openapiFields.add("additionalCapabilities");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProfileAssignedForLocalTenantDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProfileAssignedForLocalTenantDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProfileAssignedForLocalTenantDTO is not found in the empty JSON string", ProfileAssignedForLocalTenantDTO.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("profileId") != null && !jsonObj.get("profileId").isJsonNull()) && !jsonObj.get("profileId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profileId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profileId").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("validityStartTime") != null && !jsonObj.get("validityStartTime").isJsonNull()) && !jsonObj.get("validityStartTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validityStartTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validityStartTime").toString()));
      }
      if ((jsonObj.get("validityEndTime") != null && !jsonObj.get("validityEndTime").isJsonNull()) && !jsonObj.get("validityEndTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validityEndTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validityEndTime").toString()));
      }
      if (jsonObj.get("capabilities") != null && !jsonObj.get("capabilities").isJsonNull()) {
        JsonArray jsonArraycapabilities = jsonObj.getAsJsonArray("capabilities");
        if (jsonArraycapabilities != null) {
          // ensure the json data is an array
          if (!jsonObj.get("capabilities").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `capabilities` to be an array in the JSON string but got `%s`", jsonObj.get("capabilities").toString()));
          }

          // validate the optional field `capabilities` (array)
          for (int i = 0; i < jsonArraycapabilities.size(); i++) {
            CapabilitiesDTO.validateJsonObject(jsonArraycapabilities.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `additionalCapabilities`
      if (jsonObj.get("additionalCapabilities") != null && !jsonObj.get("additionalCapabilities").isJsonNull()) {
        AdditionalCapabilitiesDTO.validateJsonObject(jsonObj.getAsJsonObject("additionalCapabilities"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProfileAssignedForLocalTenantDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProfileAssignedForLocalTenantDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProfileAssignedForLocalTenantDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProfileAssignedForLocalTenantDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<ProfileAssignedForLocalTenantDTO>() {
           @Override
           public void write(JsonWriter out, ProfileAssignedForLocalTenantDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ProfileAssignedForLocalTenantDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProfileAssignedForLocalTenantDTO instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProfileAssignedForLocalTenantDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProfileAssignedForLocalTenantDTO
  * @throws IOException if the JSON string is invalid with respect to ProfileAssignedForLocalTenantDTO
  */
  public static ProfileAssignedForLocalTenantDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProfileAssignedForLocalTenantDTO.class);
  }

 /**
  * Convert an instance of ProfileAssignedForLocalTenantDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
