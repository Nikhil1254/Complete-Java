<%@page import="java.util.Date" %>
<div style="background: blue;font-size: 30px;color: white;">
<h1>This is header </h1>
<p>We are learning include directive here.</p>
<p><%= "Todays date and time : "+ new Date().toString()%></p>
<p>In this way we can include other resources using include directive.</p>
</div>