<%@include file = "heading.jsp"%>
<div id="wrapper">
    <div id="map-canvas"></div>
    <div id="over_map" style="margin-top: 30px;">
        <div class="col-lg-7 col-md-7 col-xs-7">

            <div class="panel panel-primary" style="background-color: rgba(50,100,255,0.8);">
                <div class="panel-heading">
                    <h3 class="panel-title">Relief Centers Near YOU!</h3>
                </div>
                <div class="panel-body">
                    <div class="col-md-9" style="padding-right: 0px; padding-left: 0px">
                        <input class="form-control" placeholder="hehe" id="inputDefault" value="2401 Taft Ave. Manila, Philippines"/>
                        <br />
                        <select class="form-control" id="end" onchange="calcRoute();">
                            <option value="2401 Taft Ave. Manila, Philippines">De La Salle University - Manila</option>
                            <option value="San Marcelino, Ermita, Manila, Philippines">Adamson University (Student Government)</option>
                            <option value="Dona Juana Ave. (formerly Broadway Ave.) corner 4th/5th St., New Manila, Quezon City, Philippines">Mt. Carmel Parish</option>

                        </select>
                    </div>
                    <div class="col-md-3">
                        <button class="btn btn-primary" style="width: 100%" onclick="calcRoute()">GO</button>
                    </div>
                    <br />
                    <table class="table " style="background-color: rgba(0,0,0,0);" id="relieflist">
                        <thead>
                        <td>Distance</td>
                        <td>Location</td>
                        <td>Volunteers Needed</td>
                        </thead>
                        <tr>
                            <td>
                                0.5 KM
                            </td>
                            <td><input type="hidden" /><a href="#">De La Salle University(COSCA)
                                    2401 Taft Ave. Manila, Philippines</a>
                            </td>
                            <td>
                                85
                            </td>
                        </tr>

                        <tr>
                            <td>
                                1.2 KM
                            </td>
                            <td>
                                Manila City Hall
                                1234 St. Manila, Philippines
                            </td>
                            <td>
                                32
                            </td>
                        </tr>


                    </table>
                </div>
            </div>

        </div>
    </div> 
</div>
<div class="creatorscontent">
    <center>
        <img src="img/RG2.png" height="160" alt="logo"/>
        <h1>Relief? Good!</h1>
    </center>
</div>
<div class="container" style="margin-bottom: 20px;"> 
    <form action="LoginServlet" method="post" role="form" class="contactForm">
        <div class="form-group col-md-4 col-md-offset-1">
            <label for="name">Username</label>
            <input type="text" name="username" class="form-control" id="name" placeholder="Your Name" data-rule="maxlen:4" data-msg="Please enter at least 4 chars">
            <div class="validation"></div>
        </div>
        <div class="form-group col-md-4">
            <label for="email">Password</label>
            <input type="password" class="form-control" name="password" id="email" placeholder="Your Email" data-rule="email" data-msg="Please enter a valid email">
            <div class="validation"></div>
        </div>
        <div class="form-group col-md-2">
            <button type="submit" class="btn btn-danger" style="height: 61px">Log In</button>
        </div>
    </form>
</div>
<div class="container" style="margin-bottom: 20px;"> 
    <br /><br />
    <center><h1>Register now!</h1></center>
    <form action="LoginServlet" method="post" role="form" class="contactForm">
        <div class="form-group col-md-4">
            <label for="name">Username</label>
            <input type="text" name="username" class="form-control" id="name" placeholder="Your Name" data-rule="maxlen:4" data-msg="Please enter at least 4 chars">
            <div class="validation"></div>
        </div>
        <div class="form-group col-md-4">
            <label for="password">Password</label>
            <input type="password" class="form-control" name="password" id="email" placeholder="Your Email" data-rule="email" data-msg="Please enter a valid email">
            <div class="validation"></div>
        </div>
        <div class="form-group col-md-4">
            <label for="repeatpassword">Repeat Password</label>
            <input type="password" class="form-control" name="password" id="email" placeholder="Your Email" data-rule="email" data-msg="Please enter a valid email">
            <div class="validation"></div>
        </div>
        <!--<div class="form-group col-md-2">
            <button type="submit" class="btn btn-danger" style="height: 61px">Log In</button>
        </div>-->
    </form>
