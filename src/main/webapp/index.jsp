<%@ page import="com.customer.*" %>


<html>
  <head>
    <style>
      body {
        color: blue;
      }

      h2 {
        color: green;
      }
    </style>
  </head>
<body>

  <h1>Mock maven MVC application</h1>
<h2>Hello CI/CD enthusiasts!</h2>
<h3> "Continuous integration doesn't get rid of bugs, but it does make them dramatically easier to find and remove."</h3>
  <p>testing java methods here:</p>
  <p><%= FeatureAUtils.transformToLower("WELCOME TO OUR INTRANET!") %> </p>
  <p id="feat-xyz"><%= FeatureAUtils.transformToLower("WELCOME TO OUR INTRANET!") %> </p>


</body>
</html>
