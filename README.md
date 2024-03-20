<div align="center">

[![Visit Visier](./header.png)](https://visier.com)

# [Visier](https://visier.com)

Visier APIs for managing the profiles assigned to users

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Visier&serviceName=ProfileManagement&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>visier-profile-management-java-sdk</artifactId>
  <version>22222222.99201.1200</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:visier-profile-management-java-sdk:22222222.99201.1200"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/visier-profile-management-java-sdk-22222222.99201.1200.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierProfileManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProfileManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierProfileManagement client = new VisierProfileManagement(configuration);
    String profileId = "profileId_example"; // The ID of the profile to assign.
    List<String> targetUserIds = Arrays.asList(); // A list of users to assign this profile.
    List<TargetTenantCodeDTO> targetTenantCodes = Arrays.asList(); // A list of objects representing the  analytic tenants for profiles assigned to the users.
    String validityStartTime = "validityStartTime_example"; // An inclusive date-time when this profile is active.
    String validityEndTime = "validityEndTime_example"; // An exclusive date-time when this profile is no longer active.
    try {
      AccessibleTenantProfileAssignmentResponseDTO result = client
              .profileManagement
              .assignAnalyticProfile(profileId)
              .targetUserIds(targetUserIds)
              .targetTenantCodes(targetTenantCodes)
              .validityStartTime(validityStartTime)
              .validityEndTime(validityEndTime)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrors());
      System.out.println(result.getBadTenantCodes());
      System.out.println(result.getBadUserIds());
      System.out.println(result.getFailedAssignments());
      System.out.println(result.getSuccessfulAssignments());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileManagementApi#assignAnalyticProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccessibleTenantProfileAssignmentResponseDTO> response = client
              .profileManagement
              .assignAnalyticProfile(profileId)
              .targetUserIds(targetUserIds)
              .targetTenantCodes(targetTenantCodes)
              .validityStartTime(validityStartTime)
              .validityEndTime(validityEndTime)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileManagementApi#assignAnalyticProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://vanity.api.visier.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ProfileManagementApi* | [**assignAnalyticProfile**](docs/ProfileManagementApi.md#assignAnalyticProfile) | **PUT** /v1/admin/profiles/accessible-tenants/{profileId}/assign | Assign an analytic tenant profile to administrating tenant users
*ProfileManagementApi* | [**assignProfile**](docs/ProfileManagementApi.md#assignProfile) | **PUT** /v1/admin/profiles/{profileId}/assign | Assign a profile to a list of users
*ProfileManagementApi* | [**getAllProfiles**](docs/ProfileManagementApi.md#getAllProfiles) | **GET** /v1/admin/profiles | Retrieve a list of all profiles
*ProfileManagementApi* | [**getAnalyticProfileDetail**](docs/ProfileManagementApi.md#getAnalyticProfileDetail) | **GET** /v1/admin/profiles/accessible-tenants/{profileId} | Retrieve the details of an analytic tenant profile
*ProfileManagementApi* | [**getAnalyticProfiles**](docs/ProfileManagementApi.md#getAnalyticProfiles) | **GET** /v1/admin/profiles/accessible-tenants | Retrieve a list of analytic tenant profiles
*ProfileManagementApi* | [**getAnalyticUserProfile**](docs/ProfileManagementApi.md#getAnalyticUserProfile) | **GET** /v1/admin/users/{userId}/accessible-tenant-profiles | Retrieve an administrating tenant user&#39;s analytic tenant profiles
*ProfileManagementApi* | [**getProfileDetail**](docs/ProfileManagementApi.md#getProfileDetail) | **GET** /v1/admin/profiles/{profileId} | Retrieve the details of a profile
*ProfileManagementApi* | [**getUserProfile**](docs/ProfileManagementApi.md#getUserProfile) | **GET** /v1/admin/users/{userId}/profiles | Retrieve a user&#39;s profiles
*ProfileManagementApi* | [**removeAnalyticProfile**](docs/ProfileManagementApi.md#removeAnalyticProfile) | **DELETE** /v1/admin/profiles/accessible-tenants/{profileId}/remove | Remove an analytic tenant profile from administrating tenant users
*ProfileManagementApi* | [**removeProfile**](docs/ProfileManagementApi.md#removeProfile) | **DELETE** /v1/admin/profiles/{profileId}/remove | Remove a profile from a list of users


## Documentation for Models

 - [AccessibleTenantProfileAssignmentRequestDTO](docs/AccessibleTenantProfileAssignmentRequestDTO.md)
 - [AccessibleTenantProfileAssignmentResponseDTO](docs/AccessibleTenantProfileAssignmentResponseDTO.md)
 - [AccessibleTenantProfileRevokeRequestDTO](docs/AccessibleTenantProfileRevokeRequestDTO.md)
 - [AccessibleTenantProfileRevokeResponseDTO](docs/AccessibleTenantProfileRevokeResponseDTO.md)
 - [AdditionalCapabilitiesDTO](docs/AdditionalCapabilitiesDTO.md)
 - [AllProfileAssignedForAccessibleTenantDTO](docs/AllProfileAssignedForAccessibleTenantDTO.md)
 - [AllProfileAssignedForLocalTenantDTO](docs/AllProfileAssignedForLocalTenantDTO.md)
 - [CapabilitiesDTO](docs/CapabilitiesDTO.md)
 - [ErrorDTO](docs/ErrorDTO.md)
 - [FailedAccessibleTenantProfileAssignmentDTO](docs/FailedAccessibleTenantProfileAssignmentDTO.md)
 - [FailedLocalTenantProfileAssignmentDTO](docs/FailedLocalTenantProfileAssignmentDTO.md)
 - [FailedLocalTenantProfileRevokeDTO](docs/FailedLocalTenantProfileRevokeDTO.md)
 - [GoogleProtobufAny](docs/GoogleProtobufAny.md)
 - [LocalTenantProfileAssignmentRequestDTO](docs/LocalTenantProfileAssignmentRequestDTO.md)
 - [LocalTenantProfileAssignmentResponseDTO](docs/LocalTenantProfileAssignmentResponseDTO.md)
 - [LocalTenantProfileRevokeRequestDTO](docs/LocalTenantProfileRevokeRequestDTO.md)
 - [LocalTenantProfileRevokeResponseDTO](docs/LocalTenantProfileRevokeResponseDTO.md)
 - [ProfileAssignedForAccessibleTenantDTO](docs/ProfileAssignedForAccessibleTenantDTO.md)
 - [ProfileAssignedForLocalTenantDTO](docs/ProfileAssignedForLocalTenantDTO.md)
 - [ProfileGetAPIResponseDTO](docs/ProfileGetAPIResponseDTO.md)
 - [ProfilesGetAPIResponseDTO](docs/ProfilesGetAPIResponseDTO.md)
 - [ReducedErrorDTO](docs/ReducedErrorDTO.md)
 - [ReducedTenantCodeErrorDTO](docs/ReducedTenantCodeErrorDTO.md)
 - [ReducedUserIdErrorDTO](docs/ReducedUserIdErrorDTO.md)
 - [Status](docs/Status.md)
 - [SuccessfulAccessibleTenantProfileAssignmentDTO](docs/SuccessfulAccessibleTenantProfileAssignmentDTO.md)
 - [SuccessfulLocalTenantProfileAssignmentDTO](docs/SuccessfulLocalTenantProfileAssignmentDTO.md)
 - [TargetTenantCodeDTO](docs/TargetTenantCodeDTO.md)
 - [TenantCodeErrorDTO](docs/TenantCodeErrorDTO.md)
 - [UserIdErrorDTO](docs/UserIdErrorDTO.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