</div>
<div class="container creatorscontent">
    <div class="row">
        <h2></h2>
        <div class="col-lg-3">
            <div class="tile" style="text-align: center;">
                <i class="fa fa-dropbox fa-5x customi" ></i>
                <h3>Locate the nearest relief centers near you!</h3>
                <p>
                    Hello
                </p>
            </div>

        </div>

        <div class="col-lg-3">
            <div class="tile" style="text-align: center;">
                <i class="fa fa-bullhorn fa-5x customi" ></i>
                <h3>Find out different places where organizations are operating</h3>
                <p>
                    Oversaw the research of the different interests and 
                    concerns of the students for better implementation 
                    of projects and activities for the batch and maximization 
                    of the school?s services and facilities. 
                    Spearheaded projects for the batch talks, 
                    specialization orientations and freedom of speech activities
                </p>
            </div>


        </div>

        <div class="col-lg-3">
            <div class="tile" style="text-align: center;">
                <i class="fa fa-arrows-h fa-5x customi" ></i>
                <h3>Know the shortest distance to your desired relief center</h3>
                <p>
                    Headed the project of providing a newsletter called 
                    the ?Bits and Bytes? for the members of the organization 
                    for them to be oriented on the current technological trends. 
                    Researched and wrote for the contents of the newsletter. 
                    Became the official Editor-In-Chief and the assistant concept designer
                </p>
            </div>

        </div>

        <div class="col-lg-3">
            <div class="tile" style="text-align: center;">
                <i class="fa fa-group fa-5x customi" ></i>
                <h3>Know if relief centers are in need of volunteers!</h3>
                <p>
                    Python 101, Ignition Web Hackathon, Shell Eco Marathon Asia 2014
                    Technology SUmmit 2013, Leadership Excellence and Dynamism, Dynamic 
                    LSCS Leadership Seminar 2013
                    That Seminar
                    THis Seminar
                </p>
            </div>
        </div>
    </div>
</div>
<div class="whyrelief">
    <div class="container pull-right" style="padding-top: 50px;">
        <span><h1 style="color: white; text-align: right">Mission and Vision</h1></span>
        <i class="fa-5x fa-arrow-circle-down"></i>
    </div>
</div>
<div class="container creatorscontent">
    <div class="row">
        <h2></h2>
        <div class="col-lg-3">
            <div class="tile" style="text-align: left;">
                <h3>Share your thoughts</h3>
                <p>
                    Oversees the overall direction of the organization 
                    through following its vision and mission to serve 
                    the College of Computer Studies and De La Salle University. 
                    Major Projects initiated: Co-Head of Technology 
                    Summit 2013, LSCS-Technokids Philippines IT Cup 2014 
                    and Multimedia Expo 2014
                </p>
            </div>
        </div>

        <div class="col-lg-3">
            <div class="tile" style="text-align: left;">
                <h3>Help your countrymen</h3>
                <p>
                    Oversaw the research of the different interests and 
                    concerns of the students for better implementation 
                    of projects and activities for the batch and maximization 
                    of the school?s services and facilities. 
                    Spearheaded projects for the batch talks, 
                    specialization orientations and freedom of speech activities
                </p>

            </div>
        </div>

        <div class="col-lg-3">
            <div class="tile" style="text-align: left;">
                <h3>We're all in this together</h3>
                <p>
                    Headed the project of providing a newsletter called 
                    the ?Bits and Bytes? for the members of the organization 
                    for them to be oriented on the current technological trends. 
                    Researched and wrote for the contents of the newsletter. 
                    Became the official Editor-In-Chief and the assistant concept designer
                </p>
            </div>

        </div>

        <div class="col-lg-3">
            <div class="tile" style="text-align: left;">

                <h3>Because you have the power</h3>
                <p>
                    Python 101, Ignition Web Hackathon, Shell Eco Marathon Asia 2014
                    Technology SUmmit 2013, Leadership Excellence and Dynamism, Dynamic 
                    LSCS Leadership Seminar 2013
                    That Seminar
                    THis Seminar
                </p>
            </div>
        </div>
    </div>
