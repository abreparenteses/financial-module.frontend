(ns financial-module.routes
  (:require
   [financial-module.views :as views]
   [financial-module.views.login :refer [login]]))

(def routes
  ["/"
   [""
    {:name      ::home
     :view      views/home
     :link-text "Home"
     :controllers
     [{}]}] ;; Do whatever initialization needed for home page
   ;; I.e (refx/dispatch [::events/load-something-with-ajax])
   ;; Teardown can be done here.

   ["login"
    {:name      ::login
     :view      login
     :link-text "Login"
     :controllers
     [{}]}]]) ;; Do whatever initialization needed for home page
       ;; I.e (refx/dispatch [::events/load-something-with-ajax])
       ;; Teardown can be done here.
