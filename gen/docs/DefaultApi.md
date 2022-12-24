# DefaultApi

All URIs are relative to *https://productService*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProduct**](DefaultApi.md#addProduct) | **POST** /products | POST products


<a name="addProduct"></a>
# **addProduct**
> String addProduct(productRestModel)

POST products

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://productService");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    ProductRestModel productRestModel = new ProductRestModel(); // ProductRestModel | 
    try {
      String result = apiInstance.addProduct(productRestModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#addProduct");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productRestModel** | [**ProductRestModel**](ProductRestModel.md)|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

