<html>
<head>
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</head>
<body style="background:#219ebc ">
<div class="container">
    <div class="row">
        <div class="col m6 offset-m3">
            <div class="card">
                <div class="card-content">
                    <h3>Register here!! </h3>
                    <h5 id="msg" class="center-align"></h5>
                    <!--creating form -->
                    <div class="form center-align">
                        <form action="register" method="post" id="myform">
                            <input type="text" name="user_name" placeholder="Enter user name"/>
                            <input type="password" name="user_password" placeholder="Enter your password"/>
                            <input type="email" name="user_email" placeholder="Enter user email"/>

                                <div class="file-field input-field">
                                  <div class="btn light-blue accent-3">
                                    <span>File</span>
                                    <input name="image" type="file">
                                  </div>
                                  <div class="file-path-wrapper">
                                    <input class="file-path validate" type="text">
                                  </div>
                                </div>

                            <button type="submit" class="btn light-blue accent-3">Submit</button>
                        </form>
                    </div>

                    <div class="loader center-align" style="margin-top:10px; display:none;">
                      <div class="progress">
                         <div class="indeterminate"></div>
                </div>
                 <h5>Please wait...</h5>
            </div>

        </div>
    </div>
</div>
</div>
</div>
</div>

   <script src="https://code.jquery.com/jquery-3.7.1.min.js"
   integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
   crossorigin="anonymous">
   </script>

   <script>
     $(document).ready(function() {
     console.log("page is ready")

      $("#myform").on('submit',function(event){
              event.preventDefault();

          //    var f = $(this).serialize();

          let f = new FormData(this);
              console.log(f);

              $(".loader").show();
              $(".form").hide();


              $.ajax({
                url:"register",
                data:f,
                type:'post',
                success:function(data,textStatus,jqXHR){
                   console.log(data);
                   console.log("success...");
                   $(".loader").hide();
                   $(".form").show();

                   if(data.trim()==='done'){
                      $('#msg').html("successfully registered...")
                      $('#msg').addClass("green-text")
                   }
                   else{
                      $('#msg').html("something went wrong")
                      $('#msg').addClass("red-text")

                   }

                },
                error: function(data,textStatus,jqXHR){
                   console.log(data);
                   console.log("error...");
                   $(".loader").hide();
                   $(".form").show();
                   $('#msg').html("something went wrong")
                },
                processData:false,
                contentType:false
              })
              })
          })
   </script>

</body>
</html>
