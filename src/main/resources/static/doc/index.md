# springbootTest
Version |  Update Time  | Status | Author |  Description
---|---|---|---|---
v2021-12-10 21:26:42|2021-12-10 21:26:42|auto|@HP|Created by smart-doc



## 测试层
### 测试异常
**URL:** http://localhost:8080/test/exception

**Type:** POST


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试异常

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
Authorization|string|token请求头的值|false|-


**Request-example:**
```
curl -X POST -H 'Authorization:token请求头的值' -i http://localhost:8080/test/exception
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
code|string|响应码 00成功 99失败|-
message|string|消息|-
data|object|数据|-

**Response-example:**
```
{
  "code": "91192",
  "message": "success",
  "data": "y185zo"
}
```

### 测试成功
**URL:** http://localhost:8080/test/success

**Type:** POST


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试成功

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
Authorization|string|token请求头的值|false|-


**Request-example:**
```
curl -X POST -H 'Authorization:token请求头的值' -i http://localhost:8080/test/success
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
code|string|响应码 00成功 99失败|-
message|string|消息|-
data|object|数据|-
└─id|int32|用户编号|2021-12-06
└─username|string|用户姓名|-
└─sex|string|性别|-
└─birthday|string|生日|-
└─address|string|地址|-
└─password|string|密码|-

**Response-example:**
```
{
  "code": "91192",
  "message": "success",
  "data": {
    "id": 898,
    "username": "jerrell.cartwright",
    "sex": "4li8os",
    "birthday": "2021-12-10 21:26:44",
    "address": "Apt. 987 6818 Kraig Ridge， Toychester， MO 35012",
    "password": "nvy4mu"
  }
}
```

### 测试响应头
**URL:** http://localhost:8080/test/header

**Type:** POST


**Content-Type:** application/json; charset=utf-8

**Description:** 测试响应头

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
Authorization|string|token请求头的值|false|-


**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int32|用户编号|true|2021-12-06
username|string|用户姓名|false|-
sex|string|性别|false|-
birthday|string|生日|false|-
address|string|地址|false|-
password|string|密码|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -H 'Authorization:token请求头的值' -i http://localhost:8080/test/header --data '{
  "id": 300,
  "username": "jerrell.cartwright",
  "sex": "z7z1wx",
  "birthday": "2021-12-10 21:26:44",
  "address": "Apt. 987 6818 Kraig Ridge， Toychester， MO 35012",
  "password": "ru5wdz"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
code|string|响应码 00成功 99失败|-
message|string|消息|-
data|object|数据|-
└─id|int32|用户编号|2021-12-06
└─username|string|用户姓名|-
└─sex|string|性别|-
└─birthday|string|生日|-
└─address|string|地址|-
└─password|string|密码|-

**Response-example:**
```
{
  "code": "91192",
  "message": "success",
  "data": {
    "id": 805,
    "username": "jerrell.cartwright",
    "sex": "1jls8u",
    "birthday": "2021-12-10 21:26:44",
    "address": "Apt. 987 6818 Kraig Ridge， Toychester， MO 35012",
    "password": "451zn6"
  }
}
```

### 
**URL:** http://localhost:8080/test/queryByPage

**Type:** POST


**Content-Type:** application/json; charset=utf-8

**Description:** 

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
Authorization|string|token请求头的值|false|-


**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int32|用户编号|true|2021-12-06
username|string|用户姓名|false|-
sex|string|性别|false|-
birthday|string|生日|false|-
address|string|地址|false|-
password|string|密码|false|-
paged|boolean|Returns whether the current {@link Pageable} contains pagination information.|false|-
unpaged|boolean|Returns whether the current {@link Pageable} does not contain pagination information.|false|-
pageNumber|int32|Returns the page to be returned.|false|-
pageSize|int32|Returns the number of items to be returned.|false|-
offset|int64|Returns the offset to be taken according to the underlying page and page size.|false|-
sort|object|No comments found.|false|-
└─orders|array|No comments found.|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─direction|enum|null(See: Enumeration for sort directions.)|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─property|string|No comments found.|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ignoreCase|boolean|No comments found.|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nullHandling|enum|null(See: Enumeration for null handling hints that can be used in {@link Order} expressions.)|false|-
page|int32|No comments found.|false|-
size|int32|No comments found.|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -H 'Authorization:token请求头的值' -i http://localhost:8080/test/queryByPage?unpaged=true&pageNumber=314&paged=true&pageSize=10&offset=1&page=1&size=10 --data '{
  "id": 467,
  "username": "jerrell.cartwright",
  "sex": "50j9iv",
  "birthday": "2021-12-10 21:26:44",
  "address": "Apt. 987 6818 Kraig Ridge， Toychester， MO 35012",
  "password": "2y5rbr"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
