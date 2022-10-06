<%-- 
    Document   : index
    Created on : 5/10/2022, 1:02:17 p. m.
    Author     : FAMILIA TOVAR BUSTOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>GYM ETITC</title>
  <link rel='stylesheet' href='https://unpkg.com/css-pro-layout@1.1.0/dist/css/css-pro-layout.css'>
<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/remixicon@2.2.0/fonts/remixicon.css'><link rel="stylesheet" href="./css/style.css">

</head>
<body>
  <div class="container-fluid" style="background: rgb(8, 100, 37);>
    
        <nav class=">
            <a class="navbar-frand" href="#">
                <img src="../imagenes/iconoETITC.JPG.jpg" width="80" height="60" alt="">
            </a>
        </nav>


    </div>
<!-- este espacio almacena el titulo del menu -->
<div class="layout has-sidebar fixed-sidebar fixed-header">
  <aside id="sidebar" class="sidebar break-point-lg has-bg-image">
    <div class="image-wrapper">
      <img src="../imagenes/imgback.jpeg" alt="sidebar background" />
    </div>
    <div class="sidebar-layout">
      <div class="sidebar-header">
        <span style="
                text-transform: uppercase;
                font-size: 15px;
                letter-spacing: 3px;
                font-weight: bold;
              ">Gimnacio ETITC</span>
      </div>
      <div class="sidebar-content">
        <nav class="menu open-current-submenu">
          <ul>
            <li class="menu-item">
              <a href="#">
                <span class="menu-icon">
                  <i class="ri-calendar-fill"></i>
                </span>
                <span class="menu-title">Principal</span>
              </a>
            </li>
            <li class="menu-item sub-menu">
              <a href="#">
                <span class="menu-icon">
                  <i class="ri-bar-chart-2-fill"></i>
                </span>
                <span class="menu-title">Usuario</span>
              </a>
              <div class="sub-menu-list">
                <ul>
                  
                  
                  
                </ul>
              </div>
            </li>
            <li class="menu-item sub-menu">
              <a href="#">
                <span class="menu-icon">
                  <i class="ri-shopping-cart-fill"></i>
                </span>
                <span class="menu-title">NEO</span>
              </a>
              <div class="sub-menu-list">
                <ul>
                  
                  
                  
                </ul>
              </div>
            </li>
            <li class="menu-item sub-menu">
              <a href="#">
                <span class="menu-icon">
                  <i class="ri-global-fill"></i>
                </span>
                <span class="menu-title">Horario GYM</span>
              </a>
              <div class="sub-menu-list">
                <ul>
                  
                  
                </ul>
              </div>
            </li>
            <li class="menu-item sub-menu">
              <a href="#">
                <span class="menu-icon">
                  <i class="ri-brush-3-fill"></i>
                </span>
                <span class="menu-title">Ejercicios </span>
              </a>
              <div class="sub-menu-list">
                <ul>
                  
                  
                </ul>
              </div>
            </li>
            <li class="menu-item">
              <a href="#">
                <span class="menu-icon">
                  <i class="ri-book-2-fill"></i>
                </span>
                <span class="menu-title">Rutinas</span>
              </a>
            </li>
            <li class="menu-item">
              <a href="#">
                <span class="menu-icon">
                  <i class="ri-calendar-fill"></i>
                </span>
                <span class="menu-title">Eventos</span>
              </a>
            </li>
            <li class="menu-item">
              <a href="#">
                <span class="menu-icon">
                  <i class="ri-service-fill"></i>
                </span>
                <span class="menu-title">Formularios</span>
              </a>
            </li>
            <li class="menu-item">
              <a href="#">
                <span class="menu-icon">
                  <i class="ri-service-fill"></i>
                </span>
                <span class="menu-title">Reportes</span>
              </a>
            </li>
          </ul>
        </nav>
      </div>
      <div class="sidebar-footer"><span>Sidebar footer</span></div>
    </div>
  </aside>
  <div id="overlay" class="overlay"></div>
  <div class="layout">
    <header class="header">
      <a id="btn-collapse" href="#">
        <i class="ri-menu-line ri-xl"></i>
      </a>
      <a id="btn-toggle" href="#" class="sidebar-toggler break-point-lg">
        <i class="ri-menu-line ri-xl"></i>
      </a>
    </header>
    <main class="content">
      <div>
        <!--<h1>Pro Sidebar</h1>
        <p>
          Responsive layout with advanced sidebar menu built with SCSS and vanilla Javascript
        </p>
        <p>
          Full Code and documentation available on  <a href="https://github.com/azouaoui-med/pro-sidebar-template" target="_blank">Github</a>
        </p>
        <div>
          <a href="https://github.com/azouaoui-med/pro-sidebar-template" target="_blank">
            <img alt="GitHub stars" src="https://img.shields.io/github/stars/azouaoui-med/pro-sidebar-template?style=social" />
          </a>
          <a href="https://github.com/azouaoui-med/pro-sidebar-template" target="_blank">
            <img alt="GitHub forks" src="https://img.shields.io/github/forks/azouaoui-med/pro-sidebar-template?style=social" />
          </a>
        </div>
      </div>
      <div>
        <h2>Features</h2>
        <ul>
          <li>Fully responsive</li>
          <li>Collapsable sidebar</li>
          <li>Multi level menu</li>
          <li>RTL support</li>
          <li>Customizable</li>
        </ul>
      </div>
      <div>
        <h2>Resources</h2>
        <ul>
          <li>
            <a target="_blank" href="https://github.com/azouaoui-med/css-pro-layout">
              Css Pro Layout</a>
          </li>
          <li>
            <a target="_blank" href="https://github.com/popperjs/popper-core"> Popper Core</a>
          </li>
          <li>
            <a target="_blank" href="https://remixicon.com/"> Remix Icons</a>
          </li>
        </ul>
      </div>
      <footer class="footer">
        <small style="margin-bottom: 20px; display: inline-block">
          © 2022 made with
          <span style="color: red; font-size: 18px">&#10084;</span> by -
          <a target="_blank" href="https://azouaoui.netlify.com"> Mohamed Azouaoui </a>
        </small>
        <br />
        <div>
          <a href="https://github.com/azouaoui-med" target="_blank" rel="noopener noreferrer">
            <img alt="GitHub followers" src="https://img.shields.io/github/followers/azouaoui-med?label=github&style=social" />
          </a>
          <a href="https://twitter.com/azouaoui_med" target="_blank" rel="noopener noreferrer">
            <img alt="Twitter Follow" src="https://img.shields.io/twitter/follow/azouaoui_med?label=twitter&style=social" />
          </a>
        </div>
      </footer>
    </main>
    <div class="overlay"></div>
  </div>
</div>
<!-- partial -->
  <script src='https://unpkg.com/@popperjs/core@2'></script><script  src="/script.js"></script>

</body>
</html>