</div>
<div class="creatorsblog">
    <div class="container" style="padding-top: 50px">
        <center><span><h1 style="color: white">About the creators</h1></span>
            <i class="fa-5x fa-arrow-circle-down"></i>
        </center>
    </div>
</div>
<div class="container creatorscontent">
    <div class="row">
        <div class="col-lg-3">

            <div class="tile" style="text-align: center;">
                <img src="img/team/rosabel.png" alt="arneil" height="200" style="margin-bottom: 20px"/>
                <h3>Rosabel Ang</h3>
                <p>
                    A person taking up Bachelor of Science in Computer
                    Science with Specialization in Software Technology
                </p>
            </div>
        </div>

        <div class="col-lg-3">
            <div class="tile" style="text-align: center">
                <img src="img/team/lester.png" alt="arneil" height="200" style="margin-bottom: 20px"/>
                <h3>Lester Chong</h3>
                <p>
                    A person taking up Bachelor of Science in Computer
                    Science with Specialization in Software Technology
                </p>

            </div>
        </div>

        <div class="col-lg-3">
            <div class="tile" style="text-align: center;">
                <img src="img/team/arneil.png" alt="arneil" height="200" style="margin-bottom: 20px"/>
                <h3>Arneil Leonin</h3>
                <p>
                    A person taking up Bachelor of Science in Computer
                    Science with Specialization in Software Technology
                </p>

            </div>
        </div>

        <div class="col-lg-3">
            <div class="tile" style="text-align: center;">
                <img src="img/team/vee.png" alt="arneil"  height="200" style="margin-bottom: 20px"/>
                <h3>Vianca Villacorta</h3>
                <p>
                    A person taking up Bachelor of Science in Computer
                    Science with Specialization in Software Technology
                </p>
            </div>
        </div>
    </div>
</div>
<footer class="footer">
    <div class="container">
        <div class="row">
            <div class="col-sm-4 col-xs-12 shopinfo">
                <h4 class="title">RELIEF? GOOD!</h4>
                <p> Whippin is an online dessert marketplace that envisions to provide you a new way of setting your dessert shop online; it envisions to help dessert lovers in their conquest to finding the most delicious dessert. Most of today's sweets in the market are done at home and, most sites in the Metro require you to have stalls or shops to be able to gain a page on their site. We want to change that way. In Whippin, you are not only making sweets as a hobby but also making it as your income at the comfort of your home.</p>
            </div>
            <div class="col-sm-4 col-xs-12 getintouch">
                <h4 class="title">get in touch</h4>
                <ul>
                    <li>
                        <i class="fa fa-map-marker fa-fw"></i><span>2401 Taft Avenue
                            Manila, Philippines</span>
                    </li>
                    <li>
                        <i class="fa fa-envelope-o fa-fw"></i><span>Email Us At:
                            <a href="#a">whippinph@gmail.com</a></span>
                    </li>
                    <li>
                        <i class="fa fa-phone fa-fw"></i><span>Contact Number:
                            <a href="#a">09069089406</a></span>
                    </li>
                </ul>
                <div class="social-icons">
                    <ul>
                        <li>
                            <a href="#a"><i class="fa fa-google-plus fa-fw"></i></a>
                            <a href="#a"><i class="fa fa-linkedin fa-fw"></i></a>
                            <a><i class="fa fa-twitter fa-fw"></i></a>
                            <a href="#a"><i class="fa fa-facebook fa-fw"></i></a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>            
    </div>
</footer>
<div class="copyrights">
    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-sm-8 col-xs-12"> <span class="copytxt">&copy; Copyright 2013 by Whippin -  All rights reserved</span> </div>
        </div>
    </div>
</div>
</body>
</html>