code|string|响应码 00成功 99失败|-
message|string|消息|-
data|object|数据|-
└─totalPages|int32|Returns the number of total pages.|-
└─totalElements|int64|Returns the total amount of elements.|-
└─number|int32|Returns the number of the current {@link Slice}. Is always non-negative.|-
└─size|int32|Returns the size of the {@link Slice}.|-
└─numberOfElements|int32|Returns the number of elements currently on this {@link Slice}.|-
└─content|array|Returns the page content as {@link List}.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|int32|用户编号|2021-12-06
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─username|string|用户姓名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─sex|string|性别|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─birthday|string|生日|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─address|string|地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─password|string|密码|-
└─sort|object|Returns the sorting parameters for the {@link Slice}.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─orders|array|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─direction|enum|null(See: Enumeration for sort directions.)|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─property|string|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ignoreCase|boolean|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nullHandling|enum|null(See: Enumeration for null handling hints that can be used in {@link Order} expressions.)|-
└─first|boolean|Returns whether the current {@link Slice} is the first one.|-
└─last|boolean|Returns whether the current {@link Slice} is the last one.|-
└─pageable|object|Returns the {@link Pageable} that's been used to request the current {@link Slice}.|2.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─paged|boolean|Returns whether the current {@link Pageable} contains pagination information.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─unpaged|boolean|Returns whether the current {@link Pageable} does not contain pagination information.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─pageNumber|int32|Returns the page to be returned.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─pageSize|int32|Returns the number of items to be returned.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─offset|int64|Returns the offset to be taken according to the underlying page and page size.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─sort|object|Returns the sorting parameters.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─orders|array|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─direction|enum|null(See: Enumeration for sort directions.)|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─property|string|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ignoreCase|boolean|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nullHandling|enum|null(See: Enumeration for null handling hints that can be used in {@link Order} expressions.)|-

**Response-example:**
```
{
  "code": "91192",
  "message": "success",
  "data": {
    "totalPages": 663,
    "totalElements": 643,
    "number": 739,
    "size": 10,
    "numberOfElements": 750,
    "content": [
      {
        "id": 690,
        "username": "jerrell.cartwright",
        "sex": "ent7dg",
        "birthday": "2021-12-10 21:26:44",
        "address": "Apt. 987 6818 Kraig Ridge， Toychester， MO 35012",
        "password": "yaqav3"
      }
    ],
    "sort": {
      "orders": [
        {
          "direction": "ASC",
          "property": "1ufgud",
          "ignoreCase": true,
          "nullHandling": "NATIVE"
        }
      ]
    },
    "first": true,
    "last": true,
    "pageable": {
      "paged": true,
      "unpaged": true,
      "pageNumber": 300,
      "pageSize": 10,
      "offset": 1,
      "sort": {
        "orders": [
          {
            "direction": "ASC",
            "property": "2ca7o5",
            "ignoreCase": true,
            "nullHandling": "NATIVE"
          }
        ]
      }
    }
  }
}
```

### 跳转到应用列表页面
**URL:** http://localhost:8080/test/list

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 跳转到应用列表页面

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
Authorization|string|token请求头的值|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
pageNo|int32|要显示第几页内容|true|-
pageSize|int32|一页显示多少条|true|-

**Request-example:**
```
curl -X GET -H 'Authorization:token请求头的值' -i http://localhost:8080/test/list?pageSize=10&pageNo=1
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
code|string|响应码 00成功 99失败|-
message|string|消息|-
data|object|数据|-
└─pageNum|int32|No comments found.|-
└─pageSize|int32|No comments found.|-
└─size|int32|No comments found.|-
└─startRow|int32|No comments found.|-
└─endRow|int32|No comments found.|-
└─total|int64|No comments found.|-
└─pages|int32|No comments found.|-
└─list|array|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|int32|用户编号|2021-12-06
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─username|string|用户姓名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─sex|string|性别|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─birthday|string|生日|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─address|string|地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─password|string|密码|-
└─prePage|int32|No comments found.|-
└─nextPage|int32|No comments found.|-
└─firstPage|boolean|No comments found.|-
└─lastPage|boolean|No comments found.|-
└─hasPreviousPage|boolean|No comments found.|-
└─hasNextPage|boolean|No comments found.|-
└─navigatePages|int32|No comments found.|-
└─navigatepageNums|array|No comments found.|-
└─navigateFirstPage|int32|No comments found.|-
└─navigateLastPage|int32|No comments found.|-

**Response-example:**
```
{
  "code": "91192",
  "message": "success",
  "data": {
    "pageNum": 139,
    "pageSize": 10,
    "size": 10,
    "startRow": 957,
    "endRow": 242,
    "total": 367,
    "pages": 350,
    "list": [
      {
        "id": 210,
        "username": "jerrell.cartwright",
        "sex": "x3dr5w",
        "birthday": "2021-12-10 21:26:44",
        "address": "Apt. 987 6818 Kraig Ridge， Toychester， MO 35012",
        "password": "rr8j2c"
      }
    ],
    "prePage": 1,
    "nextPage": 1,
    "firstPage": true,
    "lastPage": true,
    "hasPreviousPage": true,
    "hasNextPage": true,
    "navigatePages": 516,
    "navigatepageNums": [
      322
    ],
    "navigateFirstPage": 1,
    "navigateLastPage": 1
  }
}
```


