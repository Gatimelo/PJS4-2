<%@ page import="main.java.lib.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="javax.servlet.*" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>HelpHuman | Articles</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">


    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito+Sans:200,300,400,700,900|Roboto+Mono:300,400,500">
    <link rel="stylesheet" href="fonts/icomoon/style.css">

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/magnific-popup.css">
    <link rel="stylesheet" href="css/jquery-ui.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">
    <link rel="stylesheet" href="css/bootstrap-datepicker.css">
    <link rel="stylesheet" href="css/animate.css">

    <link rel="stylesheet" href="fonts/flaticon/font/flaticon.css">
    <link rel="stylesheet" href="css/fl-bigmug-line.css">

    <link rel="stylesheet" href="css/aos.css">

    <link rel="stylesheet" href="css/style.css">

    <link rel="icon" type="image/png" href="./images/icon.png" />

  </head>
  <body>

  <div class="site-wrap">

    <div class="site-mobile-menu">
      <div class="site-mobile-menu-header">
        <div class="site-mobile-menu-close mt-3">
          <span class="icon-close2 js-menu-toggle"></span>
        </div>
      </div>
      <div class="site-mobile-menu-body"></div>
    </div> <!-- .site-mobile-menu -->


    <header class="site-navbar py-1" role="banner">

      <div class="container">
        <div class="row align-items-center">

          <div class="col-6 col-xl-2">
            <h1 class="mb-0"><a href="index.html" class="text-black h2 mb-0">Help<strong>Human</strong></a></h1>
          </div>



          <div class="col-10 col-xl-10 d-none d-xl-block">
            <nav class="site-navigation text-right" role="navigation">

              <ul class="site-menu js-clone-nav mr-auto d-none d-lg-block">
                <li class="active"><a href="index.html">Accueil</a></li>
                <li><a href="demande.html">Offres</a></li>

                <li><a href="blog.html">Articles</a></li>
                <li><a href="about.html">à propos</a></li>
                <li><a href="contact.html">Contact</a></li>
                <li><a href="new-post.html"><span class="rounded bg-primary py-2 px-3 text-white">Poster une annonce</a></li>
                <li><a href="coins.html"><span class="rounded bg-primary py-2 px-3 text-white">Connexion</a></li>

                <li><a href="coins.html"></a></li>
              </ul>
            </nav>
          </div>

          <div class="col-6 col-xl-2 text-right d-block">

            <div class="d-inline-block d-xl-none ml-md-0 mr-auto py-3" style="position: relative; top: 3px;"><a href="#" class="site-menu-toggle js-menu-toggle text-black"><span class="icon-menu h3"></span></a></div>

          </div>

        </div>
      </div>

    </header>

    <div class="unit-5 overlay" style="background-image: url('images/hero_bg_2.jpg');">
      <div class="container text-center">
        <h2 class="mb-0">Blog</h2>
        <p class="mb-0 unit-6"><a href="index.html">Home</a> <span class="sep">></span> <span>Blog</span></p>
      </div>
    </div>




    <div class="site-section bg-light">
      <div class="container">
        <div class="row">
          <% Article article = (Article) request.getAttribute("article");
	        out.println("<div class='col-md-6 mb-5 mb-lg-4 col-lg-3' data-aos='fade'>");
	        	out.println("<div class='position-relative unit-8'>");
	          		out.println("<a href='#' class='mb-3 d-block img-a'><img src='images/img_2.jpg' alt='Image' class='img-fluid rounded'></a>");
	          		out.println("<span class='d-block text-gray-500 text-normal small mb-3'>Par <a href='#'>" + article.getAuteur() + "</a> <span class='mx-2'>&bullet;</span>" + article.getDate() + "</span>");
	          		out.println("<h2 class='h5 font-weihgt-normal line-height-sm mb-3'><a href='#' class='text-black'>" + article.getTitre() + "</a></h2>");
	          		out.println("<p>" + article.getResume() + "</p>");
	          		out.println("<p>" + article.getContenu() + "</p>");
	          	out.println("</div>");
	         out.println("</div>");
		    	%>
        </div>

        <div class="row mt-5">
          <div class="col-md-12 text-center">
            <div class="site-block-27">
              <ul>
                <li><a href="#"><i class="icon-keyboard_arrow_left h5"></i></a></li>
                <li class="active"><span>1</span></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
                <li><a href="#"><i class="icon-keyboard_arrow_right h5"></i></a></li>
              </ul>
            </div>
          </div>
        </div>


      </div>
    </div>









    <div class="py-5 bg-primary">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <h2 class="text-white h4 font-weihgt-normal mb-4">Abonnez vous à notre newsletter</h2>
          </div>
        </div>
        <form action="" class="row">
          <div class="col-md-9">
            <input type="text" class="form-control border-0 mb-3 mb-md-0" placeholder="Enter votre Email">
          </div>
          <div class="col-md-3">
            <input type="submit" value="Envoyer" class="btn btn-dark btn-block" style="height: 45px;">
          </div>
        </form>
      </div>
    </div>
    <footer class="site-footer">
      <div class="container">


        <div class="row">
          <div class="col-lg-9">
            <div class="row">
              <div class="col-6 col-md-3 col-lg-3 mb-5 mb-lg-0">
                <h3 class="footer-heading mb-4">Associations</h3>
                <ul class="list-unstyled">
                  <li><a href="#">Compte associations</a></li>
                  <li><a href="#">Obtenir de l'aide des bénevoles</a></li>
                  <li><a href="#">Information associations</a></li>
                  <li><a href="#">Conditions &amp; politiques</a></li>
                </ul>
              </div>
              <div class="col-6 col-md-3 col-lg-3 mb-5 mb-lg-0">
                <h3 class="footer-heading mb-4">Bénevoles</h3>
                <ul class="list-unstyled">
                  <li><a href="#">Inscription</a></li>
                  <li><a href="#">Trouver une association</a></li>
                  <li><a href="#">Information bénevoles</a></li>
                </ul>
              </div>
              <div class="col-6 col-md-3 col-lg-3 mb-5 mb-lg-0">
                <h3 class="footer-heading mb-4">Archives</h3>
                <ul class="list-unstyled">
                  <li><a href="#">2019</a></li>
                  <li><a href="#">2020</a></li>
                  <li><a href="#">2021</a></li>
                </ul>
              </div>
              <div class="col-6 col-md-3 col-lg-3 mb-5 mb-lg-0">
                <h3 class="footer-heading mb-4">Entreprise</h3>
                <ul class="list-unstyled">
                  <li><a href="#">à propos</a></li>
                  <li><a href="#">Equipe</a></li>
                  <li><a href="#">Conditions &amp; politiques</a></li>
                  <li><a href="#">Contactez-nous</a></li>
                </ul>
              </div>
            </div>
          </div>
          <div class="col-lg-3">
            <h3 class="footer-heading mb-4">Contacte Info</h3>
            <ul class="list-unstyled">
              <li>
                <span class="d-block text-white">Adresse</span>
                Paris - 16éme
              </li>
              <li>
                <span class="d-block text-white">Telephone</span>
                07811786363
              </li>
              <li>
                <span class="d-block text-white">Email</span>
                helphuman.pro@gmail.com
              </li>
            </ul>

          </div>
        </div>
        <div class="row pt-5 mt-5 text-center">
          <div class="col-md-12">
            <p>
            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
            Copyright &copy; <script data-cfasync="false" src="/cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js"></script><script>document.write(new Date().getFullYear());</script> All Rights Reserved | This template is made with <i class="icon-heart text-danger" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank" >Colorlib</a>
            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
            </p>
          </div>

        </div>
      </div>
    </footer>
    </div>

  <script src="js/jquery-3.3.1.min.js"></script>
  <script src="js/jquery-migrate-3.0.1.min.js"></script>
  <script src="js/jquery-ui.js"></script>
  <script src="js/popper.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/owl.carousel.min.js"></script>
  <script src="js/jquery.stellar.min.js"></script>
  <script src="js/jquery.countdown.min.js"></script>
  <script src="js/jquery.magnific-popup.min.js"></script>
  <script src="js/bootstrap-datepicker.min.js"></script>
  <script src="js/aos.js"></script>


  <script src="js/main.js"></script>

  </body>
</html>
