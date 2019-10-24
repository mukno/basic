<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
.container
  .card-wrap
  
    .card.border-0.shadow.card--welcome.is-show#welcome
      .card-body
        h2.card-title WELCOME
        p Welcome to the login page
        .btn-wrap
          a(data-target="register").btn.btn-lg.btn-register.js-btn REGISTER
          a(data-target="login").btn.btn-lg.btn-login.js-btn LOGIN
          
    .card.border-0.shadow.card--register#register
      .card-body
        h2.card-title Create Account
        p.card-text Enter your personal details
          br
          | and start journey with us
        p.badge-wrap
          a.badge: i.fab.fa-facebook-f
          a.badge: i.fab.fa-google
          a.badge: i.fab.fa-twitter
          a.badge: i.fab.fa-github
        p or use your email for registration
        form
          .form-group
            input(type='text' placeholder='Name' required).form-control
          .form-group
            input(type='email' placeholder='Email' required).form-control
          .form-group
            input(type='password' placeholder='Password' required).form-control
          button.btn.btn-lg REGISTER
      button(data-target="welcome").btn.btn-back.js-btn: i.fas.fa-angle-left
          
    .card.border-0.shadow.card--login#login
      .card-body
        h2.card-title Welcome Back!
        p To keep connected with us
          br
          | please login with your personal info
        p.badge-wrap
          a.badge: i.fab.fa-facebook-f
          a.badge: i.fab.fa-google
          a.badge: i.fab.fa-twitter
          a.badge: i.fab.fa-github
        p or use your account
        form
          .form-group
            input(type='email' placeholder='Email' required).form-control
          .form-group
            input(type='password' placeholder='Password' required).form-control
          p: a Forgot your password?
          button.btn.btn-lg LOGIN
      button(data-target="welcome").btn.btn-back.js-btn: i.fas.fa-angle-left