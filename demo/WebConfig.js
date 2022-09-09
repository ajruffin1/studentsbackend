//   <httpProtocol>  
//     <customHeaders>  
//      <add name="Access-Control-Allow-Origin" value="*" />  
//      <add name="Access-Control-Allow-Headers" value="Content-Type" />  
//      <add name="Access-Control-Allow-Methods" value="GET, POST, PUT, DELETE, OPTIONS" />  
//     </customHeaders>  
//   </httpProtocol>  

<?xml version="1.0" encoding="utf-8"?>
<configuration>
  <system.webServer>
    <cors enabled="true" failUnlistedOrigins="false">
        <add origin="*" allowed="true" />
    </cors>
    <handlers>
      <add name="aspNetCore" path="*" verb="*" modules="AspNetCoreModule" resourceType="Unspecified" />
    </handlers>
    <aspNetCore processPath=".\ERCore_Service.exe" stdoutLogEnabled="true" stdoutLogFile=".\logs\stdout" />
    <httpProtocol>
      <customHeaders>
        <add name="Access-Control-Allow-Origin" value="*"/>
        <add name="Access-Control-Allow-Headers" value="Content-Type"/>
        <add name="Access-Control-Allow-Methods" value="POST,GET,OPTIONS"/>
      </customHeaders>
    </httpProtocol>
  </system.webServer>
</configuration>
