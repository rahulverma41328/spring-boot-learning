<html>
<head>
  <meta charset="UTF-8">
  <title>Form page</title>

  <style>
     .container{
        width: 40%;
        border: 1px solid black;
        margin: auto;
        padding: 20px;
        font-size: 20px;
     }
  </style>
</head>
<body>
    <div class="container">
        <h1>My Form</h1>
        <form action="RegisterServlet" method="post">
           <table>
              <tr>
                <td>Enter your name:</td>
                <td><input type="text" name="user_name" placeholder="Enter here"/></td>
              </tr>

              <tr>
                <td>Enter your password</td>
                <td><input type="password" name="user_password" placeholder="Enter here"/></td>
              </tr>

              <tr>
                <td>Enter your Email:</td>
                <td><input type="email" name="user_email" placeholder="Enter here"/></td>
              </tr>

              <tr>
                 <td>Select Gender</td>
                 <td><input type="radio" name="user_gender" value="male"/>Male &nbsp; &nbsp;
                     <input type="radio" name="user_gender" value="female"/>Female</td>
              </tr>

              <td> Select your course</td>
              <td><select name="user_course">
                     <option value="Java">Java</option>
                     <option value="Php">PHP</option>
                     <option value="Python">Python</option>
                     <option value="Android">Android</option>
                  </select>
              </td>

              <tr>
                 <td style="text-align: right;">
                   <input type="checkbox" value="checked" name="condition"/>
                 </td>

                 <td> Agree terms and condition</td

                 <tr>
                    <td></td>

                    <td>
                      <button type="submit">Register</button>
                      <button type="reset">Reset</button>

           </table>
    </div>
</body>
</html>