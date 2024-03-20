# ProfileManagementApi

All URIs are relative to *https://vanity.api.visier.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignAnalyticProfile**](ProfileManagementApi.md#assignAnalyticProfile) | **PUT** /v1/admin/profiles/accessible-tenants/{profileId}/assign | Assign an analytic tenant profile to administrating tenant users |
| [**assignProfile**](ProfileManagementApi.md#assignProfile) | **PUT** /v1/admin/profiles/{profileId}/assign | Assign a profile to a list of users |
| [**getAllProfiles**](ProfileManagementApi.md#getAllProfiles) | **GET** /v1/admin/profiles | Retrieve a list of all profiles |
| [**getAnalyticProfileDetail**](ProfileManagementApi.md#getAnalyticProfileDetail) | **GET** /v1/admin/profiles/accessible-tenants/{profileId} | Retrieve the details of an analytic tenant profile |
| [**getAnalyticProfiles**](ProfileManagementApi.md#getAnalyticProfiles) | **GET** /v1/admin/profiles/accessible-tenants | Retrieve a list of analytic tenant profiles |
| [**getAnalyticUserProfile**](ProfileManagementApi.md#getAnalyticUserProfile) | **GET** /v1/admin/users/{userId}/accessible-tenant-profiles | Retrieve an administrating tenant user&#39;s analytic tenant profiles |
| [**getProfileDetail**](ProfileManagementApi.md#getProfileDetail) | **GET** /v1/admin/profiles/{profileId} | Retrieve the details of a profile |
| [**getUserProfile**](ProfileManagementApi.md#getUserProfile) | **GET** /v1/admin/users/{userId}/profiles | Retrieve a user&#39;s profiles |
| [**removeAnalyticProfile**](ProfileManagementApi.md#removeAnalyticProfile) | **DELETE** /v1/admin/profiles/accessible-tenants/{profileId}/remove | Remove an analytic tenant profile from administrating tenant users |
| [**removeProfile**](ProfileManagementApi.md#removeProfile) | **DELETE** /v1/admin/profiles/{profileId}/remove | Remove a profile from a list of users |


<a name="assignAnalyticProfile"></a>
# **assignAnalyticProfile**
> AccessibleTenantProfileAssignmentResponseDTO assignAnalyticProfile(profileId, accessibleTenantProfileAssignmentRequestDTO).execute();

Assign an analytic tenant profile to administrating tenant users

This API allows you to assign an analytic tenant profile to a list of administrating tenant users  for a list of analytic tenants.   Note:   - Administrating tenants only.   - You can revoke a profile from a user with this request by updating the validityEndTime to be     \&quot;less than\&quot; the current time (that is, in the past).

### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **profileId** | **String**| The ID of the profile to assign. | |
| **accessibleTenantProfileAssignmentRequestDTO** | [**AccessibleTenantProfileAssignmentRequestDTO**](AccessibleTenantProfileAssignmentRequestDTO.md)|  | |

### Return type

[**AccessibleTenantProfileAssignmentResponseDTO**](AccessibleTenantProfileAssignmentResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="assignProfile"></a>
# **assignProfile**
> LocalTenantProfileAssignmentResponseDTO assignProfile(profileId, localTenantProfileAssignmentRequestDTO).execute();

Assign a profile to a list of users

This API allows you to assign a profile to a list of users. For administrating tenants,  this assigns an administrating tenant profile to a list of users.

### Example
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
    String profileId = "profileId_example"; // The ID of the profile to assign to a list of users.
    List<String> targetUserIds = Arrays.asList(); // A list of users to assign this profile.
    String validityStartTime = "validityStartTime_example"; // An inclusive date-time when this profile is active.
    String validityEndTime = "validityEndTime_example"; // An exclusive date-time when this profile is no longer active.
    try {
      LocalTenantProfileAssignmentResponseDTO result = client
              .profileManagement
              .assignProfile(profileId)
              .targetUserIds(targetUserIds)
              .validityStartTime(validityStartTime)
              .validityEndTime(validityEndTime)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrors());
      System.out.println(result.getBadUserIds());
      System.out.println(result.getFailedAssignments());
      System.out.println(result.getSuccessfulAssignments());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileManagementApi#assignProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LocalTenantProfileAssignmentResponseDTO> response = client
              .profileManagement
              .assignProfile(profileId)
              .targetUserIds(targetUserIds)
              .validityStartTime(validityStartTime)
              .validityEndTime(validityEndTime)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileManagementApi#assignProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **profileId** | **String**| The ID of the profile to assign to a list of users. | |
| **localTenantProfileAssignmentRequestDTO** | [**LocalTenantProfileAssignmentRequestDTO**](LocalTenantProfileAssignmentRequestDTO.md)|  | |

### Return type

[**LocalTenantProfileAssignmentResponseDTO**](LocalTenantProfileAssignmentResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="getAllProfiles"></a>
# **getAllProfiles**
> ProfilesGetAPIResponseDTO getAllProfiles().execute();

Retrieve a list of all profiles

This API allows you to get a list of all available profiles. For administrating tenants,  this retrieves all administrating tenant profiles.

### Example
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
    try {
      ProfilesGetAPIResponseDTO result = client
              .profileManagement
              .getAllProfiles()
              .execute();
      System.out.println(result);
      System.out.println(result.getProfiles());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileManagementApi#getAllProfiles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProfilesGetAPIResponseDTO> response = client
              .profileManagement
              .getAllProfiles()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileManagementApi#getAllProfiles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProfilesGetAPIResponseDTO**](ProfilesGetAPIResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="getAnalyticProfileDetail"></a>
# **getAnalyticProfileDetail**
> ProfileGetAPIResponseDTO getAnalyticProfileDetail(profileId).execute();

Retrieve the details of an analytic tenant profile

This API allows you to get the details of an analytic tenant profile.   Note: Administrating tenants only.

### Example
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
    String profileId = "profileId_example"; // The ID of the profile to retrieve details for.
    try {
      ProfileGetAPIResponseDTO result = client
              .profileManagement
              .getAnalyticProfileDetail(profileId)
              .execute();
      System.out.println(result);
      System.out.println(result.getProfileId());
      System.out.println(result.getDisplayName());
      System.out.println(result.getCapabilities());
      System.out.println(result.getAdditionalCapabilities());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileManagementApi#getAnalyticProfileDetail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProfileGetAPIResponseDTO> response = client
              .profileManagement
              .getAnalyticProfileDetail(profileId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileManagementApi#getAnalyticProfileDetail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **profileId** | **String**| The ID of the profile to retrieve details for. | |

### Return type

[**ProfileGetAPIResponseDTO**](ProfileGetAPIResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="getAnalyticProfiles"></a>
# **getAnalyticProfiles**
> ProfilesGetAPIResponseDTO getAnalyticProfiles().execute();

Retrieve a list of analytic tenant profiles

This API allows you to retrieve a list of profiles available for analytic tenants.   Note: Administrating tenants only.

### Example
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
    try {
      ProfilesGetAPIResponseDTO result = client
              .profileManagement
              .getAnalyticProfiles()
              .execute();
      System.out.println(result);
      System.out.println(result.getProfiles());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileManagementApi#getAnalyticProfiles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProfilesGetAPIResponseDTO> response = client
              .profileManagement
              .getAnalyticProfiles()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileManagementApi#getAnalyticProfiles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProfilesGetAPIResponseDTO**](ProfilesGetAPIResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="getAnalyticUserProfile"></a>
# **getAnalyticUserProfile**
> AllProfileAssignedForAccessibleTenantDTO getAnalyticUserProfile(userId).execute();

Retrieve an administrating tenant user&#39;s analytic tenant profiles

This API allows you to retrieve a specified user&#39;s assigned profiles for analytic tenants.   Note: Administrating tenants only.

### Example
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
    String userId = "userId_example"; // The ID of the user you want to retrieve.
    try {
      AllProfileAssignedForAccessibleTenantDTO result = client
              .profileManagement
              .getAnalyticUserProfile(userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAssignedProfilesForAccessibleTenant());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileManagementApi#getAnalyticUserProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AllProfileAssignedForAccessibleTenantDTO> response = client
              .profileManagement
              .getAnalyticUserProfile(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileManagementApi#getAnalyticUserProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| The ID of the user you want to retrieve. | |

### Return type

[**AllProfileAssignedForAccessibleTenantDTO**](AllProfileAssignedForAccessibleTenantDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="getProfileDetail"></a>
# **getProfileDetail**
> ProfileGetAPIResponseDTO getProfileDetail(profileId).execute();

Retrieve the details of a profile

This API allows you to get the details of a specific profile. For administrating tenants, this retrieves  the details of administrating tenant profiles.

### Example
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
    String profileId = "profileId_example"; // The ID of the profile to retrieve details for.
    try {
      ProfileGetAPIResponseDTO result = client
              .profileManagement
              .getProfileDetail(profileId)
              .execute();
      System.out.println(result);
      System.out.println(result.getProfileId());
      System.out.println(result.getDisplayName());
      System.out.println(result.getCapabilities());
      System.out.println(result.getAdditionalCapabilities());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileManagementApi#getProfileDetail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProfileGetAPIResponseDTO> response = client
              .profileManagement
              .getProfileDetail(profileId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileManagementApi#getProfileDetail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **profileId** | **String**| The ID of the profile to retrieve details for. | |

### Return type

[**ProfileGetAPIResponseDTO**](ProfileGetAPIResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="getUserProfile"></a>
# **getUserProfile**
> AllProfileAssignedForLocalTenantDTO getUserProfile(userId).execute();

Retrieve a user&#39;s profiles

This API allows you to retrieve a specified user&#39;s assigned profiles. For administrating tenants,  this retrieves a user&#39;s administrating tenant profiles.

### Example
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
    String userId = "userId_example"; // The ID of the user you want to retrieve.
    try {
      AllProfileAssignedForLocalTenantDTO result = client
              .profileManagement
              .getUserProfile(userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAssignedProfiles());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileManagementApi#getUserProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AllProfileAssignedForLocalTenantDTO> response = client
              .profileManagement
              .getUserProfile(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileManagementApi#getUserProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| The ID of the user you want to retrieve. | |

### Return type

[**AllProfileAssignedForLocalTenantDTO**](AllProfileAssignedForLocalTenantDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="removeAnalyticProfile"></a>
# **removeAnalyticProfile**
> AccessibleTenantProfileRevokeResponseDTO removeAnalyticProfile(profileId, accessibleTenantProfileRevokeRequestDTO).execute();

Remove an analytic tenant profile from administrating tenant users

This API allows you to remove an analytic tenant profile from a list of administrating tenant users for a list of analytic tenants.   Note: Administrating tenants only.

### Example
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
    String profileId = "profileId_example"; // The ID of the profile to remove.
    List<String> targetUserIds = Arrays.asList(); // A list of users to remove this profile from.
    List<TargetTenantCodeDTO> targetTenantCodes = Arrays.asList(); // A list of objects representing the  analytic tenants for removing profiles from each target user ID.
    try {
      AccessibleTenantProfileRevokeResponseDTO result = client
              .profileManagement
              .removeAnalyticProfile(profileId)
              .targetUserIds(targetUserIds)
              .targetTenantCodes(targetTenantCodes)
              .execute();
      System.out.println(result);
      System.out.println(result.getBadTenantCodes());
      System.out.println(result.getBadUserIds());
      System.out.println(result.getUnaffectedUsers());
      System.out.println(result.getSucceeded());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileManagementApi#removeAnalyticProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccessibleTenantProfileRevokeResponseDTO> response = client
              .profileManagement
              .removeAnalyticProfile(profileId)
              .targetUserIds(targetUserIds)
              .targetTenantCodes(targetTenantCodes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileManagementApi#removeAnalyticProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **profileId** | **String**| The ID of the profile to remove. | |
| **accessibleTenantProfileRevokeRequestDTO** | [**AccessibleTenantProfileRevokeRequestDTO**](AccessibleTenantProfileRevokeRequestDTO.md)|  | |

### Return type

[**AccessibleTenantProfileRevokeResponseDTO**](AccessibleTenantProfileRevokeResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="removeProfile"></a>
# **removeProfile**
> LocalTenantProfileRevokeResponseDTO removeProfile(profileId, localTenantProfileRevokeRequestDTO).execute();

Remove a profile from a list of users

This API allows you to remove a profile from a list of users. For administrating tenants, this  removes an administrating tenant profile from a list of users.

### Example
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
    String profileId = "profileId_example"; // The ID of the profile to remove to a list of users.
    List<String> targetUserIds = Arrays.asList(); // A list of users to remove this profile from.
    try {
      LocalTenantProfileRevokeResponseDTO result = client
              .profileManagement
              .removeProfile(profileId)
              .targetUserIds(targetUserIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getFailed());
      System.out.println(result.getSucceeded());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileManagementApi#removeProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LocalTenantProfileRevokeResponseDTO> response = client
              .profileManagement
              .removeProfile(profileId)
              .targetUserIds(targetUserIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileManagementApi#removeProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **profileId** | **String**| The ID of the profile to remove to a list of users. | |
| **localTenantProfileRevokeRequestDTO** | [**LocalTenantProfileRevokeRequestDTO**](LocalTenantProfileRevokeRequestDTO.md)|  | |

### Return type

[**LocalTenantProfileRevokeResponseDTO**](LocalTenantProfileRevokeResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

