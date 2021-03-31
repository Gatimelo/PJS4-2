<%@ page import="lib.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="javax.servlet.*" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="fr">
  <head>
    <title>HelpHuman | Accueil</title>
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

    <div class="site-blocks-cover" style="background-image: url(images/hero_bg_1.jpg);" data-aos="fade" data-stellar-background-ratio="0.5">
      <div class="container">
        <div class="row row-custom align-items-center">
          <div class="col-md-10">
            <h1 class="mb-2 text-white w-75"><span class="font-weight-bold">L'aide caritative</span> à porté de main</h1>
            <div class="job-search">
              <ul class="nav nav-pills mb-3" id="pills-tab" role="tablist">
                <li class="nav-item">
                  <a class="nav-link active py-3" id="pills-job-tab" data-toggle="pill" href="#pills-job" role="tab" aria-controls="pills-job" aria-selected="true">Chercher une l'association</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link text-white py-3" id="pills-candidate-tab" data-toggle="pill" href="#pills-candidate" role="tab" aria-controls="pills-candidate" aria-selected="false">Chercher des bénevoles</a>
                </li>
              </ul>
              <div class="tab-content bg-white p-4 rounded" id="pills-tabContent">
                <div class="tab-pane fade show active" id="pills-job" role="tabpanel" aria-labelledby="pills-job-tab">
                  <form action="#" method="post">
                    <div class="row">
                      <div class="col-md-6 col-lg-3 mb-3 mb-lg-0">
                        <input type="text" class="form-control" placeholder="ex: Croix Rouge">
                      </div>
                      <div class="col-md-6 col-lg-3 mb-3 mb-lg-0">
                        <div class="select-wrap">
                          <span class="icon-keyboard_arrow_down arrow-down"></span>
                          <select name="" id="" class="form-control">
                            <option value="">Categorie</option>
                            <option value="humanitaire">Humanitaire</option>
                            <option value="caritative">Caritative</option>
                            <option value="sociale">Sociale</option>
                            <option value="environmental">Environmental</option>
                            <option value="culturel">Culturel</option>
                          </select>
                        </div>
                      </div>
                      <div class="col-md-6 col-lg-3 mb-3 mb-lg-0">
                        <input type="text" class="form-control form-control-block search-input" id="autocomplete" placeholder="Localisation" onFocus="geolocate()">
                      </div>
                      <div class="col-md-6 col-lg-3 mb-3 mb-lg-0">
                        <input type="submit" class="btn btn-primary btn-block" value="Recherche">
                      </div>
                    </div>
                  </form>
                </div>
                <div class="tab-pane fade" id="pills-candidate" role="tabpanel" aria-labelledby="pills-candidate-tab">
                  <form action="#" method="post">
                    <div class="row">
                      <div class="col-md-6 col-lg-3 mb-3 mb-lg-0">
                        <input type="text" class="form-control" placeholder="ex: Croix Rouge">
                      </div>
                      <div class="col-md-6 col-lg-3 mb-3 mb-lg-0">
                        <div class="select-wrap">
                          <span class="icon-keyboard_arrow_down arrow-down"></span>
                          <select name="" id="" class="form-control">
                            <option value="">Categorie</option>
                            <option value="humanitaire">Humanitaire</option>
                            <option value="caritative">Caritative</option>
                            <option value="sociale">Sociale</option>
                            <option value="environmental">Environmental</option>
                            <option value="culturel">Culturel</option>
                          </select>
                        </div>
                      </div>
                      <div class="col-md-6 col-lg-3 mb-3 mb-lg-0">
                        <input type="text" class="form-control form-control-block search-input" id="autocomplete" placeholder="Localisation" onFocus="geolocate()">
                      </div>
                      <div class="col-md-6 col-lg-3 mb-3 mb-lg-0">
                        <input type="submit" class="btn btn-primary btn-block" value="Recherche">
                      </div>
                    </div>
                  </form>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>


    <div class="site-section bg-light">
      <div class="container">
        <div class="row justify-content-start text-left mb-5">
          <div class="col-md-9" data-aos="fade">
            <h2 class="font-weight-bold text-black">Annonce récente</h2>
          </div>
          <div class="col-md-3" data-aos="fade" data-aos-delay="200">
            <a href="#" class="btn btn-primary py-3 btn-block"><span class="h5">+ </span>Poster une annonce</a>
          </div>
        </div>

        <div class="row" data-aos="fade">
         <div class="col-md-12">

           <div class="job-post-item bg-white p-4 d-block d-md-flex align-items-center">

              <div class="mb-4 mb-md-0 mr-5">
               <div class="job-post-item-header d-flex align-items-center">
                 <h2 class="mr-3 text-black h4">Offre de bénévolat ponctuel - Croix Rouge</h2>
                 <div class="badge-wrap">
                  <span class="bg-primary text-white badge py-2 px-4">Temps partiel</span>
                 </div>
               </div>
               <div class="job-post-item-body d-block d-md-flex">
                 <div class="mr-3"><span class="fl-bigmug-line-portfolio23"></span> <a href="#">Croix Rouge Française</a></div>
                 <div><span class="fl-bigmug-line-big104"></span> <span>63 Rue de l'Amiral Roussin, 75015 Paris</span></div>
               </div>
              </div>

              <div class="ml-auto">
                <a href="#" class="btn btn-secondary rounded-circle btn-favorite text-gray-500"><span class="icon-heart"></span></a>
                <a href="job-single.html" class="btn btn-primary py-2">Postuler</a>
              </div>
           </div>

         </div>
        </div>


           </div>
         </div>
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






    <div class="site-section">
      <div class="container">
        <div class="row justify-content-center text-center mb-5">
          <div class="col-md-6" data-aos="fade" >
            <h2 class="text-black">Pourquoi Help<strong>Human</strong> ?</h2>
          </div>
        </div>
        <div class="row hosting">
          <div class="col-md-6 col-lg-4 mb-5 mb-lg-4" data-aos="fade" data-aos-delay="100">

            <div class="unit-3 h-100 bg-white">

              <div class="d-flex align-items-center mb-3 unit-3-heading">
                <div class="unit-3-icon-wrap mr-4">
                  <svg class="unit-3-svg" xmlns="http://www.w3.org/2000/svg" width="59px" height="68px">
                    <path fill-rule="evenodd" stroke-width="2px" stroke-linecap="butt" stroke-linejoin="miter" fill="none" d="M29.000,66.000 L1.012,49.750 L1.012,17.250 L29.000,1.000 L56.988,17.250 L56.988,49.750 L29.000,66.000 Z"></path>
                  </svg><span class="unit-3-icon icon fl-bigmug-line-portfolio23"></span>
                </div>
                <h2 class="h5">Oeuvrer</h2>
              </div>
              <div class="unit-3-body">
                <p>Enormément de personnes souhaitent oeuvrer pour des oeuvres caritatives. Ils veulent aider les personnes les plus démunis lors de leurs temps libres, permettent à d'autres de vivre de bons moments, leur donner le sourire.</p>
              </div>
            </div>

          </div>
          <div class="col-md-6 col-lg-4 mb-5 mb-lg-4" data-aos="fade" data-aos-delay="200">

            <div class="unit-3 h-100 bg-white">

              <div class="d-flex align-items-center mb-3 unit-3-heading">
                <div class="unit-3-icon-wrap mr-4">
                  <svg class="unit-3-svg" xmlns="http://www.w3.org/2000/svg" width="59px" height="68px">
                    <path fill-rule="evenodd" stroke-width="2px" stroke-linecap="butt" stroke-linejoin="miter" fill="none" d="M29.000,66.000 L1.012,49.750 L1.012,17.250 L29.000,1.000 L56.988,17.250 L56.988,49.750 L29.000,66.000 Z"></path>
                  </svg><span class="unit-3-icon icon fl-bigmug-line-big104"></span>
                </div>
                <h2 class="h5">Proche de chez vous</h2>
              </div>
              <div class="unit-3-body">
                <p>C'est pourquoi nous avons dévelloper une interface qui permettra aux associations de poster des annonces de recherche de bénévoles et aux utilisateurs de trouver des associations dans leur secteur.</p>
              </div>
            </div>

          </div>

          <div class="col-md-6 col-lg-4 mb-5 mb-lg-4" data-aos="fade" data-aos-delay="500">

            <div class="unit-3 h-100 bg-white">

              <div class="d-flex align-items-center mb-3 unit-3-heading">
                <div class="unit-3-icon-wrap mr-4">
                  <svg class="unit-3-svg" xmlns="http://www.w3.org/2000/svg" width="59px" height="68px">
                    <path fill-rule="evenodd" stroke-width="2px" stroke-linecap="butt" stroke-linejoin="miter" fill="none" d="M29.000,66.000 L1.012,49.750 L1.012,17.250 L29.000,1.000 L56.988,17.250 L56.988,49.750 L29.000,66.000 Z"></path>
                  </svg><span class="unit-3-icon icon fl-bigmug-line-clipboard68"></span>
                </div>
                <h2 class="h5">Temps libre</h2>
              </div>
              <div class="unit-3-body">
                <p>Le temps libre ne leur manque pas. En effet, ils ne savent pas comment s'y prendre avec les centaines d'associations qui existent. Trouver une association qui leur correspond et en plus proche de chez soi est devenue assez compliqué.</p>
              </div>
            </div>

          </div>
          <div class="col-md-6 col-lg-4 mb-5 mb-lg-4" data-aos="fade" data-aos-delay="600">

          </div>

        </div>

      </div>
    </div>

    <div class="site-section block-4 bg-light">

      <div class="container">

        <div class="row justify-content-center text-center mb-5">
          <div class="col-md-6" data-aos="fade" >
            <h2 class="text-black">Avis</h2>
          </div>
        </div>

        <div class="nonloop-block-4 owl-carousel" data-aos="fade">
          <div class="item col-md-8 mx-auto">

            <div class="block-38 text-center bg-white p-4">
              <div class="block-38-img">
                <div class="block-38-header">
                  <img src="images/person_1.jpg" alt="Image placeholder">
                  <h3 class="block-38-heading">Elodie Graham</h3>
                  <p class="block-38-subheading">Bénévole/Renne</p>
                </div>
                <div class="block-38-body">
                  <p>Pendant mon temps libre je voulais oeuvrer caritativement. Je me suis alors inscrit sur HelpHuman et j'ai trouvé 8 associations autour de chez moi.</p>
                </div>
              </div>
            </div>

          </div>
          <div class="item col-md-8 mx-auto">
            <div class="block-38 text-center bg-white p-4">
              <div class="block-38-img">
                <div class="block-38-header">
                  <img src="images/person_2.jpg" alt="Image placeholder">
                  <h3 class="block-38-heading">Manon Greive</h3>
                  <p class="block-38-subheading">Bénévole/Vienne</p>
                </div>
                <div class="block-38-body">
                  <p>J'habiatais sur Lyon où j'avais l'habitude de me rendre dans l'association de ma rue. Lorsque j'ai déménagé sur Vienne, j'ai voulu trouver une association dans la ville. J'ai pu en trouver grâce à HelpHuman.</p>
                </div>
              </div>
            </div>
          </div>


      </div>
    </div>



    <div class="site-section">
      <div class="container">
        <div class="row justify-content-center text-center mb-5">
          <div class="col-md-6" data-aos="fade" >
            <h2 class="text-black">Les Dernier Articles</h2>
          </div>
        </div>
        <div class="row">

          <% ArrayList<Article> articles = (ArrayList<Article>) request.getAttribute("articles");
            for(Article article : articles) {
              out.println("<div class='col-md-6 mb-5 mb-lg-4 col-lg-3' data-aos='fade'>");
              out.println("<div class='position-relative unit-8'>");
              out.println("<a href='#' class='mb-3 d-block img-a'><img src='images/img_1.jpg' alt='Image' class='img-fluid rounded'></a>");
              out.println("<span class='d-block text-gray-500 text-normal small mb-3'>Par <a href='#'>" + article.getAuteur() + "</a> <span class='mx-2'>&bullet;</span>" + article.getDate() + "</span>");
              out.println("<h2 class='h5 font-weihgt-normal line-height-sm mb-3'><a href='#' class='text-black'>" + article.getTitre() + "</a></h2>");
              out.println("<p>" + article.getResume() + "</p>");
              out.println("</div>");
              out.println("</div>");
            }
          %>
          
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

  <script>
      // This example displays an address form, using the autocomplete feature
      // of the Google Places API to help users fill in the information.

      // This example requires the Places library. Include the libraries=places
      // parameter when you first load the API. For example:
      // <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_API_KEY&libraries=places">

      var placeSearch, autocomplete;
      var componentForm = {
        street_number: 'short_name',
        route: 'long_name',
        locality: 'long_name',
        administrative_area_level_1: 'short_name',
        country: 'long_name',
        postal_code: 'short_name'
      };

      function initAutocomplete() {
        // Create the autocomplete object, restricting the search to geographical
        // location types.
        autocomplete = new google.maps.places.Autocomplete(
            /** @type {!HTMLInputElement} */(document.getElementById('autocomplete')),
            {types: ['geocode']});

        // When the user selects an address from the dropdown, populate the address
        // fields in the form.
        autocomplete.addListener('place_changed', fillInAddress);
      }

      function fillInAddress() {
        // Get the place details from the autocomplete object.
        var place = autocomplete.getPlace();

        for (var component in componentForm) {
          document.getElementById(component).value = '';
          document.getElementById(component).disabled = false;
        }

        // Get each component of the address from the place details
        // and fill the corresponding field on the form.
        for (var i = 0; i < place.address_components.length; i++) {
          var addressType = place.address_components[i].types[0];
          if (componentForm[addressType]) {
            var val = place.address_components[i][componentForm[addressType]];
            document.getElementById(addressType).value = val;
          }
        }
      }

      // Bias the autocomplete object to the user's geographical location,
      // as supplied by the browser's 'navigator.geolocation' object.
      function geolocate() {
        if (navigator.geolocation) {
          navigator.geolocation.getCurrentPosition(function(position) {
            var geolocation = {
              lat: position.coords.latitude,
              lng: position.coords.longitude
            };
            var circle = new google.maps.Circle({
              center: geolocation,
              radius: position.coords.accuracy
            });
            autocomplete.setBounds(circle.getBounds());
          });
        }
      }
    </script>

    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&libraries=places&callback=initAutocomplete"
        async defer></script>

  <script src="js/main.js"></script>

  </body>
</html>
