Camel REST DSL Transform Example
===

Added: 2016-03-07  
Tested: JBDS 8, Local Test with Fuse 6.2.1  

This example is based on an [example](http://wei-meilin.blogspot.com/2015/07/jboss-fuse-updated-camel-101-labs.html) created by Christina Lin, thanks!  

Using the REST DSL functionality
* Input XML it will convert to JSON
URL: `http://<IP/HOSTNAME>:9091/app/newStockEntryXML`  
```
<?xml version="1.0" encoding="UTF-8" standalone="yes" ?>
<stocktrading>
<name>Test User</name>
<custId>12345</custId>
<vip>1</vip>
<stockId>XYZ</stockId>
<shares>11</shares>
 </stocktrading>
```
* Input JSON it will convert to XML
URL: `http://<IP/HOSTNAME>:9091/app/newStockEntryJSON`  
```
{"stocktrade":{"name":"Test User","custId":"12345","vip":1,"stockId":"XYZ","shares":11}}
```



**NOTE:** the use of streamCache="true" in this example.  [StreamCache](http://camel.apache.org/stream-caching.html)



