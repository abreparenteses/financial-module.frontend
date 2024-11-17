(ns financial-module.views
  (:require
   [financial-module.views.login :as views.login]
   [financial-module.views.main :as views.main]
   [helix.core :refer [$ <> defnc]]
   [helix.dom :as d]
   [refx.alpha :as refx]))

(defnc home [{:keys [_]}]
  (let [session (refx/use-sub [:session])]
    (<>
      (d/main
        (if (empty? (:token session))
          ($ views.login/login)
          ($ views.main/main {:session session}))))))
